package cn.jianyun.workplan.module.base.dao;

import android.database.Cursor;
import androidx.autofill.HintConstants;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import cn.jianyun.workplan.module.base.model.WebDAVUser;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class WebDAVUserDao_Impl implements WebDAVUserDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<WebDAVUser> __deletionAdapterOfWebDAVUser;
    private final EntityInsertionAdapter<WebDAVUser> __insertionAdapterOfWebDAVUser;
    private final EntityDeletionOrUpdateAdapter<WebDAVUser> __updateAdapterOfWebDAVUser;

    public WebDAVUserDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfWebDAVUser = new EntityInsertionAdapter<WebDAVUser>(__db) { // from class: cn.jianyun.workplan.module.base.dao.WebDAVUserDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `WebDAVUser` (`uuid`,`url`,`username`,`password`,`platform`,`type`,`defaultPath`,`masterNode`,`bind`,`ordinal`,`shown`,`message`,`cloud`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, WebDAVUser webDAVUser) {
                if (webDAVUser.getUuid() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, webDAVUser.getUuid());
                }
                if (webDAVUser.getUrl() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, webDAVUser.getUrl());
                }
                if (webDAVUser.getUsername() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, webDAVUser.getUsername());
                }
                if (webDAVUser.getPassword() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, webDAVUser.getPassword());
                }
                if (webDAVUser.getPlatform() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, webDAVUser.getPlatform());
                }
                if (webDAVUser.getType() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, webDAVUser.getType());
                }
                if (webDAVUser.getDefaultPath() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, webDAVUser.getDefaultPath());
                }
                supportSQLiteStatement.bindLong(8, webDAVUser.getMasterNode() ? 1L : 0L);
                supportSQLiteStatement.bindLong(9, webDAVUser.getBind() ? 1L : 0L);
                supportSQLiteStatement.bindLong(10, webDAVUser.getOrdinal());
                supportSQLiteStatement.bindLong(11, webDAVUser.getShown() ? 1L : 0L);
                if (webDAVUser.getMessage() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, webDAVUser.getMessage());
                }
                supportSQLiteStatement.bindLong(13, webDAVUser.getCloud() ? 1L : 0L);
            }
        };
        this.__deletionAdapterOfWebDAVUser = new EntityDeletionOrUpdateAdapter<WebDAVUser>(__db) { // from class: cn.jianyun.workplan.module.base.dao.WebDAVUserDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `WebDAVUser` WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, WebDAVUser value) {
                if (value.getUuid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUuid());
                }
            }
        };
        this.__updateAdapterOfWebDAVUser = new EntityDeletionOrUpdateAdapter<WebDAVUser>(__db) { // from class: cn.jianyun.workplan.module.base.dao.WebDAVUserDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR REPLACE `WebDAVUser` SET `uuid` = ?,`url` = ?,`username` = ?,`password` = ?,`platform` = ?,`type` = ?,`defaultPath` = ?,`masterNode` = ?,`bind` = ?,`ordinal` = ?,`shown` = ?,`message` = ?,`cloud` = ? WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, WebDAVUser webDAVUser) {
                if (webDAVUser.getUuid() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, webDAVUser.getUuid());
                }
                if (webDAVUser.getUrl() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, webDAVUser.getUrl());
                }
                if (webDAVUser.getUsername() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, webDAVUser.getUsername());
                }
                if (webDAVUser.getPassword() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, webDAVUser.getPassword());
                }
                if (webDAVUser.getPlatform() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, webDAVUser.getPlatform());
                }
                if (webDAVUser.getType() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, webDAVUser.getType());
                }
                if (webDAVUser.getDefaultPath() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, webDAVUser.getDefaultPath());
                }
                supportSQLiteStatement.bindLong(8, webDAVUser.getMasterNode() ? 1L : 0L);
                supportSQLiteStatement.bindLong(9, webDAVUser.getBind() ? 1L : 0L);
                supportSQLiteStatement.bindLong(10, webDAVUser.getOrdinal());
                supportSQLiteStatement.bindLong(11, webDAVUser.getShown() ? 1L : 0L);
                if (webDAVUser.getMessage() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, webDAVUser.getMessage());
                }
                supportSQLiteStatement.bindLong(13, webDAVUser.getCloud() ? 1L : 0L);
                if (webDAVUser.getUuid() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, webDAVUser.getUuid());
                }
            }
        };
    }

    @Override // cn.jianyun.workplan.module.base.dao.WebDAVUserDao
    public Object insert(final WebDAVUser item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.base.dao.WebDAVUserDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                WebDAVUserDao_Impl.this.__db.beginTransaction();
                try {
                    WebDAVUserDao_Impl.this.__insertionAdapterOfWebDAVUser.insert(item);
                    WebDAVUserDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    WebDAVUserDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.base.dao.WebDAVUserDao
    public Object delete(final WebDAVUser item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.base.dao.WebDAVUserDao_Impl.5
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                WebDAVUserDao_Impl.this.__db.beginTransaction();
                try {
                    WebDAVUserDao_Impl.this.__deletionAdapterOfWebDAVUser.handle(item);
                    WebDAVUserDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    WebDAVUserDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.base.dao.WebDAVUserDao
    public Object update(final WebDAVUser item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.base.dao.WebDAVUserDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                WebDAVUserDao_Impl.this.__db.beginTransaction();
                try {
                    WebDAVUserDao_Impl.this.__updateAdapterOfWebDAVUser.handle(item);
                    WebDAVUserDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    WebDAVUserDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.base.dao.WebDAVUserDao
    public Object list(final Continuation<? super List<WebDAVUser>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM WebDAVUser", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<WebDAVUser>>() { // from class: cn.jianyun.workplan.module.base.dao.WebDAVUserDao_Impl.7
            @Override // java.util.concurrent.Callable
            public List<WebDAVUser> call() throws Exception {
                AnonymousClass7 anonymousClass7 = this;
                Cursor cursorQuery = DBUtil.query(WebDAVUserDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "url");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, HintConstants.AUTOFILL_HINT_USERNAME);
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, HintConstants.AUTOFILL_HINT_PASSWORD);
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "platform");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "defaultPath");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "masterNode");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "bind");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ordinal");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "shown");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "message");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cloud");
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(new WebDAVUser(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8) != 0, cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.getInt(columnIndexOrThrow10), cursorQuery.getInt(columnIndexOrThrow11) != 0, cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12), cursorQuery.getInt(columnIndexOrThrow13) != 0));
                        }
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass7 = this;
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.base.dao.WebDAVUserDao
    public Object getMasterOne(final Continuation<? super WebDAVUser> continuation) {
        return WebDAVUserDao.DefaultImpls.getMasterOne(this, continuation);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}