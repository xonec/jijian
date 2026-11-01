package cn.jianyun.workplan.vm;

import android.content.Context;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class ColorViewModel_Factory implements Factory<ColorViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<Context> contextProvider;

    public ColorViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<Context> contextProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public ColorViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.contextProvider.get());
    }

    public static ColorViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<Context> contextProvider) {
        return new ColorViewModel_Factory(baseRepositoryProvider, contextProvider);
    }

    public static ColorViewModel newInstance(BaseRepository baseRepository, Context context) {
        return new ColorViewModel(baseRepository, context);
    }
}