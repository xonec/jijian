package cn.jianyun.workplan.module.base;

import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: BaseDatabase.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"MIGRATION_1_2", "Landroidx/room/migration/Migration;", "getMIGRATION_1_2", "()Landroidx/room/migration/Migration;", "app_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class BaseDatabaseKt {
    private static final Migration MIGRATION_1_2 = new Migration() { // from class: cn.jianyun.workplan.module.base.BaseDatabaseKt$MIGRATION_1_2$1
        @Override // androidx.room.migration.Migration
        public void migrate(SupportSQLiteDatabase database) {
            Intrinsics.checkNotNullParameter(database, "database");
            database.execSQL("CREATE TABLE if not exists `TestUser` (`uuid` TEXT not null, `name` TEXT not null, PRIMARY KEY(`uuid`))");
        }
    };

    public static final Migration getMIGRATION_1_2() {
        return MIGRATION_1_2;
    }
}