#!/usr/bin/env bash
set -euo pipefail
# 本地模拟 GitHub Actions 的关键步骤（提交前自测）
ROOT="$(cd "$(dirname "$0")" && pwd)"
REPO="$(cd "$ROOT/.." && pwd)"

echo "== [1/4] pnpm install --frozen-lockfile =="
cd "$REPO/uniapp"
pnpm install --frozen-lockfile

echo "== [2/4] 静态检查 =="
node tools/check-sfc.mjs src/pages src/components
for f in uniCloud-aliyun/cloudfunctions/*/index.js; do node --check "$f"; done
echo "云函数语法 OK"

echo "== [3/4] 构建 H5 =="
pnpm build:h5

echo "== [4/4] 构建签名 APK =="
cd "$REPO"
./release/build-apk.sh
echo
echo "本地 CI 模拟全部通过"
