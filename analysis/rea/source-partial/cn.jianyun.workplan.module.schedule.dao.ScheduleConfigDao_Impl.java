package cn.jianyun.workplan.module.schedule.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import cn.jianyun.workplan.module.schedule.model.ScheduleConfig;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleConfigDao_Impl implements ScheduleConfigDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<ScheduleConfig> __insertionAdapterOfScheduleConfig;
    private final SharedSQLiteStatement __preparedStmtOfClearAll;

    public ScheduleConfigDao_Impl(RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfScheduleConfig = new EntityInsertionAdapter<ScheduleConfig>(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "INSERT OR REPLACE INTO `ScheduleConfig` (`uuid`,`autoDay`,`beginDay`,`dateFontSize`,`workFontSize`,`timeFontSize`,`workRadius`,`showLunar`,`showFestival`,`showBeginTime`,`showEndTime`,`showHLine`,`fillCalendar`,`showRemark`,`showStat`,`protectMode`,`extField1`,`extField2`,`extField3`,`extField4`,`extField5`,`projectUuid`,`remark`,`gmtCreate`,`cc`,`cid`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(SupportSQLiteStatement supportSQLiteStatement, ScheduleConfig scheduleConfig) {
                if (scheduleConfig.getUuid() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, scheduleConfig.getUuid());
                }
                if (scheduleConfig.getAutoDay() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, scheduleConfig.getAutoDay());
                }
                if (scheduleConfig.getBeginDay() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, scheduleConfig.getBeginDay());
                }
                if (scheduleConfig.getDateFontSize() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, scheduleConfig.getDateFontSize());
                }
                if (scheduleConfig.getWorkFontSize() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, scheduleConfig.getWorkFontSize());
                }
                if (scheduleConfig.getTimeFontSize() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindString(6, scheduleConfig.getTimeFontSize());
                }
                if (scheduleConfig.getWorkRadius() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindString(7, scheduleConfig.getWorkRadius());
                }
                supportSQLiteStatement.bindLong(8, scheduleConfig.getShowLunar() ? 1L : 0L);
                supportSQLiteStatement.bindLong(9, scheduleConfig.getShowFestival() ? 1L : 0L);
                supportSQLiteStatement.bindLong(10, scheduleConfig.getShowBeginTime() ? 1L : 0L);
                supportSQLiteStatement.bindLong(11, scheduleConfig.getShowEndTime() ? 1L : 0L);
                supportSQLiteStatement.bindLong(12, scheduleConfig.getShowHLine() ? 1L : 0L);
                supportSQLiteStatement.bindLong(13, scheduleConfig.getFillCalendar() ? 1L : 0L);
                supportSQLiteStatement.bindLong(14, scheduleConfig.getShowRemark() ? 1L : 0L);
                supportSQLiteStatement.bindLong(15, scheduleConfig.getShowStat() ? 1L : 0L);
                supportSQLiteStatement.bindLong(16, scheduleConfig.getProtectMode() ? 1L : 0L);
                if (scheduleConfig.getExtField1() == null) {
                    supportSQLiteStatement.bindNull(17);
                } else {
                    supportSQLiteStatement.bindString(17, scheduleConfig.getExtField1());
                }
                if (scheduleConfig.getExtField2() == null) {
                    supportSQLiteStatement.bindNull(18);
                } else {
                    supportSQLiteStatement.bindString(18, scheduleConfig.getExtField2());
                }
                if (scheduleConfig.getExtField3() == null) {
                    supportSQLiteStatement.bindNull(19);
                } else {
                    supportSQLiteStatement.bindString(19, scheduleConfig.getExtField3());
                }
                if (scheduleConfig.getExtField4() == null) {
                    supportSQLiteStatement.bindNull(20);
                } else {
                    supportSQLiteStatement.bindString(20, scheduleConfig.getExtField4());
                }
                if (scheduleConfig.getExtField5() == null) {
                    supportSQLiteStatement.bindNull(21);
                } else {
                    supportSQLiteStatement.bindString(21, scheduleConfig.getExtField5());
                }
                if (scheduleConfig.getProjectUuid() == null) {
                    supportSQLiteStatement.bindNull(22);
                } else {
                    supportSQLiteStatement.bindString(22, scheduleConfig.getProjectUuid());
                }
                if (scheduleConfig.getRemark() == null) {
                    supportSQLiteStatement.bindNull(23);
                } else {
                    supportSQLiteStatement.bindString(23, scheduleConfig.getRemark());
                }
                if (scheduleConfig.getGmtCreate() == null) {
                    supportSQLiteStatement.bindNull(24);
                } else {
                    supportSQLiteStatement.bindString(24, scheduleConfig.getGmtCreate());
                }
                supportSQLiteStatement.bindLong(25, scheduleConfig.getCc());
                if (scheduleConfig.getCid() == null) {
                    supportSQLiteStatement.bindNull(26);
                } else {
                    supportSQLiteStatement.bindString(26, scheduleConfig.getCid());
                }
            }
        };
        this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public String createQuery() {
                return "delete from ScheduleConfig";
            }
        };
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao
    public Object set(final ScheduleConfig item, final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.3
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                ScheduleConfigDao_Impl.this.__db.beginTransaction();
                try {
                    ScheduleConfigDao_Impl.this.__insertionAdapterOfScheduleConfig.insert(item);
                    ScheduleConfigDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleConfigDao_Impl.this.__db.endTransaction();
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao
    public Object clearAll(final Continuation<? super Unit> continuation) {
        return CoroutinesRoom.execute(this.__db, true, new Callable<Unit>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.4
            @Override // java.util.concurrent.Callable
            public Unit call() throws Exception {
                SupportSQLiteStatement supportSQLiteStatementAcquire = ScheduleConfigDao_Impl.this.__preparedStmtOfClearAll.acquire();
                ScheduleConfigDao_Impl.this.__db.beginTransaction();
                try {
                    supportSQLiteStatementAcquire.executeUpdateDelete();
                    ScheduleConfigDao_Impl.this.__db.setTransactionSuccessful();
                    return Unit.INSTANCE;
                } finally {
                    ScheduleConfigDao_Impl.this.__db.endTransaction();
                    ScheduleConfigDao_Impl.this.__preparedStmtOfClearAll.release(supportSQLiteStatementAcquire);
                }
            }
        }, continuation);
    }

    @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao
    public Object realGet(final Continuation<? super ScheduleConfig> continuation) {
        final RoomSQLiteQuery roomSQLiteQueryAcquire = RoomSQLiteQuery.acquire("SELECT * FROM ScheduleConfig limit 1", 0);
        return CoroutinesRoom.execute(this.__db, false, DBUtil.createCancellationSignal(), new Callable<ScheduleConfig>() { // from class: cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.5
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public ScheduleConfig call() throws Exception {
                ScheduleConfig scheduleConfig;
                AnonymousClass5 anonymousClass5 = this;
                Cursor cursorQuery = DBUtil.query(ScheduleConfigDao_Impl.this.__db, roomSQLiteQueryAcquire, false, null);
                try {
                    int columnIndexOrThrow = CursorUtil.getColumnIndexOrThrow(cursorQuery, "uuid");
                    int columnIndexOrThrow2 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "autoDay");
                    int columnIndexOrThrow3 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "beginDay");
                    int columnIndexOrThrow4 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "dateFontSize");
                    int columnIndexOrThrow5 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workFontSize");
                    int columnIndexOrThrow6 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "timeFontSize");
                    int columnIndexOrThrow7 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "workRadius");
                    int columnIndexOrThrow8 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "showLunar");
                    int columnIndexOrThrow9 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "showFestival");
                    int columnIndexOrThrow10 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "showBeginTime");
                    int columnIndexOrThrow11 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "showEndTime");
                    int columnIndexOrThrow12 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "showHLine");
                    int columnIndexOrThrow13 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "fillCalendar");
                    int columnIndexOrThrow14 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "showRemark");
                    try {
                        int columnIndexOrThrow15 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "showStat");
                        int columnIndexOrThrow16 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "protectMode");
                        int columnIndexOrThrow17 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField1");
                        int columnIndexOrThrow18 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField2");
                        int columnIndexOrThrow19 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField3");
                        int columnIndexOrThrow20 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField4");
                        int columnIndexOrThrow21 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "extField5");
                        int columnIndexOrThrow22 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "projectUuid");
                        int columnIndexOrThrow23 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "remark");
                        int columnIndexOrThrow24 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "gmtCreate");
                        int columnIndexOrThrow25 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cc");
                        int columnIndexOrThrow26 = CursorUtil.getColumnIndexOrThrow(cursorQuery, "cid");
                        if (cursorQuery.moveToFirst()) {
                            scheduleConfig = new ScheduleConfig(cursorQuery.isNull(columnIndexOrThrow) ? null : cursorQuery.getString(columnIndexOrThrow), cursorQuery.isNull(columnIndexOrThrow2) ? null : cursorQuery.getString(columnIndexOrThrow2), cursorQuery.isNull(columnIndexOrThrow3) ? null : cursorQuery.getString(columnIndexOrThrow3), cursorQuery.isNull(columnIndexOrThrow4) ? null : cursorQuery.getString(columnIndexOrThrow4), cursorQuery.isNull(columnIndexOrThrow5) ? null : cursorQuery.getString(columnIndexOrThrow5), cursorQuery.isNull(columnIndexOrThrow6) ? null : cursorQuery.getString(columnIndexOrThrow6), cursorQuery.isNull(columnIndexOrThrow7) ? null : cursorQuery.getString(columnIndexOrThrow7), cursorQuery.getInt(columnIndexOrThrow8) != 0, cursorQuery.getInt(columnIndexOrThrow9) != 0, cursorQuery.getInt(columnIndexOrThrow10) != 0, cursorQuery.getInt(columnIndexOrThrow11) != 0, cursorQuery.getInt(columnIndexOrThrow12) != 0, cursorQuery.getInt(columnIndexOrThrow13) != 0, cursorQuery.getInt(columnIndexOrThrow14) != 0, cursorQuery.getInt(columnIndexOrThrow15) != 0, cursorQuery.getInt(columnIndexOrThrow16) != 0, cursorQuery.isNull(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0250: CONSTRUCTOR (r4v6 'scheduleConfig' cn.jianyun.workplan.module.schedule.model.ScheduleConfig) = 
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x00c8: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r0v5 'columnIndexOrThrow' int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:231)) != false) ? (null java.lang.String) : (wrap ??:0x00d5: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r0v5 'columnIndexOrThrow' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:234)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x00d7: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r5v1 'columnIndexOrThrow2' int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:237)) != false) ? (null java.lang.String) : (wrap ??:0x00e4: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r5v1 'columnIndexOrThrow2' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:240)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x00e6: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r6v1 'columnIndexOrThrow3' int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:243)) != false) ? (null java.lang.String) : (wrap ??:0x00f3: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r6v1 'columnIndexOrThrow3' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:246)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x00f5: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r7v1 'columnIndexOrThrow4' int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:249)) != false) ? (null java.lang.String) : (wrap ??:0x0102: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r7v1 'columnIndexOrThrow4' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:252)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x0104: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r8v1 'columnIndexOrThrow5' int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:255)) != false) ? (null java.lang.String) : (wrap ??:0x0111: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r8v1 'columnIndexOrThrow5' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:258)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x0113: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r9v1 'columnIndexOrThrow6' int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:261)) != false) ? (null java.lang.String) : (wrap ??:0x0120: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r9v1 'columnIndexOrThrow6' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:264)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x0122: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r10v1 'columnIndexOrThrow7' int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:267)) != false) ? (null java.lang.String) : (wrap ??:0x012f: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r10v1 'columnIndexOrThrow7' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:270)))
                                  (wrap boolean:?: TERNARY null = ((wrap int:0x0131: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r11v1 'columnIndexOrThrow8' int) INTERFACE call: android.database.Cursor.getInt(int):int A[Catch: all -> 0x0260, MD:(int):int (c), WRAPPED] (LINE:274)) != (0 int)) ? true : false)
                                  (wrap boolean:?: TERNARY null = ((wrap int:0x013d: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r12v1 'columnIndexOrThrow9' int) INTERFACE call: android.database.Cursor.getInt(int):int A[Catch: all -> 0x0260, MD:(int):int (c), WRAPPED] (LINE:278)) != (0 int)) ? true : false)
                                  (wrap boolean:?: TERNARY null = ((wrap int:0x0148: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r13v1 'columnIndexOrThrow10' int) INTERFACE call: android.database.Cursor.getInt(int):int A[Catch: all -> 0x0260, MD:(int):int (c), WRAPPED] (LINE:282)) != (0 int)) ? true : false)
                                  (wrap boolean:?: TERNARY null = ((wrap int:0x0153: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r14v1 'columnIndexOrThrow11' int) INTERFACE call: android.database.Cursor.getInt(int):int A[Catch: all -> 0x0260, MD:(int):int (c), WRAPPED] (LINE:286)) != (0 int)) ? true : false)
                                  (wrap boolean:?: TERNARY null = ((wrap int:0x015e: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r15v1 'columnIndexOrThrow12' int) INTERFACE call: android.database.Cursor.getInt(int):int A[Catch: all -> 0x0260, MD:(int):int (c), WRAPPED] (LINE:290)) != (0 int)) ? true : false)
                                  (wrap boolean:?: TERNARY null = ((wrap int:0x0169: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r3v2 'columnIndexOrThrow13' int) INTERFACE call: android.database.Cursor.getInt(int):int A[Catch: all -> 0x0260, MD:(int):int (c), WRAPPED] (LINE:294)) != (0 int)) ? true : false)
                                  (wrap boolean:?: TERNARY null = ((wrap int:0x0174: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r4v2 'columnIndexOrThrow14' int) INTERFACE call: android.database.Cursor.getInt(int):int A[Catch: all -> 0x0260, MD:(int):int (c), WRAPPED] (LINE:298)) != (0 int)) ? true : false)
                                  (wrap boolean:?: TERNARY null = ((wrap int:0x0183: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v4 'columnIndexOrThrow15' int) INTERFACE call: android.database.Cursor.getInt(int):int A[Catch: all -> 0x0260, MD:(int):int (c), WRAPPED] (LINE:302)) != (0 int)) ? true : false)
                                  (wrap boolean:?: TERNARY null = ((wrap int:0x0192: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v6 'columnIndexOrThrow16' int) INTERFACE call: android.database.Cursor.getInt(int):int A[Catch: all -> 0x0260, MD:(int):int (c), WRAPPED] (LINE:306)) != (0 int)) ? true : false)
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x01a1: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r18v0 int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:309)) != false) ? (null java.lang.String) : (wrap ??:0x01b0: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v8 'columnIndexOrThrow17' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:312)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x01b4: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r19v0 int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:315)) != false) ? (null java.lang.String) : (wrap ??:0x01c3: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v10 'columnIndexOrThrow18' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:318)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x01c7: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r20v0 int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:321)) != false) ? (null java.lang.String) : (wrap ??:0x01d6: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v12 'columnIndexOrThrow19' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:324)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x01da: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r21v0 int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:327)) != false) ? (null java.lang.String) : (wrap ??:0x01e9: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v14 'columnIndexOrThrow20' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:330)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x01ed: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r22v0 int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:333)) != false) ? (null java.lang.String) : (wrap ??:0x01fc: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v16 'columnIndexOrThrow21' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:336)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x0200: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r23v0 int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:339)) != false) ? (null java.lang.String) : (wrap ??:0x020f: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v18 'columnIndexOrThrow22' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:342)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x0213: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r24v0 int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:345)) != false) ? (null java.lang.String) : (wrap ??:0x0222: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v20 'columnIndexOrThrow23' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:348)))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x0226: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r25v0 int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:351)) != false) ? (null java.lang.String) : (wrap ??:0x0235: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v22 'columnIndexOrThrow24' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:354)))
                                  (wrap int:0x0239: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v24 'columnIndexOrThrow25' int) INTERFACE call: android.database.Cursor.getInt(int):int A[Catch: all -> 0x0260, MD:(int):int (c), WRAPPED] (LINE:357))
                                  (wrap java.lang.String:?: TERNARY null = ((wrap boolean:0x023d: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v26 'columnIndexOrThrow26' int) INTERFACE call: android.database.Cursor.isNull(int):boolean A[Catch: all -> 0x0260, MD:(int):boolean (c), WRAPPED] (LINE:359)) != false) ? (null java.lang.String) : (wrap ??:0x024a: INVOKE (r2v1 'cursorQuery' android.database.Cursor), (r1v26 'columnIndexOrThrow26' int) INTERFACE call: android.database.Cursor.getString(int):java.lang.String A[Catch: all -> 0x0260, MD:(int):java.lang.String (c), WRAPPED] (LINE:362)))
                                 A[Catch: all -> 0x0260, MD:(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void (m), TRY_LEAVE] (LINE:364) call: cn.jianyun.workplan.module.schedule.model.ScheduleConfig.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String):void type: CONSTRUCTOR in method: cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.5.call():cn.jianyun.workplan.module.schedule.model.ScheduleConfig, file: classes2.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 int
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 622
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl.AnonymousClass5.call():cn.jianyun.workplan.module.schedule.model.ScheduleConfig");
                        }
                    }, continuation);
                }

                @Override // cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao
                public Object get(final Continuation<? super ScheduleConfig> continuation) {
                    return ScheduleConfigDao.DefaultImpls.get(this, continuation);
                }

                public static List<Class<?>> getRequiredConverters() {
                    return Collections.emptyList();
                }
            }