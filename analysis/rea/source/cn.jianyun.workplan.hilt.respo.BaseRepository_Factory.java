package cn.jianyun.workplan.hilt.respo;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import cn.jianyun.workplan.api.BaseApi;
import cn.jianyun.workplan.api.ConfigApi;
import cn.jianyun.workplan.api.TraceApi;
import cn.jianyun.workplan.module.base.dao.WebDAVUserDao;
import dagger.internal.Factory;
import javax.inject.Provider;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseRepository_Factory implements Factory<BaseRepository> {
    private final Provider<BaseApi> apiProvider;
    private final Provider<ConfigApi> configApiProvider;
    private final Provider<Context> contextProvider;
    private final Provider<DataStore<Preferences>> datastoreProvider;
    private final Provider<TraceApi> traceApiProvider;
    private final Provider<WebDAVUserDao> webDAVUserDaoProvider;

    public BaseRepository_Factory(Provider<DataStore<Preferences>> datastoreProvider, Provider<TraceApi> traceApiProvider, Provider<BaseApi> apiProvider, Provider<ConfigApi> configApiProvider, Provider<WebDAVUserDao> webDAVUserDaoProvider, Provider<Context> contextProvider) {
        this.datastoreProvider = datastoreProvider;
        this.traceApiProvider = traceApiProvider;
        this.apiProvider = apiProvider;
        this.configApiProvider = configApiProvider;
        this.webDAVUserDaoProvider = webDAVUserDaoProvider;
        this.contextProvider = contextProvider;
    }

    @Override // javax.inject.Provider
    public BaseRepository get() {
        return newInstance(this.datastoreProvider.get(), this.traceApiProvider.get(), this.apiProvider.get(), this.configApiProvider.get(), this.webDAVUserDaoProvider.get(), this.contextProvider.get());
    }

    public static BaseRepository_Factory create(Provider<DataStore<Preferences>> datastoreProvider, Provider<TraceApi> traceApiProvider, Provider<BaseApi> apiProvider, Provider<ConfigApi> configApiProvider, Provider<WebDAVUserDao> webDAVUserDaoProvider, Provider<Context> contextProvider) {
        return new BaseRepository_Factory(datastoreProvider, traceApiProvider, apiProvider, configApiProvider, webDAVUserDaoProvider, contextProvider);
    }

    public static BaseRepository newInstance(DataStore<Preferences> datastore, TraceApi traceApi, BaseApi api, ConfigApi configApi, WebDAVUserDao webDAVUserDao, Context context) {
        return new BaseRepository(datastore, traceApi, api, configApi, webDAVUserDao, context);
    }
}