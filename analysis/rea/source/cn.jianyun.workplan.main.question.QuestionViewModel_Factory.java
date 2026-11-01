package cn.jianyun.workplan.main.question;

import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class QuestionViewModel_Factory implements Factory<QuestionViewModel> {
    private final Provider<BaseApi> apiProvider;
    private final Provider<BaseRepository> baseRepositoryProvider;

    public QuestionViewModel_Factory(Provider<BaseRepository> baseRepositoryProvider, Provider<BaseApi> apiProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
        this.apiProvider = apiProvider;
    }

    @Override // javax.inject.Provider
    public QuestionViewModel get() {
        return newInstance(this.baseRepositoryProvider.get(), this.apiProvider.get());
    }

    public static QuestionViewModel_Factory create(Provider<BaseRepository> baseRepositoryProvider, Provider<BaseApi> apiProvider) {
        return new QuestionViewModel_Factory(baseRepositoryProvider, apiProvider);
    }

    public static QuestionViewModel newInstance(BaseRepository baseRepository, BaseApi api) {
        return new QuestionViewModel(baseRepository, api);
    }
}