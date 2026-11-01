package cn.jianyun.workplan.util;

import android.content.Context;
import android.net.Uri;
import androidx.compose.ui.util.ListUtilsKt;
import androidx.documentfile.provider.DocumentFile;
import cn.jianyun.workplan.api.ApiResult;
import com.alipay.sdk.m.t.e;
import com.wangmai.permission.androidsupport.FileProvider;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.apache.poi.openxml4j.opc.PackagingURIHelper;

/* JADX INFO: compiled from: MyFileUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bJ\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u001e\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bJ\"\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0010\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u0010\u0010\u0015\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0002J$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\bJ\u000e\u0010\u001a\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ$\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ&\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\b¨\u0006\u001f"}, d2 = {"Lcn/jianyun/workplan/util/MyFileUtil;", "", "()V", "cleanDir", "", "context", "Landroid/content/Context;", "basePath", "", "workSpace", "createDir", "", FileProvider.ATTR_PATH, "deleteFile", "file", "findWriteableDocumentFile", "Landroidx/documentfile/provider/DocumentFile;", "getFileName", "getNextFile", "dir", "fileName", "getParentPath", "getRealPath", "Landroid/net/Uri;", "readDirFiles", "", "readDirRelativePath", "readFileContent", "Lcn/jianyun/workplan/api/ApiResult;", "writeFile", e.m, "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MyFileUtil {
    public static final int $stable = 0;
    public static final MyFileUtil INSTANCE = new MyFileUtil();

    private MyFileUtil() {
    }

    public final boolean createDir(Context context, String basePath, String path) {
        Uri uri;
        Uri uri2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(path, "path");
        if ("".equals(path)) {
            return true;
        }
        DocumentFile documentFileFromTreeUri = DocumentFile.fromTreeUri(context, Uri.parse(basePath));
        CommonToolKt.mlog("root file", documentFileFromTreeUri);
        if (documentFileFromTreeUri == null) {
            CommonToolKt.mlog("file not exits1", basePath);
            return false;
        }
        if (!documentFileFromTreeUri.exists()) {
            CommonToolKt.mlog("file not exits2", basePath);
            return false;
        }
        if (!documentFileFromTreeUri.canWrite()) {
            CommonToolKt.mlog("file not write", basePath);
            return false;
        }
        CommonToolKt.mlog("root file exist", documentFileFromTreeUri);
        int i = 0;
        boolean z = true;
        while (z) {
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) path, PackagingURIHelper.FORWARD_SLASH_STRING, i, false, 4, (Object) null);
            if (iIndexOf$default < 0) {
                iIndexOf$default = path.length();
                z = false;
            }
            String strSubstring = path.substring(i, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String strSubstring2 = path.substring(0, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            CommonToolKt.mlog("next path", strSubstring2);
            Intrinsics.checkNotNull(documentFileFromTreeUri);
            DocumentFile nextFile = getNextFile(documentFileFromTreeUri, strSubstring);
            if (nextFile == null) {
                documentFileFromTreeUri = documentFileFromTreeUri.createDirectory(strSubstring);
                Object[] objArr = new Object[3];
                objArr[0] = "new file";
                objArr[1] = (documentFileFromTreeUri == null || (uri2 = documentFileFromTreeUri.getUri()) == null) ? null : uri2.getPath();
                objArr[2] = documentFileFromTreeUri != null ? Boolean.valueOf(documentFileFromTreeUri.canWrite()) : null;
                CommonToolKt.mlog(objArr);
            } else if (nextFile.isFile()) {
                nextFile.delete();
                documentFileFromTreeUri = documentFileFromTreeUri.createDirectory(strSubstring);
                Object[] objArr2 = new Object[3];
                objArr2[0] = "new file";
                objArr2[1] = (documentFileFromTreeUri == null || (uri = documentFileFromTreeUri.getUri()) == null) ? null : uri.getPath();
                objArr2[2] = documentFileFromTreeUri != null ? Boolean.valueOf(documentFileFromTreeUri.canWrite()) : null;
                CommonToolKt.mlog(objArr2);
            } else {
                CommonToolKt.mlog("child dir exists ", strSubstring2);
                documentFileFromTreeUri = nextFile;
            }
            i = iIndexOf$default + 1;
        }
        return true;
    }

    private final DocumentFile getNextFile(DocumentFile dir, String fileName) {
        DocumentFile documentFile;
        DocumentFile[] documentFileArrListFiles = dir.listFiles();
        Intrinsics.checkNotNullExpressionValue(documentFileArrListFiles, "dir.listFiles()");
        DocumentFile[] documentFileArr = documentFileArrListFiles;
        int length = documentFileArr.length;
        for (int i = 0; i < length; i++) {
            documentFile = documentFileArr[i];
            if (Intrinsics.areEqual(documentFile.getName(), fileName)) {
                return documentFile;
            }
        }
        documentFile = null;
        return documentFile;
    }

    private final String getParentPath(String path) {
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) path, PackagingURIHelper.FORWARD_SLASH_STRING, 0, false, 6, (Object) null);
        if (iLastIndexOf$default <= 0) {
            return "";
        }
        String strSubstring = path.substring(0, iLastIndexOf$default);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final String getFileName(String path) {
        int iLastIndexOf$default = StringsKt.lastIndexOf$default((CharSequence) path, PackagingURIHelper.FORWARD_SLASH_STRING, 0, false, 6, (Object) null);
        if (iLastIndexOf$default <= 0) {
            return path;
        }
        String strSubstring = path.substring(iLastIndexOf$default + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private final DocumentFile findWriteableDocumentFile(Context context, String basePath, String path) {
        CommonToolKt.mlog("start", basePath, path);
        boolean z = true;
        if (StringsKt.endsWith$default(path, PackagingURIHelper.FORWARD_SLASH_STRING, false, 2, (Object) null)) {
            path = path.substring(0, path.length() - 1);
            Intrinsics.checkNotNullExpressionValue(path, "substring(...)");
        }
        DocumentFile documentFileFromTreeUri = DocumentFile.fromTreeUri(context, Uri.parse(basePath));
        int i = 0;
        while (z) {
            int iIndexOf$default = StringsKt.indexOf$default((CharSequence) path, PackagingURIHelper.FORWARD_SLASH_STRING, i, false, 4, (Object) null);
            if (iIndexOf$default < 0) {
                iIndexOf$default = path.length();
                z = false;
            }
            String strSubstring = path.substring(i, iIndexOf$default);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Intrinsics.checkNotNull(documentFileFromTreeUri);
            documentFileFromTreeUri = getNextFile(documentFileFromTreeUri, strSubstring);
            if (documentFileFromTreeUri == null) {
                return null;
            }
            if (!z) {
                return documentFileFromTreeUri;
            }
            CommonToolKt.mlog("read next file", strSubstring, documentFileFromTreeUri, Boolean.valueOf(documentFileFromTreeUri.exists()));
            i = iIndexOf$default + 1;
        }
        Intrinsics.checkNotNull(documentFileFromTreeUri);
        return documentFileFromTreeUri;
    }

    private final Uri getRealPath(String basePath, String path) {
        Uri uri = Uri.parse(basePath + "%2F" + StringsKt.replace$default(path, PackagingURIHelper.FORWARD_SLASH_STRING, "%2F", false, 4, (Object) null));
        Intrinsics.checkNotNullExpressionValue(uri, "parse(basePath + \"%2F\" + path.replace(\"/\", \"%2F\"))");
        return uri;
    }

    public final String readDirRelativePath(String path) throws UnsupportedEncodingException {
        Intrinsics.checkNotNullParameter(path, "path");
        int iIndexOf$default = StringsKt.indexOf$default((CharSequence) path, "documents/tree/primary%3A", 0, false, 6, (Object) null);
        if (iIndexOf$default <= 0) {
            return path;
        }
        String strSubstring = path.substring(iIndexOf$default + 25);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return PackagingURIHelper.FORWARD_SLASH_STRING + URLDecoder.decode(StringsKt.replace$default(strSubstring, "%2F", PackagingURIHelper.FORWARD_SLASH_STRING, false, 4, (Object) null), "UTF-8");
    }

    public final void writeFile(Context context, String basePath, String path, String data) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(data, "data");
        CommonToolKt.mlog("start write file", basePath, path);
        try {
            createDir(context, basePath, getParentPath(path));
            String str = basePath + "%2F" + StringsKt.replace$default(getParentPath(path), PackagingURIHelper.FORWARD_SLASH_STRING, "%2F", false, 4, (Object) null);
            DocumentFile documentFileFindWriteableDocumentFile = findWriteableDocumentFile(context, basePath, getParentPath(path));
            Object[] objArr = new Object[3];
            objArr[0] = "parent file";
            objArr[1] = str;
            objArr[2] = documentFileFindWriteableDocumentFile != null ? Boolean.valueOf(documentFileFindWriteableDocumentFile.canWrite()) : null;
            CommonToolKt.mlog(objArr);
            if (documentFileFindWriteableDocumentFile != null) {
                DocumentFile documentFileCreateFile = documentFileFindWriteableDocumentFile.createFile("text/plan", getFileName(path));
                Intrinsics.checkNotNull(documentFileCreateFile);
                OutputStream outputStreamOpenOutputStream = context.getContentResolver().openOutputStream(documentFileCreateFile.getUri());
                if (outputStreamOpenOutputStream != null) {
                    byte[] bytes = data.getBytes(Charsets.UTF_8);
                    Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
                    outputStreamOpenOutputStream.write(bytes);
                }
            }
            CommonToolKt.mlog("write success");
        } catch (Exception e2) {
            CommonToolKt.mlog("write error", e2);
        }
    }

    public final List<String> readDirFiles(Context context, String basePath, String dir) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(dir, "dir");
        try {
            DocumentFile documentFileFindWriteableDocumentFile = findWriteableDocumentFile(context, basePath, getParentPath(dir));
            if (documentFileFindWriteableDocumentFile != null) {
                DocumentFile[] documentFileArrListFiles = documentFileFindWriteableDocumentFile.listFiles();
                Intrinsics.checkNotNullExpressionValue(documentFileArrListFiles, "parentDir.listFiles()");
                DocumentFile[] documentFileArr = documentFileArrListFiles;
                ArrayList arrayList = new ArrayList(documentFileArr.length);
                for (DocumentFile documentFile : documentFileArr) {
                    String name = documentFile.getName();
                    if (name == null) {
                        name = "";
                    }
                    arrayList.add(name);
                }
                return arrayList;
            }
        } catch (Exception unused) {
        }
        return CollectionsKt.emptyList();
    }

    public final ApiResult<Object> readFileContent(Context context, String basePath, String path) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(path, "path");
        try {
            DocumentFile documentFileFindWriteableDocumentFile = findWriteableDocumentFile(context, basePath, path);
            if (documentFileFindWriteableDocumentFile != null) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(context.getContentResolver().openInputStream(documentFileFindWriteableDocumentFile.getUri())));
                    List<String> lines = TextStreamsKt.readLines(bufferedReader);
                    bufferedReader.close();
                    return ApiResult.INSTANCE.success(ListUtilsKt.fastJoinToString$default(lines, "\n", null, null, 0, null, null, 62, null));
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return ApiResult.INSTANCE.fail("文件不存在");
                }
            }
        } catch (Exception unused) {
        }
        return ApiResult.INSTANCE.fail("文件不存在");
    }

    public final void cleanDir(Context context, String basePath, String workSpace) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(workSpace, "workSpace");
        DocumentFile documentFileFindWriteableDocumentFile = findWriteableDocumentFile(context, basePath, workSpace);
        CommonToolKt.mlog("origin dir", documentFileFindWriteableDocumentFile, workSpace);
        if (documentFileFindWriteableDocumentFile != null) {
            DocumentFile[] documentFileArrListFiles = documentFileFindWriteableDocumentFile.listFiles();
            Intrinsics.checkNotNullExpressionValue(documentFileArrListFiles, "originFile.listFiles()");
            for (DocumentFile documentFile : documentFileArrListFiles) {
                documentFile.delete();
            }
        }
    }

    public final void deleteFile(Context context, String basePath, String file) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(file, "file");
        DocumentFile documentFileFindWriteableDocumentFile = findWriteableDocumentFile(context, basePath, file);
        if (documentFileFindWriteableDocumentFile != null) {
            documentFileFindWriteableDocumentFile.delete();
        }
    }
}