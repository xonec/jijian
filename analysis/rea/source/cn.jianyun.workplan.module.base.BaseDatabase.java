package cn.jianyun.workplan.module.base;

import androidx.room.RoomDatabase;
import cn.jianyun.workplan.module.base.dao.WebDAVUserDao;
import kotlin.Metadata;

/* JADX INFO: compiled from: BaseDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b'\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&¨\u0006\u0005"}, d2 = {"Lcn/jianyun/workplan/module/base/BaseDatabase;", "Landroidx/room/RoomDatabase;", "()V", "WebDAVUserDao", "Lcn/jianyun/workplan/module/base/dao/WebDAVUserDao;", "app_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class BaseDatabase extends RoomDatabase {
    public static final int $stable = 0;

    public abstract WebDAVUserDao WebDAVUserDao();
}