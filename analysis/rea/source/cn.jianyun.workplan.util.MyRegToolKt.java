package cn.jianyun.workplan.util;

import androidx.core.app.NotificationCompat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MyRegTool.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"isValidEmail", "", NotificationCompat.CATEGORY_EMAIL, "", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MyRegToolKt {
    public static final boolean isValidEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        Pattern patternCompile = Pattern.compile("^.+@.+\\.[A-Za-z]+$");
        Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(emailPattern)");
        Matcher matcher = patternCompile.matcher(email);
        Intrinsics.checkNotNullExpressionValue(matcher, "pattern.matcher(email)");
        return matcher.matches();
    }
}