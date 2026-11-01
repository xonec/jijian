package cn.jianyun.workplan.module.schedule.dao;

import android.database.Cursor;
import androidx.core.app.NotificationCompat;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import cn.jianyun.workplan.module.schedule.model.ScheduleProject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleProjectDao_Impl implements ScheduleProjectDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<ScheduleProject> __deletionAdapterOfScheduleProject;
    private final EntityInsertionAdapter<ScheduleProject> __insertionAdapterOfScheduleProject;
    private final SharedSQLiteStatement __preparedStmtOfClearAll;
    private final EntityDeletionOrUpdateAdapter<ScheduleProject> __updateAdapterOfScheduleProject;

    public ScheduleProjectDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfScheduleProject = new EntityInsertionAdapter<ScheduleProject>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ScheduleProject` (`uuid`,`name`,`remark`,`userId`,`ordinal`,`state`,`alarm`,`gmtCreate`,`extField1`,`extField2`,`extField3`,`cc`,`cid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ScheduleProject scheduleProject) {
                if (scheduleProject.getUuid() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, scheduleProject.getUuid());
                }
                if (scheduleProject.getName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, scheduleProject.getName());
                }
                if (scheduleProject.getRemark() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, scheduleProject.getRemark());
                }
                if (scheduleProject.getUserId() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, scheduleProject.getUserId());
                }
                supportSQLiteStatement.bindLong(5, scheduleProject.getOrdinal());
                supportSQLiteStatement.bindLong(6, scheduleProject.getState());
                supportSQLiteStatement.bindLong(7, scheduleProject.getAlarm() ? 1L : 0L);
                if (scheduleProject.getGmtCreate() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, scheduleProject.getGmtCreate());
                }
                if (scheduleProject.getExtField1() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, scheduleProject.getExtField1());
                }
                if (scheduleProject.getExtField2() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, scheduleProject.getExtField2());
                }
                if (scheduleProject.getExtField3() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, scheduleProject.getExtField3());
                }
                supportSQLiteStatement.bindLong(12, scheduleProject.getCc());
                if (scheduleProject.getCid() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, scheduleProject.getCid());
                }
            }
        };
        this.__deletionAdapterOfScheduleProject = new EntityDeletionOrUpdateAdapter<ScheduleProject>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `ScheduleProject` WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, ScheduleProject value) {
                if (value.getUuid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUuid());
                }
            }
        };
        this.__updateAdapterOfScheduleProject = new EntityDeletionOrUpdateAdapter<ScheduleProject>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR REPLACE `ScheduleProject` SET `uuid` = ?,`name` = ?,`remark` = ?,`userId` = ?,`ordinal` = ?,`state` = ?,`alarm` = ?,`gmtCreate` = ?,`extField1` = ?,`extField2` = ?,`extField3` = ?,`cc` = ?,`cid` = ? WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ScheduleProject scheduleProject) {
                if (scheduleProject.getUuid() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, scheduleProject.getUuid());
                }
                if (scheduleProject.getName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, scheduleProject.getName());
                }
                if (scheduleProject.getRemark() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, scheduleProject.getRemark());
                }
                if (scheduleProject.getUserId() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, scheduleProject.getUserId());
                }
                supportSQLiteStatement.bindLong(5, scheduleProject.getOrdinal());
                supportSQLiteStatement.bindLong(6, scheduleProject.getState());
                supportSQLiteStatement.bindLong(7, scheduleProject.getAlarm() ? 1L : 0L);
                if (scheduleProject.getGmtCreate() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, scheduleProject.getGmtCreate());
                }
                if (scheduleProject.getExtField1() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, scheduleProject.getExtField1());
                }
                if (scheduleProject.getExtField2() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, scheduleProject.getExtField2());
                }
                if (scheduleProject.getExtField3() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, scheduleProject.getExtField3());
                }
                supportSQLiteStatement.bindLong(12, scheduleProject.getCc());
                if (scheduleProject.getCid() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, scheduleProject.getCid());
                }
                if (scheduleProject.getUuid() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, scheduleProject.getUuid());
                }
            }
        };
        this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from ScheduleProject";
            }
        };
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao
    public Object insert(final ScheduleProject item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao_Impl.5
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleProjectDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleProjectDao_Impl.this.__insertionAdapterOfScheduleProject.insert(item);
                    ScheduleProjectDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleProjectDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao
    public Object delete(final ScheduleProject item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleProjectDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleProjectDao_Impl.this.__deletionAdapterOfScheduleProject.handle(item);
                    ScheduleProjectDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleProjectDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao
    public Object update(final ScheduleProject item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleProjectDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleProjectDao_Impl.this.__updateAdapterOfScheduleProject.handle(item);
                    ScheduleProjectDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleProjectDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao
    public Object clearAll(final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = ScheduleProjectDao_Impl.this.__preparedStmtOfClearAll.acquire();
                ScheduleProjectDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    ScheduleProjectDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleProjectDao_Impl.this.__db.endTransaction();
                    ScheduleProjectDao_Impl.this.__preparedStmtOfClearAll.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao
    public Object list(final Continuation<? super List<ScheduleProject>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ScheduleProject order by ordinal asc", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ScheduleProject>>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao_Impl.9
            @Override // java.util.concurrent.Callable
            public List<ScheduleProject> call() throws Exception {
                AnonymousClass9 anonymousClass9 = this;
                Cursor cursorQuery = DBUtil.query(ScheduleProjectDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ordinal");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_ALARM);
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(new ScheduleProject(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.getInt(columnIndexOrThrow5), cursorQuery.getInt(columnIndexOrThrow6), cursorQuery.getInt(columnIndexOrThrow7) != 0, cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                        }
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass9 = this;
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

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}