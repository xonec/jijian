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
import cn.jianyun.workplan.module.schedule.model.ScheduleWork;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleWorkDao_Impl implements ScheduleWorkDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<ScheduleWork> __deletionAdapterOfScheduleWork;
    private final EntityInsertionAdapter<ScheduleWork> __insertionAdapterOfScheduleWork;
    private final SharedSQLiteStatement __preparedStmtOfClearAll;
    private final SharedSQLiteStatement __preparedStmtOfDeleteByProject;
    private final EntityDeletionOrUpdateAdapter<ScheduleWork> __updateAdapterOfScheduleWork;

    public ScheduleWorkDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfScheduleWork = new EntityInsertionAdapter<ScheduleWork>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ScheduleWork` (`uuid`,`name`,`userId`,`gmtBegin`,`gmtEnd`,`remark`,`theme`,`projectUuid`,`complex`,`config`,`ordinal`,`fullDay`,`state`,`gmtCreate`,`subId`,`extField1`,`extField2`,`extField3`,`cc`,`cid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ScheduleWork scheduleWork) {
                if (scheduleWork.getUuid() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, scheduleWork.getUuid());
                }
                if (scheduleWork.getName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, scheduleWork.getName());
                }
                if (scheduleWork.getUserId() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, scheduleWork.getUserId());
                }
                if (scheduleWork.getGmtBegin() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, scheduleWork.getGmtBegin());
                }
                if (scheduleWork.getGmtEnd() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, scheduleWork.getGmtEnd());
                }
                if (scheduleWork.getRemark() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, scheduleWork.getRemark());
                }
                if (scheduleWork.getTheme() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, scheduleWork.getTheme());
                }
                if (scheduleWork.getProjectUuid() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, scheduleWork.getProjectUuid());
                }
                supportSQLiteStatement.bindLong(9, scheduleWork.getComplex() ? 1L : 0L);
                if (scheduleWork.getConfig() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, scheduleWork.getConfig());
                }
                supportSQLiteStatement.bindLong(11, scheduleWork.getOrdinal());
                supportSQLiteStatement.bindLong(12, scheduleWork.getFullDay() ? 1L : 0L);
                supportSQLiteStatement.bindLong(13, scheduleWork.getState());
                if (scheduleWork.getGmtCreate() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, scheduleWork.getGmtCreate());
                }
                if (scheduleWork.getSubId() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindString(15, scheduleWork.getSubId());
                }
                if (scheduleWork.getExtField1() == null) {
                    supportSQLiteStatement.bindNull(16);
                } else {
                    supportSQLiteStatement.bindString(16, scheduleWork.getExtField1());
                }
                if (scheduleWork.getExtField2() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, scheduleWork.getExtField2());
                }
                if (scheduleWork.getExtField3() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindString(18, scheduleWork.getExtField3());
                }
                supportSQLiteStatement.bindLong(19, scheduleWork.getCc());
                if (scheduleWork.getCid() == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindString(20, scheduleWork.getCid());
                }
            }
        };
        this.__deletionAdapterOfScheduleWork = new EntityDeletionOrUpdateAdapter<ScheduleWork>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `ScheduleWork` WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, ScheduleWork value) {
                if (value.getUuid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUuid());
                }
            }
        };
        this.__updateAdapterOfScheduleWork = new EntityDeletionOrUpdateAdapter<ScheduleWork>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR REPLACE `ScheduleWork` SET `uuid` = ?,`name` = ?,`userId` = ?,`gmtBegin` = ?,`gmtEnd` = ?,`remark` = ?,`theme` = ?,`projectUuid` = ?,`complex` = ?,`config` = ?,`ordinal` = ?,`fullDay` = ?,`state` = ?,`gmtCreate` = ?,`subId` = ?,`extField1` = ?,`extField2` = ?,`extField3` = ?,`cc` = ?,`cid` = ? WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ScheduleWork scheduleWork) {
                if (scheduleWork.getUuid() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, scheduleWork.getUuid());
                }
                if (scheduleWork.getName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, scheduleWork.getName());
                }
                if (scheduleWork.getUserId() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, scheduleWork.getUserId());
                }
                if (scheduleWork.getGmtBegin() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, scheduleWork.getGmtBegin());
                }
                if (scheduleWork.getGmtEnd() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, scheduleWork.getGmtEnd());
                }
                if (scheduleWork.getRemark() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, scheduleWork.getRemark());
                }
                if (scheduleWork.getTheme() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, scheduleWork.getTheme());
                }
                if (scheduleWork.getProjectUuid() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, scheduleWork.getProjectUuid());
                }
                supportSQLiteStatement.bindLong(9, scheduleWork.getComplex() ? 1L : 0L);
                if (scheduleWork.getConfig() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, scheduleWork.getConfig());
                }
                supportSQLiteStatement.bindLong(11, scheduleWork.getOrdinal());
                supportSQLiteStatement.bindLong(12, scheduleWork.getFullDay() ? 1L : 0L);
                supportSQLiteStatement.bindLong(13, scheduleWork.getState());
                if (scheduleWork.getGmtCreate() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, scheduleWork.getGmtCreate());
                }
                if (scheduleWork.getSubId() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindString(15, scheduleWork.getSubId());
                }
                if (scheduleWork.getExtField1() == null) {
                    supportSQLiteStatement.bindNull(16);
                } else {
                    supportSQLiteStatement.bindString(16, scheduleWork.getExtField1());
                }
                if (scheduleWork.getExtField2() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, scheduleWork.getExtField2());
                }
                if (scheduleWork.getExtField3() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindString(18, scheduleWork.getExtField3());
                }
                supportSQLiteStatement.bindLong(19, scheduleWork.getCc());
                if (scheduleWork.getCid() == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindString(20, scheduleWork.getCid());
                }
                if (scheduleWork.getUuid() == null) {
                    supportSQLiteStatement.bindNull(21);
                } else {
                    supportSQLiteStatement.bindString(21, scheduleWork.getUuid());
                }
            }
        };
        this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from ScheduleWork";
            }
        };
        this.__preparedStmtOfDeleteByProject = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from ScheduleWork where projectUuid = ?";
            }
        };
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao
    public Object insert(final ScheduleWork item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleWorkDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleWorkDao_Impl.this.__insertionAdapterOfScheduleWork.insert(item);
                    ScheduleWorkDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleWorkDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao
    public Object delete(final ScheduleWork item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleWorkDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleWorkDao_Impl.this.__deletionAdapterOfScheduleWork.handle(item);
                    ScheduleWorkDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleWorkDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao
    public Object update(final ScheduleWork item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleWorkDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleWorkDao_Impl.this.__updateAdapterOfScheduleWork.handle(item);
                    ScheduleWorkDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleWorkDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao
    public Object clearAll(final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.9
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = ScheduleWorkDao_Impl.this.__preparedStmtOfClearAll.acquire();
                ScheduleWorkDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    ScheduleWorkDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleWorkDao_Impl.this.__db.endTransaction();
                    ScheduleWorkDao_Impl.this.__preparedStmtOfClearAll.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao
    public Object deleteByProject(final String projectUuid, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.10
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = ScheduleWorkDao_Impl.this.__preparedStmtOfDeleteByProject.acquire();
                String str = projectUuid;
                if (str == null) {
                    supportSQLiteStatementAcquire.bindNull(1);
                } else {
                    supportSQLiteStatementAcquire.bindString(1, str);
                }
                ScheduleWorkDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    ScheduleWorkDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleWorkDao_Impl.this.__db.endTransaction();
                    ScheduleWorkDao_Impl.this.__preparedStmtOfDeleteByProject.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao
    public Object list(final Continuation<? super List<ScheduleWork>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ScheduleWork", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ScheduleWork>>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.11
            @Override // java.util.concurrent.Callable
            public List<ScheduleWork> call() throws Exception {
                AnonymousClass11 anonymousClass11;
                Cursor cursorQuery = DBUtil.query(ScheduleWorkDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtBegin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtEnd");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "theme");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "complex");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "config");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ordinal");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fullDay");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subId");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                        int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                        int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                        int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
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
                            boolean z = cursorQuery.getInt(columnIndexOrThrow9) != 0;
                            String string9 = cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10);
                            int i2 = cursorQuery.getInt(columnIndexOrThrow11);
                            boolean z2 = cursorQuery.getInt(columnIndexOrThrow12) != 0;
                            int i3 = cursorQuery.getInt(columnIndexOrThrow13);
                            int i4 = i;
                            String string10 = cursorQuery.isNull(i4) ? null : cursorQuery.getString(i4);
                            int i5 = columnIndexOrThrow15;
                            int i6 = columnIndexOrThrow;
                            String string11 = cursorQuery.isNull(i5) ? null : cursorQuery.getString(i5);
                            int i7 = columnIndexOrThrow16;
                            String string12 = cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7);
                            int i8 = columnIndexOrThrow17;
                            String string13 = cursorQuery.isNull(i8) ? null : cursorQuery.getString(i8);
                            int i9 = columnIndexOrThrow18;
                            String string14 = cursorQuery.isNull(i9) ? null : cursorQuery.getString(i9);
                            int i10 = columnIndexOrThrow19;
                            columnIndexOrThrow20 = columnIndexOrThrow20;
                            arrayList.add(new ScheduleWork(string, string2, string3, string4, string5, string6, string7, string8, z, string9, i2, z2, i3, string10, string11, string12, string13, string14, cursorQuery.getInt(i10), cursorQuery.isNull(columnIndexOrThrow20) ? null : cursorQuery.getString(columnIndexOrThrow20)));
                            columnIndexOrThrow = i6;
                            columnIndexOrThrow15 = i5;
                            columnIndexOrThrow16 = i7;
                            columnIndexOrThrow17 = i8;
                            columnIndexOrThrow18 = i9;
                            columnIndexOrThrow19 = i10;
                            i = i4;
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

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao
    public Object findWork(final String workUuid, final Continuation<? super Integer> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT count(1) from ScheduleWork WHERE config like '%' || ? || '%'", 1);
        if (workUuid == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, workUuid);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<Integer>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.12
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Integer call() throws Exception {
                int iValueOf;
                Cursor cursorQuery = DBUtil.query(ScheduleWorkDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
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

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao
    public Object listByProject(final String projectUuid, final Continuation<? super List<ScheduleWork>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * from ScheduleWork where projectUuid = ? order by ordinal asc", 1);
        if (projectUuid == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, projectUuid);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ScheduleWork>>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl.13
            @Override // java.util.concurrent.Callable
            public List<ScheduleWork> call() throws Exception {
                AnonymousClass13 anonymousClass13;
                Cursor cursorQuery = DBUtil.query(ScheduleWorkDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "userId");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtBegin");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtEnd");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "theme");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "complex");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "config");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "ordinal");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fullDay");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "state");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "subId");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                        int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                        int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                        int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
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
                            boolean z = cursorQuery.getInt(columnIndexOrThrow9) != 0;
                            String string9 = cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10);
                            int i2 = cursorQuery.getInt(columnIndexOrThrow11);
                            boolean z2 = cursorQuery.getInt(columnIndexOrThrow12) != 0;
                            int i3 = cursorQuery.getInt(columnIndexOrThrow13);
                            int i4 = i;
                            String string10 = cursorQuery.isNull(i4) ? null : cursorQuery.getString(i4);
                            int i5 = columnIndexOrThrow15;
                            int i6 = columnIndexOrThrow;
                            String string11 = cursorQuery.isNull(i5) ? null : cursorQuery.getString(i5);
                            int i7 = columnIndexOrThrow16;
                            String string12 = cursorQuery.isNull(i7) ? null : cursorQuery.getString(i7);
                            int i8 = columnIndexOrThrow17;
                            String string13 = cursorQuery.isNull(i8) ? null : cursorQuery.getString(i8);
                            int i9 = columnIndexOrThrow18;
                            String string14 = cursorQuery.isNull(i9) ? null : cursorQuery.getString(i9);
                            int i10 = columnIndexOrThrow19;
                            columnIndexOrThrow20 = columnIndexOrThrow20;
                            arrayList.add(new ScheduleWork(string, string2, string3, string4, string5, string6, string7, string8, z, string9, i2, z2, i3, string10, string11, string12, string13, string14, cursorQuery.getInt(i10), cursorQuery.isNull(columnIndexOrThrow20) ? null : cursorQuery.getString(columnIndexOrThrow20)));
                            columnIndexOrThrow = i6;
                            columnIndexOrThrow15 = i5;
                            columnIndexOrThrow16 = i7;
                            columnIndexOrThrow17 = i8;
                            columnIndexOrThrow18 = i9;
                            columnIndexOrThrow19 = i10;
                            i = i4;
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