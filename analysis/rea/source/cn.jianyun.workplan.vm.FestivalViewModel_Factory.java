package cn.jianyun.workplan.vm;

import android.content.Context;
import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class FestivalViewModel_Factory implements Factory<FestivalViewModel> {
    private final Provider<BaseRepository> baseRepositoryProvider;
    private final Provider<Context> contextProvider;
    private final Provider<BaseApi> festivalApiProvider;

    public FestivalViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<BaseApi> festivalApiProvider, Provider<Context> contextProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.festivalApiProvider = festivalApiProvider;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public FestivalViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.festivalApiProvider.get(), this.contextProvider.get());
    }

    public static FestivalViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<BaseApi> festivalApiProvider, Provider<Context> contextProvider) {
        return new FestivalViewModel_Factory(baseRepositoryProvider, festivalApiProvider, contextProvider);
    }

    public static FestivalViewModel newInstance(BaseRepository baseRepository, BaseApi festivalApi, Context context) {
        return new FestivalViewModel(baseRepository, festivalApi, context);
    }
}