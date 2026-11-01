
package cn.jianyun.replica.widget

import android.app.PendingIntent
import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.graphics.Color
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
        const val ACTION_REFRESH = "cn.jianyun.replica.widget.ACTION_REFRESH"
        private val DAY_IDS = intArrayOf(R.id.day0, R.id.day1, R.id.day2, R.id.day3, R.id.day4, R.id.day5, R.id.day6, R.id.day7, R.id.day8, R.id.day9, R.id.day10, R.id.day11, R.id.day12, R.id.day13, R.id.day14, R.id.day15, R.id.day16, R.id.day17, R.id.day18, R.id.day19, R.id.day20, R.id.day21, R.id.day22, R.id.day23, R.id.day24, R.id.day25, R.id.day26, R.id.day27, R.id.day28, R.id.day29, R.id.day30, R.id.day31, R.id.day32, R.id.day33, R.id.day34, R.id.day35, R.id.day36, R.id.day37, R.id.day38, R.id.day39, R.id.day40, R.id.day41)

        fun update(context: Context, mgr: AppWidgetManager, widgetId: Int) {
            val data = WidgetPrefs.data(context)
            val dark = WidgetPrefs.isDark(context, data)
            val rv = RemoteViews(context.packageName, R.layout.widget_month)
            val theme = data.optJSONObject("theme")
            val calBg = if (dark) "#191919" else (theme?.optString("calBg") ?: "#FFFFFF")
            rv.setInt(R.id.widget_root, "setBackgroundColor", safeColor(calBg, "#FFFFFF"))
            rv.setTextViewText(R.id.widget_title, data.optString("title"))
            val labels = data.optJSONArray("weekLabels")
            val wdIds = intArrayOf(R.id.wd0, R.id.wd1, R.id.wd2, R.id.wd3, R.id.wd4, R.id.wd5, R.id.wd6)
            for (i in wdIds.indices) {
                val label = if (labels != null && i < labels.length()) labels.optString(i) else ""
                rv.setTextViewText(wdIds[i], label)
                rv.setTextColor(wdIds[i], safeColor(if (dark) "#888888" else "#999999", "#999999"))
            }
            val weeks = data.optJSONArray("weeks")
            for (i in 0 until 42) {
                val cell = if (weeks != null && i / 7 < weeks.length()) weeks.optJSONArray(i / 7)?.optJSONObject(i % 7) else null
                val day = cell?.optInt("d", 0) ?: 0
                rv.setTextViewText(DAY_IDS[i], if (day > 0) day.toString() else "")
                val shiftColor = cell?.optString("color", "") ?: ""
                val today = cell?.optBoolean("today", false) ?: false
                if (shiftColor.isNotEmpty()) rv.setInt(DAY_IDS[i], "setBackgroundColor", safeColor(shiftColor, "#00000000"))
                else if (today) rv.setInt(DAY_IDS[i], "setBackgroundColor", safeColor(if (dark) "#1F3A2E" else "#DDF2E8", "#DDF2E8"))
                else rv.setInt(DAY_IDS[i], "setBackgroundColor", Color.TRANSPARENT)
                val textColor = cell?.optString("textColor", "") ?: ""
                rv.setTextColor(DAY_IDS[i], safeColor(if (textColor.isNotEmpty()) textColor else (if (dark) "#DDDDDD" else "#222222"), "#222222"))
            }
            val launch = context.packageManager.getLaunchIntentForPackage(context.packageName) ?: return
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
