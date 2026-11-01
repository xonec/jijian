package cn.jianyun.workplan.module.base;

import androidx.autofill.HintConstants;
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
import cn.jianyun.workplan.module.base.dao.WebDAVUserDao;
import cn.jianyun.workplan.module.base.dao.WebDAVUserDao_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final class BaseDatabase_Impl extends BaseDatabase {
    private volatile WebDAVUserDao _webDAVUserDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
        return configuration.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(configuration.context).name(configuration.name).callback(new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(2) { // from class: cn.jianyun.workplan.module.base.BaseDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(SupportSQLiteDatabase _db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("CREATE TABLE IF NOT EXISTS `WebDAVUser` (`uuid` TEXT NOT NULL, `url` TEXT NOT NULL, `username` TEXT NOT NULL, `password` TEXT NOT NULL, `platform` TEXT NOT NULL, `type` TEXT NOT NULL, `defaultPath` TEXT NOT NULL, `masterNode` INTEGER NOT NULL, `bind` INTEGER NOT NULL, `ordinal` INTEGER NOT NULL, `shown` INTEGER NOT NULL, `message` TEXT NOT NULL, `cloud` INTEGER NOT NULL, PRIMARY KEY(`uuid`))");
                _db.execSQL("CREATE TABLE IF NOT EXISTS `TestUser` (`uuid` TEXT NOT NULL, `name` TEXT NOT NULL, PRIMARY KEY(`uuid`))");
                _db.execSQL(RoomMasterTable.CREATE_QUERY);
                _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5f8f54bd5b312fe5e6fedc2067800f47')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(SupportSQLiteDatabase _db) {
                _db.execSQL("DROP TABLE IF EXISTS `WebDAVUser`");
                _db.execSQL("DROP TABLE IF EXISTS `TestUser`");
                if (BaseDatabase_Impl.this.mCallbacks != null) {
                    int size = BaseDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) BaseDatabase_Impl.this.mCallbacks.get(i)).onDestructiveMigration(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(SupportSQLiteDatabase _db) {
                if (BaseDatabase_Impl.this.mCallbacks != null) {
                    int size = BaseDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) BaseDatabase_Impl.this.mCallbacks.get(i)).onCreate(_db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(SupportSQLiteDatabase _db) {
                BaseDatabase_Impl.this.mDatabase = _db;
                BaseDatabase_Impl.this.internalInitInvalidationTracker(_db);
                if (BaseDatabase_Impl.this.mCallbacks != null) {
                    int size = BaseDatabase_Impl.this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        ((RoomDatabase.Callback) BaseDatabase_Impl.this.mCallbacks.get(i)).onOpen(_db);
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
                map.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, 1));
                map.put(HintConstants.AUTOFILL_HINT_USERNAME, new TableInfo.Column(HintConstants.AUTOFILL_HINT_USERNAME, "TEXT", true, 0, null, 1));
                map.put(HintConstants.AUTOFILL_HINT_PASSWORD, new TableInfo.Column(HintConstants.AUTOFILL_HINT_PASSWORD, "TEXT", true, 0, null, 1));
                map.put("platform", new TableInfo.Column("platform", "TEXT", true, 0, null, 1));
                map.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, 1));
                map.put("defaultPath", new TableInfo.Column("defaultPath", "TEXT", true, 0, null, 1));
                map.put("masterNode", new TableInfo.Column("masterNode", "INTEGER", true, 0, null, 1));
                map.put("bind", new TableInfo.Column("bind", "INTEGER", true, 0, null, 1));
                map.put("ordinal", new TableInfo.Column("ordinal", "INTEGER", true, 0, null, 1));
                map.put("shown", new TableInfo.Column("shown", "INTEGER", true, 0, null, 1));
                map.put("message", new TableInfo.Column("message", "TEXT", true, 0, null, 1));
                map.put("cloud", new TableInfo.Column("cloud", "INTEGER", true, 0, null, 1));
                TableInfo tableInfo = new TableInfo("WebDAVUser", map, new HashSet(0), new HashSet(0));
                TableInfo tableInfo2 = TableInfo.read(_db, "WebDAVUser");
                if (!tableInfo.equals(tableInfo2)) {
                    return new RoomOpenHelper.ValidationResult(false, "WebDAVUser(cn.jianyun.workplan.module.base.model.WebDAVUser).\n Expected:\n" + tableInfo + "\n Found:\n" + tableInfo2);
                }
                HashMap map2 = new HashMap(2);
                map2.put("uuid", new TableInfo.Column("uuid", "TEXT", true, 1, null, 1));
                map2.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, 1));
                TableInfo tableInfo3 = new TableInfo("TestUser", map2, new HashSet(0), new HashSet(0));
                TableInfo tableInfo4 = TableInfo.read(_db, "TestUser");
                if (!tableInfo3.equals(tableInfo4)) {
                    return new RoomOpenHelper.ValidationResult(false, "TestUser(cn.jianyun.workplan.module.base.model.TestUser).\n Expected:\n" + tableInfo3 + "\n Found:\n" + tableInfo4);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "5f8f54bd5b312fe5e6fedc2067800f47", "e3e14002e8ff58424d163cf677d1e051")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "WebDAVUser", "TestUser");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("DELETE FROM `WebDAVUser`");
            writableDatabase.execSQL("DELETE FROM `TestUser`");
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
        map.put(WebDAVUserDao.class, WebDAVUserDao_Impl.getRequiredConverters());
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

    @Override // cn.jianyun.workplan.module.base.BaseDatabase
    public WebDAVUserDao WebDAVUserDao() {
        WebDAVUserDao webDAVUserDao;
        if (this._webDAVUserDao != null) {
            return this._webDAVUserDao;
        }
        synchronized (this) {
            if (this._webDAVUserDao == null) {
                this._webDAVUserDao = new WebDAVUserDao_Impl(this);
            }
            webDAVUserDao = this._webDAVUserDao;
        }
        return webDAVUserDao;
    }
}