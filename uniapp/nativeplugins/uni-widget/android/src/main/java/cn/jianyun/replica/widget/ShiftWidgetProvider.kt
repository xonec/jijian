
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
            rv.setInt(R.id.shift_root, "setBackgroundColor", if (dark) Color.parseColor("#191919") else Color.parseColor("#FFFFFF"))
            val today = data.optJSONObject("today")
            val shift = today?.optString("shift", "") ?: ""
            rv.setTextViewText(R.id.shift_title, if (shift.isEmpty()) "今日无排班" else "今日排班")
            rv.setTextViewText(R.id.shift_name, if (shift.isEmpty()) "—" else shift)
            rv.setTextViewText(R.id.shift_time, today?.optString("time", "") ?: "")
            rv.setTextViewText(R.id.shift_remark, today?.optString("remark", "") ?: "")
            val alarm = today?.optString("alarm", "") ?: ""
            rv.setTextViewText(R.id.shift_alarm, if (alarm.isNotEmpty()) "提醒 " + alarm else "")
            val launch = context.packageManager.getLaunchIntentForPackage(context.packageName) ?: return
            val pi = PendingIntent.getActivity(context, 1, launch, PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE)
            rv.setOnClickPendingIntent(R.id.shift_root, pi)
            mgr.updateAppWidget(widgetId, rv)
        }
    }
}
