package cn.jianyun.workplan.module.schedule;

import androidx.core.app.NotificationCompat;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleAlarmDao_Impl;
import cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl;
import cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleDutyDao_Impl;
import cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao;
import cn.jianyun.workplan.module.schedule.dao.SchedulePlanDao_Impl;
import cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleProjectDao_Impl;
import cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao;
import cn.jianyun.workplan.module.schedule.dao.ScheduleWorkDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class ScheduleDatabase_Impl extends ScheduleDatabase {
    private volatile ScheduleAlarmDao _scheduleAlarmDao;
    private volatile ScheduleConfigDao _scheduleConfigDao;
    private volatile ScheduleDutyDao _scheduleDutyDao;
    private volatile SchedulePlanDao _schedulePlanDao;
    private volatile ScheduleProjectDao _scheduleProjectDao;
    private volatile ScheduleWorkDao _scheduleWorkDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(5) { // from class: cn.jianyun.workplan.module.schedule.ScheduleDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase _db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `ScheduleProject` (`uuid` TEXT NOT NULL, `name` TEXT NOT NULL, `remark` TEXT NOT NULL, `userId` TEXT NOT NULL, `ordinal` INTEGER NOT NULL, `state` INTEGER NOT NULL, `alarm` INTEGER NOT NULL, `gmtCreate` TEXT NOT NULL, `extField1` TEXT NOT NULL, `extField2` TEXT NOT NULL, `extField3` TEXT NOT NULL, `cc` INTEGER NOT NULL, `cid` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `ScheduleWork` (`uuid` TEXT NOT NULL, `name` TEXT NOT NULL, `userId` TEXT NOT NULL, `gmtBegin` TEXT NOT NULL, `gmtEnd` TEXT NOT NULL, `remark` TEXT NOT NULL, `theme` TEXT NOT NULL, `projectUuid` TEXT NOT NULL, `complex` INTEGER NOT NULL, `config` TEXT NOT NULL, `ordinal` INTEGER NOT NULL, `fullDay` INTEGER NOT NULL, `state` INTEGER NOT NULL, `gmtCreate` TEXT NOT NULL, `subId` TEXT NOT NULL, `extField1` TEXT NOT NULL, `extField2` TEXT NOT NULL, `extField3` TEXT NOT NULL, `cc` INTEGER NOT NULL, `cid` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_ScheduleWork_projectUuid` ON `ScheduleWork` (`projectUuid`)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `ScheduleConfig` (`uuid` TEXT NOT NULL, `autoDay` TEXT NOT NULL, `beginDay` TEXT NOT NULL, `dateFontSize` TEXT NOT NULL, `workFontSize` TEXT NOT NULL, `timeFontSize` TEXT NOT NULL, `workRadius` TEXT NOT NULL, `showLunar` INTEGER NOT NULL, `showFestival` INTEGER NOT NULL, `showBeginTime` INTEGER NOT NULL, `showEndTime` INTEGER NOT NULL, `showHLine` INTEGER NOT NULL, `fillCalendar` INTEGER NOT NULL, `showRemark` INTEGER NOT NULL, `showStat` INTEGER NOT NULL, `protectMode` INTEGER NOT NULL, `extField1` TEXT NOT NULL, `extField2` TEXT NOT NULL, `extField3` TEXT NOT NULL, `extField4` TEXT NOT NULL, `extField5` TEXT NOT NULL, `projectUuid` TEXT NOT NULL, `remark` TEXT NOT NULL, `gmtCreate` TEXT NOT NULL, `cc` INTEGER NOT NULL, `cid` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `SchedulePlan` (`uuid` TEXT NOT NULL, `name` TEXT NOT NULL, `userId` TEXT NOT NULL, `gmtBegin` TEXT NOT NULL, `gmtEnd` TEXT NOT NULL, `remark` TEXT NOT NULL, `theme` TEXT NOT NULL, `projectUuid` TEXT NOT NULL, `config` TEXT NOT NULL, `ordinal` INTEGER NOT NULL, `state` INTEGER NOT NULL, `gmtCreate` TEXT NOT NULL, `extField1` TEXT NOT NULL, `extField2` TEXT NOT NULL, `extField3` TEXT NOT NULL, `cc` INTEGER NOT NULL, `cid` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_SchedulePlan_projectUuid` ON `SchedulePlan` (`projectUuid`)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `ScheduleDuty` (`uuid` TEXT NOT NULL, `day` TEXT NOT NULL, `userId` TEXT NOT NULL, `workUuid` TEXT NOT NULL, `secondWorkUuid` TEXT NOT NULL, `projectUuid` TEXT NOT NULL, `remark` TEXT NOT NULL, `gmtCreate` TEXT NOT NULL, `extField1` TEXT NOT NULL, `extField2` TEXT NOT NULL, `extField3` TEXT NOT NULL, `cc` INTEGER NOT NULL, `cid` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_ScheduleDuty_projectUuid` ON `ScheduleDuty` (`projectUuid`)");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `ScheduleAlarm` (`uuid` TEXT NOT NULL, `name` TEXT NOT NULL, `type` TEXT NOT NULL, `beforeDay` TEXT NOT NULL, `notifyTime` TEXT NOT NULL, `workUuid` TEXT NOT NULL, `projectUuid` TEXT NOT NULL, `alarm` INTEGER NOT NULL, `opened` INTEGER NOT NULL, `nextTime` TEXT NOT NULL, `remark` TEXT NOT NULL, `gmtCreate` TEXT NOT NULL, `extField1` TEXT NOT NULL, `extField2` TEXT NOT NULL, `extField3` TEXT NOT NULL, `cc` INTEGER NOT NULL, `cid` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                _db.execSQL("CREATE INDEX IF NOT EXISTS `index_ScheduleAlarm_projectUuid` ON `ScheduleAlarm` (`projectUuid`)");
                _db.execSQL(RoomMasterTable.CREATE_QUERY);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9a3a3b43f62127e53a9ecfa046c73a41')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("DROP TABLE IF EXISTS `ScheduleProject`");
                _db.execSQL("DROP TABLE IF EXISTS `ScheduleWork`");
                _db.execSQL("DROP TABLE IF EXISTS `ScheduleConfig`");
                _db.execSQL("DROP TABLE IF EXISTS `SchedulePlan`");
                _db.execSQL("DROP TABLE IF EXISTS `ScheduleDuty`");
                _db.execSQL("DROP TABLE IF EXISTS `ScheduleAlarm`");
                if (ScheduleDatabase_Impl.this.mCallbacks != null) {
                    int size = ScheduleDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) ScheduleDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase _db) {
                if (ScheduleDatabase_Impl.this.mCallbacks != null) {
                    int size = ScheduleDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) ScheduleDatabase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase _db) {
                ScheduleDatabase_Impl.this.mDatabase = _db;
                ScheduleDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (ScheduleDatabase_Impl.this.mCallbacks != null) {
                    int size = ScheduleDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) ScheduleDatabase_Impl.this.mCallbacks.get(i)).onOpen(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(SupportSQLiteDatabase _db) {
                DBUtil.dropFtsSyncTriggers(_db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
                HashMap map = new HashMap(13);
                map.put("uuid", new TableInfo.Column("uuid", "TEXT", true, 1, null, 1));
                map.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map.put("remark", new TableInfo.Column("remark", "TEXT", true, 0, null, 1));
                map.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
                map.put("ordinal", new TableInfo.Column("ordinal", "INTEGER", true, 0, null, 1));
                map.put("state", new TableInfo.Column("state", "INTEGER", true, 0, null, 1));
                map.put(NotificationCompat.CATEGORY_ALARM, new TableInfo.Column(NotificationCompat.CATEGORY_ALARM, "INTEGER", true, 0, null, 1));
                map.put("gmtCreate", new TableInfo.Column("gmtCreate", "TEXT", true, 0, null, 1));
                map.put("extField1", new TableInfo.Column("extField1", "TEXT", true, 0, null, 1));
                map.put("extField2", new TableInfo.Column("extField2", "TEXT", true, 0, null, 1));
                map.put("extField3", new TableInfo.Column("extField3", "TEXT", true, 0, null, 1));
                map.put("cc", new TableInfo.Column("cc", "INTEGER", true, 0, null, 1));
                map.put("cid", new TableInfo.Column("cid", "TEXT", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("ScheduleProject", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(_db, "ScheduleProject");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenHelper.ValidationResult(false, "ScheduleProject(cn.jianyun.workplan.module.schedule.model.ScheduleProject).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(20);
                map2.put("uuid", new TableInfo.Column("uuid", "TEXT", true, 1, null, 1));
                map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map2.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
                map2.put("gmtBegin", new TableInfo.Column("gmtBegin", "TEXT", true, 0, null, 1));
                map2.put("gmtEnd", new TableInfo.Column("gmtEnd", "TEXT", true, 0, null, 1));
                map2.put("remark", new TableInfo.Column("remark", "TEXT", true, 0, null, 1));
                map2.put("theme", new TableInfo.Column("theme", "TEXT", true, 0, null, 1));
                map2.put("projectUuid", new TableInfo.Column("projectUuid", "TEXT", true, 0, null, 1));
                map2.put("complex", new TableInfo.Column("complex", "INTEGER", true, 0, null, 1));
                map2.put("config", new TableInfo.Column("config", "TEXT", true, 0, null, 1));
                map2.put("ordinal", new TableInfo.Column("ordinal", "INTEGER", true, 0, null, 1));
                map2.put("fullDay", new TableInfo.Column("fullDay", "INTEGER", true, 0, null, 1));
                map2.put("state", new TableInfo.Column("state", "INTEGER", true, 0, null, 1));
                map2.put("gmtCreate", new TableInfo.Column("gmtCreate", "TEXT", true, 0, null, 1));
                map2.put("subId", new TableInfo.Column("subId", "TEXT", true, 0, null, 1));
                map2.put("extField1", new TableInfo.Column("extField1", "TEXT", true, 0, null, 1));
                map2.put("extField2", new TableInfo.Column("extField2", "TEXT", true, 0, null, 1));
                map2.put("extField3", new TableInfo.Column("extField3", "TEXT", true, 0, null, 1));
                map2.put("cc", new TableInfo.Column("cc", "INTEGER", true, 0, null, 1));
                map2.put("cid", new TableInfo.Column("cid", "TEXT", true, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new TableInfo.Index("index_ScheduleWork_projectUuid", false, Arrays.asList("projectUuid"), Arrays.asList("ASC")));
                TableInfo tableInfo3 = new TableInfo("ScheduleWork", map2, hashSet, hashSet2);
                TableInfo tableInfo4 = TableInfo.read(_db, "ScheduleWork");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenHelper.ValidationResult(false, "ScheduleWork(cn.jianyun.workplan.module.schedule.model.ScheduleWork).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                HashMap map3 = new HashMap(26);
                map3.put("uuid", new TableInfo.Column("uuid", "TEXT", true, 1, null, 1));
                map3.put("autoDay", new TableInfo.Column("autoDay", "TEXT", true, 0, null, 1));
                map3.put("beginDay", new TableInfo.Column("beginDay", "TEXT", true, 0, null, 1));
                map3.put("dateFontSize", new TableInfo.Column("dateFontSize", "TEXT", true, 0, null, 1));
                map3.put("workFontSize", new TableInfo.Column("workFontSize", "TEXT", true, 0, null, 1));
                map3.put("timeFontSize", new TableInfo.Column("timeFontSize", "TEXT", true, 0, null, 1));
                map3.put("workRadius", new TableInfo.Column("workRadius", "TEXT", true, 0, null, 1));
                map3.put("showLunar", new TableInfo.Column("showLunar", "INTEGER", true, 0, null, 1));
                map3.put("showFestival", new TableInfo.Column("showFestival", "INTEGER", true, 0, null, 1));
                map3.put("showBeginTime", new TableInfo.Column("showBeginTime", "INTEGER", true, 0, null, 1));
                map3.put("showEndTime", new TableInfo.Column("showEndTime", "INTEGER", true, 0, null, 1));
                map3.put("showHLine", new TableInfo.Column("showHLine", "INTEGER", true, 0, null, 1));
                map3.put("fillCalendar", new TableInfo.Column("fillCalendar", "INTEGER", true, 0, null, 1));
                map3.put("showRemark", new TableInfo.Column("showRemark", "INTEGER", true, 0, null, 1));
                map3.put("showStat", new TableInfo.Column("showStat", "INTEGER", true, 0, null, 1));
                map3.put("protectMode", new TableInfo.Column("protectMode", "INTEGER", true, 0, null, 1));
                map3.put("extField1", new TableInfo.Column("extField1", "TEXT", true, 0, null, 1));
                map3.put("extField2", new TableInfo.Column("extField2", "TEXT", true, 0, null, 1));
                map3.put("extField3", new TableInfo.Column("extField3", "TEXT", true, 0, null, 1));
                map3.put("extField4", new TableInfo.Column("extField4", "TEXT", true, 0, null, 1));
                map3.put("extField5", new TableInfo.Column("extField5", "TEXT", true, 0, null, 1));
                map3.put("projectUuid", new TableInfo.Column("projectUuid", "TEXT", true, 0, null, 1));
                map3.put("remark", new TableInfo.Column("remark", "TEXT", true, 0, null, 1));
                map3.put("gmtCreate", new TableInfo.Column("gmtCreate", "TEXT", true, 0, null, 1));
                map3.put("cc", new TableInfo.Column("cc", "INTEGER", true, 0, null, 1));
                map3.put("cid", new TableInfo.Column("cid", "TEXT", true, 0, null, 1));
                TableInfo tableInfo5 = new TableInfo("ScheduleConfig", map3, new HashSet(0), new HashSet(0));
                TableInfo tableInfo6 = TableInfo.read(_db, "ScheduleConfig");
                if (!tableInfo5.equals(tableInfo6)) {
                    return new RoomOpenHelper.ValidationResult(false, "ScheduleConfig(cn.jianyun.workplan.module.schedule.model.ScheduleConfig).\n Expected:\n" + tableInfo5 + "\n Found:\n" + tableInfo6);
                }
                HashMap map4 = new HashMap(17);
                map4.put("uuid", new TableInfo.Column("uuid", "TEXT", true, 1, null, 1));
                map4.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map4.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
                map4.put("gmtBegin", new TableInfo.Column("gmtBegin", "TEXT", true, 0, null, 1));
                map4.put("gmtEnd", new TableInfo.Column("gmtEnd", "TEXT", true, 0, null, 1));
                map4.put("remark", new TableInfo.Column("remark", "TEXT", true, 0, null, 1));
                map4.put("theme", new TableInfo.Column("theme", "TEXT", true, 0, null, 1));
                map4.put("projectUuid", new TableInfo.Column("projectUuid", "TEXT", true, 0, null, 1));
                map4.put("config", new TableInfo.Column("config", "TEXT", true, 0, null, 1));
                map4.put("ordinal", new TableInfo.Column("ordinal", "INTEGER", true, 0, null, 1));
                map4.put("state", new TableInfo.Column("state", "INTEGER", true, 0, null, 1));
                map4.put("gmtCreate", new TableInfo.Column("gmtCreate", "TEXT", true, 0, null, 1));
                map4.put("extField1", new TableInfo.Column("extField1", "TEXT", true, 0, null, 1));
                map4.put("extField2", new TableInfo.Column("extField2", "TEXT", true, 0, null, 1));
                map4.put("extField3", new TableInfo.Column("extField3", "TEXT", true, 0, null, 1));
                map4.put("cc", new TableInfo.Column("cc", "INTEGER", true, 0, null, 1));
                map4.put("cid", new TableInfo.Column("cid", "TEXT", true, 0, null, 1));
                HashSet hashSet3 = new HashSet(0);
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new TableInfo.Index("index_SchedulePlan_projectUuid", false, Arrays.asList("projectUuid"), Arrays.asList("ASC")));
                TableInfo tableInfo7 = new TableInfo("SchedulePlan", map4, hashSet3, hashSet4);
                TableInfo tableInfo8 = TableInfo.read(_db, "SchedulePlan");
                if (!tableInfo7.equals(tableInfo8)) {
                    return new RoomOpenHelper.ValidationResult(false, "SchedulePlan(cn.jianyun.workplan.module.schedule.model.SchedulePlan).\n Expected:\n" + tableInfo7 + "\n Found:\n" + tableInfo8);
                }
                HashMap map5 = new HashMap(13);
                map5.put("uuid", new TableInfo.Column("uuid", "TEXT", true, 1, null, 1));
                map5.put("day", new TableInfo.Column("day", "TEXT", true, 0, null, 1));
                map5.put("userId", new TableInfo.Column("userId", "TEXT", true, 0, null, 1));
                map5.put("workUuid", new TableInfo.Column("workUuid", "TEXT", true, 0, null, 1));
                map5.put("secondWorkUuid", new TableInfo.Column("secondWorkUuid", "TEXT", true, 0, null, 1));
                map5.put("projectUuid", new TableInfo.Column("projectUuid", "TEXT", true, 0, null, 1));
                map5.put("remark", new TableInfo.Column("remark", "TEXT", true, 0, null, 1));
                map5.put("gmtCreate", new TableInfo.Column("gmtCreate", "TEXT", true, 0, null, 1));
                map5.put("extField1", new TableInfo.Column("extField1", "TEXT", true, 0, null, 1));
                map5.put("extField2", new TableInfo.Column("extField2", "TEXT", true, 0, null, 1));
                map5.put("extField3", new TableInfo.Column("extField3", "TEXT", true, 0, null, 1));
                map5.put("cc", new TableInfo.Column("cc", "INTEGER", true, 0, null, 1));
                map5.put("cid", new TableInfo.Column("cid", "TEXT", true, 0, null, 1));
                HashSet hashSet5 = new HashSet(0);
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new TableInfo.Index("index_ScheduleDuty_projectUuid", false, Arrays.asList("projectUuid"), Arrays.asList("ASC")));
                TableInfo tableInfo9 = new TableInfo("ScheduleDuty", map5, hashSet5, hashSet6);
                TableInfo tableInfo10 = TableInfo.read(_db, "ScheduleDuty");
                if (!tableInfo9.equals(tableInfo10)) {
                    return new RoomOpenHelper.ValidationResult(false, "ScheduleDuty(cn.jianyun.workplan.module.schedule.model.ScheduleDuty).\n Expected:\n" + tableInfo9 + "\n Found:\n" + tableInfo10);
                }
                HashMap map6 = new HashMap(17);
                map6.put("uuid", new TableInfo.Column("uuid", "TEXT", true, 1, null, 1));
                map6.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                map6.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                map6.put("beforeDay", new TableInfo.Column("beforeDay", "TEXT", true, 0, null, 1));
                map6.put("notifyTime", new TableInfo.Column("notifyTime", "TEXT", true, 0, null, 1));
                map6.put("workUuid", new TableInfo.Column("workUuid", "TEXT", true, 0, null, 1));
                map6.put("projectUuid", new TableInfo.Column("projectUuid", "TEXT", true, 0, null, 1));
                map6.put(NotificationCompat.CATEGORY_ALARM, new TableInfo.Column(NotificationCompat.CATEGORY_ALARM, "INTEGER", true, 0, null, 1));
                map6.put("opened", new TableInfo.Column("opened", "INTEGER", true, 0, null, 1));
                map6.put("nextTime", new TableInfo.Column("nextTime", "TEXT", true, 0, null, 1));
                map6.put("remark", new TableInfo.Column("remark", "TEXT", true, 0, null, 1));
                map6.put("gmtCreate", new TableInfo.Column("gmtCreate", "TEXT", true, 0, null, 1));
                map6.put("extField1", new TableInfo.Column("extField1", "TEXT", true, 0, null, 1));
                map6.put("extField2", new TableInfo.Column("extField2", "TEXT", true, 0, null, 1));
                map6.put("extField3", new TableInfo.Column("extField3", "TEXT", true, 0, null, 1));
                map6.put("cc", new TableInfo.Column("cc", "INTEGER", true, 0, null, 1));
                map6.put("cid", new TableInfo.Column("cid", "TEXT", true, 0, null, 1));
                HashSet hashSet7 = new HashSet(0);
                HashSet hashSet8 = new HashSet(1);
                hashSet8.add(new TableInfo.Index("index_ScheduleAlarm_projectUuid", false, Arrays.asList("projectUuid"), Arrays.asList("ASC")));
                TableInfo tableInfo11 = new TableInfo("ScheduleAlarm", map6, hashSet7, hashSet8);
                TableInfo tableInfo12 = TableInfo.read(_db, "ScheduleAlarm");
                if (!tableInfo11.equals(tableInfo12)) {
                    return new RoomOpenHelper.ValidationResult(false, "ScheduleAlarm(cn.jianyun.workplan.module.schedule.model.ScheduleAlarm).\n Expected:\n" + tableInfo11 + "\n Found:\n" + tableInfo12);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "9a3a3b43f62127e53a9ecfa046c73a41", "6d8159b27005d54e41e693feeb5a1aab")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "ScheduleProject", "ScheduleWork", "ScheduleConfig", "SchedulePlan", "ScheduleDuty", "ScheduleAlarm");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `ScheduleProject`");
            writableDatabase.execSQL("DELETE FROM `ScheduleWork`");
            writableDatabase.execSQL("DELETE FROM `ScheduleConfig`");
            writableDatabase.execSQL("DELETE FROM `SchedulePlan`");
            writableDatabase.execSQL("DELETE FROM `ScheduleDuty`");
            writableDatabase.execSQL("DELETE FROM `ScheduleAlarm`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(ScheduleProjectDao.class, ScheduleProjectDao_Impl.getRequiredConverters());
        map.put(ScheduleWorkDao.class, ScheduleWorkDao_Impl.getRequiredConverters());
        map.put(SchedulePlanDao.class, SchedulePlanDao_Impl.getRequiredConverters());
        map.put(ScheduleDutyDao.class, ScheduleDutyDao_Impl.getRequiredConverters());
        map.put(ScheduleAlarmDao.class, ScheduleAlarmDao_Impl.getRequiredConverters());
        map.put(ScheduleConfigDao.class, ScheduleConfigDao_Impl.getRequiredConverters());
        return map;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
        return Arrays.asList(new Migration[0]);
    }

    @Override // cn.jianyun.workplan.module.schedule.ScheduleDatabase
    public ScheduleProjectDao projectDao() {
        ScheduleProjectDao scheduleProjectDao;
        if (this._scheduleProjectDao != null) {
            return this._scheduleProjectDao;
        }
        synchronized (this) {
            if (this._scheduleProjectDao == null) {
                this._scheduleProjectDao = new ScheduleProjectDao_Impl(this);
            }
            scheduleProjectDao = this._scheduleProjectDao;
        }
        return scheduleProjectDao;
    }

    @Override // cn.jianyun.workplan.module.schedule.ScheduleDatabase
    public ScheduleWorkDao workDao() {
        ScheduleWorkDao scheduleWorkDao;
        if (this._scheduleWorkDao != null) {
            return this._scheduleWorkDao;
        }
        synchronized (this) {
            if (this._scheduleWorkDao == null) {
                this._scheduleWorkDao = new ScheduleWorkDao_Impl(this);
            }
            scheduleWorkDao = this._scheduleWorkDao;
        }
        return scheduleWorkDao;
    }

    @Override // cn.jianyun.workplan.module.schedule.ScheduleDatabase
    public SchedulePlanDao planDao() {
        SchedulePlanDao schedulePlanDao;
        if (this._schedulePlanDao != null) {
            return this._schedulePlanDao;
        }
        synchronized (this) {
            if (this._schedulePlanDao == null) {
                this._schedulePlanDao = new SchedulePlanDao_Impl(this);
            }
            schedulePlanDao = this._schedulePlanDao;
        }
        return schedulePlanDao;
    }

    @Override // cn.jianyun.workplan.module.schedule.ScheduleDatabase
    public ScheduleDutyDao dutyDao() {
        ScheduleDutyDao scheduleDutyDao;
        if (this._scheduleDutyDao != null) {
            return this._scheduleDutyDao;
        }
        synchronized (this) {
            if (this._scheduleDutyDao == null) {
                this._scheduleDutyDao = new ScheduleDutyDao_Impl(this);
            }
            scheduleDutyDao = this._scheduleDutyDao;
        }
        return scheduleDutyDao;
    }

    @Override // cn.jianyun.workplan.module.schedule.ScheduleDatabase
    public ScheduleAlarmDao alarmDao() {
        ScheduleAlarmDao scheduleAlarmDao;
        if (this._scheduleAlarmDao != null) {
            return this._scheduleAlarmDao;
        }
        synchronized (this) {
            if (this._scheduleAlarmDao == null) {
                this._scheduleAlarmDao = new ScheduleAlarmDao_Impl(this);
            }
            scheduleAlarmDao = this._scheduleAlarmDao;
        }
        return scheduleAlarmDao;
    }

    @Override // cn.jianyun.workplan.module.schedule.ScheduleDatabase
    public ScheduleConfigDao configDao() {
        ScheduleConfigDao scheduleConfigDao;
        if (this._scheduleConfigDao != null) {
            return this._scheduleConfigDao;
        }
        synchronized (this) {
            if (this._scheduleConfigDao == null) {
                this._scheduleConfigDao = new ScheduleConfigDao_Impl(this);
            }
            scheduleConfigDao = this._scheduleConfigDao;
        }
        return scheduleConfigDao;
    }
}