package cn.jianyun.workplan.util;

import cn.jianyun.workplan.R;
import cn.jianyun.workplan.api.ApiResult;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine;
import com.wangmai.permission.androidsupport.FileProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;
import org.apache.xmlbeans.XmlErrorCodes;

/* JADX INFO: compiled from: MyWebdavTool.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nJ\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nJ\u0016\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006J\u000e\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\nJ \u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\u0004J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\nJ\u000e\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eJ(\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010 2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\u0004J$\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010 2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010#\u001a\u00020\nJ\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010 2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\n¨\u0006%"}, d2 = {"Lcn/jianyun/workplan/util/MyWebdavTool;", "", "()V", "check", "", "webDAVUser", "Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "clean", "", "dir", "", "createDir", "sardine", "Lcom/thegrizzlylabs/sardineandroid/Sardine;", FileProvider.ATTR_PATH, "delete", "fileName", "exist", "getClient", "getDefaultPath", "user", "getParentPath", "getRealUrl", "withDefault", "getWebDAVIcon", "", "platform", "getWebDAVServerUrl", "inputStreamToString", "inputStream", "Ljava/io/InputStream;", XmlErrorCodes.LIST, "Lcn/jianyun/workplan/api/ApiResult;", "fileOnly", "put", "content", "read", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MyWebdavTool {
    public static final int $stable = 0;
    public static final MyWebdavTool INSTANCE = new MyWebdavTool();

    private MyWebdavTool() {
    }

    public final boolean check(WebDAVUser webDAVUser) {
        Intrinsics.checkNotNullParameter(webDAVUser, "webDAVUser");
        try {
            getClient(webDAVUser).list(getRealUrl$default(this, webDAVUser, "", false, 4, null));
            return true;
        } catch (Exception e2) {
            CommonToolKt.mlog("error", e2);
            return false;
        }
    }

    public static /* synthetic */ ApiResult list$default(MyWebdavTool myWebdavTool, WebDAVUser webDAVUser, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            str = PackagingURIHelper.FORWARD_SLASH_STRING;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return myWebdavTool.list(webDAVUser, str, z);
    }

    public final ApiResult<Object> list(WebDAVUser webDAVUser, String path, boolean fileOnly) {
        Intrinsics.checkNotNullParameter(webDAVUser, "webDAVUser");
        Intrinsics.checkNotNullParameter(path, "path");
        String defaultPath = getDefaultPath(webDAVUser);
        try {
            List<DavResource> list = getClient(webDAVUser).list(getRealUrl$default(this, webDAVUser, path, false, 4, null));
            Intrinsics.checkNotNullExpressionValue(list, "client.list(newUrl)");
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = list.iterator();
            while (true) {
                boolean z = false;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                DavResource davResource = (DavResource) next;
                if (!Intrinsics.areEqual(davResource.getPath(), defaultPath) && !Intrinsics.areEqual(davResource.getPath(), defaultPath + PackagingURIHelper.FORWARD_SLASH_STRING)) {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (fileOnly) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : arrayList2) {
                    if (!((DavResource) obj).isDirectory()) {
                        arrayList3.add(obj);
                    }
                }
                arrayList2 = arrayList3;
            }
            CommonToolKt.mlog(XmlErrorCodes.LIST, path, arrayList2);
            final MyWebdavTool$list$aa$1 myWebdavTool$list$aa$1 = new Function2<DavResource, DavResource, Integer>() { // from class: cn.jianyun.workplan.util.MyWebdavTool$list$aa$1
                @Override // kotlin.jvm.functions.Function2
                public final Integer invoke(DavResource davResource2, DavResource davResource3) {
                    int iIntValue;
                    if (davResource2.isDirectory() == davResource3.isDirectory()) {
                        MyWebdavTool myWebdavTool = MyWebdavTool.INSTANCE;
                        String path2 = davResource2.getPath();
                        Intrinsics.checkNotNullExpressionValue(path2, "v1.path");
                        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) myWebdavTool.getParentPath(path2), PackagingURIHelper.FORWARD_SLASH_STRING, 0, false, 6, (Object) null);
                        MyWebdavTool myWebdavTool2 = MyWebdavTool.INSTANCE;
                        String path3 = davResource3.getPath();
                        Intrinsics.checkNotNullExpressionValue(path3, "v2.path");
                        int iLastIndexOf$default2 = StringsKt.lastIndexOf$default((CharSequence) myWebdavTool2.getParentPath(path3), PackagingURIHelper.FORWARD_SLASH_STRING, 0, false, 6, (Object) null);
                        if (iLastIndexOf$default != iLastIndexOf$default2) {
                            iIntValue = iLastIndexOf$default - iLastIndexOf$default2;
                        } else {
                            String name = davResource2.getName();
                            String name2 = davResource3.getName();
                            Intrinsics.checkNotNullExpressionValue(name2, "v2.name");
                            iIntValue = name.compareTo(name2);
                        }
                    } else {
                        iIntValue = ((Number) CommonToolKt.ifv(davResource2.isDirectory(), -1, 1)).intValue();
                    }
                    return Integer.valueOf(iIntValue);
                }
            };
            List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: cn.jianyun.workplan.util.MyWebdavTool$$ExternalSyntheticLambda0
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return MyWebdavTool.list$lambda$2(myWebdavTool$list$aa$1, obj2, obj3);
                }
            });
            CommonToolKt.mlog("list2", path, listSortedWith);
            return ApiResult.INSTANCE.success(listSortedWith);
        } catch (Exception e2) {
            CommonToolKt.mlog("error", e2);
            return ApiResult.INSTANCE.fail("加载失败");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int list$lambda$2(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return ((Number) tmp0.invoke(obj, obj2)).intValue();
    }

    public static /* synthetic */ String getRealUrl$default(MyWebdavTool myWebdavTool, WebDAVUser webDAVUser, String str, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return myWebdavTool.getRealUrl(webDAVUser, str, z);
    }

    public final String getRealUrl(WebDAVUser webDAVUser, String path, boolean withDefault) {
        Intrinsics.checkNotNullParameter(webDAVUser, "webDAVUser");
        Intrinsics.checkNotNullParameter(path, "path");
        String url = webDAVUser.getUrl();
        String strReplace$default = StringsKt.replace$default(CommonToolKt.ifv(withDefault, getDefaultPath(webDAVUser), "") + PackagingURIHelper.FORWARD_SLASH_STRING + path, "//", PackagingURIHelper.FORWARD_SLASH_STRING, false, 4, (Object) null);
        CommonToolKt.mlog("newPath", strReplace$default);
        if (StringsKt.startsWith$default(strReplace$default, "/dav/", false, 2, (Object) null)) {
            strReplace$default = strReplace$default.substring(4);
            Intrinsics.checkNotNullExpressionValue(strReplace$default, "substring(...)");
        }
        if (StringsKt.startsWith$default(strReplace$default, PackagingURIHelper.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
            strReplace$default = strReplace$default.substring(1);
            Intrinsics.checkNotNullExpressionValue(strReplace$default, "substring(...)");
        }
        if (!StringsKt.endsWith$default(url, PackagingURIHelper.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
            url = url + PackagingURIHelper.FORWARD_SLASH_STRING;
        }
        CommonToolKt.mlog("finalPath", url + strReplace$default);
        return url + strReplace$default;
    }

    public final String getParentPath(String path) {
        Intrinsics.checkNotNullParameter(path, "path");
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) path, PackagingURIHelper.FORWARD_SLASH_STRING, 0, false, 6, (Object) null);
        if (iLastIndexOf$default <= 0) {
            return "";
        }
        if (iLastIndexOf$default == path.length() - 1) {
            String strSubstring = path.substring(0, iLastIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            return getParentPath(strSubstring);
        }
        String strSubstring2 = path.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return strSubstring2;
    }

    public final boolean exist(Sardine sardine, String path) {
        Intrinsics.checkNotNullParameter(sardine, "sardine");
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            CommonToolKt.mlog("exist path: ", path, sardine.list(path));
            return true;
        } catch (Exception e2) {
            CommonToolKt.mlog("not exist path: ", path, e2);
            return false;
        }
    }

    public final void createDir(Sardine sardine, String path) throws IOException {
        Intrinsics.checkNotNullParameter(sardine, "sardine");
        Intrinsics.checkNotNullParameter(path, "path");
        CommonToolKt.mlog("create dir", path);
        if (exist(sardine, path)) {
            return;
        }
        String parentPath = getParentPath(path);
        if (exist(sardine, parentPath)) {
            CommonToolKt.mlog("real create dir", path);
            sardine.createDirectory(path);
        } else {
            CommonToolKt.mlog("prepare real create parent dir", parentPath);
            createDir(sardine, parentPath);
            createDir(sardine, path);
        }
    }

    public final Sardine getClient(WebDAVUser webDAVUser) {
        Intrinsics.checkNotNullParameter(webDAVUser, "webDAVUser");
        OkHttpSardine okHttpSardine = new OkHttpSardine();
        okHttpSardine.setCredentials(webDAVUser.getUsername(), webDAVUser.resolvePassword());
        return okHttpSardine;
    }

    public final ApiResult<Object> put(WebDAVUser webDAVUser, String path, String content) {
        Intrinsics.checkNotNullParameter(webDAVUser, "webDAVUser");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(content, "content");
        Sardine client = getClient(webDAVUser);
        String realUrl$default = getRealUrl$default(this, webDAVUser, path, false, 4, null);
        try {
            createDir(client, getParentPath(realUrl$default));
            Charset charsetForName = Charset.forName("UTF-8");
            Intrinsics.checkNotNullExpressionValue(charsetForName, "forName(\"UTF-8\")");
            byte[] bytes = content.getBytes(charsetForName);
            Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            client.put(realUrl$default, bytes);
            CommonToolKt.mlog("write file success", realUrl$default);
            return ApiResult.INSTANCE.success(true);
        } catch (Exception e2) {
            CommonToolKt.mlog("write file error", realUrl$default, e2);
            return ApiResult.INSTANCE.fail("加载失败");
        }
    }

    public final void clean(WebDAVUser webDAVUser, String dir) {
        Intrinsics.checkNotNullParameter(webDAVUser, "webDAVUser");
        Intrinsics.checkNotNullParameter(dir, "dir");
        Sardine client = getClient(webDAVUser);
        try {
            List<DavResource> files = client.list(getRealUrl$default(this, webDAVUser, dir, false, 4, null));
            Intrinsics.checkNotNullExpressionValue(files, "files");
            int i = 0;
            for (Object obj : files) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                DavResource davResource = (DavResource) obj;
                if (i > 0) {
                    String name = davResource.getName();
                    Intrinsics.checkNotNullExpressionValue(name, "v.name");
                    if (StringsKt.contains$default((CharSequence) name, (CharSequence) ".workplan.", false, 2, (Object) null)) {
                        MyWebdavTool myWebdavTool = INSTANCE;
                        String path = davResource.getPath();
                        Intrinsics.checkNotNullExpressionValue(path, "v.path");
                        String realUrl = myWebdavTool.getRealUrl(webDAVUser, path, false);
                        try {
                            client.delete(realUrl);
                            CommonToolKt.mlog("remove file", realUrl);
                        } catch (Exception e2) {
                            CommonToolKt.mlog("remove file error", realUrl, e2);
                        }
                    }
                }
                i = i2;
            }
        } catch (Exception unused) {
        }
    }

    public final void delete(WebDAVUser webDAVUser, String dir, String fileName) {
        Intrinsics.checkNotNullParameter(webDAVUser, "webDAVUser");
        Intrinsics.checkNotNullParameter(dir, "dir");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Sardine client = getClient(webDAVUser);
        String realUrl$default = getRealUrl$default(this, webDAVUser, dir + PackagingURIHelper.FORWARD_SLASH_STRING + fileName, false, 4, null);
        try {
            client.delete(realUrl$default);
        } catch (Exception e2) {
            CommonToolKt.mlog("delete file error", realUrl$default, e2);
        }
    }

    public final ApiResult<Object> read(WebDAVUser webDAVUser, String path) {
        Intrinsics.checkNotNullParameter(webDAVUser, "webDAVUser");
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            InputStream inputStream = getClient(webDAVUser).get(getRealUrl$default(this, webDAVUser, path, false, 4, null));
            ApiResult.Companion companion = ApiResult.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(inputStream, "inputStream");
            return companion.success(inputStreamToString(inputStream));
        } catch (Exception unused) {
            return ApiResult.INSTANCE.fail("读取失败");
        }
    }

    public final String inputStreamToString(InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter(inputStream, "inputStream");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charsets.UTF_8));
        StringBuilder sb = new StringBuilder();
        try {
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(line);
            }
            bufferedReader.close();
            String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "content.toString()");
            return string;
        } catch (Throwable th) {
            bufferedReader.close();
            throw th;
        }
    }

    public final String getWebDAVServerUrl(String platform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        return Intrinsics.areEqual(platform, "坚果云") ? "https://dav.jianguoyun.com/dav/" : "https://app.koofr.net/dav/";
    }

    public final int getWebDAVIcon(String platform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        int iHashCode = platform.hashCode();
        if (iHashCode != 22332239) {
            if (iHashCode != 72680823) {
                if (iHashCode == 1308159665 && platform.equals("GoogleDrive")) {
                    return R.mipmap.cloud;
                }
            } else if (platform.equals("Koofr")) {
                return R.mipmap.koofr;
            }
        } else if (platform.equals("坚果云")) {
            return R.mipmap.jgy;
        }
        return R.mipmap.cloud;
    }

    public final String getDefaultPath(WebDAVUser user) {
        Intrinsics.checkNotNullParameter(user, "user");
        String platform = user.getPlatform();
        switch (platform.hashCode()) {
            case -704590756:
                return !platform.equals("Dropbox") ? "/dav" : "/dav/Dropbox";
            case 22332239:
                platform.equals("坚果云");
                return "/dav";
            case 72680823:
                return !platform.equals("Koofr") ? "/dav" : "/dav/Koofr";
            case 1308159665:
                return !platform.equals("GoogleDrive") ? "/dav" : "/dav/GoogleDrive";
            case 2042064612:
                return !platform.equals("OneDrive") ? "/dav" : "/dav/OneDrive";
            default:
                return "/dav";
        }
    }
}