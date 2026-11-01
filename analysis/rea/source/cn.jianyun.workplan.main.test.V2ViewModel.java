package cn.jianyun.workplan.main.test;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import cn.jianyun.workplan.module.base.vm.BaseViewModel;
import cn.jianyun.workplan.util.CommonToolKt;
import cn.jianyun.workplan.util.MyDateTool;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TestV2.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcn/jianyun/workplan/main/test/V2ViewModel;", "Lcn/jianyun/workplan/module/base/vm/BaseViewModel;", "baseRepository", "Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "(Lcn/jianyun/workplan/hilt/respo/BaseRepository;)V", "getBaseRepository", "()Lcn/jianyun/workplan/hilt/respo/BaseRepository;", "<set-?>", "Ljava/util/Date;", "currentDate", "getCurrentDate", "()Ljava/util/Date;", "setCurrentDate", "(Ljava/util/Date;)V", "currentDate$delegate", "Landroidx/compose/runtime/MutableState;", "getCurrentDateStr", "", "getRepository", "reload", "", "reloadData", "dataChanged", "", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class V2ViewModel extends BaseViewModel {
    public static final int $stable = 8;
    private final BaseRepository baseRepository;

    /* JADX INFO: renamed from: currentDate$delegate, reason: from kotlin metadata */
    private final MutableState currentDate;

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reload() {
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public void reloadData(boolean dataChanged) {
    }

    public final BaseRepository getBaseRepository() {
        return this.baseRepository;
    }

    @Inject
    public V2ViewModel(BaseRepository baseRepository) {
        Intrinsics.checkNotNullParameter(baseRepository, "baseRepository");
        this.baseRepository = baseRepository;
        this.currentDate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new Date(), null, 2, null);
        CommonToolKt.mlog("init v2");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Date getCurrentDate() {
        return (Date) this.currentDate.getValue();
    }

    public final void setCurrentDate(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.currentDate.setValue(date);
    }

    @Override // cn.jianyun.workplan.module.base.vm.BaseViewModel
    public BaseRepository getRepository() {
        return this.baseRepository;
    }

    public final String getCurrentDateStr() {
        String dateString = MyDateTool.toDateString(getCurrentDate());
        Intrinsics.checkNotNullExpressionValue(dateString, "toDateString(currentDate)");
        return dateString;
    }
}