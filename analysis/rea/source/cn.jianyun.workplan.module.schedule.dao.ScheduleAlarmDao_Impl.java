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
import cn.jianyun.workplan.module.schedule.model.ScheduleAlarm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleAlarmDao_Impl implements ScheduleAlarmDao {
    private final RoomDatabase __db;
    private final EntityDeletionOrUpdateAdapter<ScheduleAlarm> __deletionAdapterOfScheduleAlarm;
    private final EntityInsertionAdapter<ScheduleAlarm> __insertionAdapterOfScheduleAlarm;
    private final SharedSQLiteStatement __preparedStmtOfClearAll;
    private final SharedSQLiteStatement __preparedStmtOfDeleteByProject;
    private final EntityDeletionOrUpdateAdapter<ScheduleAlarm> __updateAdapterOfScheduleAlarm;

    public ScheduleAlarmDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfScheduleAlarm = new EntityInsertionAdapter<ScheduleAlarm>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ScheduleAlarm` (`uuid`,`name`,`type`,`beforeDay`,`notifyTime`,`workUuid`,`projectUuid`,`alarm`,`opened`,`nextTime`,`remark`,`gmtCreate`,`extField1`,`extField2`,`extField3`,`cc`,`cid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ScheduleAlarm scheduleAlarm) {
                if (scheduleAlarm.getUuid() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, scheduleAlarm.getUuid());
                }
                if (scheduleAlarm.getName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, scheduleAlarm.getName());
                }
                if (scheduleAlarm.getType() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, scheduleAlarm.getType());
                }
                if (scheduleAlarm.getBeforeDay() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, scheduleAlarm.getBeforeDay());
                }
                if (scheduleAlarm.getNotifyTime() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, scheduleAlarm.getNotifyTime());
                }
                if (scheduleAlarm.getWorkUuid() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, scheduleAlarm.getWorkUuid());
                }
                if (scheduleAlarm.getProjectUuid() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, scheduleAlarm.getProjectUuid());
                }
                supportSQLiteStatement.bindLong(8, scheduleAlarm.getAlarm() ? 1L : 0L);
                supportSQLiteStatement.bindLong(9, scheduleAlarm.getOpened() ? 1L : 0L);
                if (scheduleAlarm.getNextTime() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, scheduleAlarm.getNextTime());
                }
                if (scheduleAlarm.getRemark() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, scheduleAlarm.getRemark());
                }
                if (scheduleAlarm.getGmtCreate() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, scheduleAlarm.getGmtCreate());
                }
                if (scheduleAlarm.getExtField1() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, scheduleAlarm.getExtField1());
                }
                if (scheduleAlarm.getExtField2() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, scheduleAlarm.getExtField2());
                }
                if (scheduleAlarm.getExtField3() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindString(15, scheduleAlarm.getExtField3());
                }
                supportSQLiteStatement.bindLong(16, scheduleAlarm.getCc());
                if (scheduleAlarm.getCid() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, scheduleAlarm.getCid());
                }
            }
        };
        this.__deletionAdapterOfScheduleAlarm = new EntityDeletionOrUpdateAdapter<ScheduleAlarm>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "DELETE FROM `ScheduleAlarm` WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement stmt, ScheduleAlarm value) {
                if (value.getUuid() == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.getUuid());
                }
            }
        };
        this.__updateAdapterOfScheduleAlarm = new EntityDeletionOrUpdateAdapter<ScheduleAlarm>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "UPDATE OR REPLACE `ScheduleAlarm` SET `uuid` = ?,`name` = ?,`type` = ?,`beforeDay` = ?,`notifyTime` = ?,`workUuid` = ?,`projectUuid` = ?,`alarm` = ?,`opened` = ?,`nextTime` = ?,`remark` = ?,`gmtCreate` = ?,`extField1` = ?,`extField2` = ?,`extField3` = ?,`cc` = ?,`cid` = ? WHERE `uuid` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ScheduleAlarm scheduleAlarm) {
                if (scheduleAlarm.getUuid() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, scheduleAlarm.getUuid());
                }
                if (scheduleAlarm.getName() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, scheduleAlarm.getName());
                }
                if (scheduleAlarm.getType() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, scheduleAlarm.getType());
                }
                if (scheduleAlarm.getBeforeDay() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, scheduleAlarm.getBeforeDay());
                }
                if (scheduleAlarm.getNotifyTime() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, scheduleAlarm.getNotifyTime());
                }
                if (scheduleAlarm.getWorkUuid() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, scheduleAlarm.getWorkUuid());
                }
                if (scheduleAlarm.getProjectUuid() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, scheduleAlarm.getProjectUuid());
                }
                supportSQLiteStatement.bindLong(8, scheduleAlarm.getAlarm() ? 1L : 0L);
                supportSQLiteStatement.bindLong(9, scheduleAlarm.getOpened() ? 1L : 0L);
                if (scheduleAlarm.getNextTime() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindString(10, scheduleAlarm.getNextTime());
                }
                if (scheduleAlarm.getRemark() == null) {
                    supportSQLiteStatement.bindNull(11);
                } else {
                    supportSQLiteStatement.bindString(11, scheduleAlarm.getRemark());
                }
                if (scheduleAlarm.getGmtCreate() == null) {
                    supportSQLiteStatement.bindNull(12);
                } else {
                    supportSQLiteStatement.bindString(12, scheduleAlarm.getGmtCreate());
                }
                if (scheduleAlarm.getExtField1() == null) {
                    supportSQLiteStatement.bindNull(13);
                } else {
                    supportSQLiteStatement.bindString(13, scheduleAlarm.getExtField1());
                }
                if (scheduleAlarm.getExtField2() == null) {
                    supportSQLiteStatement.bindNull(14);
                } else {
                    supportSQLiteStatement.bindString(14, scheduleAlarm.getExtField2());
                }
                if (scheduleAlarm.getExtField3() == null) {
                    supportSQLiteStatement.bindNull(15);
                } else {
                    supportSQLiteStatement.bindString(15, scheduleAlarm.getExtField3());
                }
                supportSQLiteStatement.bindLong(16, scheduleAlarm.getCc());
                if (scheduleAlarm.getCid() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, scheduleAlarm.getCid());
                }
                if (scheduleAlarm.getUuid() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindString(18, scheduleAlarm.getUuid());
                }
            }
        };
        this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from ScheduleAlarm";
            }
        };
        this.__preparedStmtOfDeleteByProject = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from ScheduleAlarm where projectUuid = ?";
            }
        };
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao
    public Object insert(final ScheduleAlarm item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.6
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleAlarmDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleAlarmDao_Impl.this.__insertionAdapterOfScheduleAlarm.insert(item);
                    ScheduleAlarmDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleAlarmDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao
    public Object delete(final ScheduleAlarm item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.7
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleAlarmDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleAlarmDao_Impl.this.__deletionAdapterOfScheduleAlarm.handle(item);
                    ScheduleAlarmDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleAlarmDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao
    public Object update(final ScheduleAlarm item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.8
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleAlarmDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleAlarmDao_Impl.this.__updateAdapterOfScheduleAlarm.handle(item);
                    ScheduleAlarmDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleAlarmDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao
    public Object clearAll(final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.9
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = ScheduleAlarmDao_Impl.this.__preparedStmtOfClearAll.acquire();
                ScheduleAlarmDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    ScheduleAlarmDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleAlarmDao_Impl.this.__db.endTransaction();
                    ScheduleAlarmDao_Impl.this.__preparedStmtOfClearAll.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao
    public Object deleteByProject(final String projectUuid, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.10
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = ScheduleAlarmDao_Impl.this.__preparedStmtOfDeleteByProject.acquire();
                String str = projectUuid;
                if (str == null) {
                    supportSQLiteStatementAcquire.bindNull(1);
                } else {
                    supportSQLiteStatementAcquire.bindString(1, str);
                }
                ScheduleAlarmDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    ScheduleAlarmDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleAlarmDao_Impl.this.__db.endTransaction();
                    ScheduleAlarmDao_Impl.this.__preparedStmtOfDeleteByProject.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao
    public Object list(final Continuation<? super List<ScheduleAlarm>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ScheduleAlarm", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ScheduleAlarm>>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.11
            @Override // java.util.concurrent.Callable
            public List<ScheduleAlarm> call() throws Exception {
                AnonymousClass11 anonymousClass11;
                Cursor cursorQuery = DBUtil.query(ScheduleAlarmDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "beforeDay");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "notifyTime");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workUuid");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_ALARM);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "opened");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextTime");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
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
                            boolean z = cursorQuery.getInt(columnIndexOrThrow8) != 0;
                            boolean z2 = cursorQuery.getInt(columnIndexOrThrow9) != 0;
                            String string8 = cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10);
                            String string9 = cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11);
                            String string10 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                            String string11 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                            String string12 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                            int i2 = columnIndexOrThrow15;
                            int i3 = columnIndexOrThrow;
                            String string13 = cursorQuery.isNull(i2) ? null : cursorQuery.getString(i2);
                            int i4 = columnIndexOrThrow16;
                            columnIndexOrThrow17 = columnIndexOrThrow17;
                            arrayList.add(new ScheduleAlarm(string, string2, string3, string4, string5, string6, string7, z, z2, string8, string9, string10, string11, string12, string13, cursorQuery.getInt(i4), cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17)));
                            columnIndexOrThrow = i3;
                            columnIndexOrThrow15 = i2;
                            columnIndexOrThrow16 = i4;
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

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao
    public Object listByProject(final String projectUuid, final Continuation<? super List<ScheduleAlarm>> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * from ScheduleAlarm where projectUuid = ?", 1);
        if (projectUuid == null) {
            roomSQLiteQueryAcquire.bindNull(1);
        } else {
            roomSQLiteQueryAcquire.bindString(1, projectUuid);
        }
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<List<ScheduleAlarm>>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl.12
            @Override // java.util.concurrent.Callable
            public List<ScheduleAlarm> call() throws Exception {
                AnonymousClass12 anonymousClass12;
                Cursor cursorQuery = DBUtil.query(ScheduleAlarmDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "name");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "type");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "beforeDay");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "notifyTime");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workUuid");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, NotificationCompat.CATEGORY_ALARM);
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "opened");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "nextTime");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
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
                            boolean z = cursorQuery.getInt(columnIndexOrThrow8) != 0;
                            boolean z2 = cursorQuery.getInt(columnIndexOrThrow9) != 0;
                            String string8 = cursorQuery.isNull(columnIndexOrThrow10) ? null : cursorQuery.getString(columnIndexOrThrow10);
                            String string9 = cursorQuery.isNull(columnIndexOrThrow11) ? null : cursorQuery.getString(columnIndexOrThrow11);
                            String string10 = cursorQuery.isNull(columnIndexOrThrow12) ? null : cursorQuery.getString(columnIndexOrThrow12);
                            String string11 = cursorQuery.isNull(columnIndexOrThrow13) ? null : cursorQuery.getString(columnIndexOrThrow13);
                            String string12 = cursorQuery.isNull(i) ? null : cursorQuery.getString(i);
                            int i2 = columnIndexOrThrow15;
                            int i3 = columnIndexOrThrow;
                            String string13 = cursorQuery.isNull(i2) ? null : cursorQuery.getString(i2);
                            int i4 = columnIndexOrThrow16;
                            columnIndexOrThrow17 = columnIndexOrThrow17;
                            arrayList.add(new ScheduleAlarm(string, string2, string3, string4, string5, string6, string7, z, z2, string8, string9, string10, string11, string12, string13, cursorQuery.getInt(i4), cursorQuery.isNull(columnIndexOrThrow17) ? null : cursorQuery.getString(columnIndexOrThrow17)));
                            columnIndexOrThrow = i3;
                            columnIndexOrThrow15 = i2;
                            columnIndexOrThrow16 = i4;
                            i = i;
                        }
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        return arrayList;
                    } catch (Throwable th) {
                        th = th;
                        anonymousClass12 = this;
                        cursorQuery.close();
                        roomSQLiteQueryAcquire.release();
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    anonymousClass12 = this;
                }
            }
        }, continuation);
    }

    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
}