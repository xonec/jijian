package cn.jianyun.workplan.main.receiver;

import cn.jianyun.workplan.hilt.respo.BaseRepository;
import dagger.MembersInjector;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class AlarmWidgetReceiver_MembersInjector implements MembersInjector<AlarmWidgetReceiver> {
    private final Provider<BaseRepository> baseRepositoryProvider;

    public AlarmWidgetReceiver_MembersInjector(Provider<BaseRepository> baseRepositoryProvider) {
        this.baseRepositoryProvider = baseRepositoryProvider;
    }

    public static MembersInjector<AlarmWidgetReceiver> create(Provider<BaseRepository> baseRepositoryProvider) {
        return new AlarmWidgetReceiver_MembersInjector(baseRepositoryProvider);
    }

    @Override // dagger.MembersInjector
    public void injectMembers(AlarmWidgetReceiver instance) {
        injectBaseRepository(instance, this.baseRepositoryProvider.get());
    }

    public static void injectBaseRepository(AlarmWidgetReceiver instance, BaseRepository baseRepository) {
        instance.baseRepository = baseRepository;
    }
}