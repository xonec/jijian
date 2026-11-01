import { reactive, computed, watch } from 'vue'

const KEY = 'jy_theme_mode' // light | dark | system
const state = reactive({ mode: 'system', systemTheme: 'light' })

function detectSystem() {
  let theme = 'light'
  try {
    // #ifdef H5
    theme = window.matchMedia && window.matchMedia('(prefers-color-scheme: dark)').matches ? 'dark' : 'light'
    // #endif
    // #ifndef H5
    const info = uni.getSystemInfoSync()
    theme = info.osTheme === 'dark' ? 'dark' : 'light'
    // #endif
  } catch (e) {
    theme = 'light'
  }
  return theme
}

export function initTheme() {
  try {
    const saved = uni.getStorageSync(KEY)
    if (saved === 'light' || saved === 'dark' || saved === 'system') state.mode = saved
  } catch (e) {}
  // #ifdef H5
  try {
    const q = new URLSearchParams(window.location.search).get('theme')
    if (q === 'light' || q === 'dark') state.mode = q
  } catch (e) {}
  // #endif
  state.systemTheme = detectSystem()
  try {
    // #ifdef H5
    if (window.matchMedia) {
      window.matchMedia('(prefers-color-scheme: dark)').addEventListener('change', (e) => {
        state.systemTheme = e.matches ? 'dark' : 'light'
      })
    }
    // #endif
    uni.onThemeChange && uni.onThemeChange((res) => {
      state.systemTheme = res.theme === 'dark' ? 'dark' : 'light'
    })
  } catch (e) {}
}

const theme = computed(() => (state.mode === 'system' ? state.systemTheme : state.mode))
const themeClass = computed(() => 'theme-' + theme.value)
const modeLabel = computed(() => (state.mode === 'light' ? '亮白主题' : state.mode === 'dark' ? '暗黑主题' : '跟随系统'))

function setMode(mode) {
  state.mode = mode
  try {
    uni.setStorageSync(KEY, mode)
  } catch (e) {}
}

/* H5：同步 body 背景，避免回弹出现白边 */
watch(
  theme,
  (t) => {
    // #ifdef H5
    try {
      document.documentElement.style.background = t === 'dark' ? '#111111' : '#F6F5F4'
      document.body.style.background = t === 'dark' ? '#111111' : '#F6F5F4'
    } catch (e) {}
    // #endif
  },
  { immediate: true }
)

export function useTheme() {
  return { state, theme, themeClass, modeLabel, setMode }
}
