package cn.jianyun.workplan.module.schedule.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import cn.jianyun.workplan.module.schedule.model.SchedulePlan;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class SchedulePlanDao_Impl implements SchedulePlanDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<SchedulePlan> __deletionAdapterOfSchedulePlan;
    private final EntityInsertionAdapter<SchedulePlan> __insertionAdapterOfSchedulePlan;
    private final SharedSQLiteStatement __preparedStmtOfClearAll;
    private final SharedSQLiteStatement __preparedStmtOfDeleteByProject;
    private final EntityDeletionOrUpdateAdapter<SchedulePlan> __updateAdapterOfSchedulePlan;

    public SchedulePlanDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSchedulePlan = new EntityInsertionAdapter<SchedulePlan>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `SchedulePlan` (`uuid`,`name`,`userId`,`gmtBegin`,`gmtEnd`,`remark`,`theme`,`projectUuid`,`config`,`ordinal`,`state`,`gmtCreate`,`extField1`,`extField2`,`extField3`,`cc`,`cid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, SchedulePlan value) {
                if (value.getUuid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUuid());
                }
                if (value.getName() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getName());
                }
                if (value.getUserId() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getUserId());
                }
                if (value.getGmtBegin() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getGmtBegin());
                }
                if (value.getGmtEnd() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getGmtEnd());
                }
                if (value.getRemark() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getRemark());
                }
                if (value.getTheme() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getTheme());
                }
                if (value.getProjectUuid() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getProjectUuid());
                }
                if (value.getConfig() == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.getConfig());
                }
                stmt.bindLong(10, value.getOrdinal());
                stmt.bindLong(11, value.getState());
                if (value.getGmtCreate() == null) {
                    stmt.bindNull(12);
                } else {
                    stmt.bindString(12, value.getGmtCreate());
                }
                if (value.getExtField1() == null) {
                    stmt.bindNull(13);
                } else {
                    stmt.bindString(13, value.getExtField1());
                }
                if (value.getExtField2() == null) {
                    stmt.bindNull(14);
                } else {
                    stmt.bindString(14, value.getExtField2());
                }
                if (value.getExtField3() == null) {
                    stmt.bindNull(15);
                } else {
                    stmt.bindString(15, value.getExtField3());
                }
                stmt.bindLong(16, value.getCc());
                if (value.getCid() == null) {
                    stmt.bindNull(17);
                } else {
                    stmt.bindString(17, value.getCid());
                }
            }
        };
        this.__deletionAdapterOfSchedulePlan = new EntityDeletionOrUpdateAdapter<SchedulePlan>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `SchedulePlan` WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, SchedulePlan value) {
                if (value.getUuid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUuid());
                }
            }
        };
        this.__updateAdapterOfSchedulePlan = new EntityDeletionOrUpdateAdapter<SchedulePlan>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR REPLACE `SchedulePlan` SET `uuid` = ?,`name` = ?,`userId` = ?,`gmtBegin` = ?,`gmtEnd` = ?,`remark` = ?,`theme` = ?,`projectUuid` = ?,`config` = ?,`ordinal` = ?,`state` = ?,`gmtCreate` = ?,`extField1` = ?,`extField2` = ?,`extField3` = ?,`cc` = ?,`cid` = ? WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, SchedulePlan value) {
                if (value.getUuid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUuid());
                }
                if (value.getName() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getName());
                }
                if (value.getUserId() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getUserId());
                }
                if (value.getGmtBegin() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getGmtBegin());
                }
                if (value.getGmtEnd() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getGmtEnd());
                }
                if (value.getRemark() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getRemark());
                }
                if (value.getTheme() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getTheme());
                }
                if (value.getProjectUuid() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getProjectUuid());
                }
                if (value.getConfig() == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.getConfig());
                }
                stmt.bindLong(10, value.getOrdinal());
                stmt.bindLong(11, value.getState());
                if (value.getGmtCreate() == null) {
                    stmt.bindNull(12);
                } else {
                    stmt.bindString(12, value.getGmtCreate());
                }
                if (value.getExtField1() == null) {
                    stmt.bindNull(13);
                } else {
                    stmt.bindString(13, value.getExtField1());
                }
                if (value.getExtField2() == null) {
                    stmt.bindNull(14);
                } else {
                    stmt.bindString(14, value.getExtField2());
                }
                if (value.getExtField3() == null) {
                    stmt.bindNull(15);
                } else {
                    stmt.bindString(15, value.getExtField3());
                }
                stmt.bindLong(16, value.getCc());
                if (value.getCid() == null) {
                    stmt.bindNull(17);
                } else {
                    stmt.bindString(17, value.getCid());
                }
                if (value.getUuid() == null) {
                    stmt.bindNull(18);
                } else {
                    stmt.bindString(18, value.getUuid());
                }
            }
        };
        this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from SchedulePlan";
            }
        };
        this.__preparedStmtOfDeleteByProject = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from SchedulePlan where projectUuid = ?";
            }
        };
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao
    public Object insert(final SchedulePlan item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SchedulePlanDao_Impl.this.__db.beginTransaction();
                try {
                    SchedulePlanDao_Impl.this.__insertionAdapterOfSchedulePlan.insert(item);
                    SchedulePlanDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    SchedulePlanDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao
    public Object delete(final SchedulePlan item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SchedulePlanDao_Impl.this.__db.beginTransaction();
                try {
                    SchedulePlanDao_Impl.this.__deletionAdapterOfSchedulePlan.handle(item);
                    SchedulePlanDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    SchedulePlanDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao
    public Object update(final SchedulePlan item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SchedulePlanDao_Impl.this.__db.beginTransaction();
                try {
                    SchedulePlanDao_Impl.this.__updateAdapterOfSchedulePlan.handle(item);
                    SchedulePlanDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    SchedulePlanDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao
    public Object clearAll(final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.9
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = SchedulePlanDao_Impl.this.__preparedStmtOfClearAll.acquire();
                SchedulePlanDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    SchedulePlanDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    SchedulePlanDao_Impl.this.__db.endTransaction();
                    SchedulePlanDao_Impl.this.__preparedStmtOfClearAll.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao
    public Object deleteByProject(final String projectUuid, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.10
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = SchedulePlanDao_Impl.this.__preparedStmtOfDeleteByProject.acquire();
                String str = projectUuid;
                if (str == null) {
                    supportSQLiteStatementAcquire.bindNull(1);
                } else {
                    supportSQLiteStatementAcquire.bindString(1, str);
                }
                SchedulePlanDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    SchedulePlanDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    SchedulePlanDao_Impl.this.__db.endTransaction();
                    SchedulePlanDao_Impl.this.__preparedStmtOfDeleteByProject.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao
    public Object list(final Continuation<? super List<SchedulePlan>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM SchedulePlan", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<SchedulePlan>>() { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.11
            @Override // java.util.concurrent.Callable
            public List<SchedulePlan> call() throws Exception {
                AnonymousClass11 anonymousClass11;
                Cursor cursorQuery = DBUtil.query(SchedulePlanDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtBegin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtEnd");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "theme");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "config");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ordinal");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
                        int i = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                            String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                            String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                            String string4 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                            String string5 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                            String string6 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                            String string7 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                            String string8 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                            String string9 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                            int i2 = cursorQuery.getInt(columnIndexOrThrow10);
                            int i3 = cursorQuery.getInt(columnIndexOrThrow11);
                            String string10 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                            String string11 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                            String string12 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                            int i4 = columnIndexOrThrow15;
                            int i5 = columnIndexOrThrow;
                            String string13 = cursorQuery.isNull(i4) ? null : cursorQuery.getString(i4);
                            int i6 = columnIndexOrThrow16;
                            columnIndexOrThrow17 = columnIndexOrThrow17;
                            arrayList.add(new SchedulePlan(string, string2, string3, string4, string5, string6, string7, string8, string9, i2, i3, string10, string11, string12, string13, cursorQuery.getInt(i6), cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17)));
                            columnIndexOrThrow = i5;
                            columnIndexOrThrow15 = i4;
                            columnIndexOrThrow16 = i6;
                            i = i;
                        }
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass11 = this;
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    anonymousClass11 = this;
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao
    public Object findWork(final String workUuid, final Continuation<? super Integer> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT count(1) from SchedulePlan WHERE config like '%' || ? || '%'", 1);
        if (workUuid == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, workUuid);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Integer>() { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int iValueOf;
                Cursor cursorQuery = DBUtil.query(SchedulePlanDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        iValueOf = Integer.valueOf(cursorQuery.getInt(0));
                    } else {
                        iValueOf = 0;
                    }
                    return iValueOf;
                } finally {
                    cursorQuery.close();
                    roomSQLiteQueryAcquire.release();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao
    public Object listByProject(final String projectUuid, final Continuation<? super List<SchedulePlan>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * from SchedulePlan where projectUuid = ? order by ordinal asc", 1);
        if (projectUuid == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, projectUuid);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<SchedulePlan>>() { // from class: cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<SchedulePlan> call() throws Exception {
                AnonymousClass13 anonymousClass13;
                Cursor cursorQuery = DBUtil.query(SchedulePlanDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtBegin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtEnd");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "theme");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "config");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ordinal");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
                        int i = columnIndexOrThrow14;
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            String string = cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow);
                            String string2 = cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2);
                            String string3 = cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3);
                            String string4 = cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4);
                            String string5 = cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5);
                            String string6 = cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6);
                            String string7 = cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7);
                            String string8 = cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8);
                            String string9 = cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9);
                            int i2 = cursorQuery.getInt(columnIndexOrThrow10);
                            int i3 = cursorQuery.getInt(columnIndexOrThrow11);
                            String string10 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                            String string11 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                            String string12 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                            int i4 = columnIndexOrThrow15;
                            int i5 = columnIndexOrThrow;
                            String string13 = cursorQuery.isNull(i4) ? null : cursorQuery.getString(i4);
                            int i6 = columnIndexOrThrow16;
                            columnIndexOrThrow17 = columnIndexOrThrow17;
                            arrayList.add(new SchedulePlan(string, string2, string3, string4, string5, string6, string7, string8, string9, i2, i3, string10, string11, string12, string13, cursorQuery.getInt(i6), cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17)));
                            columnIndexOrThrow = i5;
                            columnIndexOrThrow15 = i4;
                            columnIndexOrThrow16 = i6;
                            i = i;
                        }
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass13 = this;
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    anonymousClass13 = this;
                }
            }
        }, continuation);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}