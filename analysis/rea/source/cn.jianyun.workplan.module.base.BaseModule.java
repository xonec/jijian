package cn.jianyun.workplan.module.base;

import android.content.Context;
import androidx.room.Room;
import cn.jianyun.workplan.module.base.dao.WebDAVUserDao;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseModule.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcn/jianyun/workplan/module/base/BaseModule;", "", "()V", "provideDao1", "Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;", "appDatabase", "Lcn/jianyun/workplan/module/base/BaseDatabase;", "provideDb", "appContext", "Landroid/content/Context;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Module
public final class BaseModule {
    public static final int $stable = 0;
    public static final BaseModule INSTANCE = new BaseModule();

    private BaseModule() {
    }

    @Provides
    @Singleton
    public final BaseDatabase provideDb(@ApplicationContext Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        return (BaseDatabase) Room.databaseBuilder(appContext, BaseDatabase.class, "BaseDb2").addMigrations(BaseDatabaseKt.getMIGRATION_1_2()).build();
    }

    @Provides
    public final WebDAVUserDao provideDao1(BaseDatabase appDatabase) {
        Intrinsics.checkNotNullParameter(appDatabase, "appDatabase");
        return appDatabase.WebDAVUserDao();
    }
}