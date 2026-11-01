package cn.jianyun.workplan.api.dto;

import androidx.compose.ui.graphics.Color;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.ui.theme.ColorKt;
import cn.jianyun.workplan.util.MyEncryptTool;
import com.alipay.sdk.m.c0.d;
import com.bykv.vk.component.ttvideo.LiveConfigKey;
import com.bykv.vk.component.ttvideo.player.C;
import com.tianmu.biz.bean.AdType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppTipInfo.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000;\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0003\b\u008d\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0081\u0003\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0014\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\n\u0012\b\b\u0002\u0010\u001a\u001a\u00020\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0003\u0012\b\b\u0002\u0010 \u001a\u00020\u0003\u0012\b\b\u0002\u0010!\u001a\u00020\u0003\u0012\b\b\u0002\u0010\"\u001a\u00020\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0016\u0012\b\b\u0002\u0010$\u001a\u00020\n\u0012\b\b\u0002\u0010%\u001a\u00020\u0016\u0012\b\b\u0002\u0010&\u001a\u00020\u0016\u0012\b\b\u0002\u0010'\u001a\u00020\u0016\u0012\b\b\u0002\u0010(\u001a\u00020\u0003\u0012\b\b\u0002\u0010)\u001a\u00020\u0003\u0012\b\b\u0002\u0010*\u001a\u00020\u0016\u0012\b\b\u0002\u0010+\u001a\u00020\u0016¢\u0006\u0002\u0010,J\n\u0010\u0080\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0081\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0082\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0083\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0084\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0085\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0086\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0087\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0088\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0089\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u008a\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u008b\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u008c\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008d\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008e\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u008f\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0090\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0091\u0001\u001a\u00020\u001eHÆ\u0003J\n\u0010\u0092\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0093\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0094\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0095\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u0096\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u0097\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u0098\u0001\u001a\u00020\nHÆ\u0003J\n\u0010\u0099\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u009a\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u009b\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u009c\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009d\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010\u009e\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010\u009f\u0001\u001a\u00020\u0016HÆ\u0003J\n\u0010 \u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¡\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¢\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010£\u0001\u001a\u00020\nHÆ\u0003J\n\u0010¤\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¥\u0001\u001a\u00020\nHÆ\u0003J\u0086\u0003\u0010¦\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\n2\b\b\u0002\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\n2\b\b\u0002\u0010\u0011\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\n2\b\b\u0002\u0010\u001a\u001a\u00020\n2\b\b\u0002\u0010\u001b\u001a\u00020\u00032\b\b\u0002\u0010\u001c\u001a\u00020\u00032\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u00032\b\b\u0002\u0010 \u001a\u00020\u00032\b\b\u0002\u0010!\u001a\u00020\u00032\b\b\u0002\u0010\"\u001a\u00020\u00162\b\b\u0002\u0010#\u001a\u00020\u00162\b\b\u0002\u0010$\u001a\u00020\n2\b\b\u0002\u0010%\u001a\u00020\u00162\b\b\u0002\u0010&\u001a\u00020\u00162\b\b\u0002\u0010'\u001a\u00020\u00162\b\b\u0002\u0010(\u001a\u00020\u00032\b\b\u0002\u0010)\u001a\u00020\u00032\b\b\u0002\u0010*\u001a\u00020\u00162\b\b\u0002\u0010+\u001a\u00020\u0016HÆ\u0001J\u0015\u0010§\u0001\u001a\u00020\u00162\t\u0010¨\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010©\u0001\u001a\u00020\nHÖ\u0001J\u001d\u0010ª\u0001\u001a\u00020\u00162\b\u0010«\u0001\u001a\u00030¬\u0001H\u0086@ø\u0001\u0000¢\u0006\u0003\u0010\u00ad\u0001J\u0019\u0010®\u0001\u001a\u00030¯\u0001ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000¢\u0006\u0005\b°\u0001\u0010sJ\n\u0010±\u0001\u001a\u00020\u0003HÖ\u0001J\u0007\u0010²\u0001\u001a\u00020\u0003R\u001a\u0010(\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010.\"\u0004\b2\u00100R\u001a\u0010\u000e\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010\u0019\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001a\u0010 \u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R\u001a\u0010\u001f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\u001a\u0010!\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\u001a\u0010\"\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u00108\"\u0004\bC\u0010:R\u001a\u0010\u000f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u00104\"\u0004\bE\u00106R\u001a\u0010\u0014\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u00104\"\u0004\bG\u00106R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010.\"\u0004\bI\u00100R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010.\"\u0004\bK\u00100R\u001a\u0010\u0010\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u00104\"\u0004\bM\u00106R\u001a\u0010\u0013\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u00104\"\u0004\bO\u00106R\u001a\u0010\u001b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010.\"\u0004\bQ\u00100R\u001a\u0010\u0011\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u00104\"\u0004\bS\u00106R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010.\"\u0004\bU\u00100R\u001a\u0010*\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u00108\"\u0004\bW\u0010:R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010.\"\u0004\bY\u00100R\u001a\u0010+\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u00108\"\u0004\b[\u0010:R\u001a\u0010#\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u00108\"\u0004\b]\u0010:R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010.\"\u0004\b_\u00100R\u001a\u0010\u001a\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u00104\"\u0004\ba\u00106R\u001a\u0010)\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010.\"\u0004\bc\u00100R\u001a\u0010$\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u00104\"\u0004\be\u00106R\u001a\u0010'\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u00108\"\u0004\bg\u0010:R\u001a\u0010\u0017\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u00108\"\u0004\bi\u0010:R\u001a\u0010&\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u00108\"\u0004\bk\u0010:R\u001a\u0010%\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u00108\"\u0004\bm\u0010:R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bn\u0010.\"\u0004\bo\u00100R\u001a\u0010\u0018\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u00104\"\u0004\bq\u00106R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\br\u0010s\"\u0004\bt\u0010uR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010.\"\u0004\bw\u00100R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bx\u00104\"\u0004\by\u00106R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bz\u0010.\"\u0004\b{\u00100R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b|\u0010.\"\u0004\b}\u00100R\u001a\u0010\f\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b~\u00104\"\u0004\b\u007f\u00106\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006³\u0001"}, d2 = {"Lcn/jianyun/workplan/api/dto/AppTipInfo;", "", "app", "", "name", "platform", "message", "type", "state", "top", "", "url", "vip", "title", "closed", "maxDay", "minDay", "minVipDay", "newPage", "minIOS", "maxIOS", "discount", "", "showPurchase", "testMode", "forceRate", "rateNumber", "minVersion", "maxVersion", "tipTime", "", "helpInfo", "helpFlag", "helpNumber", "isShow", "openScreenAds", "screenAdsGapMinute", "showWx", "showShare", "shareEvent", "adsValue", "recoverAdsValue", "needStat", "openRecover", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;IIIILjava/lang/String;IIZZIIILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZIZZZLjava/lang/String;Ljava/lang/String;ZZ)V", "getAdsValue", "()Ljava/lang/String;", "setAdsValue", "(Ljava/lang/String;)V", "getApp", "setApp", "getClosed", "()I", "setClosed", "(I)V", "getDiscount", "()Z", "setDiscount", "(Z)V", "getForceRate", "setForceRate", "getHelpFlag", "setHelpFlag", "getHelpInfo", "setHelpInfo", "getHelpNumber", "setHelpNumber", "setShow", "getMaxDay", "setMaxDay", "getMaxIOS", "setMaxIOS", "getMaxVersion", "setMaxVersion", "getMessage", "setMessage", "getMinDay", "setMinDay", "getMinIOS", "setMinIOS", "getMinVersion", "setMinVersion", "getMinVipDay", "setMinVipDay", "getName", "setName", "getNeedStat", "setNeedStat", "getNewPage", "setNewPage", "getOpenRecover", "setOpenRecover", "getOpenScreenAds", "setOpenScreenAds", "getPlatform", "setPlatform", "getRateNumber", "setRateNumber", "getRecoverAdsValue", "setRecoverAdsValue", "getScreenAdsGapMinute", "setScreenAdsGapMinute", "getShareEvent", "setShareEvent", "getShowPurchase", "setShowPurchase", "getShowShare", "setShowShare", "getShowWx", "setShowWx", "getState", "setState", "getTestMode", "setTestMode", "getTipTime", "()J", "setTipTime", "(J)V", "getTitle", d.p, "getTop", "setTop", "getType", "setType", "getUrl", "setUrl", "getVip", "setVip", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", AdType.TYPE_OTHER, "hashCode", "isShown", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "showColor", "Landroidx/compose/ui/graphics/Color;", "showColor-0d7_KjU", "toString", "uid", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class AppTipInfo {
    public static final int $stable = 8;
    private String adsValue;
    private String app;
    private int closed;
    private boolean discount;
    private int forceRate;
    private String helpFlag;
    private String helpInfo;
    private String helpNumber;
    private boolean isShow;
    private int maxDay;
    private int maxIOS;
    private String maxVersion;
    private String message;
    private int minDay;
    private int minIOS;
    private String minVersion;
    private int minVipDay;
    private String name;
    private boolean needStat;
    private String newPage;
    private boolean openRecover;
    private boolean openScreenAds;
    private String platform;
    private int rateNumber;
    private String recoverAdsValue;
    private int screenAdsGapMinute;
    private boolean shareEvent;
    private boolean showPurchase;
    private boolean showShare;
    private boolean showWx;
    private String state;
    private int testMode;
    private long tipTime;
    private String title;
    private int top;
    private String type;
    private String url;
    private int vip;

    /* JADX INFO: renamed from: cn.jianyun.workplan.api.dto.AppTipInfo$isShown$1, reason: invalid class name */
    /* JADX INFO: compiled from: AppTipInfo.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "cn.jianyun.workplan.api.dto.AppTipInfo", f = "AppTipInfo.kt", i = {0, 0}, l = {69}, m = "isShown", n = {"this", "baseRepository"}, s = {"L$0", "L$1"})
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
            return AppTipInfo.this.isShown(null, this);
        }
    }

    public AppTipInfo() {
        this(null, null, null, null, null, null, 0, null, 0, null, 0, 0, 0, 0, null, 0, 0, false, false, 0, 0, 0, null, null, 0L, null, null, null, false, false, 0, false, false, false, null, null, false, false, -1, 63, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApp() {
        return this.app;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getClosed() {
        return this.closed;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getMaxDay() {
        return this.maxDay;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final int getMinDay() {
        return this.minDay;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final int getMinVipDay() {
        return this.minVipDay;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getNewPage() {
        return this.newPage;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final int getMinIOS() {
        return this.minIOS;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getMaxIOS() {
        return this.maxIOS;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final boolean getDiscount() {
        return this.discount;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final boolean getShowPurchase() {
        return this.showPurchase;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getTestMode() {
        return this.testMode;
    }

    /* JADX INFO: renamed from: component21, reason: from getter */
    public final int getForceRate() {
        return this.forceRate;
    }

    /* JADX INFO: renamed from: component22, reason: from getter */
    public final int getRateNumber() {
        return this.rateNumber;
    }

    /* JADX INFO: renamed from: component23, reason: from getter */
    public final String getMinVersion() {
        return this.minVersion;
    }

    /* JADX INFO: renamed from: component24, reason: from getter */
    public final String getMaxVersion() {
        return this.maxVersion;
    }

    /* JADX INFO: renamed from: component25, reason: from getter */
    public final long getTipTime() {
        return this.tipTime;
    }

    /* JADX INFO: renamed from: component26, reason: from getter */
    public final String getHelpInfo() {
        return this.helpInfo;
    }

    /* JADX INFO: renamed from: component27, reason: from getter */
    public final String getHelpFlag() {
        return this.helpFlag;
    }

    /* JADX INFO: renamed from: component28, reason: from getter */
    public final String getHelpNumber() {
        return this.helpNumber;
    }

    /* JADX INFO: renamed from: component29, reason: from getter */
    public final boolean getIsShow() {
        return this.isShow;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPlatform() {
        return this.platform;
    }

    /* JADX INFO: renamed from: component30, reason: from getter */
    public final boolean getOpenScreenAds() {
        return this.openScreenAds;
    }

    /* JADX INFO: renamed from: component31, reason: from getter */
    public final int getScreenAdsGapMinute() {
        return this.screenAdsGapMinute;
    }

    /* JADX INFO: renamed from: component32, reason: from getter */
    public final boolean getShowWx() {
        return this.showWx;
    }

    /* JADX INFO: renamed from: component33, reason: from getter */
    public final boolean getShowShare() {
        return this.showShare;
    }

    /* JADX INFO: renamed from: component34, reason: from getter */
    public final boolean getShareEvent() {
        return this.shareEvent;
    }

    /* JADX INFO: renamed from: component35, reason: from getter */
    public final String getAdsValue() {
        return this.adsValue;
    }

    /* JADX INFO: renamed from: component36, reason: from getter */
    public final String getRecoverAdsValue() {
        return this.recoverAdsValue;
    }

    /* JADX INFO: renamed from: component37, reason: from getter */
    public final boolean getNeedStat() {
        return this.needStat;
    }

    /* JADX INFO: renamed from: component38, reason: from getter */
    public final boolean getOpenRecover() {
        return this.openRecover;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getVip() {
        return this.vip;
    }

    public final AppTipInfo copy(String app, String name, String platform, String message, String type, String state, int top, String url, int vip, String title, int closed, int maxDay, int minDay, int minVipDay, String newPage, int minIOS, int maxIOS, boolean discount, boolean showPurchase, int testMode, int forceRate, int rateNumber, String minVersion, String maxVersion, long tipTime, String helpInfo, String helpFlag, String helpNumber, boolean isShow, boolean openScreenAds, int screenAdsGapMinute, boolean showWx, boolean showShare, boolean shareEvent, String adsValue, String recoverAdsValue, boolean needStat, boolean openRecover) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(newPage, "newPage");
        Intrinsics.checkNotNullParameter(minVersion, "minVersion");
        Intrinsics.checkNotNullParameter(maxVersion, "maxVersion");
        Intrinsics.checkNotNullParameter(helpInfo, "helpInfo");
        Intrinsics.checkNotNullParameter(helpFlag, "helpFlag");
        Intrinsics.checkNotNullParameter(helpNumber, "helpNumber");
        Intrinsics.checkNotNullParameter(adsValue, "adsValue");
        Intrinsics.checkNotNullParameter(recoverAdsValue, "recoverAdsValue");
        return new AppTipInfo(app, name, platform, message, type, state, top, url, vip, title, closed, maxDay, minDay, minVipDay, newPage, minIOS, maxIOS, discount, showPurchase, testMode, forceRate, rateNumber, minVersion, maxVersion, tipTime, helpInfo, helpFlag, helpNumber, isShow, openScreenAds, screenAdsGapMinute, showWx, showShare, shareEvent, adsValue, recoverAdsValue, needStat, openRecover);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppTipInfo)) {
            return false;
        }
        AppTipInfo appTipInfo = (AppTipInfo) other;
        return Intrinsics.areEqual(this.app, appTipInfo.app) && Intrinsics.areEqual(this.name, appTipInfo.name) && Intrinsics.areEqual(this.platform, appTipInfo.platform) && Intrinsics.areEqual(this.message, appTipInfo.message) && Intrinsics.areEqual(this.type, appTipInfo.type) && Intrinsics.areEqual(this.state, appTipInfo.state) && this.top == appTipInfo.top && Intrinsics.areEqual(this.url, appTipInfo.url) && this.vip == appTipInfo.vip && Intrinsics.areEqual(this.title, appTipInfo.title) && this.closed == appTipInfo.closed && this.maxDay == appTipInfo.maxDay && this.minDay == appTipInfo.minDay && this.minVipDay == appTipInfo.minVipDay && Intrinsics.areEqual(this.newPage, appTipInfo.newPage) && this.minIOS == appTipInfo.minIOS && this.maxIOS == appTipInfo.maxIOS && this.discount == appTipInfo.discount && this.showPurchase == appTipInfo.showPurchase && this.testMode == appTipInfo.testMode && this.forceRate == appTipInfo.forceRate && this.rateNumber == appTipInfo.rateNumber && Intrinsics.areEqual(this.minVersion, appTipInfo.minVersion) && Intrinsics.areEqual(this.maxVersion, appTipInfo.maxVersion) && this.tipTime == appTipInfo.tipTime && Intrinsics.areEqual(this.helpInfo, appTipInfo.helpInfo) && Intrinsics.areEqual(this.helpFlag, appTipInfo.helpFlag) && Intrinsics.areEqual(this.helpNumber, appTipInfo.helpNumber) && this.isShow == appTipInfo.isShow && this.openScreenAds == appTipInfo.openScreenAds && this.screenAdsGapMinute == appTipInfo.screenAdsGapMinute && this.showWx == appTipInfo.showWx && this.showShare == appTipInfo.showShare && this.shareEvent == appTipInfo.shareEvent && Intrinsics.areEqual(this.adsValue, appTipInfo.adsValue) && Intrinsics.areEqual(this.recoverAdsValue, appTipInfo.recoverAdsValue) && this.needStat == appTipInfo.needStat && this.openRecover == appTipInfo.openRecover;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [int] */
    /* JADX WARN: Type inference failed for: r0v37, types: [int] */
    /* JADX WARN: Type inference failed for: r0v57, types: [int] */
    /* JADX WARN: Type inference failed for: r0v59, types: [int] */
    /* JADX WARN: Type inference failed for: r0v63, types: [int] */
    /* JADX WARN: Type inference failed for: r0v65, types: [int] */
    /* JADX WARN: Type inference failed for: r0v67, types: [int] */
    /* JADX WARN: Type inference failed for: r0v73, types: [int] */
    /* JADX WARN: Type inference failed for: r0v75, types: [int] */
    /* JADX WARN: Type inference failed for: r1v33, types: [int] */
    /* JADX WARN: Type inference failed for: r1v35, types: [int] */
    /* JADX WARN: Type inference failed for: r1v54, types: [int] */
    /* JADX WARN: Type inference failed for: r1v56, types: [int] */
    /* JADX WARN: Type inference failed for: r1v60, types: [int] */
    /* JADX WARN: Type inference failed for: r1v62, types: [int] */
    /* JADX WARN: Type inference failed for: r1v64, types: [int] */
    /* JADX WARN: Type inference failed for: r1v70, types: [int] */
    /* JADX WARN: Type inference failed for: r1v72 */
    /* JADX WARN: Type inference failed for: r1v73 */
    /* JADX WARN: Type inference failed for: r1v74 */
    /* JADX WARN: Type inference failed for: r1v75 */
    /* JADX WARN: Type inference failed for: r1v76 */
    /* JADX WARN: Type inference failed for: r1v77 */
    /* JADX WARN: Type inference failed for: r1v78 */
    /* JADX WARN: Type inference failed for: r1v79 */
    /* JADX WARN: Type inference failed for: r1v80 */
    /* JADX WARN: Type inference failed for: r1v81 */
    /* JADX WARN: Type inference failed for: r1v82 */
    /* JADX WARN: Type inference failed for: r1v83 */
    /* JADX WARN: Type inference failed for: r1v84 */
    /* JADX WARN: Type inference failed for: r1v85 */
    /* JADX WARN: Type inference failed for: r1v86 */
    /* JADX WARN: Type inference failed for: r1v87 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((((((((((((((((((((((((((((((this.app.hashCode() * 31) + this.name.hashCode()) * 31) + this.platform.hashCode()) * 31) + this.message.hashCode()) * 31) + this.type.hashCode()) * 31) + this.state.hashCode()) * 31) + Integer.hashCode(this.top)) * 31) + this.url.hashCode()) * 31) + Integer.hashCode(this.vip)) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.closed)) * 31) + Integer.hashCode(this.maxDay)) * 31) + Integer.hashCode(this.minDay)) * 31) + Integer.hashCode(this.minVipDay)) * 31) + this.newPage.hashCode()) * 31) + Integer.hashCode(this.minIOS)) * 31) + Integer.hashCode(this.maxIOS)) * 31;
        boolean z = this.discount;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.showPurchase;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        int iHashCode2 = (((((((((((((((((((i + r2) * 31) + Integer.hashCode(this.testMode)) * 31) + Integer.hashCode(this.forceRate)) * 31) + Integer.hashCode(this.rateNumber)) * 31) + this.minVersion.hashCode()) * 31) + this.maxVersion.hashCode()) * 31) + Long.hashCode(this.tipTime)) * 31) + this.helpInfo.hashCode()) * 31) + this.helpFlag.hashCode()) * 31) + this.helpNumber.hashCode()) * 31;
        boolean z3 = this.isShow;
        ?? r3 = z3;
        if (z3) {
            r3 = 1;
        }
        int i2 = (iHashCode2 + r3) * 31;
        boolean z4 = this.openScreenAds;
        ?? r4 = z4;
        if (z4) {
            r4 = 1;
        }
        int iHashCode3 = (((i2 + r4) * 31) + Integer.hashCode(this.screenAdsGapMinute)) * 31;
        boolean z5 = this.showWx;
        ?? r5 = z5;
        if (z5) {
            r5 = 1;
        }
        int i3 = (iHashCode3 + r5) * 31;
        boolean z6 = this.showShare;
        ?? r6 = z6;
        if (z6) {
            r6 = 1;
        }
        int i4 = (i3 + r6) * 31;
        boolean z7 = this.shareEvent;
        ?? r7 = z7;
        if (z7) {
            r7 = 1;
        }
        int iHashCode4 = (((((i4 + r7) * 31) + this.adsValue.hashCode()) * 31) + this.recoverAdsValue.hashCode()) * 31;
        boolean z8 = this.needStat;
        ?? r8 = z8;
        if (z8) {
            r8 = 1;
        }
        int i5 = (iHashCode4 + r8) * 31;
        boolean z9 = this.openRecover;
        return i5 + (z9 ? 1 : z9);
    }

    public String toString() {
        return "AppTipInfo(app=" + this.app + ", name=" + this.name + ", platform=" + this.platform + ", message=" + this.message + ", type=" + this.type + ", state=" + this.state + ", top=" + this.top + ", url=" + this.url + ", vip=" + this.vip + ", title=" + this.title + ", closed=" + this.closed + ", maxDay=" + this.maxDay + ", minDay=" + this.minDay + ", minVipDay=" + this.minVipDay + ", newPage=" + this.newPage + ", minIOS=" + this.minIOS + ", maxIOS=" + this.maxIOS + ", discount=" + this.discount + ", showPurchase=" + this.showPurchase + ", testMode=" + this.testMode + ", forceRate=" + this.forceRate + ", rateNumber=" + this.rateNumber + ", minVersion=" + this.minVersion + ", maxVersion=" + this.maxVersion + ", tipTime=" + this.tipTime + ", helpInfo=" + this.helpInfo + ", helpFlag=" + this.helpFlag + ", helpNumber=" + this.helpNumber + ", isShow=" + this.isShow + ", openScreenAds=" + this.openScreenAds + ", screenAdsGapMinute=" + this.screenAdsGapMinute + ", showWx=" + this.showWx + ", showShare=" + this.showShare + ", shareEvent=" + this.shareEvent + ", adsValue=" + this.adsValue + ", recoverAdsValue=" + this.recoverAdsValue + ", needStat=" + this.needStat + ", openRecover=" + this.openRecover + ")";
    }

    public AppTipInfo(String app, String name, String platform, String message, String type, String state, int i, String url, int i2, String title, int i3, int i4, int i5, int i6, String newPage, int i7, int i8, boolean z, boolean z2, int i9, int i10, int i11, String minVersion, String maxVersion, long j, String helpInfo, String helpFlag, String helpNumber, boolean z3, boolean z4, int i12, boolean z5, boolean z6, boolean z7, String adsValue, String recoverAdsValue, boolean z8, boolean z9) {
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(newPage, "newPage");
        Intrinsics.checkNotNullParameter(minVersion, "minVersion");
        Intrinsics.checkNotNullParameter(maxVersion, "maxVersion");
        Intrinsics.checkNotNullParameter(helpInfo, "helpInfo");
        Intrinsics.checkNotNullParameter(helpFlag, "helpFlag");
        Intrinsics.checkNotNullParameter(helpNumber, "helpNumber");
        Intrinsics.checkNotNullParameter(adsValue, "adsValue");
        Intrinsics.checkNotNullParameter(recoverAdsValue, "recoverAdsValue");
        this.app = app;
        this.name = name;
        this.platform = platform;
        this.message = message;
        this.type = type;
        this.state = state;
        this.top = i;
        this.url = url;
        this.vip = i2;
        this.title = title;
        this.closed = i3;
        this.maxDay = i4;
        this.minDay = i5;
        this.minVipDay = i6;
        this.newPage = newPage;
        this.minIOS = i7;
        this.maxIOS = i8;
        this.discount = z;
        this.showPurchase = z2;
        this.testMode = i9;
        this.forceRate = i10;
        this.rateNumber = i11;
        this.minVersion = minVersion;
        this.maxVersion = maxVersion;
        this.tipTime = j;
        this.helpInfo = helpInfo;
        this.helpFlag = helpFlag;
        this.helpNumber = helpNumber;
        this.isShow = z3;
        this.openScreenAds = z4;
        this.screenAdsGapMinute = i12;
        this.showWx = z5;
        this.showShare = z6;
        this.shareEvent = z7;
        this.adsValue = adsValue;
        this.recoverAdsValue = recoverAdsValue;
        this.needStat = z8;
        this.openRecover = z9;
    }

    public /* synthetic */ AppTipInfo(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, int i2, String str8, int i3, int i4, int i5, int i6, String str9, int i7, int i8, boolean z, boolean z2, int i9, int i10, int i11, String str10, String str11, long j, String str12, String str13, String str14, boolean z3, boolean z4, int i12, boolean z5, boolean z6, boolean z7, String str15, String str16, boolean z8, boolean z9, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? "" : str3, (i13 & 8) != 0 ? "" : str4, (i13 & 16) != 0 ? "" : str5, (i13 & 32) != 0 ? "" : str6, (i13 & 64) != 0 ? 0 : i, (i13 & 128) != 0 ? "" : str7, (i13 & 256) != 0 ? 0 : i2, (i13 & 512) != 0 ? "" : str8, (i13 & 1024) != 0 ? 0 : i3, (i13 & 2048) != 0 ? 0 : i4, (i13 & 4096) != 0 ? 0 : i5, (i13 & 8192) != 0 ? 5 : i6, (i13 & 16384) != 0 ? "" : str9, (i13 & 32768) != 0 ? 0 : i7, (i13 & 65536) != 0 ? 0 : i8, (i13 & 131072) != 0 ? false : z, (i13 & 262144) != 0 ? false : z2, (i13 & 524288) != 0 ? -1 : i9, (i13 & 1048576) != 0 ? 0 : i10, (i13 & 2097152) != 0 ? 30 : i11, (i13 & 4194304) != 0 ? "" : str10, (i13 & 8388608) != 0 ? "" : str11, (i13 & 16777216) != 0 ? 0L : j, (i13 & 33554432) != 0 ? "" : str12, (i13 & 67108864) != 0 ? "" : str13, (i13 & 134217728) != 0 ? "" : str14, (i13 & C.ENCODING_PCM_MU_LAW) != 0 ? false : z3, (i13 & C.ENCODING_PCM_A_LAW) != 0 ? true : z4, (i13 & 1073741824) != 0 ? 2 : i12, (i13 & Integer.MIN_VALUE) != 0 ? false : z5, (i14 & 1) != 0 ? false : z6, (i14 & 2) != 0 ? false : z7, (i14 & 4) != 0 ? "10:1" : str15, (i14 & 8) == 0 ? str16 : "10:1", (i14 & 16) != 0 ? true : z8, (i14 & 32) == 0 ? z9 : true);
    }

    public final String getApp() {
        return this.app;
    }

    public final void setApp(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.app = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final void setPlatform(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }

    public final String getState() {
        return this.state;
    }

    public final void setState(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state = str;
    }

    public final int getTop() {
        return this.top;
    }

    public final void setTop(int i) {
        this.top = i;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final int getVip() {
        return this.vip;
    }

    public final void setVip(int i) {
        this.vip = i;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final int getClosed() {
        return this.closed;
    }

    public final void setClosed(int i) {
        this.closed = i;
    }

    public final int getMaxDay() {
        return this.maxDay;
    }

    public final void setMaxDay(int i) {
        this.maxDay = i;
    }

    public final int getMinDay() {
        return this.minDay;
    }

    public final void setMinDay(int i) {
        this.minDay = i;
    }

    public final int getMinVipDay() {
        return this.minVipDay;
    }

    public final void setMinVipDay(int i) {
        this.minVipDay = i;
    }

    public final String getNewPage() {
        return this.newPage;
    }

    public final void setNewPage(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.newPage = str;
    }

    public final int getMinIOS() {
        return this.minIOS;
    }

    public final void setMinIOS(int i) {
        this.minIOS = i;
    }

    public final int getMaxIOS() {
        return this.maxIOS;
    }

    public final void setMaxIOS(int i) {
        this.maxIOS = i;
    }

    public final boolean getDiscount() {
        return this.discount;
    }

    public final void setDiscount(boolean z) {
        this.discount = z;
    }

    public final boolean getShowPurchase() {
        return this.showPurchase;
    }

    public final void setShowPurchase(boolean z) {
        this.showPurchase = z;
    }

    public final int getTestMode() {
        return this.testMode;
    }

    public final void setTestMode(int i) {
        this.testMode = i;
    }

    public final int getForceRate() {
        return this.forceRate;
    }

    public final void setForceRate(int i) {
        this.forceRate = i;
    }

    public final int getRateNumber() {
        return this.rateNumber;
    }

    public final void setRateNumber(int i) {
        this.rateNumber = i;
    }

    public final String getMinVersion() {
        return this.minVersion;
    }

    public final void setMinVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.minVersion = str;
    }

    public final String getMaxVersion() {
        return this.maxVersion;
    }

    public final void setMaxVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.maxVersion = str;
    }

    public final long getTipTime() {
        return this.tipTime;
    }

    public final void setTipTime(long j) {
        this.tipTime = j;
    }

    public final String getHelpInfo() {
        return this.helpInfo;
    }

    public final void setHelpInfo(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.helpInfo = str;
    }

    public final String getHelpFlag() {
        return this.helpFlag;
    }

    public final void setHelpFlag(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.helpFlag = str;
    }

    public final String getHelpNumber() {
        return this.helpNumber;
    }

    public final void setHelpNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.helpNumber = str;
    }

    public final boolean isShow() {
        return this.isShow;
    }

    public final void setShow(boolean z) {
        this.isShow = z;
    }

    public final boolean getOpenScreenAds() {
        return this.openScreenAds;
    }

    public final void setOpenScreenAds(boolean z) {
        this.openScreenAds = z;
    }

    public final int getScreenAdsGapMinute() {
        return this.screenAdsGapMinute;
    }

    public final void setScreenAdsGapMinute(int i) {
        this.screenAdsGapMinute = i;
    }

    public final boolean getShowWx() {
        return this.showWx;
    }

    public final void setShowWx(boolean z) {
        this.showWx = z;
    }

    public final boolean getShowShare() {
        return this.showShare;
    }

    public final void setShowShare(boolean z) {
        this.showShare = z;
    }

    public final boolean getShareEvent() {
        return this.shareEvent;
    }

    public final void setShareEvent(boolean z) {
        this.shareEvent = z;
    }

    public final String getAdsValue() {
        return this.adsValue;
    }

    public final void setAdsValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.adsValue = str;
    }

    public final String getRecoverAdsValue() {
        return this.recoverAdsValue;
    }

    public final void setRecoverAdsValue(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.recoverAdsValue = str;
    }

    public final boolean getNeedStat() {
        return this.needStat;
    }

    public final void setNeedStat(boolean z) {
        this.needStat = z;
    }

    public final boolean getOpenRecover() {
        return this.openRecover;
    }

    public final void setOpenRecover(boolean z) {
        this.openRecover = z;
    }

    /* JADX INFO: renamed from: showColor-0d7_KjU, reason: not valid java name */
    public final long m6669showColor0d7_KjU() {
        String str = this.type;
        if (!Intrinsics.areEqual(str, "default") && !Intrinsics.areEqual(str, "primary")) {
            return Color.INSTANCE.m3789getRed0d7_KjU();
        }
        return ColorKt.getThemeColor();
    }

    public final String uid() {
        if (this.message.length() == 0) {
            return LiveConfigKey.NONE;
        }
        return "n_" + MyEncryptTool.md5(this.message);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object isShown(BaseRepository baseRepository, Continuation<? super Boolean> continuation) throws Throwable {
        AnonymousClass1 anonymousClass1;
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
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = baseRepository;
            anonymousClass1.label = 1;
            registDay = baseRepository.getRegistDay(anonymousClass1);
            if (registDay == coroutine_suspended) {
                return coroutine_suspended;
            }
            appTipInfo = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            baseRepository = (BaseRepository) anonymousClass1.L$1;
            appTipInfo = (AppTipInfo) anonymousClass1.L$0;
            ResultKt.throwOnFailure(registDay);
        }
        int iIntValue = ((Number) registDay).intValue();
        if (iIntValue < appTipInfo.minDay || iIntValue > appTipInfo.maxDay) {
            return Boxing.boxBoolean(false);
        }
        boolean zIsVip = baseRepository.isVip();
        int i2 = appTipInfo.vip;
        if (i2 >= 0) {
            if ((i2 == 1) != zIsVip) {
                return Boxing.boxBoolean(false);
            }
        }
        return Boxing.boxBoolean(true);
    }
}