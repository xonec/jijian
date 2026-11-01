package cn.jianyun.workplan.module.base.views.webdav;

import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.UriHandler;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.TextUnitKt;
import cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel;
import cn.jianyun.workplan.ui.component.form.ButtonViewKt;
import cn.jianyun.workplan.ui.component.form.DialogViewKt;
import cn.jianyun.workplan.ui.component.nav.PanelViewKt;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.CommonUIKt;
import com.bykv.vk.component.ttvideo.player.MediaPlayer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebDAVUserDocView.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"WebDAVUserDocView", "", "viewModel", "Lcn/jianyun/workplan/module/base/vm/WebDAVUserViewModel;", "(Lcn/jianyun/workplan/module/base/vm/WebDAVUserViewModel;Landroidx/compose/runtime/Composer;I)V", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class WebDAVUserDocViewKt {
    public static final void WebDAVUserDocView(final WebDAVUserViewModel viewModel, Composer composer, final int i) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Composer composerStartRestartGroup = composer.startRestartGroup(2078701539);
        ComposerKt.sourceInformation(composerStartRestartGroup, "C(WebDAVUserDocView)");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2078701539, i, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserDocView (WebDAVUserDocView.kt:14)");
        }
        ProvidableCompositionLocal<UriHandler> localUriHandler = CompositionLocalsKt.getLocalUriHandler();
        ComposerKt.sourceInformationMarkerStart(composerStartRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
        Object objConsume = composerStartRestartGroup.consume(localUriHandler);
        ComposerKt.sourceInformationMarkerEnd(composerStartRestartGroup);
        final UriHandler uriHandler = (UriHandler) objConsume;
        DialogViewKt.m6840BottomDialogVieweHTjO5g("云备份使用说明", false, null, null, false, 0.0f, new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserDocViewKt.WebDAVUserDocView.1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                viewModel.resetForm();
            }
        }, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 230714831, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserDocViewKt.WebDAVUserDocView.2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                if ((i2 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(230714831, i2, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserDocView.<anonymous> (WebDAVUserDocView.kt:20)");
                    }
                    PanelViewKt.m6912PanelView3f6hBDE("为什么需要云备份？", CommonToolKt.oneLine("\n           云备份可以帮助用户实现多设备数据同步，同时也可以防止手机损坏或者丢失导致数据无法找回，\n        "), true, false, 0L, false, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 120);
                    PanelViewKt.m6912PanelView3f6hBDE("云备份安全吗？", CommonToolKt.oneLine("\n           我们的云备份是将数据保存在用户自己的网盘空间，开发者不会将用户数据上传至开发者服务器，所以这个对于用户来说是比较安全的\n        "), true, false, 0L, false, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 120);
                    PanelViewKt.m6912PanelView3f6hBDE("云备份和本地备份区别在哪？", CommonToolKt.oneLine("\n           本地备份最大的优点无疑是加载速度快，用户日常的操作都是通过本地备份来实现的，开发者会在合适的时机将用户数据上传至用户个人的网盘空间（前提得先配置云备份账号）\n        "), true, false, 0L, false, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 120);
                    PanelViewKt.m6912PanelView3f6hBDE("为什么推荐使用坚果云？", CommonToolKt.oneLine("\n            在中国，坚果云独树一帜，提供业界领先的免费WebDAV协议访问服务。这一服务使得用户能够享受到更为便捷、高效的云端文件管理体验。WebDAV协议的兼容性和灵活性，让用户无论身处何地，都能轻松同步和共享文件，如同使用本地存储设备一样自如。\n            坚果云虽然免费，但是它有上传和下载容量限制，如果觉得容量不足，也可以选择其他几种云存储服务\n        "), true, false, 0L, false, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 120);
                    PanelViewKt.m6912PanelView3f6hBDE("为什么不支持百度网盘？", CommonToolKt.oneLine("\n            因为它不支持WebDAV协议访问服务\n        "), true, false, 0L, false, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 120);
                    final UriHandler uriHandler2 = uriHandler;
                    PanelViewKt.m6912PanelView3f6hBDE("什么是Koofr？", null, true, false, 0L, false, ComposableLambdaKt.composableLambda(composer2, -1638599518, true, new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserDocViewKt.WebDAVUserDocView.2.1
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i3) {
                            if ((i3 & 11) != 2 || !composer3.getSkipping()) {
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1638599518, i3, -1, "cn.jianyun.workplan.module.base.views.webdav.WebDAVUserDocView.<anonymous>.<anonymous> (WebDAVUserDocView.kt:41)");
                                }
                                TextKt.m2471Text4IGK_g(CommonToolKt.oneLine("\n           Koofr本身是一个网盘，同时还支持绑定第三方网盘，并且它向用户免费提供WebDAV协议访问服务，\n           使得用户可以直接通过它来对第三方网盘进行读取和写入文件，比如微软OneDrive,谷歌GoogleDrive,Dropbox，\n           Koofr自己也向用户提供10GB的存储空间，只是这个平台访问速度比较慢，但是不影响我们数据的云备份\n        "), (Modifier) null, 0L, TextUnitKt.getSp(13), (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 3072, 0, 131062);
                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer3, 0, 1);
                                final UriHandler uriHandler3 = uriHandler2;
                                ButtonViewKt.LongOkButton("注册koofr账号", new Function0<Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserDocViewKt.WebDAVUserDocView.2.1.1
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        uriHandler3.openUri("https://k00.fr/m8v2gygx");
                                    }
                                }, composer3, 6, 0);
                                CommonUIKt.m6944BlankkHDZbjc(0.0f, composer3, 0, 1);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                    return;
                                }
                                return;
                            }
                            composer3.skipToGroupEnd();
                        }
                    }), composer2, 1573254, 58);
                    PanelViewKt.m6912PanelView3f6hBDE("如何绑定微软OneDrive空间？", CommonToolKt.oneLine("\n            由于微软OneDrive空间并没有直接向个人提供WebDAV协议访问服务，但是用户可以借用Koofr平台，先将OneDrive绑定到Koofr,然后通过Koofr免费提供的webDAV协议向OneDrive读取和写入文件\n        "), true, false, 0L, false, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 120);
                    PanelViewKt.m6912PanelView3f6hBDE("如何绑定GoogleDrive空间？", CommonToolKt.oneLine("\n           由于GoogleDrive空间并没有直接向个人提供WebDAV协议访问服务，但是用户可以借用Koofr平台，先将GoogleDrive绑定到Koofr,然后通过Koofr免费提供的webDAV协议向GoogleDrive读取和写入文件\n        "), true, false, 0L, false, null, composer2, MediaPlayer.MEDIA_PLAYER_OPTION_QUIC_MAX_CRYPTO_RETRANSMISSION_TIME_MS, 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), composerStartRestartGroup, 12582918, 62);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: cn.jianyun.workplan.module.base.views.webdav.WebDAVUserDocViewKt.WebDAVUserDocView.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i2) {
                WebDAVUserDocViewKt.WebDAVUserDocView(viewModel, composer2, RecomposeScopeImplKt.updateChangedFlags(i | 1));
            }
        });
    }
}