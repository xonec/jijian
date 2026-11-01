
package cn.jianyun.replica.widget

import android.content.Context
import android.content.res.Configuration
import org.json.JSONObject

/** 读取 App（uni-app JS）写入的小组件数据：SharedPreferences 'jy_widget' */
object WidgetPrefs {
    const val PREFS = "jy_widget"
    const val KEY_DATA = "data"
    const val KEY_CONFIG = "config"

    fun data(context: Context): JSONObject = read(context, KEY_DATA)
    fun config(context: Context): JSONObject = read(context, KEY_CONFIG)

    private fun read(context: Context, key: String): JSONObject = try {
        JSONObject(context.getSharedPreferences(PREFS, Context.MODE_PRIVATE).getString(key, "{}") ?: "{}")
    } catch (e: Exception) {
        JSONObject()
    }

    fun isDark(context: Context, data: JSONObject): Boolean {
        val cfg = config(context)
        return when (cfg.optString("darkMode", "跟随系统")) {
            "暗色" -> true
            "亮色" -> false
            else -> {
                val mode = context.resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
                mode == Configuration.UI_MODE_NIGHT_YES
            }
        }
    }
}
