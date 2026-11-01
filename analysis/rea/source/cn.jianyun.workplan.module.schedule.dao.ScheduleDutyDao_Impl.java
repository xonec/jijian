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
import cn.jianyun.workplan.module.schedule.model.ScheduleDuty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleDutyDao_Impl implements ScheduleDutyDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<ScheduleDuty> __deletionAdapterOfScheduleDuty;
    private final EntityInsertionAdapter<ScheduleDuty> __insertionAdapterOfScheduleDuty;
    private final SharedSQLiteStatement __preparedStmtOfClearAll;
    private final SharedSQLiteStatement __preparedStmtOfDeleteByDay;
    private final SharedSQLiteStatement __preparedStmtOfDeleteByProject;
    private final EntityDeletionOrUpdateAdapter<ScheduleDuty> __updateAdapterOfScheduleDuty;

    public ScheduleDutyDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfScheduleDuty = new EntityInsertionAdapter<ScheduleDuty>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ScheduleDuty` (`uuid`,`day`,`userId`,`workUuid`,`secondWorkUuid`,`projectUuid`,`remark`,`gmtCreate`,`extField1`,`extField2`,`extField3`,`cc`,`cid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement stmt, ScheduleDuty value) {
                if (value.getUuid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUuid());
                }
                if (value.getDay() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getDay());
                }
                if (value.getUserId() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getUserId());
                }
                if (value.getWorkUuid() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getWorkUuid());
                }
                if (value.getSecondWorkUuid() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getSecondWorkUuid());
                }
                if (value.getProjectUuid() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getProjectUuid());
                }
                if (value.getRemark() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getRemark());
                }
                if (value.getGmtCreate() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getGmtCreate());
                }
                if (value.getExtField1() == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.getExtField1());
                }
                if (value.getExtField2() == null) {
                    stmt.bindNull(10);
                } else {
                    stmt.bindString(10, value.getExtField2());
                }
                if (value.getExtField3() == null) {
                    stmt.bindNull(11);
                } else {
                    stmt.bindString(11, value.getExtField3());
                }
                stmt.bindLong(12, value.getCc());
                if (value.getCid() == null) {
                    stmt.bindNull(13);
                } else {
                    stmt.bindString(13, value.getCid());
                }
            }
        };
        this.__deletionAdapterOfScheduleDuty = new EntityDeletionOrUpdateAdapter<ScheduleDuty>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `ScheduleDuty` WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, ScheduleDuty value) {
                if (value.getUuid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUuid());
                }
            }
        };
        this.__updateAdapterOfScheduleDuty = new EntityDeletionOrUpdateAdapter<ScheduleDuty>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR REPLACE `ScheduleDuty` SET `uuid` = ?,`day` = ?,`userId` = ?,`workUuid` = ?,`secondWorkUuid` = ?,`projectUuid` = ?,`remark` = ?,`gmtCreate` = ?,`extField1` = ?,`extField2` = ?,`extField3` = ?,`cc` = ?,`cid` = ? WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, ScheduleDuty value) {
                if (value.getUuid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUuid());
                }
                if (value.getDay() == null) {
                    stmt.bindNull(2);
                } else {
                    stmt.bindString(2, value.getDay());
                }
                if (value.getUserId() == null) {
                    stmt.bindNull(3);
                } else {
                    stmt.bindString(3, value.getUserId());
                }
                if (value.getWorkUuid() == null) {
                    stmt.bindNull(4);
                } else {
                    stmt.bindString(4, value.getWorkUuid());
                }
                if (value.getSecondWorkUuid() == null) {
                    stmt.bindNull(5);
                } else {
                    stmt.bindString(5, value.getSecondWorkUuid());
                }
                if (value.getProjectUuid() == null) {
                    stmt.bindNull(6);
                } else {
                    stmt.bindString(6, value.getProjectUuid());
                }
                if (value.getRemark() == null) {
                    stmt.bindNull(7);
                } else {
                    stmt.bindString(7, value.getRemark());
                }
                if (value.getGmtCreate() == null) {
                    stmt.bindNull(8);
                } else {
                    stmt.bindString(8, value.getGmtCreate());
                }
                if (value.getExtField1() == null) {
                    stmt.bindNull(9);
                } else {
                    stmt.bindString(9, value.getExtField1());
                }
                if (value.getExtField2() == null) {
                    stmt.bindNull(10);
                } else {
                    stmt.bindString(10, value.getExtField2());
                }
                if (value.getExtField3() == null) {
                    stmt.bindNull(11);
                } else {
                    stmt.bindString(11, value.getExtField3());
                }
                stmt.bindLong(12, value.getCc());
                if (value.getCid() == null) {
                    stmt.bindNull(13);
                } else {
                    stmt.bindString(13, value.getCid());
                }
                if (value.getUuid() == null) {
                    stmt.bindNull(14);
                } else {
                    stmt.bindString(14, value.getUuid());
                }
            }
        };
        this.__preparedStmtOfDeleteByDay = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM ScheduleDuty WHERE projectUuid = ? AND day = ?";
            }
        };
        this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from ScheduleDuty";
            }
        };
        this.__preparedStmtOfDeleteByProject = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from ScheduleDuty where projectUuid = ?";
            }
        };
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object insert(final ScheduleDuty item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleDutyDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleDutyDao_Impl.this.__insertionAdapterOfScheduleDuty.insert(item);
                    ScheduleDutyDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleDutyDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object delete(final ScheduleDuty item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleDutyDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleDutyDao_Impl.this.__deletionAdapterOfScheduleDuty.handle(item);
                    ScheduleDutyDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleDutyDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object update(final ScheduleDuty item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.9
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleDutyDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleDutyDao_Impl.this.__updateAdapterOfScheduleDuty.handle(item);
                    ScheduleDutyDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleDutyDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object deleteByDay(final String projectUuid, final String day, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.10
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = ScheduleDutyDao_Impl.this.__preparedStmtOfDeleteByDay.acquire();
                String str = projectUuid;
                if (str == null) {
                    supportSQLiteStatementAcquire.bindNull(1);
                } else {
                    supportSQLiteStatementAcquire.bindString(1, str);
                }
                String str2 = day;
                if (str2 == null) {
                    supportSQLiteStatementAcquire.bindNull(2);
                } else {
                    supportSQLiteStatementAcquire.bindString(2, str2);
                }
                ScheduleDutyDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    ScheduleDutyDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleDutyDao_Impl.this.__db.endTransaction();
                    ScheduleDutyDao_Impl.this.__preparedStmtOfDeleteByDay.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object clearAll(final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.11
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = ScheduleDutyDao_Impl.this.__preparedStmtOfClearAll.acquire();
                ScheduleDutyDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    ScheduleDutyDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleDutyDao_Impl.this.__db.endTransaction();
                    ScheduleDutyDao_Impl.this.__preparedStmtOfClearAll.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object deleteByProject(final String projectUuid, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.12
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = ScheduleDutyDao_Impl.this.__preparedStmtOfDeleteByProject.acquire();
                String str = projectUuid;
                if (str == null) {
                    supportSQLiteStatementAcquire.bindNull(1);
                } else {
                    supportSQLiteStatementAcquire.bindString(1, str);
                }
                ScheduleDutyDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    ScheduleDutyDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleDutyDao_Impl.this.__db.endTransaction();
                    ScheduleDutyDao_Impl.this.__preparedStmtOfDeleteByProject.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object list(final Continuation<? super List<ScheduleDuty>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ScheduleDuty", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ScheduleDuty>>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<ScheduleDuty> call() throws Exception {
                AnonymousClass13 anonymousClass13 = this;
                Cursor cursorQuery = DBUtil.query(ScheduleDutyDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workUuid");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "secondWorkUuid");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(new ScheduleDuty(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
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
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object list(final String projectUuid, final Continuation<? super List<ScheduleDuty>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ScheduleDuty WHERE projectUuid = ?", 1);
        if (projectUuid == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, projectUuid);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ScheduleDuty>>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.14
            @Override // java.util.concurrent.Callable
            public List<ScheduleDuty> call() throws Exception {
                AnonymousClass14 anonymousClass14 = this;
                Cursor cursorQuery = DBUtil.query(ScheduleDutyDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workUuid");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "secondWorkUuid");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(new ScheduleDuty(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                        }
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass14 = this;
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

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object findByDay(final String projectUuid, final String day, final Continuation<? super List<ScheduleDuty>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ScheduleDuty WHERE projectUuid = ? AND day = ?", 2);
        if (projectUuid == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, projectUuid);
        }
        if (day == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, day);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ScheduleDuty>>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.15
            @Override // java.util.concurrent.Callable
            public List<ScheduleDuty> call() throws Exception {
                AnonymousClass15 anonymousClass15 = this;
                Cursor cursorQuery = DBUtil.query(ScheduleDutyDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workUuid");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "secondWorkUuid");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(new ScheduleDuty(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                        }
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass15 = this;
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

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object listByPeriod(final String projectUuid, final String gmtBegin, final String gmtEnd, final Continuation<? super List<ScheduleDuty>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ScheduleDuty WHERE projectUuid = ? AND day Between ? AND ? order by day asc", 3);
        if (projectUuid == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, projectUuid);
        }
        if (gmtBegin == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, gmtBegin);
        }
        if (gmtEnd == null) {
            roomSQLiteQueryAcquire.bindNull(3);
        } else {
            roomSQLiteQueryAcquire.bindString(3, gmtEnd);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ScheduleDuty>>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.16
            @Override // java.util.concurrent.Callable
            public List<ScheduleDuty> call() throws Exception {
                AnonymousClass16 anonymousClass16 = this;
                Cursor cursorQuery = DBUtil.query(ScheduleDutyDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workUuid");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "secondWorkUuid");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(new ScheduleDuty(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                        }
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass16 = this;
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

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object findWork(final String workUuid, final Continuation<? super Integer> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT count(1) from ScheduleDuty WHERE workUuid = ? or secondWorkUuid = ?", 2);
        if (workUuid == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, workUuid);
        }
        if (workUuid == null) {
            roomSQLiteQueryAcquire.bindNull(2);
        } else {
            roomSQLiteQueryAcquire.bindString(2, workUuid);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Integer>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.17
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int iValueOf;
                Cursor cursorQuery = DBUtil.query(ScheduleDutyDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
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

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao
    public Object listByProject(final String projectUuid, final Continuation<? super List<ScheduleDuty>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * from ScheduleDuty where projectUuid = ?", 1);
        if (projectUuid == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, projectUuid);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ScheduleDuty>>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl.18
            @Override // java.util.concurrent.Callable
            public List<ScheduleDuty> call() throws Exception {
                AnonymousClass18 anonymousClass18 = this;
                Cursor cursorQuery = DBUtil.query(ScheduleDutyDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "day");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workUuid");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "secondWorkUuid");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
                    try {
                        ArrayList arrayList = new ArrayList(cursorQuery.getCount());
                        while (cursorQuery.moveToNext()) {
                            arrayList.add(new ScheduleDuty(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.isNull(columnIndexOrThrow8) ? null : cursorQuery.getString(columnIndexOrThrow8), cursorQuery.isNull(columnIndexOrThrow9) ? null : cursorQuery.getString(columnIndexOrThrow9), cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10), cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11), cursorQuery.getInt(columnIndexOrThrow12), cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13)));
                        }
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass18 = this;
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