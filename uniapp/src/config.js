/**
 * 数据后端开关
 * - useCloud=false：本地 mock（uni storage），零配置即可跑 H5 预览/截图
 * - useCloud=true ：走 uniCloud 云函数（需在 HBuilderX 关联服务空间并上传云函数，见 README）
 */
export default {
  // 无广告模式：本项目不接入任何广告 SDK。
  // true = 隐藏首页「去广告」入口与会员页「无广告秒开」权益（默认）；
  // false = 保留官方原样，便于 1:1 像素对比截图。
  noAds: true,
  useCloud: false,
  cloudFunction: 'workplan',
  seedFunction: 'seedDemo'
}
