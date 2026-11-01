/** 页面导航：Tab 用 reLaunch（自绘 tabbar，无原生 tabBar），二级页用 navigateTo */
export function goTab(key) {
  uni.reLaunch({ url: '/pages/' + key + '/index' })
}

export function goPage(path, params) {
  let url = '/pages/sub/' + path + '/index'
  if (params && typeof params === 'object') {
    const qs = Object.keys(params)
      .filter((k) => params[k] !== undefined && params[k] !== null && params[k] !== '')
      .map((k) => encodeURIComponent(k) + '=' + encodeURIComponent(params[k]))
      .join('&')
    if (qs) url += '?' + qs
  }
  uni.navigateTo({ url })
}

export function back() {
  const pages = getCurrentPages()
  if (pages.length > 1) {
    uni.navigateBack({ delta: 1 })
  } else {
    uni.reLaunch({ url: '/pages/home/index' })
  }
}

export function toast(title) {
  uni.showToast({ title, icon: 'none' })
}
