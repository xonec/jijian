import os, json
B = '/Users/hogar/.dsh/ungrouped/jianyun/uniapp/nativeplugins/uni-widget'
PKG = 'cn.jianyun.replica.widget'
JAVA = B + '/android/src/main/java/cn/jianyun/replica/widget'
RES = B + '/android/src/main/res'
for d in [JAVA, RES + '/layout', RES + '/xml', RES + '/values', RES + '/drawable']:
    os.makedirs(d, exist_ok=True)
def w(p, s):
    with open(os.path.join(B, p), 'w', encoding='utf-8') as f: f.write(s)

w('package.json', json.dumps({
  'name': 'uni-widget',
  'id': 'uni-widget',
  'version': '1.0.0',
  'description': '极简排班（复刻）桌面小组件：月历 + 班次（读取 App 写入的 SharedPreferences）',
  '_dp_type': 'nativeplugin',
  '_dp_nativeplugin': {
    'android': {
      'plugins': [],
      'integrateType': 'aar',
      'minSdkVersion': 26,
      'abis': ['armeabi-v7a', 'arm64-v8a']
    }
  }
}, ensure_ascii=False, indent=2))

w('android/settings.gradle', "rootProject.name = 'uni-widget'\n")
w('android/gradle.properties', 'android.useAndroidX=false\norg.gradle.jvmargs=-Xmx2g\n')
w('android/build.gradle', '''
buildscript {
    repositories { google(); mavenCentral() }
    dependencies { classpath 'com.android.tools.build:gradle:8.1.4'; classpath 'org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22' }
}
allprojects { repositories { google(); mavenCentral() } }
''')
w('android/src/main/AndroidManifest.xml', '''
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android">
    <application>
        <receiver
            android:name="cn.jianyun.replica.widget.MonthWidgetProvider"
            android:exported="true">
            <intent-filter>
                <action android:name="android.appwidget.action.APPWIDGET_UPDATE" />
                <action android:name="cn.jianyun.replica.widget.ACTION_REFRESH" />
            </intent-filter>
            <meta-data
                android:name="android.appwidget.provider"
                android:resource="@xml/widget_month_info" />
        </receiver>
        <receiver
            android:name="cn.jianyun.replica.widget.ShiftWidgetProvider"
            android:exported="true">
            <intent-filter>
                <action android:name="android.appwidget.action.APPWIDGET_UPDATE" />
                <action android:name="cn.jianyun.replica.widget.ACTION_REFRESH" />
            </intent-filter>
            <meta-data
                android:name="android.appwidget.provider"
                android:resource="@xml/widget_shift_info" />
        </receiver>
    </application>
</manifest>
''')

w('android/src/main/res/xml/widget_month_info.xml', '''
<?xml version="1.0" encoding="utf-8"?>
<appwidget-provider xmlns:android="http://schemas.android.com/apk/res/android"
    android:minWidth="320dp"
    android:minHeight="180dp"
    android:updatePeriodMillis="1800000"
    android:resizeMode="horizontal|vertical"
    android:widgetCategory="home_screen"
    android:initialLayout="@layout/widget_month" />
''')
w('android/src/main/res/xml/widget_shift_info.xml', '''
<?xml version="1.0" encoding="utf-8"?>
<appwidget-provider xmlns:android="http://schemas.android.com/apk/res/android"
    android:minWidth="180dp"
    android:minHeight="80dp"
    android:updatePeriodMillis="1800000"
    android:resizeMode="horizontal|vertical"
    android:widgetCategory="home_screen"
    android:initialLayout="@layout/widget_shift" />
''')
w('android/src/main/res/values/strings.xml', '''
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <string name="widget_month_name">极简排班 · 月历</string>
    <string name="widget_shift_name">极简排班 · 班次</string>
</resources>
''')
w('android/src/main/res/values/colors.xml', '''
<?xml version="1.0" encoding="utf-8"?>
<resources>
    <color name="widget_primary">#55BB8A</color>
</resources>
''')

# 月历布局：星期行 + 6×7 天格子（生成 42 个 id）
week = ''
for i in range(7):
    week += '<TextView android:id="@+id/wd%d" android:layout_width="0dp" android:layout_height="wrap_content" android:layout_weight="1" android:gravity="center" android:textSize="10sp" android:textColor="#999999" />' % i
rows = ''
for r in range(6):
    cells = ''
    for c in range(7):
        i = r * 7 + c
        cells += ('<FrameLayout android:layout_width="0dp" android:layout_height="match_parent" android:layout_weight="1" android:layout_margin="1dp">'
                  '<TextView android:id="@+id/day%d" android:layout_width="match_parent" android:layout_height="match_parent" android:gravity="center" android:textSize="12sp" android:textColor="#222222" />'
                  '</FrameLayout>') % i
    rows += ('<LinearLayout android:layout_width="match_parent" android:layout_height="34dp" android:orientation="horizontal">' + cells + '</LinearLayout>')
month_xml = ('<?xml version="1.0" encoding="utf-8"?>'
  '<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" android:id="@+id/widget_root" android:layout_width="match_parent" android:layout_height="match_parent" android:orientation="vertical" android:padding="10dp" android:background="#FFFFFF">'
  '<LinearLayout android:layout_width="match_parent" android:layout_height="wrap_content" android:orientation="horizontal" android:gravity="center_vertical">'
  '<TextView android:id="@+id/widget_title" android:layout_width="0dp" android:layout_weight="1" android:layout_height="wrap_content" android:textSize="14sp" android:textStyle="bold" android:textColor="#222222" />'
  '<TextView android:id="@+id/widget_nav" android:layout_width="wrap_content" android:layout_height="wrap_content" android:text="本月" android:textSize="11sp" android:textColor="#999999" />'
  '</LinearLayout>'
  '<LinearLayout android:layout_width="match_parent" android:layout_height="wrap_content" android:orientation="horizontal" android:layout_marginTop="6dp">' + week + '</LinearLayout>'
  '<LinearLayout android:layout_width="match_parent" android:layout_height="wrap_content" android:orientation="vertical" android:layout_marginTop="2dp">' + rows + '</LinearLayout>'
  '</LinearLayout>')
w('android/src/main/res/layout/widget_month.xml', month_xml)

# 班次布局
w('android/src/main/res/layout/widget_shift.xml', '''
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android" android:id="@+id/shift_root" android:layout_width="match_parent" android:layout_height="match_parent" android:orientation="vertical" android:padding="12dp" android:background="#FFFFFF">
    <TextView android:id="@+id/shift_title" android:layout_width="match_parent" android:layout_height="wrap_content" android:text="今日排班" android:textSize="12sp" android:textColor="#999999" />
    <TextView android:id="@+id/shift_name" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_marginTop="4dp" android:text="—" android:textSize="20sp" android:textStyle="bold" android:textColor="#222222" />
    <TextView android:id="@+id/shift_time" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_marginTop="2dp" android:text="" android:textSize="13sp" android:textColor="#666666" />
    <TextView android:id="@+id/shift_remark" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_marginTop="2dp" android:text="" android:textSize="12sp" android:textColor="#999999" />
    <TextView android:id="@+id/shift_alarm" android:layout_width="match_parent" android:layout_height="wrap_content" android:layout_marginTop="2dp" android:text="" android:textSize="12sp" android:textColor="#55BB8A" />
</LinearLayout>
''')

ids = ', '.join('R.id.day%d' % i for i in range(42))
kt = '''
package cn.jianyun.replica.widget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.View
import android.widget.RemoteViews
import org.json.JSONObject

/** 极简排班（复刻）月历小组件：读取 App 写入的 SharedPreferences('jy_widget') 渲染 */
class MonthWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        for (id in appWidgetIds) update(context, appWidgetManager, id)
    }

    override fun onReceive(context: Context, intent: Intent) {
        super.onReceive(context, intent)
        if (intent.action == ACTION_REFRESH) {
            val mgr = AppWidgetManager.getInstance(context)
            val ids = mgr.getAppWidgetIds(ComponentName(context, MonthWidgetProvider::class.java))
            for (id in ids) update(context, mgr, id)
        }
    }

    companion object {
        const val ACTION_REFRESH = \"cn.jianyun.replica.widget.ACTION_REFRESH\"
        private val DAY_IDS = intArrayOf(IDS_PLACEHOLDER)

        fun update(context: Context, mgr: AppWidgetManager, widgetId: Int) {
            val data = WidgetPrefs.data(context)
            val dark = WidgetPrefs.isDark(context, data)
            val rv = RemoteViews(context.packageName, R.layout.widget_month)
            val theme = data.optJSONObject(\"theme\")
            val calBg = if (dark) \"#191919\" else (theme?.optString(\"calBg\") ?: \"#FFFFFF\")
            rv.setInt(R.id.widget_root, \"setBackgroundColor\", safeColor(calBg, \"#FFFFFF\"))
            rv.setTextViewText(R.id.widget_title, data.optString(\"title\"))
            val labels = data.optJSONArray(\"weekLabels\")
            val wdIds = intArrayOf(R.id.wd0, R.id.wd1, R.id.wd2, R.id.wd3, R.id.wd4, R.id.wd5, R.id.wd6)
            for (i in wdIds.indices) {
                val label = if (labels != null && i < labels.length()) labels.optString(i) else \"\"
                rv.setTextViewText(wdIds[i], label)
                rv.setTextColor(wdIds[i], safeColor(if (dark) \"#888888\" else \"#999999\", \"#999999\"))
            }
            val weeks = data.optJSONArray(\"weeks\")
            for (i in 0 until 42) {
                val cell = if (weeks != null && i / 7 < weeks.length()) weeks.optJSONArray(i / 7)?.optJSONObject(i % 7) else null
                val day = cell?.optInt(\"d\", 0) ?: 0
                rv.setTextViewText(DAY_IDS[i], if (day > 0) day.toString() else \"\")
                val shiftColor = cell?.optString(\"color\", \"\") ?: \"\"
                val today = cell?.optBoolean(\"today\", false) ?: false
                if (shiftColor.isNotEmpty()) rv.setInt(DAY_IDS[i], \"setBackgroundColor\", safeColor(shiftColor, \"#00000000\"))
                else if (today) rv.setInt(DAY_IDS[i], \"setBackgroundColor\", safeColor(if (dark) \"#1F3A2E\" else \"#DDF2E8\", \"#DDF2E8\"))
                else rv.setInt(DAY_IDS[i], \"setBackgroundColor\", Color.TRANSPARENT)
                val textColor = cell?.optString(\"textColor\", \"\") ?: \"\"
                rv.setTextColor(DAY_IDS[i], safeColor(if (textColor.isNotEmpty()) textColor else (if (dark) \"#DDDDDD\" else \"#222222\"), \"#222222\"))
            }
            val launch = Intent(context, Class.forName(\"cn.jianyun.workplan.main.MainActivity\"))
            val pi = PendingIntent.getActivity(context, 0, launch, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)
            rv.setOnClickPendingIntent(R.id.widget_root, pi)
            mgr.updateAppWidget(widgetId, rv)
        }

        private fun safeColor(hex: String, fallback: String): Int = try {
            Color.parseColor(if (hex.isNotEmpty()) hex else fallback)
        } catch (e: Exception) {
            try { Color.parseColor(fallback) } catch (e2: Exception) { Color.TRANSPARENT }
        }
    }
}
'''
kt = kt.replace('IDS_PLACEHOLDER', ids).replace('\\\\\"', '\"')
w('android/src/main/java/cn/jianyun/replica/widget/MonthWidgetProvider.kt', kt)

w('android/src/main/java/cn/jianyun/replica/widget/WidgetPrefs.kt', '''
package cn.jianyun.replica.widget

import android.content.Context
import android.content.res.Configuration
import org.json.JSONObject

/** 读取 App（uni-app JS）写入的小组件数据：SharedPreferences 'jy_widget' */
object WidgetPrefs {
    const val PREFS = \"jy_widget\"
    const val KEY_DATA = \"data\"
    const val KEY_CONFIG = \"config\"

    fun data(context: Context): JSONObject = read(context, KEY_DATA)
    fun config(context: Context): JSONObject = read(context, KEY_CONFIG)

    private fun read(context: Context, key: String): JSONObject = try {
        JSONObject(context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString(key, \"{}\") ?: \"{}\")
    } catch (e: Exception) {
        JSONObject()
    }

    fun isDark(context: Context, data: JSONObject): Boolean {
        val cfg = config(context)
        return when (cfg.optString(\"darkMode\", \"跟随系统\")) {
            \"暗色\" -> true
            \"亮色\" -> false
            else -> {
                val mode = context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
                mode == Configuration.UI_MODE_NIGHT_YES
            }
        }
    }
}
''' .replace('\\\\\"', '\"'))

w('android/src/main/java/cn/jianyun/replica/widget/ShiftWidgetProvider.kt', '''
package cn.jianyun.replica.widget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.widget.RemoteViews

/** 极简排班（复刻）班次小组件：显示今日班次/时间/备注/提醒 */
class ShiftWidgetProvider : AppWidgetProvider() {

    override fun onUpdate(context: Context, appWidgetManager: AppWidgetManager, appWidgetIds: IntArray) {
        for (id in appWidgetIds) update(context, appWidgetManager, id)
    }

    override fun onReceive(context: Context, intent: Intent) {
        super.onReceive(context, intent)
        if (intent.action == MonthWidgetProvider.ACTION_REFRESH) {
            val mgr = AppWidgetManager.getInstance(context)
            val ids = mgr.getAppWidgetIds(ComponentName(context, ShiftWidgetProvider::class.java))
            for (id in ids) update(context, mgr, id)
        }
    }

    companion object {
        fun update(context: Context, mgr: AppWidgetManager, widgetId: Int) {
            val data = WidgetPrefs.data(context)
            val dark = WidgetPrefs.isDark(context, data)
            val rv = RemoteViews(context.packageName, R.layout.widget_shift)
            rv.setInt(R.id.shift_root, \"setBackgroundColor\", if (dark) Color.parseColor(\"#191919\") else Color.parseColor(\"#FFFFFF\"))
            val today = data.optJSONObject(\"today\")
            val shift = today?.optString(\"shift\", \"\") ?: \"\"
            rv.setTextViewText(R.id.shift_title, if (shift.isEmpty()) \"今日无排班\" else \"今日排班\")
            rv.setTextViewText(R.id.shift_name, if (shift.isEmpty()) \"—\" else shift)
            rv.setTextViewText(R.id.shift_time, today?.optString(\"time\", \"\") ?: \"\")
            rv.setTextViewText(R.id.shift_remark, today?.optString(\"remark\", \"\") ?: \"\")
            val alarm = today?.optString(\"alarm\", \"\") ?: \"\"
            rv.setTextViewText(R.id.shift_alarm, if (alarm.isNotEmpty()) \"提醒 \" + alarm else \"\")
            val launch = Intent(context, Class.forName(\"cn.jianyun.workplan.main.MainActivity\"))
            val pi = PendingIntent.getActivity(context, 1, launch, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)
            rv.setOnClickPendingIntent(R.id.shift_root, pi)
            mgr.updateAppWidget(widgetId, rv)
        }
    }
}
''' .replace('\\\\\"', '\"'))

w('android/src/main/res/drawable/widget_preview.xml', '''
<?xml version="1.0" encoding="utf-8"?>
<shape xmlns:android="http://schemas.android.com/apk/res/android" android:shape="rectangle">
    <solid android:color="#FFFFFF" />
    <corners android:radius="12dp" />
</shape>
''')
print('generated native widget plugin at', B)