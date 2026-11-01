#!/usr/bin/env bash
set -euo pipefail

# 极简排班（复刻）APK 构建脚本（GitHub Actions / 本地通用）
#
# 本地：
#   ./build-apk.sh
#   VERSION_CODE=12 VERSION_NAME=1.2.0 ./build-apk.sh
#
# 可选环境变量：
#   ANDROID_SDK_ROOT / ANDROID_HOME    Android SDK 路径
#   BUILD_TOOLS_VERSION                默认 34.0.0
#   OUT_DIR                            APK 输出目录（默认 release/）
#   RELEASE_KEYSTORE_BASE64            CI：base64 的 keystore
#   RELEASE_STORE_PASSWORD             CI：keystore 密码
#   RELEASE_KEY_PASSWORD               CI：key 密码（默认同 store 密码）
#   RELEASE_KEY_ALIAS                  CI：alias（默认 replica）
#   RELEASE_KEYSTORE_PATH              自定义 keystore 路径

ROOT="$(cd "$(dirname "$0")" && pwd)"
PROJ="$ROOT/webview-apk"
SDK="${ANDROID_SDK_ROOT:-${ANDROID_HOME:-$HOME/tools/android-sdk}}"
VERSION_CODE="${VERSION_CODE:-1}"
VERSION_NAME="${VERSION_NAME:-1.0.0}"
BT_VERSION="${BUILD_TOOLS_VERSION:-34.0.0}"
BT="$SDK/build-tools/$BT_VERSION"
AJAR="$SDK/platforms/android-34/android.jar"
DIST="$ROOT/../uniapp/dist/build/h5"
BUILD="$PROJ/build"
OUT_DIR="${OUT_DIR:-$ROOT}"
KEYS="$ROOT/keystore"
KS="${RELEASE_KEYSTORE_PATH:-$KEYS/replica-release.jks}"
ALIAS="${RELEASE_KEY_ALIAS:-replica}"

die() { echo "ERROR: $*" >&2; exit 1; }

for tool in aapt2 d8 apksigner zipalign; do
  [ -x "$BT/$tool" ] || die "缺少 $BT/$tool（安装 build-tools;$BT_VERSION）"
done
[ -f "$AJAR" ] || die "缺少 $AJAR（安装 platforms;android-34）"
command -v javac >/dev/null || die "缺少 javac（JDK 17）"
command -v zip >/dev/null || die "缺少 zip"

echo "== 1/8 清理（版本 $VERSION_NAME / $VERSION_CODE）=="
rm -rf "$BUILD"
mkdir -p "$BUILD/assets" "$BUILD/compiled" "$BUILD/classes" "$BUILD/dex" "$BUILD/gen" "$OUT_DIR"

echo "== 2/8 复制 H5 产物到 assets/www =="
[ -f "$DIST/index.html" ] || die "缺少 H5 产物：$DIST（先执行 pnpm build:h5）"
cp -R "$DIST/." "$BUILD/assets/www/"

echo "== 3/8 图标 =="
[ -d "$PROJ/res/mipmap-xxxhdpi" ] || python3 "$ROOT/make-icons.py"

echo "== 4/8 aapt2 编译/链接资源 =="
cp "$PROJ/AndroidManifest.xml" "$BUILD/AndroidManifest.xml"
if [ "$(uname -s)" = "Darwin" ]; then
  sed -i '' -e "s/android:versionCode=\"[0-9]*\"/android:versionCode=\"$VERSION_CODE\"/" \
    -e "s/android:versionName=\"[^\"]*\"/android:versionName=\"$VERSION_NAME\"/" "$BUILD/AndroidManifest.xml"
else
  sed -i -e "s/android:versionCode=\"[0-9]*\"/android:versionCode=\"$VERSION_CODE\"/" \
    -e "s/android:versionName=\"[^\"]*\"/android:versionName=\"$VERSION_NAME\"/" "$BUILD/AndroidManifest.xml"
fi
grep -o 'android:version[^ ]*' "$BUILD/AndroidManifest.xml" | head -2
"$BT/aapt2" compile --dir "$PROJ/res" -o "$BUILD/compiled/res.zip"
"$BT/aapt2" link -o "$BUILD/app-unsigned.apk" -I "$AJAR" \
  --manifest "$BUILD/AndroidManifest.xml" -A "$BUILD/assets" \
  --java "$BUILD/gen" -R "$BUILD/compiled/res.zip" --auto-add-overlay \
  --min-sdk-version 26 --target-sdk-version 34

echo "== 5/8 javac =="
javac -source 17 -target 17 -encoding UTF-8 -Xlint:-options -classpath "$AJAR" -d "$BUILD/classes" \
  $(find "$BUILD/gen" -name '*.java') $(find "$PROJ/src" -name '*.java')

echo "== 6/8 d8 -> classes.dex =="
"$BT/d8" --lib "$AJAR" --min-api 26 --output "$BUILD/dex" $(find "$BUILD/classes" -name '*.class')
( cd "$BUILD/dex" && zip -q -u "$BUILD/app-unsigned.apk" classes.dex )
"$BT/zipalign" -f -p 4 "$BUILD/app-unsigned.apk" "$BUILD/app-aligned.apk"

echo "== 7/8 签名 =="
if [ -n "${RELEASE_KEYSTORE_BASE64:-}" ]; then
  mkdir -p "$KEYS"
  python3 - "$RELEASE_KEYSTORE_BASE64" "$KS" <<'PY'
import base64, sys
open(sys.argv[2], 'wb').write(base64.b64decode(sys.argv[1]))
PY
  : "${RELEASE_STORE_PASSWORD:?CI 构建需要 RELEASE_STORE_PASSWORD}"
  STORE_PASS="$RELEASE_STORE_PASSWORD"
  KEY_PASS="${RELEASE_KEY_PASSWORD:-$STORE_PASS}"
  echo "使用 CI 注入的 keystore：$KS（alias=$ALIAS）"
else
  if [ ! -f "$KS" ]; then
    mkdir -p "$KEYS"
    PASS=$(python3 -c 'import secrets;print(secrets.token_urlsafe(18))')
    echo "$PASS" > "$KEYS/password.txt"
    chmod 600 "$KEYS/password.txt"
    keytool -genkeypair -v -keystore "$KS" -alias "$ALIAS" -keyalg RSA -keysize 2048 -validity 10000 \
      -storepass "$PASS" -keypass "$PASS" \
      -dname "CN=Jianyun Replica, OU=dev, O=replica, L=Hangzhou, ST=Zhejiang, C=CN" >/dev/null 2>&1
    echo "已生成演示 keystore：$KS（密码在 $KEYS/password.txt，勿提交仓库）"
  fi
  STORE_PASS=$(cat "$KEYS/password.txt")
  KEY_PASS="$STORE_PASS"
fi

OUT="$OUT_DIR/replica-$VERSION_NAME-release.apk"
"$BT/apksigner" sign --ks "$KS" --ks-key-alias "$ALIAS" \
  --ks-pass "pass:$STORE_PASS" --key-pass "pass:$KEY_PASS" \
  --out "$OUT" "$BUILD/app-aligned.apk"

echo "== 8/8 校验与摘要 =="
"$BT/apksigner" verify --print-certs "$OUT" | head -8
"$BT/aapt2" dump badging "$OUT" | grep -E "^(package|sdkVersion|targetSdkVersion|application-label:)" | head -4
if command -v sha256sum >/dev/null 2>&1; then
  SHA=$(sha256sum "$OUT" | awk '{print $1}')
else
  SHA=$(shasum -a 256 "$OUT" | awk '{print $1}')
fi
echo "$SHA  $(basename "$OUT")" > "$OUT.sha256"
echo "APK=$OUT"
echo "SHA256=$SHA"
echo "VERSION=$VERSION_NAME ($VERSION_CODE)"
echo "SIZE=$(wc -c < "$OUT" | tr -d ' ') bytes"
