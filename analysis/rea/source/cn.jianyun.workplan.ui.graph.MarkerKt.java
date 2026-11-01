package cn.jianyun.workplan.ui.graph;

import android.graphics.Typeface;
import android.text.Layout;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.unit.Dp;
import com.patrykandpatrick.vico.compose.cartesian.axis.AxisComponentsKt;
import com.patrykandpatrick.vico.compose.common.DimensionsKt;
import com.patrykandpatrick.vico.compose.common.component.ComponentsKt;
import com.patrykandpatrick.vico.compose.common.shape.ShapeKt;
import com.patrykandpatrick.vico.core.cartesian.CartesianMeasureContext;
import com.patrykandpatrick.vico.core.cartesian.HorizontalDimensions;
import com.patrykandpatrick.vico.core.cartesian.Insets;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarker;
import com.patrykandpatrick.vico.core.cartesian.marker.CartesianMarkerValueFormatter;
import com.patrykandpatrick.vico.core.cartesian.marker.DefaultCartesianMarker;
import com.patrykandpatrick.vico.core.cartesian.marker.DefaultCartesianMarkerValueFormatter;
import com.patrykandpatrick.vico.core.common.ColorKt;
import com.patrykandpatrick.vico.core.common.Dimensions;
import com.patrykandpatrick.vico.core.common.LayeredComponent;
import com.patrykandpatrick.vico.core.common.component.LineComponent;
import com.patrykandpatrick.vico.core.common.component.PaintComponent;
import com.patrykandpatrick.vico.core.common.component.ShapeComponent;
import com.patrykandpatrick.vico.core.common.component.TextComponent;
import com.patrykandpatrick.vico.core.common.shader.DynamicShader;
import com.patrykandpatrick.vico.core.common.shape.Corner;
import com.patrykandpatrick.vico.core.common.shape.MarkerCorneredShape;
import com.patrykandpatrick.vico.core.common.shape.Shape;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Marker.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a+\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"CLIPPING_FREE_SHADOW_RADIUS_MULTIPLIER", "", "LABEL_BACKGROUND_SHADOW_DY_DP", "LABEL_BACKGROUND_SHADOW_RADIUS_DP", "rememberMarker", "Lcom/patrykandpatrick/vico/core/cartesian/marker/CartesianMarker;", "valueFormatter", "Lcom/patrykandpatrick/vico/core/cartesian/marker/CartesianMarkerValueFormatter;", "labelPosition", "Lcom/patrykandpatrick/vico/core/cartesian/marker/DefaultCartesianMarker$LabelPosition;", "showIndicator", "", "(Lcom/patrykandpatrick/vico/core/cartesian/marker/CartesianMarkerValueFormatter;Lcom/patrykandpatrick/vico/core/cartesian/marker/DefaultCartesianMarker$LabelPosition;ZLandroidx/compose/runtime/Composer;II)Lcom/patrykandpatrick/vico/core/cartesian/marker/CartesianMarker;", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class MarkerKt {
    private static final float CLIPPING_FREE_SHADOW_RADIUS_MULTIPLIER = 1.4f;
    private static final float LABEL_BACKGROUND_SHADOW_DY_DP = 2.0f;
    private static final float LABEL_BACKGROUND_SHADOW_RADIUS_DP = 4.0f;

    public static final CartesianMarker rememberMarker(CartesianMarkerValueFormatter cartesianMarkerValueFormatter, DefaultCartesianMarker.LabelPosition labelPosition, boolean z, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-728748836);
        CartesianMarkerValueFormatter defaultCartesianMarkerValueFormatter = (i2 & 1) != 0 ? new DefaultCartesianMarkerValueFormatter(null, false, 3, null) : cartesianMarkerValueFormatter;
        DefaultCartesianMarker.LabelPosition labelPosition2 = (i2 & 2) != 0 ? DefaultCartesianMarker.LabelPosition.Top : labelPosition;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-728748836, i, -1, "cn.jianyun.workplan.ui.graph.rememberMarker (Marker.kt:30)");
        }
        final MarkerCorneredShape markerCorneredShapeM7350markerCorneredwH6b6FI$default = ShapeKt.m7350markerCorneredwH6b6FI$default(Shape.INSTANCE, Corner.INSTANCE.getFullyRounded(), 0.0f, 2, (Object) null);
        final DefaultCartesianMarker.LabelPosition labelPosition3 = labelPosition2;
        boolean zChanged = false;
        final TextComponent textComponentM7332rememberTextComponenth2R6Sm8 = ComponentsKt.m7332rememberTextComponenth2R6Sm8(MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).getOnSurface(), 0L, (ShapeComponent) PaintComponent.setShadow$default(ComponentsKt.m7331rememberShapeComponentwPRqli4(markerCorneredShapeM7350markerCorneredwH6b6FI$default, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).getSurface(), (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer, 8, 60), 4.0f, 0.0f, 2.0f, 0, true, 10, null), null, 2, DimensionsKt.m7304ofVpY3zN4(Dimensions.INSTANCE, Dp.m6097constructorimpl(12), Dp.m6097constructorimpl(6)), null, Typeface.MONOSPACE, Layout.Alignment.ALIGN_CENTER, ComponentsKt.m7327fixed3ABfNKs(TextComponent.MinWidth.INSTANCE, Dp.m6097constructorimpl(60)), composer, 1191469568, 74);
        ShapeComponent shapeComponentM7331rememberShapeComponentwPRqli4 = ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getPill(), MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable | 0).getSurface(), (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer, 8, 60);
        final ShapeComponent shapeComponentM7331rememberShapeComponentwPRqli5 = ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getPill(), 0L, (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer, 8, 62);
        final ShapeComponent shapeComponentM7331rememberShapeComponentwPRqli6 = ComponentsKt.m7331rememberShapeComponentwPRqli4(Shape.INSTANCE.getPill(), 0L, (DynamicShader) null, (Dimensions) null, 0.0f, 0L, composer, 8, 62);
        LayeredComponent layeredComponentRememberLayeredComponent = ComponentsKt.rememberLayeredComponent(shapeComponentM7331rememberShapeComponentwPRqli6, ComponentsKt.rememberLayeredComponent(shapeComponentM7331rememberShapeComponentwPRqli5, shapeComponentM7331rememberShapeComponentwPRqli4, DimensionsKt.m7303of3ABfNKs(Dimensions.INSTANCE, Dp.m6097constructorimpl(5)), null, composer, 584, 8), DimensionsKt.m7303of3ABfNKs(Dimensions.INSTANCE, Dp.m6097constructorimpl(10)), null, composer, 584, 8);
        final LineComponent lineComponentM7284rememberAxisGuidelineComponentzAQ4DfA = AxisComponentsKt.m7284rememberAxisGuidelineComponentzAQ4DfA(0L, 0.0f, null, 0.0f, 0L, null, null, composer, 0, 127);
        Object[] objArr = {textComponentM7332rememberTextComponenth2R6Sm8, labelPosition3, layeredComponentRememberLayeredComponent, Boolean.valueOf(z2), lineComponentM7284rememberAxisGuidelineComponentzAQ4DfA};
        composer.startReplaceableGroup(-568225417);
        ComposerKt.sourceInformation(composer, "CC(remember)P(1):Composables.kt#9igjgp");
        for (int i3 = 0; i3 < 5; i3++) {
            zChanged |= composer.changed(objArr[i3]);
        }
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final LayeredComponent layeredComponent = z2 ? layeredComponentRememberLayeredComponent : null;
            final Function1<Integer, Unit> function1 = z2 ? new Function1<Integer, Unit>() { // from class: cn.jianyun.workplan.ui.graph.MarkerKt$rememberMarker$1$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                    invoke(num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(int i4) {
                    shapeComponentM7331rememberShapeComponentwPRqli6.setColor(ColorKt.copyColor$default(i4, 0.15f, 0.0f, 0.0f, 0.0f, 14, (Object) null));
                    shapeComponentM7331rememberShapeComponentwPRqli5.setColor(i4);
                    PaintComponent.setShadow$default(shapeComponentM7331rememberShapeComponentwPRqli5, 12.0f, 0.0f, 0.0f, i4, false, 22, null);
                }
            } : null;
            final CartesianMarkerValueFormatter cartesianMarkerValueFormatter2 = defaultCartesianMarkerValueFormatter;
            objRememberedValue = new DefaultCartesianMarker(cartesianMarkerValueFormatter2, labelPosition3, lineComponentM7284rememberAxisGuidelineComponentzAQ4DfA, markerCorneredShapeM7350markerCorneredwH6b6FI$default, layeredComponent, function1) { // from class: cn.jianyun.workplan.ui.graph.MarkerKt$rememberMarker$1$1
                final /* synthetic */ MarkerCorneredShape $labelBackgroundShape;
                final /* synthetic */ DefaultCartesianMarker.LabelPosition $labelPosition;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(this.$label, cartesianMarkerValueFormatter2, labelPosition3, layeredComponent, 36.0f, function1, lineComponentM7284rememberAxisGuidelineComponentzAQ4DfA);
                    this.$labelPosition = labelPosition3;
                    this.$labelBackgroundShape = markerCorneredShapeM7350markerCorneredwH6b6FI$default;
                }

                @Override // com.patrykandpatrick.vico.core.cartesian.marker.DefaultCartesianMarker, com.patrykandpatrick.vico.core.cartesian.ChartInsetter
                public void getInsets(CartesianMeasureContext context, Insets outInsets, HorizontalDimensions horizontalDimensions) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(outInsets, "outInsets");
                    Intrinsics.checkNotNullParameter(horizontalDimensions, "horizontalDimensions");
                    DefaultCartesianMarker.LabelPosition labelPosition4 = this.$labelPosition;
                    TextComponent textComponent = this.$label;
                    MarkerCorneredShape markerCorneredShape = this.$labelBackgroundShape;
                    outInsets.setTop(context.getPixels(3.6f));
                    if (labelPosition4 == DefaultCartesianMarker.LabelPosition.AroundPoint) {
                        return;
                    }
                    outInsets.setTop(outInsets.getTop() + TextComponent.getHeight$default(textComponent, context, null, 0, 0, 0.0f, false, 62, null) + context.getPixels(markerCorneredShape.getTickSizeDp()));
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MarkerKt$rememberMarker$1$1 markerKt$rememberMarker$1$1 = (MarkerKt$rememberMarker$1$1) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return markerKt$rememberMarker$1$1;
    }
}