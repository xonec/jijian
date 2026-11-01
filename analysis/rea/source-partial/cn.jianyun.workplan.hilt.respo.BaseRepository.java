package cn.jianyun.workplan.hilt.respo;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.core.app.NotificationCompat;
import androidx.core.view.ViewCompat;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.exifinterface.media.ExifInterface;
import cn.jianyun.timetable.widget.WidgetRefreshCallback;
import cn.jianyun.workplan.api.ApiResult;
import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.api.ConfigApi;
import cn.jianyun.workplan.api.FestivalData;
import cn.jianyun.workplan.api.TraceApi;
import cn.jianyun.workplan.api.TraceInfo;
import cn.jianyun.workplan.api.dto.AppTipInfo;
import cn.jianyun.workplan.main.receiver.AlarmWidgetReceiver;
import cn.jianyun.workplan.main.setting.user.User;
import cn.jianyun.workplan.model.LocalBackupConfig;
import cn.jianyun.workplan.module.base.dao.WebDAVUserDao;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import cn.jianyun.workplan.util.CacheUtil;
import cn.jianyun.workplan.util.CommonDateToolKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDataTool;
import cn.jianyun.workplan.util.MyDateTool;
import cn.jianyun.workplan.util.MyPhoneTool;
import cn.jianyun.workplan.widget.MyAppWidgetReceiver;
import cn.jianyun.workplan.widget.WidgetConfig;
import com.adgain.sdk.base.models.AdConstants;
import com.alibaba.fastjson2.JSON;
import com.alipay.sdk.m.t.e;
import com.alipay.sdk.m.u0.b;
import com.bykv.vk.component.ttvideo.player.C;
import com.bykv.vk.component.ttvideo.player.MediaFormat;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import com.bytedance.sdk.openadsdk.mediation.MediationConstant;
import com.wangmai.dexf;
import dagger.hilt.android.qualifiers.ApplicationContext;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.GlobalScope;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.logging.log4j.message.ParameterizedMessage;
import org.apache.poi.hssf.record.UnknownRecord;

/* JADX INFO: compiled from: BaseRepository.kt */
/* JADX INFO: loaded from: classes2.dex */
@Singleton
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0007\u0018\u00002\u00020\u0001BA\b\u0007\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\b\u0001\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010\u000fJ\u0019\u0010p\u001a\u00020\u00112\u0006\u0010q\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010rJ!\u0010s\u001a\u00020t2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010u\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010vJ!\u0010w\u001a\u00020t2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010u\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010xJ!\u0010y\u001a\u00020t2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010u\u001a\u00020HH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010zJ'\u0010{\u001a\u00020t\"\u0004\b\u0000\u0010|2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010u\u001a\u0002H|H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010}J\u001a\u0010~\u001a\u00020t2\u0006\u0010\u007f\u001a\u00020.H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0080\u0001J#\u0010\u0081\u0001\u001a\u00020t2\u0006\u0010q\u001a\u00020\u001f2\u0006\u0010u\u001a\u00020.H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0082\u0001J\u001a\u0010\u0083\u0001\u001a\u00020t2\u0006\u0010q\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010rJ\u0013\u0010\u0084\u0001\u001a\u00020tH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u001b\u0010\u0086\u0001\u001a\u00020t2\u0007\u0010\u0087\u0001\u001a\u00020\u001f2\t\b\u0002\u0010\u0088\u0001\u001a\u00020\u0011J\u0012\u0010\u0089\u0001\u001a\u00030\u008a\u00012\b\u0010\u008b\u0001\u001a\u00030\u008a\u0001J\u0007\u0010\u008c\u0001\u001a\u00020HJ)\u0010\u008d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001f\u0012\u0005\u0012\u00030\u008e\u00010M2\u0007\u0010\u008f\u0001\u001a\u00020HH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0090\u0001J\u0007\u0010\u0091\u0001\u001a\u00020HJ\u0007\u0010\u0092\u0001\u001a\u00020tJ\u0013\u0010\u0093\u0001\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J8\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u0002H|0\u0095\u0001\"\u0004\b\u0000\u0010|2\u0006\u0010q\u001a\u00020\u001f2\u000e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u0002H|0\u0097\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0098\u0001J%\u0010\u0099\u0001\u001a\u00020\u001f2\u0006\u0010q\u001a\u00020\u001f2\t\b\u0002\u0010\u009a\u0001\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010vJ\u001a\u0010\u009b\u0001\u001a\u00020H2\u0006\u0010q\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010rJ\u001a\u0010\u009c\u0001\u001a\u00020H2\u0006\u0010q\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010rJ\u001a\u0010\u009d\u0001\u001a\u00020H2\u0006\u0010q\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010rJ\u0007\u0010\u009e\u0001\u001a\u00020\u001fJ\u0013\u0010\u009f\u0001\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0013\u0010 \u0001\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0014\u0010¡\u0001\u001a\u00030¢\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0013\u0010£\u0001\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0013\u0010¤\u0001\u001a\u00020.H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0012\u0010O\u001a\u00020tH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J3\u0010¥\u0001\u001a\u0004\u0018\u0001H|\"\u0004\b\u0000\u0010|2\u0006\u0010q\u001a\u00020\u001f2\u000e\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u0002H|0\u0097\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0098\u0001J\u0012\u0010U\u001a\u00020HH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0012\u0010i\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0014\u0010¦\u0001\u001a\u00030§\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0014\u0010¨\u0001\u001a\u00030©\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0007\u0010ª\u0001\u001a\u00020\u0011J\u0013\u0010«\u0001\u001a\u00020tH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u001a\u0010¬\u0001\u001a\u00020H2\u0006\u0010q\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010rJ#\u0010¬\u0001\u001a\u00020H2\u0006\u0010q\u001a\u00020\u001f2\u0007\u0010\u009a\u0001\u001a\u00020HH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010zJ\u0007\u0010\u00ad\u0001\u001a\u00020\u0011J\u0007\u0010®\u0001\u001a\u00020\u0011J\u0019\u0010¯\u0001\u001a\u00020\u00112\u0007\u0010°\u0001\u001a\u00020\u001f2\u0007\u0010±\u0001\u001a\u00020HJ\u0007\u0010²\u0001\u001a\u00020\u0011J\u000f\u0010²\u0001\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u000eJ\u0007\u0010³\u0001\u001a\u00020\u0011J\u0007\u0010´\u0001\u001a\u00020\u0011J\u001b\u0010µ\u0001\u001a\n\u0012\u0005\u0012\u00030§\u00010\u0095\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u001d\u0010<\u001a\u00020t2\t\b\u0002\u0010¶\u0001\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010·\u0001J\u001a\u0010¸\u0001\u001a\u00020.2\u0006\u0010q\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010rJ\u001c\u0010¹\u0001\u001a\u00020t2\u0007\u0010A\u001a\u00030§\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010º\u0001J\u001c\u0010»\u0001\u001a\u00020t2\u0007\u0010¼\u0001\u001a\u00020@H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010½\u0001J(\u0010¾\u0001\u001a\u00020t2\u0013\u0010¿\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110MH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010À\u0001J\u0013\u0010Á\u0001\u001a\u00020tH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0010\u0010Â\u0001\u001a\u00020t2\u0007\u0010Ã\u0001\u001a\u00020\u001fJ\u0007\u0010Ä\u0001\u001a\u00020tJ\u001b\u0010Å\u0001\u001a\u00020t2\u0007\u0010Æ\u0001\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010rJ\u0010\u0010Ç\u0001\u001a\u00020t2\u0007\u0010Æ\u0001\u001a\u00020\u001fJ\u001b\u0010È\u0001\u001a\u00020t2\u0007\u0010°\u0001\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010rJ\u0013\u0010É\u0001\u001a\u00020tH\u0087@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0007\u0010Ê\u0001\u001a\u00020tJ\u0013\u0010Ë\u0001\u001a\u00020tH\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0007\u0010Ì\u0001\u001a\u00020tJ\u001d\u0010Í\u0001\u001a\u00020t2\b\u0010Î\u0001\u001a\u00030¢\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010Ï\u0001J\u001d\u0010Ð\u0001\u001a\u00020t2\b\u0010Ñ\u0001\u001a\u00030©\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010Ò\u0001J\u001a\u0010Ó\u0001\u001a\u00020\u001f2\u0006\u0010q\u001a\u00020\u001fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010rJ\u000f\u0010b\u001a\u00020t2\u0007\u0010Ô\u0001\u001a\u00020\u001fJ\u0013\u0010Õ\u0001\u001a\u00020\u0011H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u0085\u0001J\u0010\u0010Ö\u0001\u001a\u00020H2\u0007\u0010×\u0001\u001a\u00020\u001fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R+\u0010)\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010/\u001a\u00020.2\u0006\u0010(\u001a\u00020.8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b4\u0010-\u001a\u0004\b0\u00101\"\u0004\b2\u00103R+\u00105\u001a\u00020\u001f2\u0006\u0010(\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b8\u0010-\u001a\u0004\b6\u0010!\"\u0004\b7\u0010#R\u001a\u00109\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010\u0013\"\u0004\b;\u0010\u0015R+\u0010<\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010-\u001a\u0004\b=\u0010\u0013\"\u0004\b>\u0010\u0015R+\u0010A\u001a\u00020@2\u0006\u0010(\u001a\u00020@8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bF\u0010-\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001a\u0010G\u001a\u00020HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LRC\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110M2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00110M8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010-\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020HX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bU\u0010J\"\u0004\bV\u0010LR+\u0010W\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010-\u001a\u0004\bX\u0010\u0013\"\u0004\bY\u0010\u0015R+\u0010[\u001a\u00020H2\u0006\u0010(\u001a\u00020H8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010-\u001a\u0004\b\\\u0010J\"\u0004\b]\u0010LR\u001a\u0010_\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010!\"\u0004\ba\u0010#R\u001c\u0010b\u001a\u0004\u0018\u00010cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010h\u001a\u00020\u001fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bi\u0010!\"\u0004\bj\u0010#R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\bk\u0010lR\u001a\u0010m\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010\u0013\"\u0004\bo\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Ø\u0001"}, d2 = {"Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "", "datastore", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "traceApi", "Lcn/jianyun/workplan/api/TraceApi;", "api", "Lcn/jianyun/workplan/api/BaseApi;", "configApi", "Lcn/jianyun/workplan/api/ConfigApi;", "webDAVUserDao", "Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;", "context", "Landroid/content/Context;", "(Landroidx/datastore/core/DataStore;Lcn/jianyun/workplan/api/TraceApi;Lcn/jianyun/workplan/api/BaseApi;Lcn/jianyun/workplan/api/ConfigApi;Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;Landroid/content/Context;)V", "adVip", "", "getAdVip", "()Z", "setAdVip", "(Z)V", "getApi", "()Lcn/jianyun/workplan/api/BaseApi;", "appTipInfo", "Lcn/jianyun/workplan/api/dto/AppTipInfo;", "getAppTipInfo", "()Lcn/jianyun/workplan/api/dto/AppTipInfo;", "setAppTipInfo", "(Lcn/jianyun/workplan/api/dto/AppTipInfo;)V", "brand", "", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "getConfigApi", "()Lcn/jianyun/workplan/api/ConfigApi;", "getContext", "()Landroid/content/Context;", "<set-?>", "currentPage", "getCurrentPage", "setCurrentPage", "currentPage$delegate", "Landroidx/compose/runtime/MutableState;", "", "finishTime", "getFinishTime", "()J", "setFinishTime", "(J)V", "finishTime$delegate", "focusId", "getFocusId", "setFocusId", "focusId$delegate", "inited", "getInited", "setInited", "loading", "getLoading", "setLoading", "loading$delegate", "Lcn/jianyun/workplan/main/setting/user/User;", "loginUser", "getLoginUser", "()Lcn/jianyun/workplan/main/setting/user/User;", "setLoginUser", "(Lcn/jianyun/workplan/main/setting/user/User;)V", "loginUser$delegate", "minVipDay", "", "getMinVipDay", "()I", "setMinVipDay", "(I)V", "", "notifyStatus", "getNotifyStatus", "()Ljava/util/Map;", "setNotifyStatus", "(Ljava/util/Map;)V", "notifyStatus$delegate", "registDay", "getRegistDay", "setRegistDay", "showTip", "getShowTip", "setShowTip", "showTip$delegate", "sid", "getSid", "setSid", "sid$delegate", "sp", "getSp", "setSp", "toast", "Landroid/widget/Toast;", "getToast", "()Landroid/widget/Toast;", "setToast", "(Landroid/widget/Toast;)V", "uid", "getUid", "setUid", "getWebDAVUserDao", "()Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;", "wx", "getWx", "setWx", "booleanCache", "key", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cache", "", b.f2259d, "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheBoolean", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheInt", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheJsonValue", ExifInterface.GPS_DIRECTION_TRUE, "(Ljava/lang/String;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheLocalRegistTime", "time", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheLong", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheNow", "cleanOldAlarms", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "copyData", e.m, "showMsg", "enhanceTraceInfo", "Lcn/jianyun/workplan/api/TraceInfo;", "traceInfo", "fetchAdsValue", "fetchHoliday", "Lcn/jianyun/workplan/api/FestivalData;", "year", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchRecoverAdsValue", "finish", "getAppTheme", "getArrayCache", "", "cls", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCache", "defaultValue", "getCacheDay", "getCacheHour", "getCacheMinute", "getCurrentVersion", "getDid", "getLatestVersion", "getLocalBackupConfig", "Lcn/jianyun/workplan/model/LocalBackupConfig;", "getLocalPath", "getLocalRegistTime", "getObjectCache", "getWebDAVUser", "Lcn/jianyun/workplan/module/base/model/WebDAVUser;", "getWidgetConfig", "Lcn/jianyun/workplan/widget/WidgetConfig;", "hasRegist", "initApp", "intCache", "isAdVip", "isLogin", "isNeedReload", "page", "oldSid", "isNetworkAvailable", "isRealVip", "isVip", "listWebDAVUser", "delay", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "longCache", "makeJgyUser", "(Lcn/jianyun/workplan/module/base/model/WebDAVUser;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeLogin", "uu", "(Lcn/jianyun/workplan/main/setting/user/User;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeNotifyStatus", "map", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "makeRegist", "openUrl", "url", "playTap", "postEvent", NotificationCompat.CATEGORY_EVENT, "postEvent2", "postPage", "prepareRefreshWidgetData", "reload", "reloadAppData", "reloadWidget", "setLocalBackupConfig", "config", "(Lcn/jianyun/workplan/model/LocalBackupConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setWidgetConfig", "widgetConfig", "(Lcn/jianyun/workplan/widget/WidgetConfig;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeCache", "msg", "tryUpgrade", "weightedRandom", "ratio", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BaseRepository {
    public static final int $stable = 8;
    private boolean adVip;
    private final BaseApi api;
    private AppTipInfo appTipInfo;
    private String brand;
    private final ConfigApi configApi;
    private final Context context;

    /* JADX INFO: renamed from: currentPage$delegate, reason: from kotlin metadata */
    private final MutableState currentPage;
    private final DataStore<Preferences> datastore;

    /* JADX INFO: renamed from: finishTime$delegate, reason: from kotlin metadata */
    private final MutableState finishTime;

    /* JADX INFO: renamed from: focusId$delegate, reason: from kotlin metadata */
    private final MutableState focusId;
    private boolean inited;

    /* JADX INFO: renamed from: loading$delegate, reason: from kotlin metadata */
    private final MutableState loading;

    /* JADX INFO: renamed from: loginUser$delegate, reason: from kotlin metadata */
    private final MutableState loginUser;
    private int minVipDay;

    /* JADX INFO: renamed from: notifyStatus$delegate, reason: from kotlin metadata */
    private final MutableState notifyStatus;
    private int registDay;

    /* JADX INFO: renamed from: showTip$delegate, reason: from kotlin metadata */
    private final MutableState showTip;

    /* JADX INFO: renamed from: sid$delegate, reason: from kotlin metadata */
    private final MutableState sid;
    private String sp;
    private Toast toast;
    private final TraceApi traceApi;
    private String uid;
    private final WebDAVUserDao webDAVUserDao;
    private boolean wx;

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$booleanCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {480}, m = "booleanCache", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.booleanCache(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$cleanOldAlarms$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0, 0}, l = {725}, m = "cleanOldAlarms", n = {"this", "alarmManager"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.cleanOldAlarms(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$fetchHoliday$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0, 0, 0, 1, 1, 2}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_UPDATE_TIMESTAMP_MODE, 290, MediaPlayer.MEDIA_PLAYER_OPTION_LIVE_START_INDEX}, m = "fetchHoliday", n = {"this", "lstTime", "year", "this", "year", "rst"}, s = {"L$0", "L$1", "I$0", "L$0", "I$0", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        int I$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.fetchHoliday(0, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getArrayCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0}, l = {TarConstants.SPARSELEN_GNU_SPARSE}, m = "getArrayCache", n = {"cls"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getArrayCache(null, null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getCacheDay$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_FIRST_VIDEO_SEND_OUTLET_TIME}, m = "getCacheDay", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getCacheDay(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getCacheHour$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_CMAF_AUDIO_FIRSTSEG_CONNECT_TIME}, m = "getCacheHour", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getCacheHour(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getCacheMinute$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {468}, m = "getCacheMinute", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getCacheMinute(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getDid$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0, 1}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_SAVED_HOST_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_SWITCH_CACHE_TIME}, m = "getDid", n = {"this", "did"}, s = {"L$0", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getDid(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getLatestVersion$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {661}, m = "getLatestVersion", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getLatestVersion(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getLocalBackupConfig$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {586}, m = "getLocalBackupConfig", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getLocalBackupConfig(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getLocalPath$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {583}, m = "getLocalPath", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getLocalPath(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getLocalRegistTime$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_SET_LIVE_ABR_BITRATE_4UP_CEILING}, m = "getLocalRegistTime", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getLocalRegistTime(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getNotifyStatus$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {574}, m = "getNotifyStatus", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getNotifyStatus(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getObjectCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0}, l = {494}, m = "getObjectCache", n = {"cls"}, s = {"L$0"})
    static final class AnonymousClass1<T> extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getObjectCache(null, null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getRegistDay$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_AVPH_DNS_PARSE}, m = "getRegistDay", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getRegistDay(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getUid$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0, 1, 1, 2, 2, 2}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_OUTPUT_LOG, 225, UnknownRecord.PHONETICPR_00EF}, m = "getUid", n = {"this", "this", "uu", "this", "uu", "finalLocalRegistTime"}, s = {"L$0", "L$0", "L$1", "L$0", "L$1", "J$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getUid(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$getWidgetConfig$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {707}, m = "getWidgetConfig", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.getWidgetConfig(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$initApp$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0, 1, 2, 3, 4}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_DRM_DOWNGRADE, MediaPlayer.MEDIA_PLAYER_OPTION_DRM_CLOSE_ROOT_CHECK, MediaPlayer.MEDIA_PLAYER_OPTION_REND_FIRST_FRAME_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_BUFFERING_BEFORE_FIRST_FRAME, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_QCOM_VPP}, m = "initApp", n = {"this", "this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.initApp(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$intCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_DECODER_STALL_THRESHOLD}, m = "intCache", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.intCache(null, 0, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$longCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {435}, m = "longCache", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.longCache(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$makeLogin$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0, 0}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_DUMMY_VOICE_SLEEP}, m = "makeLogin", n = {"this", "uu"}, s = {"L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.makeLogin(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$makeNotifyStatus$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0}, l = {578, 579}, m = "makeNotifyStatus", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.makeNotifyStatus(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$makeRegist$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0, 1, 1, 1, 2, 2}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_PROCESSOR_ADDR, MediaPlayer.MEDIA_PLAYER_OPTION_VIDEO_RANGE_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_AUDIO_RANGE_TIME, MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_ASYNC}, m = "makeRegist", n = {"this", "this", "newUser", "now", "this", "newUser"}, s = {"L$0", "L$0", "L$1", "J$0", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.makeRegist(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$postEvent$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {600}, m = "postEvent", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.postEvent(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$postPage$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_DEMUXER_BEGIN_TIME}, m = "postPage", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.postPage(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$prepareRefreshWidgetData$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0, 0, 1, 1, 1}, l = {753, 761}, m = "prepareRefreshWidgetData", n = {"this", "alarmManager", "this", "alarmManager", "recentWidgetTimes"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.prepareRefreshWidgetData(this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$setWidgetConfig$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0}, l = {718}, m = "setWidgetConfig", n = {"this"}, s = {"L$0"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.setWidgetConfig(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$timeCache$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {}, l = {445}, m = "timeCache", n = {}, s = {})
    static final class AnonymousClass1 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.timeCache(null, this);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$tryUpgrade$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository", f = "BaseRepository.kt", i = {0, 1, 1}, l = {686, 691, 701}, m = "tryUpgrade", n = {"this", "this", "currentVersion"}, s = {"L$0", "L$0", "L$1"})
    static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BaseRepository.this.tryUpgrade(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public BaseRepository(@Named("app") DataStore<Preferences> datastore, TraceApi traceApi, BaseApi api, ConfigApi configApi, WebDAVUserDao webDAVUserDao, @ApplicationContext Context context) throws InterruptedException {
        Intrinsics.checkNotNullParameter(datastore, "datastore");
        Intrinsics.checkNotNullParameter(traceApi, "traceApi");
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(configApi, "configApi");
        Intrinsics.checkNotNullParameter(webDAVUserDao, "webDAVUserDao");
        Intrinsics.checkNotNullParameter(context, "context");
        this.datastore = datastore;
        this.traceApi = traceApi;
        this.api = api;
        this.configApi = configApi;
        this.webDAVUserDao = webDAVUserDao;
        this.context = context;
        this.currentPage = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.sid = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.sp = "";
        this.minVipDay = 5;
        this.showTip = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.focusId = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
        this.loading = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
        this.finishTime = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);
        this.brand = "";
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        this.loginUser = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new User(str, str2, str3, str4, str5, null, str6, null, str7, null, null, null, null, str8, null, null, null, null, 0L, 524287, null), null, 2, null);
        this.notifyStatus = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(MapsKt.emptyMap(), null, 2, null);
        this.appTipInfo = new AppTipInfo(null, str, str2, str3, str4, str5, 0, str6, 0, str7, 0, 0, 0, 0, str8, 0, 0, false, false, 0, 0, 0, null == true ? 1 : 0, null, 0L, null, null, null, false, false, 0, false, false, false, null, null, false, false, -1, 63, null);
        this.uid = "";
        Log.d("qz init base repository", "base repository");
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = this;
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass2(objectRef, null), 3, null);
    }

    public final BaseApi getApi() {
        return this.api;
    }

    public final ConfigApi getConfigApi() {
        return this.configApi;
    }

    public final WebDAVUserDao getWebDAVUserDao() {
        return this.webDAVUserDao;
    }

    public final Context getContext() {
        return this.context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getCurrentPage() {
        return (String) this.currentPage.getValue();
    }

    public final void setCurrentPage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.currentPage.setValue(str);
    }

    public final Toast getToast() {
        return this.toast;
    }

    public final void setToast(Toast toast) {
        this.toast = toast;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getSid() {
        return ((Number) this.sid.getValue()).intValue();
    }

    public final void setSid(int i) {
        this.sid.setValue(Integer.valueOf(i));
    }

    public final boolean getAdVip() {
        return this.adVip;
    }

    public final void setAdVip(boolean z) {
        this.adVip = z;
    }

    public final boolean getWx() {
        return this.wx;
    }

    public final void setWx(boolean z) {
        this.wx = z;
    }

    public final String getSp() {
        return this.sp;
    }

    public final void setSp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.sp = str;
    }

    public final int getMinVipDay() {
        return this.minVipDay;
    }

    public final void setMinVipDay(int i) {
        this.minVipDay = i;
    }

    public final int getRegistDay() {
        return this.registDay;
    }

    public final void setRegistDay(int i) {
        this.registDay = i;
    }

    public final boolean getInited() {
        return this.inited;
    }

    public final void setInited(boolean z) {
        this.inited = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowTip() {
        return ((Boolean) this.showTip.getValue()).booleanValue();
    }

    public final void setShowTip(boolean z) {
        this.showTip.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getFocusId() {
        return (String) this.focusId.getValue();
    }

    public final void setFocusId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.focusId.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getLoading() {
        return ((Boolean) this.loading.getValue()).booleanValue();
    }

    public final void setLoading(boolean z) {
        this.loading.setValue(Boolean.valueOf(z));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long getFinishTime() {
        return ((Number) this.finishTime.getValue()).longValue();
    }

    public final void setFinishTime(long j) {
        this.finishTime.setValue(Long.valueOf(j));
    }

    public final String getBrand() {
        return this.brand;
    }

    public final void setBrand(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.brand = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final User getLoginUser() {
        return (User) this.loginUser.getValue();
    }

    public final void setLoginUser(User user) {
        Intrinsics.checkNotNullParameter(user, "<set-?>");
        this.loginUser.setValue(user);
    }

    public final Map<String, Boolean> getNotifyStatus() {
        return (Map) this.notifyStatus.getValue();
    }

    public final void setNotifyStatus(Map<String, Boolean> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.notifyStatus.setValue(map);
    }

    public final AppTipInfo getAppTipInfo() {
        return this.appTipInfo;
    }

    public final void setAppTipInfo(AppTipInfo appTipInfo) {
        Intrinsics.checkNotNullParameter(appTipInfo, "<set-?>");
        this.appTipInfo = appTipInfo;
    }

    public final String getUid() {
        return this.uid;
    }

    public final void setUid(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.uid = str;
    }

    public final boolean isLogin() {
        return (Intrinsics.areEqual(getLoginUser().getUuid(), "") || Intrinsics.areEqual(getLoginUser().getUsername(), "")) ? false : true;
    }

    public final boolean isNeedReload(String page, int oldSid) {
        Intrinsics.checkNotNullParameter(page, "page");
        return oldSid != getSid();
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$hasRegist$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository$hasRegist$1", f = "BaseRepository.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseRepository.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = BaseRepository.this.getLocalRegistTime(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Boxing.boxBoolean(((Number) obj).longValue() > 0);
        }
    }

    public final boolean hasRegist() {
        return ((Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(null), 1, null)).booleanValue();
    }

    public final boolean isVip() {
        return isAdVip() || this.adVip;
    }

    public final boolean isAdVip() {
        return (!Intrinsics.areEqual(getLoginUser().getVipDate(), "") && getLoginUser().getVipDate().compareTo(CommonDateToolKt.dateStr(new Date())) >= 0) || this.registDay < ((Number) CommonToolKt.ifv(this.minVipDay < 5, 5, Integer.valueOf(this.minVipDay))).intValue();
    }

    public final boolean isRealVip() {
        return getLoginUser().isVip();
    }

    public final void openUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(url));
        intent.setFlags(C.ENCODING_PCM_MU_LAW);
        this.context.startActivity(intent);
    }

    public static /* synthetic */ Object loading$default(BaseRepository baseRepository, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return baseRepository.loading(z, continuation);
    }

    public final Object loading(boolean z, Continuation<? super Unit> continuation) throws Throwable {
        if (getLoading()) {
            return Unit.INSTANCE;
        }
        setLoading(true);
        if (z) {
            setFinishTime(System.currentTimeMillis() + ((long) 200));
            Object objDelay = DelayKt.delay(200L, continuation);
            return objDelay == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objDelay : Unit.INSTANCE;
        }
        setFinishTime(System.currentTimeMillis());
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository$1", f = "BaseRepository.kt", i = {}, l = {149}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Integer>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseRepository.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Integer> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            BaseRepository baseRepository;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BaseRepository baseRepository2 = BaseRepository.this;
                this.L$0 = baseRepository2;
                this.label = 1;
                Object uid = baseRepository2.getUid(this);
                if (uid == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseRepository = baseRepository2;
                obj = uid;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseRepository = (BaseRepository) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            baseRepository.setUid((String) obj);
            return Boxing.boxInt(Log.d("qz init base repository finish", "base repository finish"));
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$2, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository$2", f = "BaseRepository.kt", i = {3, 3, 3, 3, 4}, l = {158, 159, 161, 167, 171, 191}, m = "invokeSuspend", n = {MediationConstant.ADN_KS, "destination$iv$iv", "element$iv$iv", "one", MediationConstant.ADN_KS}, s = {"L$0", "L$2", "L$4", "L$5", "L$0"})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<BaseRepository> $that;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Ref.ObjectRef<BaseRepository> objectRef, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$that = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseRepository.this.new AnonymousClass2(this.$that, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:30:0x00e5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:31:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
        /* JADX WARN: Code duplicated, block: B:37:0x0103  */
        /* JADX WARN: Code duplicated, block: B:39:0x0106  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00e6 -> B:32:0x00ef). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r15) {
            /*
                Method dump skipped, instruction units count: 734
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.hilt.respo.BaseRepository.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ac A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:44:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object initApp(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        BaseRepository baseRepository2;
        BaseRepository baseRepository3;
        BaseRepository baseRepository4;
        BaseRepository baseRepository5;
        AppTipInfo appTipInfo;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object registDay = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(registDay);
            if (this.inited) {
                return Unit.INSTANCE;
            }
            String str = CacheUtil.get(this.context, "brand");
            Intrinsics.checkNotNullExpressionValue(str, "get(context, \"brand\")");
            this.brand = str;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (getUid(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
        } else {
            if (i == 1) {
                baseRepository = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(registDay);
            } else if (i == 2) {
                baseRepository = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(registDay);
                anonymousClass1.L$0 = baseRepository;
                anonymousClass1.L$1 = baseRepository;
                anonymousClass1.label = 3;
                registDay = baseRepository.getRegistDay(anonymousClass1);
                if (registDay == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseRepository2 = baseRepository;
                baseRepository.registDay = ((Number) registDay).intValue();
                anonymousClass1.L$0 = baseRepository2;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 4;
                if (baseRepository2.getNotifyStatus(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseRepository3 = baseRepository2;
                anonymousClass1.L$0 = baseRepository3;
                anonymousClass1.L$1 = baseRepository3;
                anonymousClass1.label = 5;
                registDay = baseRepository3.getObjectCache("appTipConfig", AppTipInfo.class, anonymousClass1);
                if (registDay == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseRepository4 = baseRepository3;
                baseRepository5 = baseRepository4;
            } else if (i == 3) {
                baseRepository = (BaseRepository) anonymousClass1.L$1;
                baseRepository2 = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(registDay);
                baseRepository.registDay = ((Number) registDay).intValue();
                anonymousClass1.L$0 = baseRepository2;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 4;
                if (baseRepository2.getNotifyStatus(anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseRepository3 = baseRepository2;
                anonymousClass1.L$0 = baseRepository3;
                anonymousClass1.L$1 = baseRepository3;
                anonymousClass1.label = 5;
                registDay = baseRepository3.getObjectCache("appTipConfig", AppTipInfo.class, anonymousClass1);
                if (registDay == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseRepository4 = baseRepository3;
                baseRepository5 = baseRepository4;
            } else if (i == 4) {
                baseRepository3 = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(registDay);
                anonymousClass1.L$0 = baseRepository3;
                anonymousClass1.L$1 = baseRepository3;
                anonymousClass1.label = 5;
                registDay = baseRepository3.getObjectCache("appTipConfig", AppTipInfo.class, anonymousClass1);
                if (registDay == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseRepository4 = baseRepository3;
                baseRepository5 = baseRepository4;
            } else {
                if (i != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                baseRepository5 = (BaseRepository) anonymousClass1.L$1;
                baseRepository4 = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(registDay);
            }
            appTipInfo = (AppTipInfo) registDay;
            if (appTipInfo == null) {
                appTipInfo = new AppTipInfo(null, null, null, null, null, null, 0, null, 0, null, 0, 0, 0, 0, null, 0, 0, false, false, 0, 0, 0, null, null, 0L, null, null, null, false, false, 0, false, false, false, null, null, false, false, -1, 63, null);
            }
            baseRepository5.appTipInfo = appTipInfo;
            baseRepository4.inited = true;
            return Unit.INSTANCE;
        }
        anonymousClass1.L$0 = baseRepository;
        anonymousClass1.label = 2;
        if (baseRepository.getDid(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        anonymousClass1.L$0 = baseRepository;
        anonymousClass1.L$1 = baseRepository;
        anonymousClass1.label = 3;
        registDay = baseRepository.getRegistDay(anonymousClass1);
        if (registDay == coroutine_suspended) {
            return coroutine_suspended;
        }
        baseRepository2 = baseRepository;
        baseRepository.registDay = ((Number) registDay).intValue();
        anonymousClass1.L$0 = baseRepository2;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 4;
        if (baseRepository2.getNotifyStatus(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        baseRepository3 = baseRepository2;
        anonymousClass1.L$0 = baseRepository3;
        anonymousClass1.L$1 = baseRepository3;
        anonymousClass1.label = 5;
        registDay = baseRepository3.getObjectCache("appTipConfig", AppTipInfo.class, anonymousClass1);
        if (registDay == coroutine_suspended) {
            return coroutine_suspended;
        }
        baseRepository4 = baseRepository3;
        baseRepository5 = baseRepository4;
        appTipInfo = (AppTipInfo) registDay;
        if (appTipInfo == null) {
            appTipInfo = new AppTipInfo(null, null, null, null, null, null, 0, null, 0, null, 0, 0, 0, 0, null, 0, 0, false, false, 0, 0, 0, null, null, 0L, null, null, null, false, false, 0, false, false, false, null, null, false, false, -1, 63, null);
        }
        baseRepository5.appTipInfo = appTipInfo;
        baseRepository4.inited = true;
        return Unit.INSTANCE;
    }

    public final void finish() {
        if (System.currentTimeMillis() > getFinishTime()) {
            setLoading(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object getUid(Continuation<? super String> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        User user;
        long jLongValue;
        long time;
        Date dateTimeString;
        BaseRepository baseRepository2;
        User user2;
        long j;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objectCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objectCache);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objectCache = getObjectCache("uu", User.class, anonymousClass1);
            if (objectCache == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
        } else {
            if (i == 1) {
                baseRepository = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objectCache);
            } else {
                if (i == 2) {
                    User user3 = (User) anonymousClass1.L$1;
                    BaseRepository baseRepository3 = (BaseRepository) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(objectCache);
                    user = user3;
                    baseRepository = baseRepository3;
                    jLongValue = ((Number) objectCache).longValue();
                    if (user.getRegistTime() > 0) {
                        time = user.getRegistTime();
                    } else if (!Intrinsics.areEqual(user.getGmtCreate(), "") || (dateTimeString = MyDateTool.parseDateTimeString(user.getGmtCreate())) == null) {
                        time = 0;
                    } else {
                        time = dateTimeString.getTime();
                    }
                    if (jLongValue <= 0 && time > 0) {
                        time = Math.min(jLongValue, time);
                    } else if (jLongValue > 0) {
                        time = jLongValue;
                    }
                    if (time > 0 && time != jLongValue) {
                        anonymousClass1.L$0 = baseRepository;
                        anonymousClass1.L$1 = user;
                        anonymousClass1.J$0 = time;
                        anonymousClass1.label = 3;
                        if (baseRepository.cacheLong("localRegistTime", time, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        baseRepository2 = baseRepository;
                        user2 = user;
                        j = time;
                    }
                    user.setRegistTime(time);
                    baseRepository.setLoginUser(user);
                    return baseRepository.getLoginUser().getUuid();
                }
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = anonymousClass1.J$0;
                user2 = (User) anonymousClass1.L$1;
                baseRepository2 = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objectCache);
            }
            time = j;
            user = user2;
            baseRepository = baseRepository2;
            user.setRegistTime(time);
            baseRepository.setLoginUser(user);
            return baseRepository.getLoginUser().getUuid();
        }
        User user4 = (User) objectCache;
        if (user4 != null) {
            anonymousClass1.L$0 = baseRepository;
            anonymousClass1.L$1 = user4;
            anonymousClass1.label = 2;
            Object objLongCache = baseRepository.longCache("localRegistTime", anonymousClass1);
            if (objLongCache == coroutine_suspended) {
                return coroutine_suspended;
            }
            user = user4;
            objectCache = objLongCache;
            jLongValue = ((Number) objectCache).longValue();
            if (user.getRegistTime() > 0) {
                time = user.getRegistTime();
            } else if (Intrinsics.areEqual(user.getGmtCreate(), "")) {
                time = 0;
            } else {
                time = 0;
            }
            if (jLongValue <= 0) {
                if (jLongValue > 0) {
                    time = jLongValue;
                }
            } else if (jLongValue > 0) {
                time = jLongValue;
            }
            if (time > 0) {
                anonymousClass1.L$0 = baseRepository;
                anonymousClass1.L$1 = user;
                anonymousClass1.J$0 = time;
                anonymousClass1.label = 3;
                if (baseRepository.cacheLong("localRegistTime", time, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseRepository2 = baseRepository;
                user2 = user;
                j = time;
                time = j;
                user = user2;
                baseRepository = baseRepository2;
            }
            user.setRegistTime(time);
            baseRepository.setLoginUser(user);
        } else {
            baseRepository.setLoginUser(new User(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 0L, 524287, null));
        }
        return baseRepository.getLoginUser().getUuid();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object makeRegist(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        User user;
        BaseRepository baseRepository2;
        long j;
        User user2;
        BaseRepository baseRepository3;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objectCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objectCache);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objectCache = getObjectCache("uu", User.class, anonymousClass1);
            if (objectCache == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
        } else {
            if (i == 1) {
                baseRepository = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objectCache);
            } else if (i == 2) {
                j = anonymousClass1.J$0;
                User user3 = (User) anonymousClass1.L$1;
                baseRepository2 = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objectCache);
                user = user3;
                anonymousClass1.L$0 = baseRepository2;
                anonymousClass1.L$1 = user;
                anonymousClass1.label = 3;
                if (baseRepository2.cacheLong("localRegistTime", j, anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                user2 = user;
                baseRepository3 = baseRepository2;
                baseRepository3.uid = user2.getUuid();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 4;
                if (baseRepository3.postPage("home", anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 3) {
                user2 = (User) anonymousClass1.L$1;
                baseRepository3 = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objectCache);
                baseRepository3.uid = user2.getUuid();
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 4;
                if (baseRepository3.postPage("home", anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objectCache);
            }
            return Unit.INSTANCE;
        }
        user = (User) objectCache;
        if (user != null && !Intrinsics.areEqual(user.getUuid(), "")) {
            return Unit.INSTANCE;
        }
        Intrinsics.checkNotNull(user);
        long jCurrentTimeMillis = System.currentTimeMillis();
        user.setRegistTime(jCurrentTimeMillis);
        user.setUuid(CommonToolKt.uuid());
        anonymousClass1.L$0 = baseRepository;
        anonymousClass1.L$1 = user;
        anonymousClass1.J$0 = jCurrentTimeMillis;
        anonymousClass1.label = 2;
        if (baseRepository.cacheJsonValue("uu", user, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        baseRepository2 = baseRepository;
        j = jCurrentTimeMillis;
        anonymousClass1.L$0 = baseRepository2;
        anonymousClass1.L$1 = user;
        anonymousClass1.label = 3;
        if (baseRepository2.cacheLong("localRegistTime", j, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        user2 = user;
        baseRepository3 = baseRepository2;
        baseRepository3.uid = user2.getUuid();
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 4;
        if (baseRepository3.postPage("home", anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getDid(Continuation<? super String> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        String str;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object cache$default = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i != 0) {
            if (i == 1) {
                baseRepository = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(cache$default);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) anonymousClass1.L$0;
                ResultKt.throwOnFailure(cache$default);
            }
            return str;
        }
        ResultKt.throwOnFailure(cache$default);
        anonymousClass1.L$0 = this;
        anonymousClass1.label = 1;
        cache$default = getCache$default(this, "did", null, anonymousClass1, 2, null);
        if (cache$default == coroutine_suspended) {
            return coroutine_suspended;
        }
        baseRepository = this;
        String str2 = (String) cache$default;
        if (!Intrinsics.areEqual(str2, "")) {
            return str2;
        }
        String did = MyPhoneTool.INSTANCE.getDid();
        anonymousClass1.L$0 = did;
        anonymousClass1.label = 2;
        if (baseRepository.cache("did", did, anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        str = did;
        return str;
    }

    public final String getCurrentVersion() {
        String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        return str == null ? dexf.dexg : str;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00f2 A[Catch: Exception -> 0x0126, LOOP:0: B:39:0x00ec->B:41:0x00f2, LOOP_END, TryCatch #0 {Exception -> 0x0126, blocks: (B:14:0x0035, B:46:0x0123, B:19:0x0048, B:37:0x00c1, B:38:0x00d7, B:39:0x00ec, B:41:0x00f2, B:42:0x0104, B:22:0x0057, B:29:0x0092, B:31:0x009a, B:33:0x00af, B:25:0x0067), top: B:50:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0121 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0122  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ad, code lost:
    
        if ((r9 - r2.longValue()) > 432000000) goto L33;
     */
    /* JADX WARN: Type inference failed for: r4v2, types: [T, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchHoliday(int i, Continuation<? super Map<String, FestivalData>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Long lstTime;
        BaseRepository baseRepository;
        List<FestivalData> list;
        BaseRepository baseRepository2;
        Ref.ObjectRef objectRef;
        String str;
        Ref.ObjectRef objectRef2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object arrayCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(arrayCache);
                CommonToolKt.mlog("start fetch festival data");
                lstTime = CacheUtil.getLong(this.context, "lastYear", Boxing.boxLong(0L));
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = lstTime;
                anonymousClass1.I$0 = i;
                anonymousClass1.label = 1;
                arrayCache = getArrayCache("hyear" + i, FestivalData.class, anonymousClass1);
                if (arrayCache == coroutine_suspended) {
                    return coroutine_suspended;
                }
                baseRepository = this;
            } else {
                if (i2 == 1) {
                    i = anonymousClass1.I$0;
                    lstTime = (Long) anonymousClass1.L$1;
                    baseRepository = (BaseRepository) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(arrayCache);
                } else if (i2 == 2) {
                    i = anonymousClass1.I$0;
                    baseRepository2 = (BaseRepository) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(arrayCache);
                    list = (List) ((ApiResult) arrayCache).fetchResult();
                    CacheUtil.setLong(baseRepository2.context, "lastYear", Boxing.boxLong(System.currentTimeMillis()));
                    baseRepository = baseRepository2;
                    objectRef = new Ref.ObjectRef();
                    objectRef.element = new LinkedHashMap();
                    for (FestivalData festivalData : list) {
                        ((Map) objectRef.element).put(festivalData.getDate(), festivalData);
                    }
                    str = "hyear" + i;
                    anonymousClass1.L$0 = objectRef;
                    anonymousClass1.L$1 = null;
                    anonymousClass1.label = 3;
                    if (baseRepository.cacheJsonValue(str, list, anonymousClass1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    objectRef2 = objectRef;
                } else {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef2 = (Ref.ObjectRef) anonymousClass1.L$0;
                    ResultKt.throwOnFailure(arrayCache);
                }
                return objectRef2.element;
            }
            list = (List) arrayCache;
            if (!list.isEmpty()) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Intrinsics.checkNotNullExpressionValue(lstTime, "lstTime");
            }
            BaseApi baseApi = baseRepository.api;
            anonymousClass1.L$0 = baseRepository;
            anonymousClass1.L$1 = null;
            anonymousClass1.I$0 = i;
            anonymousClass1.label = 2;
            arrayCache = baseApi.fetchHoliday(i, anonymousClass1);
            if (arrayCache == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository2 = baseRepository;
            list = (List) ((ApiResult) arrayCache).fetchResult();
            CacheUtil.setLong(baseRepository2.context, "lastYear", Boxing.boxLong(System.currentTimeMillis()));
            baseRepository = baseRepository2;
            objectRef = new Ref.ObjectRef();
            objectRef.element = new LinkedHashMap();
            while (r4.hasNext()) {
                ((Map) objectRef.element).put(festivalData.getDate(), festivalData);
            }
            str = "hyear" + i;
            anonymousClass1.L$0 = objectRef;
            anonymousClass1.L$1 = null;
            anonymousClass1.label = 3;
            if (baseRepository.cacheJsonValue(str, list, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            objectRef2 = objectRef;
            return objectRef2.element;
        } catch (Exception unused) {
            return MapsKt.emptyMap();
        }
    }

    public final void reload() {
        if (getLoading()) {
            finish();
        }
        setSid(getSid() + 1);
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(null), 3, null);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$reload$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository$reload$1", f = "BaseRepository.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ADVANCE_CHECK_BUFFERING_END}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseRepository.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                if (BaseRepository.this.reloadAppData(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public final Object reloadAppData(Continuation<? super Unit> continuation) throws Throwable {
        reloadWidget();
        Object objPrepareRefreshWidgetData = prepareRefreshWidgetData(continuation);
        return objPrepareRefreshWidgetData == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objPrepareRefreshWidgetData : Unit.INSTANCE;
    }

    public static /* synthetic */ void copyData$default(BaseRepository baseRepository, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        baseRepository.copyData(str, z);
    }

    public final void copyData(String data, boolean showMsg) {
        Intrinsics.checkNotNullParameter(data, "data");
        Object systemService = this.context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("text", data));
        if (showMsg) {
            toast("复制成功");
        }
    }

    public final void toast(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (getLoading()) {
            finish();
        }
        Toast toast = this.toast;
        if (toast != null) {
            Intrinsics.checkNotNull(toast);
            toast.cancel();
        }
        try {
            Toast toastMakeText = Toast.makeText(this.context, msg, CommonToolKt.getToastMessageLength(msg));
            this.toast = toastMakeText;
            Intrinsics.checkNotNull(toastMakeText);
            toastMakeText.show();
        } catch (Exception e2) {
            CommonToolKt.mlog("toast error", e2);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$cache$2, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository$cache$2", f = "BaseRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ String $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, String str2, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$value = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$value, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(CommonToolKt.makePKey$default(this.$key, null, 2, null), this.$value);
            return Unit.INSTANCE;
        }
    }

    public final Object cache(String str, String str2, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(this.datastore, new AnonymousClass2(str, str2, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    public static /* synthetic */ Object getCache$default(BaseRepository baseRepository, String str, String str2, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "";
        }
        return baseRepository.getCache(str, str2, continuation);
    }

    public final Object getCache(String str, String str2, Continuation<? super String> continuation) {
        return CommonToolKt.getStringValue(this.datastore, str, str2, continuation);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$cacheInt$2, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository$cacheInt$2", f = "BaseRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ int $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, int i, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$value = i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$value, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(CommonToolKt.makePKey$default(this.$key, null, 2, null), String.valueOf(this.$value));
            return Unit.INSTANCE;
        }
    }

    public final Object cacheInt(String str, int i, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(this.datastore, new AnonymousClass2(str, i, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object intCache(String str, int i, Continuation<? super Integer> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object cache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(cache);
            String strValueOf = String.valueOf(i);
            anonymousClass1.label = 1;
            cache = getCache(str, strValueOf, anonymousClass1);
            if (cache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(cache);
        }
        try {
            return Boxing.boxInt(Integer.parseInt((String) cache));
        } catch (Exception unused) {
            return Boxing.boxInt(0);
        }
    }

    public final int fetchAdsValue() {
        return weightedRandom(this.appTipInfo.getAdsValue());
    }

    public final int fetchRecoverAdsValue() {
        return weightedRandom(this.appTipInfo.getRecoverAdsValue());
    }

    public final int weightedRandom(String ratio) {
        Intrinsics.checkNotNullParameter(ratio, "ratio");
        if (!StringsKt.contains$default((CharSequence) ratio, (CharSequence) ParameterizedMessage.ERROR_MSG_SEPARATOR, false, 2, (Object) null)) {
            ratio = "10:1";
        }
        List listSplit$default = StringsKt.split$default((CharSequence) ratio, new String[]{ParameterizedMessage.ERROR_MSG_SEPARATOR}, false, 0, 6, (Object) null);
        if (listSplit$default.size() != 2) {
            System.out.println((Object) "错误：比值格式不正确，应为 '权重1:权重2' 的正整数格式");
            return 1;
        }
        Integer intOrNull = StringsKt.toIntOrNull((String) listSplit$default.get(0));
        Integer intOrNull2 = StringsKt.toIntOrNull((String) listSplit$default.get(1));
        if (intOrNull != null && intOrNull2 != null && intOrNull.intValue() > 0 && intOrNull2.intValue() > 0) {
            return RangesKt.random(new IntRange(1, intOrNull.intValue() + intOrNull2.intValue()), Random.INSTANCE) <= intOrNull.intValue() ? 1 : 2;
        }
        System.out.println((Object) "错误：比值格式不正确，应为 '权重1:权重2' 的正整数格式");
        return 1;
    }

    public final Object intCache(String str, Continuation<? super Integer> continuation) {
        return intCache(str, 0, continuation);
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$cacheLong$2, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository$cacheLong$2", f = "BaseRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ long $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, long j, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$value = j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$value, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(CommonToolKt.makePKey$default(this.$key, null, 2, null), String.valueOf(this.$value));
            return Unit.INSTANCE;
        }
    }

    public final Object cacheLong(String str, long j, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(this.datastore, new AnonymousClass2(str, j, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$cacheNow$2, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository$cacheNow$2", f = "BaseRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$key = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(CommonToolKt.makePKey$default(this.$key, null, 2, null), String.valueOf(System.currentTimeMillis()));
            return Unit.INSTANCE;
        }
    }

    public final Object cacheNow(String str, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(this.datastore, new AnonymousClass2(str, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object longCache(String str, Continuation<? super Long> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object cache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(cache);
            anonymousClass1.label = 1;
            cache = getCache(str, AdConstants.FAIL, anonymousClass1);
            if (cache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(cache);
        }
        try {
            return Boxing.boxLong(Long.parseLong((String) cache));
        } catch (Exception unused) {
            return Boxing.boxLong(0L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object timeCache(String str, Continuation<? super String> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objLongCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objLongCache);
            anonymousClass1.label = 1;
            objLongCache = longCache(str, anonymousClass1);
            if (objLongCache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLongCache);
        }
        long jLongValue = ((Number) objLongCache).longValue();
        return jLongValue == 0 ? "" : CommonDateToolKt.datetimeStr(new Date(jLongValue));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getCacheHour(String str, Continuation<? super Integer> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objLongCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objLongCache);
            anonymousClass1.label = 1;
            objLongCache = longCache(str, anonymousClass1);
            if (objLongCache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLongCache);
        }
        return Boxing.boxInt((int) (((System.currentTimeMillis() - ((Number) objLongCache).longValue()) / ((long) 1000)) / ((long) 3600)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getCacheDay(String str, Continuation<? super Integer> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objLongCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objLongCache);
            anonymousClass1.label = 1;
            objLongCache = longCache(str, anonymousClass1);
            if (objLongCache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLongCache);
        }
        long jLongValue = ((Number) objLongCache).longValue();
        if (jLongValue == 0) {
            return Boxing.boxInt(0);
        }
        return Boxing.boxInt((int) ((((System.currentTimeMillis() - jLongValue) / ((long) 1000)) / ((long) 3600)) / ((long) 24)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getCacheMinute(String str, Continuation<? super Integer> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objLongCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objLongCache);
            anonymousClass1.label = 1;
            objLongCache = longCache(str, anonymousClass1);
            if (objLongCache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objLongCache);
        }
        return Boxing.boxInt((int) (((System.currentTimeMillis() - ((Number) objLongCache).longValue()) / ((long) 1000)) / ((long) 60)));
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$cacheBoolean$2, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/datastore/preferences/core/MutablePreferences;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository$cacheBoolean$2", f = "BaseRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass2 extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $key;
        final /* synthetic */ boolean $value;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, boolean z, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$key = str;
            this.$value = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$key, this.$value, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ((MutablePreferences) this.L$0).set(CommonToolKt.makePKey$default(this.$key, null, 2, null), String.valueOf(this.$value));
            return Unit.INSTANCE;
        }
    }

    public final Object cacheBoolean(String str, boolean z, Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(this.datastore, new AnonymousClass2(str, z, null), continuation);
        return objEdit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object booleanCache(String str, Continuation<? super Boolean> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object cache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(cache);
            anonymousClass1.label = 1;
            cache = getCache(str, "false", anonymousClass1);
            if (cache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(cache);
        }
        try {
            return Boxing.boxBoolean(Boolean.parseBoolean((String) cache));
        } catch (Exception unused) {
            return Boxing.boxBoolean(false);
        }
    }

    public final <T> Object cacheJsonValue(String str, T t, Continuation<? super Unit> continuation) {
        String jSONString = JSON.toJSONString(t);
        Intrinsics.checkNotNullExpressionValue(jSONString, "toJSONString(value)");
        Object objCache = cache(str, jSONString, continuation);
        return objCache == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCache : Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final <T> Object getObjectCache(String str, Class<T> cls, Continuation<? super T> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object cache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(cache);
            anonymousClass1.L$0 = cls;
            anonymousClass1.label = 1;
            cache = getCache(str, "{}", anonymousClass1);
            if (cache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cls = (Class) anonymousClass1.L$0;
            ResultKt.throwOnFailure(cache);
        }
        try {
            return JSON.parseObject((String) cache, (Class) cls);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final <T> Object getArrayCache(String str, Class<T> cls, Continuation<? super List<? extends T>> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object cache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(cache);
            anonymousClass1.L$0 = cls;
            anonymousClass1.label = 1;
            cache = getCache(str, "{}", anonymousClass1);
            if (cache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            cls = (Class) anonymousClass1.L$0;
            ResultKt.throwOnFailure(cache);
        }
        try {
            List array = JSON.parseArray((String) cache, (Class) cls);
            Intrinsics.checkNotNullExpressionValue(array, "parseArray(value, cls)");
            return array;
        } catch (Exception unused) {
            return CollectionsKt.emptyList();
        }
    }

    public final boolean isNetworkAvailable(Context context) {
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(2);
    }

    public final void playTap() {
        Object systemService = this.context.getSystemService(MediaFormat.KEY_AUDIO);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        ((AudioManager) systemService).playSoundEffect(0, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object makeLogin(User user, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = user;
            anonymousClass1.label = 1;
            if (cacheJsonValue("uu", user, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            user = (User) anonymousClass1.L$1;
            baseRepository = (BaseRepository) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        baseRepository.setLoginUser(user);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getLocalRegistTime(Continuation<? super Long> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objLongCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objLongCache);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objLongCache = longCache("localRegistTime", anonymousClass1);
            if (objLongCache == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseRepository = (BaseRepository) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objLongCache);
        }
        long jLongValue = ((Number) objLongCache).longValue();
        if (jLongValue > 0) {
            return Boxing.boxLong(jLongValue);
        }
        if (!Intrinsics.areEqual(baseRepository.getLoginUser().getGmtCreate(), "")) {
            Date dateTimeString = MyDateTool.parseDateTimeString(baseRepository.getLoginUser().getGmtCreate());
            return Boxing.boxLong(dateTimeString != null ? dateTimeString.getTime() : 0L);
        }
        return Boxing.boxLong(0L);
    }

    public final Object cacheLocalRegistTime(long j, Continuation<? super Unit> continuation) {
        if (j <= 0) {
            return Unit.INSTANCE;
        }
        Object objCacheLong = cacheLong("localRegistTime", j, continuation);
        return objCacheLong == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCacheLong : Unit.INSTANCE;
    }

    public final Object makeJgyUser(WebDAVUser webDAVUser, Continuation<? super Unit> continuation) {
        Object objCacheJsonValue = cacheJsonValue("jgy", webDAVUser, continuation);
        return objCacheJsonValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCacheJsonValue : Unit.INSTANCE;
    }

    public final Object getWebDAVUser(Continuation<? super WebDAVUser> continuation) {
        return this.webDAVUserDao.getMasterOne(continuation);
    }

    public final Object listWebDAVUser(Continuation<? super List<WebDAVUser>> continuation) {
        return this.webDAVUserDao.list(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getNotifyStatus(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objectCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objectCache);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objectCache = getObjectCache("notifyStatus", Map.class, anonymousClass1);
            if (objectCache == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseRepository = (BaseRepository) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objectCache);
        }
        Map<String, Boolean> mapEmptyMap = (Map) objectCache;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNull(mapEmptyMap, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Boolean>");
        baseRepository.setNotifyStatus(mapEmptyMap);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object makeNotifyStatus(Map<String, Boolean> map, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (cacheJsonValue("notifyStatus", map, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
        } else {
            if (i == 1) {
                baseRepository = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.label = 2;
        if (baseRepository.getNotifyStatus(anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getLocalPath(Continuation<? super String> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object localBackupConfig = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(localBackupConfig);
            anonymousClass1.label = 1;
            localBackupConfig = getLocalBackupConfig(anonymousClass1);
            if (localBackupConfig == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(localBackupConfig);
        }
        return ((LocalBackupConfig) localBackupConfig).getPath();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getLocalBackupConfig(Continuation<? super LocalBackupConfig> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objectCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objectCache);
            anonymousClass1.label = 1;
            objectCache = getObjectCache("localBackup", LocalBackupConfig.class, anonymousClass1);
            if (objectCache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objectCache);
        }
        LocalBackupConfig localBackupConfig = (LocalBackupConfig) objectCache;
        return localBackupConfig == null ? new LocalBackupConfig(null, false, null, 7, null) : localBackupConfig;
    }

    public final Object setLocalBackupConfig(LocalBackupConfig localBackupConfig, Continuation<? super Unit> continuation) {
        Object objCacheJsonValue = cacheJsonValue("localBackup", localBackupConfig, continuation);
        return objCacheJsonValue == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCacheJsonValue : Unit.INSTANCE;
    }

    public final Object getAppTheme(Continuation<? super String> continuation) {
        return getCache("appMode", "auto", continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, cn.jianyun.workplan.api.TraceInfo] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, cn.jianyun.workplan.api.TraceInfo] */
    public final Object postEvent(String str, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objWithApi = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithApi);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new TraceInfo(NotificationCompat.CATEGORY_EVENT, str, this.uid, null, 8, null);
            objectRef.element = enhanceTraceInfo((TraceInfo) objectRef.element);
            BaseRepository$postEvent$dd$1 baseRepository$postEvent$dd$1 = new BaseRepository$postEvent$dd$1(this, objectRef, null);
            anonymousClass1.label = 1;
            objWithApi = CommonToolKt.withApi(baseRepository$postEvent$dd$1, anonymousClass1);
            if (objWithApi == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithApi);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [T, cn.jianyun.workplan.api.TraceInfo] */
    /* JADX WARN: Type inference failed for: r8v0, types: [T, cn.jianyun.workplan.api.TraceInfo] */
    public final void postEvent2(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new TraceInfo(NotificationCompat.CATEGORY_EVENT, event, this.uid, null, 8, null);
        objectRef.element = enhanceTraceInfo((TraceInfo) objectRef.element);
        if (this.appTipInfo.getNeedStat()) {
            BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new AnonymousClass1(objectRef, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: cn.jianyun.workplan.hilt.respo.BaseRepository$postEvent2$1, reason: invalid class name */
    /* JADX INFO: compiled from: BaseRepository.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.hilt.respo.BaseRepository$postEvent2$1", f = "BaseRepository.kt", i = {}, l = {MediaPlayer.MEDIA_PLAYER_OPTION_ENABLE_CMAF_FAST_MODE}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Ref.ObjectRef<TraceInfo> $traceInfo;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.ObjectRef<TraceInfo> objectRef, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$traceInfo = objectRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseRepository.this.new AnonymousClass1(this.$traceInfo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                this.label = 1;
                obj = CommonToolKt.withApi(new BaseRepository$postEvent2$1$dd$1(BaseRepository.this, this.$traceInfo, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, cn.jianyun.workplan.api.TraceInfo] */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, cn.jianyun.workplan.api.TraceInfo] */
    public final Object postPage(String str, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objWithApi = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithApi);
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new TraceInfo("page", str, this.uid, null, 8, null);
            objectRef.element = enhanceTraceInfo((TraceInfo) objectRef.element);
            BaseRepository$postPage$dd$1 baseRepository$postPage$dd$1 = new BaseRepository$postPage$dd$1(this, objectRef, null);
            anonymousClass1.label = 1;
            objWithApi = CommonToolKt.withApi(baseRepository$postPage$dd$1, anonymousClass1);
            if (objWithApi == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithApi);
        }
        return Unit.INSTANCE;
    }

    public final TraceInfo enhanceTraceInfo(TraceInfo traceInfo) {
        Intrinsics.checkNotNullParameter(traceInfo, "traceInfo");
        traceInfo.addField("dark", (String) CommonToolKt.ifv((this.context.getResources().getConfiguration().uiMode & 48) == 32, "1", AdConstants.FAIL));
        String BRAND = Build.BRAND;
        Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
        traceInfo.addField("brand", BRAND);
        traceInfo.addField("platform", "vivo");
        String str = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName;
        Intrinsics.checkNotNullExpressionValue(str, "context.packageManager.g…ckageName, 0).versionName");
        traceInfo.addField("appVersion", str);
        traceInfo.addField("registerDay", new StringBuilder().append(getLoginUser().getRegistDay()).toString());
        traceInfo.addField("vip", (String) CommonToolKt.ifv(getLoginUser().isVip(), "1", AdConstants.FAIL));
        traceInfo.addField("sysVersion", Build.VERSION.RELEASE);
        return traceInfo;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getRegistDay(Continuation<? super Integer> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (getUid(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseRepository = (BaseRepository) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        return Boxing.boxInt(baseRepository.getLoginUser().getRegistDay());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object getLatestVersion(Continuation<? super String> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        String str;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objWithApi = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objWithApi);
            BaseRepository$getLatestVersion$version$1 baseRepository$getLatestVersion$version$1 = new BaseRepository$getLatestVersion$version$1(this, null);
            anonymousClass1.label = 1;
            objWithApi = CommonToolKt.withApi(baseRepository$getLatestVersion$version$1, anonymousClass1);
            if (objWithApi == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithApi);
        }
        ApiResult apiResult = (ApiResult) objWithApi;
        return (!apiResult.getSuccess() || (str = (String) apiResult.getResult()) == null) ? dexf.dexg : str;
    }

    public final boolean isNetworkAvailable() {
        try {
            Object systemService = this.context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            return ((ConnectivityManager) systemService).getActiveNetwork() != null;
        } catch (Exception unused) {
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object tryUpgrade(Continuation<? super Boolean> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        String currentVersion;
        BaseRepository baseRepository2;
        String strSubstring;
        CharSequence charSequenceSubSequence;
        int iIntValue;
        Integer integer;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object cacheHour = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(cacheHour);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            cacheHour = getCacheHour("lvt", anonymousClass1);
            if (cacheHour == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
        } else {
            if (i == 1) {
                baseRepository = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(cacheHour);
            } else if (i == 2) {
                currentVersion = (String) anonymousClass1.L$1;
                baseRepository2 = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(cacheHour);
                String str = (String) cacheHour;
                Intrinsics.checkNotNullExpressionValue(currentVersion, "currentVersion");
                strSubstring = currentVersion.substring(0, StringsKt.indexOf$default((CharSequence) currentVersion, ".", 0, false, 6, (Object) null));
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                charSequenceSubSequence = str.subSequence(0, StringsKt.indexOf$default((CharSequence) str, ".", 0, false, 6, (Object) null));
                if (!baseRepository2.isNetworkAvailable()) {
                    return Boxing.boxBoolean(true);
                }
                iIntValue = MyDataTool.toInteger(charSequenceSubSequence, Boxing.boxInt(0)).intValue() - 1;
                integer = MyDataTool.toInteger(strSubstring, Boxing.boxInt(0));
                Intrinsics.checkNotNullExpressionValue(integer, "toInteger(max1, 0)");
                if (iIntValue > integer.intValue()) {
                    return Boxing.boxBoolean(true);
                }
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                if (baseRepository2.cacheNow("lvt", anonymousClass1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(cacheHour);
            }
            return Boxing.boxBoolean(false);
        }
        if (((Number) cacheHour).intValue() < 72) {
            return Boxing.boxBoolean(false);
        }
        String str2 = baseRepository.context.getPackageManager().getPackageInfo(baseRepository.context.getPackageName(), 0).versionName;
        anonymousClass1.L$0 = baseRepository;
        anonymousClass1.L$1 = str2;
        anonymousClass1.label = 2;
        Object latestVersion = baseRepository.getLatestVersion(anonymousClass1);
        if (latestVersion == coroutine_suspended) {
            return coroutine_suspended;
        }
        BaseRepository baseRepository3 = baseRepository;
        currentVersion = str2;
        cacheHour = latestVersion;
        baseRepository2 = baseRepository3;
        String str3 = (String) cacheHour;
        Intrinsics.checkNotNullExpressionValue(currentVersion, "currentVersion");
        strSubstring = currentVersion.substring(0, StringsKt.indexOf$default((CharSequence) currentVersion, ".", 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        charSequenceSubSequence = str3.subSequence(0, StringsKt.indexOf$default((CharSequence) str3, ".", 0, false, 6, (Object) null));
        if (!baseRepository2.isNetworkAvailable()) {
            return Boxing.boxBoolean(true);
        }
        iIntValue = MyDataTool.toInteger(charSequenceSubSequence, Boxing.boxInt(0)).intValue() - 1;
        integer = MyDataTool.toInteger(strSubstring, Boxing.boxInt(0));
        Intrinsics.checkNotNullExpressionValue(integer, "toInteger(max1, 0)");
        if (iIntValue > integer.intValue()) {
            return Boxing.boxBoolean(true);
        }
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 3;
        if (baseRepository2.cacheNow("lvt", anonymousClass1) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Boxing.boxBoolean(false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object getWidgetConfig(Continuation<? super WidgetConfig> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objectCache = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objectCache);
            anonymousClass1.label = 1;
            objectCache = getObjectCache("widgetConfig", WidgetConfig.class, anonymousClass1);
            if (objectCache == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objectCache);
        }
        WidgetConfig widgetConfig = (WidgetConfig) objectCache;
        return widgetConfig == null ? new WidgetConfig(null, null, null, null, null, null, null, null, null, null, null, null, 0.0f, 0.0f, false, false, false, false, false, false, false, null, null, null, ViewCompat.MEASURED_SIZE_MASK, null) : widgetConfig;
    }

    public final void reloadWidget() {
        Intent intent = new Intent(this.context, (Class<?>) MyAppWidgetReceiver.class);
        intent.setAction(WidgetRefreshCallback.UPDATE_ACTION);
        this.context.sendBroadcast(intent);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object setWidgetConfig(WidgetConfig widgetConfig, Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            if (cacheJsonValue("widgetConfig", widgetConfig, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseRepository = (BaseRepository) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
        }
        baseRepository.reloadWidget();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object cleanOldAlarms(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        AlarmManager alarmManager;
        BaseRepository baseRepository;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        AnonymousClass1 anonymousClass2 = anonymousClass1;
        Object obj = anonymousClass2.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass2.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AlarmManager alarmManager2 = (AlarmManager) this.context.getSystemService(AlarmManager.class);
            anonymousClass2.L$0 = this;
            anonymousClass2.L$1 = alarmManager2;
            anonymousClass2.label = 1;
            Object cache$default = getCache$default(this, "alarmIds", null, anonymousClass2, 2, null);
            if (cache$default == coroutine_suspended) {
                return coroutine_suspended;
            }
            alarmManager = alarmManager2;
            obj = cache$default;
            baseRepository = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            alarmManager = (AlarmManager) anonymousClass2.L$1;
            baseRepository = (BaseRepository) anonymousClass2.L$0;
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        if (!Intrinsics.areEqual(str, "")) {
            List listSplit$default = StringsKt.split$default((CharSequence) str, new String[]{","}, false, 0, 6, (Object) null);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
            Iterator it = listSplit$default.iterator();
            while (it.hasNext()) {
                arrayList.add(Boxing.boxLong(Long.parseLong((String) it.next())));
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                try {
                    alarmManager.cancel(PendingIntent.getBroadcast(baseRepository.context, (int) (((Number) it2.next()).longValue() / ((long) 100000)), new Intent(baseRepository.context, (Class<?>) AlarmWidgetReceiver.class), 201326592));
                } catch (Exception unused) {
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x010f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object prepareRefreshWidgetData(Continuation<? super Unit> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
        BaseRepository baseRepository;
        AlarmManager alarmManager;
        List<Date> arrayList;
        List list;
        BaseRepository baseRepository2;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            if ((anonymousClass1.label & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label -= Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = anonymousClass1.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            AlarmManager alarmManager2 = (AlarmManager) this.context.getSystemService(AlarmManager.class);
            if (Build.VERSION.SDK_INT >= 31 && !alarmManager2.canScheduleExactAlarms()) {
                return Unit.INSTANCE;
            }
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = alarmManager2;
            anonymousClass1.label = 1;
            if (cleanOldAlarms(anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            baseRepository = this;
            alarmManager = alarmManager2;
        } else {
            if (i == 1) {
                alarmManager = (AlarmManager) anonymousClass1.L$1;
                baseRepository = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) anonymousClass1.L$2;
                alarmManager = (AlarmManager) anonymousClass1.L$1;
                baseRepository2 = (BaseRepository) anonymousClass1.L$0;
                ResultKt.throwOnFailure(obj);
            }
            baseRepository = baseRepository2;
            arrayList = list;
            for (Date date : arrayList) {
                Intent intent = new Intent(baseRepository.context, (Class<?>) AlarmWidgetReceiver.class);
                intent.putExtra("reloadWidget", MyDateTool.toDateTimeString(date));
                try {
                    alarmManager.setExactAndAllowWhileIdle(0, date.getTime(), PendingIntent.getBroadcast(baseRepository.context, (int) (date.getTime() / ((long) 100000)), intent, 201326592));
                } catch (Exception unused) {
                }
            }
            return Unit.INSTANCE;
        }
        arrayList = new ArrayList();
        int i2 = 0;
        while (i2 < 8) {
            i2++;
            Date startOfDay = MyDateTool.getStartOfDay(CommonDateToolKt.gapDay(new Date(), i2));
            Intrinsics.checkNotNullExpressionValue(startOfDay, "getStartOfDay(Date().gapDay(i + 1))");
            arrayList.add(startOfDay);
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Boxing.boxLong(((Date) it.next()).getTime()));
        }
        String strJoinToString$default = CollectionsKt.joinToString$default(arrayList3, ",", null, null, 0, null, null, 62, null);
        if (!Intrinsics.areEqual(strJoinToString$default, "")) {
            anonymousClass1.L$0 = baseRepository;
            anonymousClass1.L$1 = alarmManager;
            anonymousClass1.L$2 = arrayList;
            anonymousClass1.label = 2;
            if (baseRepository.cache("alarmIds", strJoinToString$default, anonymousClass1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            baseRepository2 = baseRepository;
            baseRepository = baseRepository2;
            arrayList = list;
        }
        while (r1.hasNext()) {
            Intent intent2 = new Intent(baseRepository.context, (Class<?>) AlarmWidgetReceiver.class);
            intent2.putExtra("reloadWidget", MyDateTool.toDateTimeString(date));
            alarmManager.setExactAndAllowWhileIdle(0, date.getTime(), PendingIntent.getBroadcast(baseRepository.context, (int) (date.getTime() / ((long) 100000)), intent2, 201326592));
        }
        return Unit.INSTANCE;
    }
}