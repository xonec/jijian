package cn.jianyun.workplan.widget.config;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class WidgetConfigViewModel_Factory implements Factory<WidgetConfigViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public WidgetConfigViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    @Override // javax.inject.Provider
    public WidgetConfigViewModel get() {
        return newInstance(this.baseRepositoryProvider.get());
    }

    public static WidgetConfigViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider) {
        return new WidgetConfigViewModel_Factory(baseRepositoryProvider);
    }

    public static WidgetConfigViewModel newInstance(BaseRepository baseRepository) {
        return new WidgetConfigViewModel(baseRepository);
    }
}