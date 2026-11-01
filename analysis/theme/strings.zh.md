# 极简排班 3.5.0 · App 自有中文文案（按界面分组）

数据来源：jadx 反编译源码中的中文字符串字面量 + decoded/res/values/strings.xml 中 App 自有 string 资源。

- 全量机器可读清单：strings.zh.full.tsv（2003 条字面量 / 748 条去重，含 file:line）。
- 选项枚举表：copy-options.md（SelectUtil.java 中所有「显示名→存储值」枚举，原型下拉/选择器可直接使用）。
- 广告 SDK 文案（beizi_/tt_/tianmu_/adgain_/ms_ 前缀）已按资源前缀排除；App 自有 string 资源只有 app_name/day/month/year 4 条（见第 14 节）。

> 说明：Compose 界面的文案大量硬编码在 Kotlin 中，字符串资源并非主来源；因此以反编译字面量为准。同一文案可能在多个 Lambda/ComposableSingletons 文件中重复出现，此处按首次出现去重并保留证据行号。

## 01 应用入口·启动·主页框架（10 条）

_MainActivity/MainView/Splash_

### cn/jianyun/workplan/main/ComposableSingletons$MainViewKt.java

| 文案 | 证据 |
|---|---|
| 一个帮助你排班的app | cn/jianyun/workplan/main/ComposableSingletons$MainViewKt.java:96 |

### cn/jianyun/workplan/main/MainActivity.java

| 文案 | 证据 |
|---|---|
| 加载抖音广告 | cn/jianyun/workplan/main/MainActivity.java:265 |
| 加载抖音失败： | cn/jianyun/workplan/main/MainActivity.java:306 |
| Builder() /             .a…置隐私权 /             .build() | cn/jianyun/workplan/main/MainActivity.java:390 |

### cn/jianyun/workplan/main/test/TestMainViewKt.java

| 文案 | 证据 |
|---|---|
| 页面1 | cn/jianyun/workplan/main/test/TestMainViewKt.java:130 |
| 页面2 | cn/jianyun/workplan/main/test/TestMainViewKt.java:149 |
| 测试 | cn/jianyun/workplan/main/test/TestMainViewKt.java:181 |

### cn/jianyun/workplan/main/test/TestV1Kt.java

| 文案 | 证据 |
|---|---|
| 刷新1 | cn/jianyun/workplan/main/test/TestV1Kt.java:229 |

### cn/jianyun/workplan/main/test/TestV2Kt.java

| 文案 | 证据 |
|---|---|
| 刷新2 | cn/jianyun/workplan/main/test/TestV2Kt.java:228 |

### cn/jianyun/workplan/main/base/UserPolicyKt.java

| 文案 | 证据 |
|---|---|
| 欢迎下载并使用极简排班APP,请您（用户）仔细阅读以下全部内容。如用户已勾选同意极简排班用户使用协议，即表示用户与杭州简蕴科技有限公司已达成协议，并同意接受本协议各项协议的约束。 /  / 1、版权归属 / 杭州简蕴科技有限公司拥有极简排班所有版权，任何人不得对极简排班中的内容进行复制 /  / 2、客户隐私制度 / 极简排班作为一款工具软件，从没有想过要手机手机隐私信息，所以不会申请没有必要的权限，但为了更好的使用体验，极简排班目前会依赖以下权限: /  /     - 网络权限（使用地方：APP版本升级检测） /     - 日历权限（使用地方：用于排班提醒） /  / 3、用户协议的修改 / 极简排班始终在不断优化和改进服务。极简排班有权在必要时通过APP推送通知、弹窗提示等合理方式修改本用户协议及各单项服务的相关协议，修订后的服务协议条款在公示届满7日起生效。用户在享受各项服务时，应及时查阅了解修改的内容，并自觉遵守修改后的用户协议及各单项服务的相关协议。如用户继续使用APP，则视为客户已同意修改的内容，发生有关争议时，以最新的用户协议为准；如用户不同意修改内容，则应停止使用该项服务。 /  / 4、服务的变更或中止 / 极简排班目前完全免费供大家使用，若用户不愿意使用，用户可自行卸载 /  / 5、用户的账号、密码和安全性 / 极简排班自身没有账号登录，纯工具类型app，我们不会采集用户隐私信息，比如设备唯一标识等敏感信息，我们只想做好一个工具 /  / 6、知识产权 / 极简排班是由杭州简蕴科技有限公司独立完成设计、开发，任何人请不要对app进行反编译、破解，请尊重别人的劳动成果，如带有恶意破解并分享，杭州简蕴科技有限公司有权利发起诉讼 /  / 7. 服务内容管辖与法律适用 / （1）本协议的成立、生效、履行、解释及纠纷解决等相关事宜，均适用中华人民共和国大陆地区法律（不包括冲突法）。 / （2）本协议签订地为中华人民共和国浙江省杭州市余杭区。 / （3）若您因使用极简排班发生任何纠纷或争议，首先应友好协商解决；协商不成的，您同意将纠纷或争议提交本协议签订地有管辖权的人民法院管辖。 / （4）本协议所有条款的标题仅为阅读方便，本身并无实际涵义，不能作为本协议涵义解释的依据。 / （5）本协议条款无论因何种原因部分无效或不可执行，其余条款仍有效，对双方具有约束力。 / 本协议有效期为1年。在有效期满前30天，如任何一方未向对方提出终止或变更协议的要求，本协议有效期自动顺延1年。上述顺延不受次数限制。 /  / 8.用户协议的生效 /  / 本协议版本创建日期为2024年08月31日，生效日期为2024年08月31日 /  / 发布人：杭州简蕴科技有限公司 | cn/jianyun/workplan/main/base/UserPolicyKt.java:52 |

## 02 首页·日历·排班（38 条）

_主页日历与排班操作；排班主视图_

### cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java

| 文案 | 证据 |
|---|---|
| 轮班 | cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java:253 |
| initValues("班次","work", "轮班", "plan") | cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java:254 |
| 统计 | cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java:410 |
| 我的 | cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java:429 |
| 网络断开 | cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java:462 |
| 您当前APP网络已断开，可能会影响正常使用, 快去开启手机网络吧! | cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java:462 |
| 快去开启手机网络吧 | cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java:482 |
| 升级提醒 | cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java:538 |
| 您当前版本过低，请前往手机应用市场升级 | cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java:538 |
| 快去应用市场更新吧 | cn/jianyun/workplan/module/schedule/views/ScheduleMainViewKt.java:554 |

### cn/jianyun/workplan/module/schedule/views/main/BottomProjectChooseViewKt.java

| 文案 | 证据 |
|---|---|
| 选择排班项目 | cn/jianyun/workplan/module/schedule/views/main/BottomProjectChooseViewKt.java:52 |
| 管理 | cn/jianyun/workplan/module/schedule/views/main/BottomProjectChooseViewKt.java:71 |
| 当前 | cn/jianyun/workplan/module/schedule/views/main/BottomProjectChooseViewKt.java:243 |

### cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java

| 文案 | 证据 |
|---|---|
| 去广告 | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:287 |
| 温馨提示: | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:465 |
| 当前月份没有设置排班 | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:632 |
| 温馨提示:点击右上角设置按钮，可以设置日历字号大小、显示农历等个性化选项 | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:707 |
| 完成排班 | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:945 |
| 开启排班 | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:945 |
| 设置备注 | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:988 |
| 第二班次 | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:1033 |
| 选择第一班次 | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:1192 |
| 取消第二班次 | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:1433 |
| 选择第二班次 | cn/jianyun/workplan/module/schedule/views/main/ScheduleHomeViewKt.java:1434 |

### cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java

| 文案 | 证据 |
|---|---|
| 自定义排班 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:278 |
| 清除 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:350 |
| 上一天 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:368 |
| 下一天 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:386 |
| 关闭 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:404 |
| 不要太着急了 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:521 |
| 你还没有设置周期排班喔 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:594 |
| 使用此轮班 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:632 |
| 周期轮班天数 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:672 |
| 清空从 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:698 |
| 开始的 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:698 |
| 天排班 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:698 |
| 添加周期轮班 | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:719 |
| 真的要清空吗？ | cn/jianyun/workplan/module/schedule/views/main/ScheduleOperViewKt.java:761 |

## 03 班次·排班编辑（52 条）

_周期轮班/排班计划；排班/日历显示配置；排班项目；班次/组合班次编辑_

### cn/jianyun/workplan/module/schedule/views/config/ScheduleConfigViewKt.java

| 文案 | 证据 |
|---|---|
| 日历显示设置 | cn/jianyun/workplan/module/schedule/views/config/ScheduleConfigViewKt.java:98 |
| 保存 | cn/jianyun/workplan/module/schedule/views/config/ScheduleConfigViewKt.java:172 |
| 一周开始日 | cn/jianyun/workplan/module/schedule/views/config/ScheduleConfigViewKt.java:417 |
| 班次圆角 | cn/jianyun/workplan/module/schedule/views/config/ScheduleConfigViewKt.java:541 |
| 显示中国农历 | cn/jianyun/workplan/module/schedule/views/config/ScheduleConfigViewKt.java:544 |
| 显示中国节假日 | cn/jianyun/workplan/module/schedule/views/config/ScheduleConfigViewKt.java:565 |
| 显示统计指标 | cn/jianyun/workplan/module/schedule/views/config/ScheduleConfigViewKt.java:649 |
| 显示分割线 | cn/jianyun/workplan/module/schedule/views/config/ScheduleConfigViewKt.java:670 |

### cn/jianyun/workplan/module/schedule/views/plan/SchdulePlanEditViewKt.java

| 文案 | 证据 |
|---|---|
| 添加轮班 | cn/jianyun/workplan/module/schedule/views/plan/SchdulePlanEditViewKt.java:199 |
| 编辑轮班 | cn/jianyun/workplan/module/schedule/views/plan/SchdulePlanEditViewKt.java:199 |
| 基本信息 | cn/jianyun/workplan/module/schedule/views/plan/SchdulePlanEditViewKt.java:248 |
| 轮班名称 | cn/jianyun/workplan/module/schedule/views/plan/SchdulePlanEditViewKt.java:270 |
| 周期轮班 | cn/jianyun/workplan/module/schedule/views/plan/SchdulePlanEditViewKt.java:301 |
| 排序 | cn/jianyun/workplan/module/schedule/views/plan/SchdulePlanEditViewKt.java:321 |
| 选择下列班次加入周期轮班 | cn/jianyun/workplan/module/schedule/views/plan/SchdulePlanEditViewKt.java:369 |
| 空 | cn/jianyun/workplan/module/schedule/views/plan/SchdulePlanEditViewKt.java:451 |
| 轮班排序 | cn/jianyun/workplan/module/schedule/views/plan/SchdulePlanEditViewKt.java:592 |

### cn/jianyun/workplan/module/schedule/views/plan/SchedulePlanManageViewKt.java

| 文案 | 证据 |
|---|---|
| 暂无轮班 | cn/jianyun/workplan/module/schedule/views/plan/SchedulePlanManageViewKt.java:208 |
| 班次排序 | cn/jianyun/workplan/module/schedule/views/plan/SchedulePlanManageViewKt.java:364 |

### cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java

| 文案 | 证据 |
|---|---|
| 项目管理 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:98 |
| 添加项目 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:141 |
| 项目排序 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:141 |
| 暂无项目 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:220 |
| 至少保留一个项目 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:263 |
| 删除项目，会把项目下所有排班数据级联删除，确定还要继续吗？ | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:269 |
| 当前项目 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:343 |
| 切换为当前项目 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:450 |
| 编辑项目名称 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:471 |
| 删除项目 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:493 |
| 选择一项操作 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:512 |
| 删除项目，会把项目下所有排班数据级联删除，确定还要继续吗 | cn/jianyun/workplan/module/schedule/views/project/ScheduleProjectManagerViewKt.java:538 |

### cn/jianyun/workplan/module/schedule/views/work/ComposableSingletons$SchduleWorkEditViewKt.java

| 文案 | 证据 |
|---|---|
| 由两个普通班次组成的班次我们称为组合班次 | cn/jianyun/workplan/module/schedule/views/work/ComposableSingletons$SchduleWorkEditViewKt.java:43 |
| 组合班次创建好后，就可以一次性在某一天设置2个班次了，同时组合班次也可以适用于周期轮班 | cn/jianyun/workplan/module/schedule/views/work/ComposableSingletons$SchduleWorkEditViewKt.java:45 |
| 比如：张三班次有A、B、C班，平时偶尔有A、B班同时上，B、C班同时上的情况，这个时候建两个组合班次就可以在主页一次性设置2个班次了 | cn/jianyun/workplan/module/schedule/views/work/ComposableSingletons$SchduleWorkEditViewKt.java:47 |

### cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java

| 文案 | 证据 |
|---|---|
| 添加班次 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:205 |
| 编辑班次 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:205 |
| 了解组合班次? | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:315 |
| 组合班次命名 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:338 |
| 从已有普通班次中选择两个 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:369 |
| 样式预览 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:458 |
| 早班 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:600 |
| 中班 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:600 |
| 晚班 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:600 |
| 白班 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:600 |
| 夜班 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:600 |
| 休假 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:600 |
| 班次名称 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:602 |
| 是否全天 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:626 |
| 开始时间 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:650 |
| 结束时间 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:674 |
| 班次颜色 | cn/jianyun/workplan/module/schedule/views/work/SchduleWorkEditViewKt.java:724 |

### cn/jianyun/workplan/module/schedule/views/work/ScheduleWorkManageViewKt.java

| 文案 | 证据 |
|---|---|
| 暂无班次 | cn/jianyun/workplan/module/schedule/views/work/ScheduleWorkManageViewKt.java:215 |

## 04 统计（7 条）

_图表组件；统计页_

### cn/jianyun/workplan/ui/graph/GraphBarViewKt.java

| 文案 | 证据 |
|---|---|
| 暂无数据 | cn/jianyun/workplan/ui/graph/GraphBarViewKt.java:116 |

### cn/jianyun/workplan/ui/graph/model/LineGraphDataKt.java

| 文案 | 证据 |
|---|---|
| 无 | cn/jianyun/workplan/ui/graph/model/LineGraphDataKt.java:93 |

### cn/jianyun/workplan/module/schedule/views/stat/ScheduleStatViewKt.java

| 文案 | 证据 |
|---|---|
| 导出数据 | cn/jianyun/workplan/module/schedule/views/stat/ScheduleStatViewKt.java:162 |
| 排班统计 | cn/jianyun/workplan/module/schedule/views/stat/ScheduleStatViewKt.java:189 |
| 当前区间暂无可统计时长 | cn/jianyun/workplan/module/schedule/views/stat/ScheduleStatViewKt.java:346 |
| 排班详情 | cn/jianyun/workplan/module/schedule/views/stat/ScheduleStatViewKt.java:382 |
| 时长 | cn/jianyun/workplan/module/schedule/views/stat/ScheduleStatViewKt.java:490 |

## 05 提醒·闹钟（28 条）

_班次提醒/系统日历提醒_

### cn/jianyun/workplan/module/schedule/views/alarm/ComposableSingletons$ScheduleAlarmManageViewKt.java

| 文案 | 证据 |
|---|---|
| 关于班次提醒？ | cn/jianyun/workplan/module/schedule/views/alarm/ComposableSingletons$ScheduleAlarmManageViewKt.java:34 |
| 由于安卓手机品牌众多，不同手机厂商定制的安卓系统各有差异，会出现部分手机系统对第三方应用的服务做了一定的限制，经过开发者多次试验，如果应用被完全退出，设备锁屏了，App设置的定时提醒在大部分手机设备上都不会触发，这会导致班次提醒显得非常鸡肋，但是系统日历设置的提醒不会出现上面的问题，这是受系统保护的，所以极简排班的提醒将通过系统日历来实现提醒 | cn/jianyun/workplan/module/schedule/views/alarm/ComposableSingletons$ScheduleAlarmManageViewKt.java:34 |
| 检查班次提醒是否生效？ | cn/jianyun/workplan/module/schedule/views/alarm/ComposableSingletons$ScheduleAlarmManageViewKt.java:35 |
| 最新版，日程将直接写入系统日历，不再写入自定义的日历（因为有些设备会自动删除自定义日历的日程） | cn/jianyun/workplan/module/schedule/views/alarm/ComposableSingletons$ScheduleAlarmManageViewKt.java:35 |

### cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java

| 文案 | 证据 |
|---|---|
| 添加提醒 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:214 |
| 编辑提醒 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:214 |
| 选择班次 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:270 |
| 提醒设置 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:388 |
| 什么时候提醒 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:435 |
| 提醒时间 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:438 |
| 是否强提醒 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:462 |
| 开启后，系统日程提醒会有铃声提醒，不只是滴一下的那种提醒，但这个只有部分安卓机型支持 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:484 |
| 上班打卡 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:487 |
| 下班打卡 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:487 |
| 快捷选项 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:523 |
| 上班前30分钟 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:524 |
| 上班前10分钟 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:524 |
| 下班前5分钟 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:524 |
| initValues("上班前30分钟", "a… "a:10", "下班前5分钟", "b:5") | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:525 |
| 请先选择一个班次 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmEditViewKt.java:556 |

### cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmManageViewKt.java

| 文案 | 证据 |
|---|---|
| 班次提醒 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmManageViewKt.java:143 |
| 暂无提醒 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmManageViewKt.java:199 |
| 强提醒 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmManageViewKt.java:374 |
| 普通提醒 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmManageViewKt.java:374 |
| 提醒已关闭 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmManageViewKt.java:395 |
| 授权极简排班操作您的日历（更新数据） | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmManageViewKt.java:554 |
| 请前往系统设置页面允许极简排班访问您的日历 | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmManageViewKt.java:574 |
| 授权极简排班查询您的日历（查询数据） | cn/jianyun/workplan/module/schedule/views/alarm/ScheduleAlarmManageViewKt.java:589 |

## 06 设置·我的（103 条）

_常见问题 FAQ；排班设置/关于/版本更新；设置子页 (账号/VIP/通知/本地备份/云备份)_

### cn/jianyun/workplan/module/schedule/views/setting/ComposableSingletons$ScheduleSettingViewKt.java

| 文案 | 证据 |
|---|---|
| 登录或注册账号 | cn/jianyun/workplan/module/schedule/views/setting/ComposableSingletons$ScheduleSettingViewKt.java:48 |
| 购买会员，获取更多APP使用特权，您的支持能够让极简排班更好地发展下去 | cn/jianyun/workplan/module/schedule/views/setting/ComposableSingletons$ScheduleSettingViewKt.java:73 |

### cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java

| 文案 | 证据 |
|---|---|
| 排班设置 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:215 |
| 普通用户 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:375 |
| 我的排班项目 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:452 |
| 本地备份设置 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:471 |
| 分享与导入排班 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:490 |
| 本地备份与恢复 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:510 |
| APP风格 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:585 |
| 桌面小组件配置 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:587 |
| 导入小程序排班 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:606 |
| 本次更新说明 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:652 |
| 常见问题解答 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:684 |
| 用户在线反馈 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:703 |
| 应用隐私政策 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:744 |
| 亲爱的老用户，感谢你一直在使用极简排班。 /  / 本次更新重点优化了这些内容： /  / 1. 首页日历支持左右滑动切换月份，浏览排班更顺手。 / 2. 首页显示配置和小组件显示配置做了进一步拆分，调节更清晰。 / 3. 统计页新增了时长统计、时长占比饼图，以及排班明细导出 Excel。 / 4. 排班详情补充了休息时长、工作时长等信息，统计更准确。 / 5. 小组件入口、暗黑模式、显示样式等细节都做了持续优化。 / 6. 若小组件一直显示“正在加载”，可以先删除小组件，重新添加 / 7. 没有班次也可以添加备注了 /  / 如果你在使用过程中还有想继续优化的地方，也欢迎随时反馈。 | cn/jianyun/workplan/module/schedule/views/setting/ScheduleSettingViewKt.java:817 |

### cn/jianyun/workplan/main/question/QuestionViewModel.java

| 文案 | 证据 |
|---|---|
| 入门 | cn/jianyun/workplan/main/question/QuestionViewModel.java:126 |
| 关于我们？ | cn/jianyun/workplan/main/question/QuestionViewModel.java:126 |
| 一个致力于开发工具软件的公司，让用户能真正体验到技术带来的便捷性 | cn/jianyun/workplan/main/question/QuestionViewModel.java:126 |
| 极简排班适合哪些人用？ | cn/jianyun/workplan/main/question/QuestionViewModel.java:127 |
| 如果你上班不规律，时而上班次1，时而上班次2，那么恭喜你，非常适合使用极简排班APP来规划你的排班 | cn/jianyun/workplan/main/question/QuestionViewModel.java:127 |
| 极简排班如何使用？ | cn/jianyun/workplan/main/question/QuestionViewModel.java:128 |
|  /                 第一步：添加自定义班次，如早班，晚班，并设置好上下班时间<br> /                 第二步：添加周期排班，如果你的班次在以某一个周期在循环排班，那么你只要建立这一周期的排班情况，就可以通过首页周期排班功能循环设置排班了<br> /                 第三步：首页进行排班，用户既可以自定义排班，也可以周期排班<br> /                 第四步：设置提醒，基于班次设置提醒 /              | cn/jianyun/workplan/main/question/QuestionViewModel.java:128 |
| 用户排班数据存储在哪里？ | cn/jianyun/workplan/main/question/QuestionViewModel.java:129 |
| 您的排班信息，安全又私密。我们承诺，所有的排班数据仅存储于您的个人设备上，不会上传至任何服务器。这意味着，即使我们的服务器遇到任何问题，您的排班信息也安全无忧，确保您享受流畅无忧的APP体验。 | cn/jianyun/workplan/main/question/QuestionViewModel.java:129 |
| 为什么你们不做云备份？ | cn/jianyun/workplan/main/question/QuestionViewModel.java:130 |
| 开发者认为只有数据掌握在用户自己手里，对用户才是负责任的，这样既保证了用户数据的安全性，也避免开发者服务器遭受攻击，导致用户无法访问APP，影响用户正常操作 | cn/jianyun/workplan/main/question/QuestionViewModel.java:130 |
| 后续有哪些开发规划？ | cn/jianyun/workplan/main/question/QuestionViewModel.java:131 |
| 1.支持分享和导入排班<br> | cn/jianyun/workplan/main/question/QuestionViewModel.java:131 |

### cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java

| 文案 | 证据 |
|---|---|
| 通知权限设置 | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:126 |
| 关于APP通知？ | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:146 |
|  /             <bb>由于安卓手机品牌众多，不同手机厂商定制的安卓系统各有差异,这就会出现部分手机系统对第三方应用的服务做了一定的限制。 /             <bb>经过开发者多次试验，如果应用被完全退出，或者设备锁屏了， /             我们App设置的本地通知大概率都不会触发（据说是为了省电），这样会导致我们设置的通知显得非常鸡肋，甚至影响用户正常工作，比如上班忘记打卡被公司扣钱。<br> /             <bb>但是系统日历设置的通知不会出现上面的问题，这是受系统保护的，它会准时触发。 /             所以计划师所有模块的提醒将通过系统日历来实现通知，首次使用之前， /             请点击当前页面按钮授权计划师APP访问您的日历。 /             虽然计划师APP会访问您的日历，但是我们仅会访问计划师范围内的通知数据， /             不会读取用户任何隐私，这个您可以在日历授权的时候可以看到的 /              | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:146 |
| 华为 | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:207 |
| 荣耀 | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:207 |
| initSingleValues("华为", "小米", "oppo", "vivo", "荣耀") | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:208 |
| 手机品牌 | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:209 |
| 验证日历普通提醒 | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:222 |
| 开启通知 | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:352 |
| 授权计划师操作您的日历（更新数据） | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:418 |
| 请前往系统设置页面允许计划师读写您的日历 | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:437 |
| 授权计划师查询您的日历 | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:447 |
| 请前往系统设置页面允许计划师访问您的日历 | cn/jianyun/workplan/main/setting/notify/NotifySettingViewKt.java:466 |

### cn/jianyun/workplan/main/setting/vip/ComposableSingletons$VipViewKt.java

| 文案 | 证据 |
|---|---|
| 会员 | cn/jianyun/workplan/main/setting/vip/ComposableSingletons$VipViewKt.java:50 |

### cn/jianyun/workplan/main/setting/vip/VipViewKt.java

| 文案 | 证据 |
|---|---|
| 购买方案 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:241 |
| 3元 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:274 |
| 每天1毛钱 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:274 |
| 12元 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:277 |
| 每天3.3分钱 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:277 |
| 最划算 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:279 |
| 18元 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:279 |
| 一次性买断 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:279 |
| 温馨提示：不会出现自动扣费，会员到期需要手动续费 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:286 |
| 会员权益 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:288 |
| 支持开发 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:289 |
| 促使开发者砥砺前行，呈现更优质的App功能 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:289 |
| 无广告秒开 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:290 |
| 没有任何开屏和视频广告 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:290 |
| 专属客服 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:291 |
| 会员用户优先响应 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:291 |
| 我是独立开发者，您的支持能够让我们坚持开发下去，也会让开发者更加有信心开发更多优质的内容和更多新的APP | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:292 |
| 购买失败或使用微信支付，请微信联系客服，yongbw2020 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:293 |
| 确认购买 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:298 |
| 请先登录 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:316 |
| 返回 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:352 |
| 购买前请查看《会员使用协议》 | cn/jianyun/workplan/main/setting/vip/VipViewKt.java:378 |

### cn/jianyun/workplan/main/setting/user/LoginDialogKt.java

| 文案 | 证据 |
|---|---|
| 请登录或注册账号后再购买，避免无法绑定会员身份 | cn/jianyun/workplan/main/setting/user/LoginDialogKt.java:154 |
| 请登录或注册账号后再反馈，避免无法查看回复 | cn/jianyun/workplan/main/setting/user/LoginDialogKt.java:160 |
| 账号 | cn/jianyun/workplan/main/setting/user/LoginDialogKt.java:196 |
| 邮箱或手机号 | cn/jianyun/workplan/main/setting/user/LoginDialogKt.java:196 |
| 请输入确认密码 | cn/jianyun/workplan/main/setting/user/LoginDialogKt.java:242 |
| 注意：目前仅用于绑定您的付费状态和反馈意见 | cn/jianyun/workplan/main/setting/user/LoginDialogKt.java:273 |
| 确认注册 | cn/jianyun/workplan/main/setting/user/LoginDialogKt.java:296 |

### cn/jianyun/workplan/main/setting/user/User.java

| 文案 | 证据 |
|---|---|
| 账号不能为空 | cn/jianyun/workplan/main/setting/user/User.java:432 |
| 密码不能为空 | cn/jianyun/workplan/main/setting/user/User.java:434 |
| 确认密码不能为空 | cn/jianyun/workplan/main/setting/user/User.java:457 |
| 密码长度不能少于6位 | cn/jianyun/workplan/main/setting/user/User.java:460 |
| 确认密码不正确 | cn/jianyun/workplan/main/setting/user/User.java:462 |
| 永久会员V3 | cn/jianyun/workplan/main/setting/user/User.java:469 |
| 年度会员V2 | cn/jianyun/workplan/main/setting/user/User.java:473 |
| 月度会员V1 | cn/jianyun/workplan/main/setting/user/User.java:479 |

### cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java

| 文案 | 证据 |
|---|---|
| 我的信息 | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:123 |
| 有效期： | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:317 |
| 退出登录 | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:341 |
| 其他信息 | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:377 |
| 编辑信息 | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:377 |
| 昵称 | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:478 |
| 城市 | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:550 |
| 登录账号仅用于记录用户付费状态，如果需要对数据进行云备份，请自行绑定第三方云备份账号 | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:610 |
| 我要注销账号 | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:626 |
| 退出登录会导致当前设备的会员身份丢失喔，请问还要继续退出吗？ | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:669 |
| 提示:请输入账号密码来确认你身份，注销账号，意味之前购买的会员也会随之失效，但您本地的排班数据，我们不会删除，仅做账号注销喔！ | cn/jianyun/workplan/main/setting/user/UserDetailViewKt.java:708 |

### cn/jianyun/workplan/main/setting/local/ComposableSingletons$LocalBackupViewKt.java

| 文案 | 证据 |
|---|---|
|  /                     选择本地备份有以下几个好处： /                      | cn/jianyun/workplan/main/setting/local/ComposableSingletons$LocalBackupViewKt.java:43 |
|  /                     1.万一APP不小心被自己或他人卸载，依然可以从本地备份目录找回数据<br>  /                     2.如果APP升级因为某种莫名的原因导致APP崩溃，无法打开APP，这个时候可以卸载APP，重新安装最新APP，依然可以找回历史数据<br> /                     3.买了新手机，可以通过本地备份还原旧手机数据 | cn/jianyun/workplan/main/setting/local/ComposableSingletons$LocalBackupViewKt.java:44 |

### cn/jianyun/workplan/main/setting/local/LocalBackupViewKt.java

| 文案 | 证据 |
|---|---|
| 本地备份目录 | cn/jianyun/workplan/main/setting/local/LocalBackupViewKt.java:105 |
| 恭喜，你已经成功设置好本地备份目录，即便app卸载，你依然可以从此目录恢复数据，记得勤备份喔 | cn/jianyun/workplan/main/setting/local/LocalBackupViewKt.java:137 |
| 切换备份目录 | cn/jianyun/workplan/main/setting/local/LocalBackupViewKt.java:141 |
| 选择备份目录 | cn/jianyun/workplan/main/setting/local/LocalBackupViewKt.java:165 |
| 真的要切换吗？这样会导致历史备份目录下备份文件失效喔 | cn/jianyun/workplan/main/setting/local/LocalBackupViewKt.java:207 |

### cn/jianyun/workplan/main/setting/cloud/jgy/JgyBindViewKt.java

| 文案 | 证据 |
|---|---|
| 绑定坚果云账号 | cn/jianyun/workplan/main/setting/cloud/jgy/JgyBindViewKt.java:110 |
| 请输入坚果云账号 | cn/jianyun/workplan/main/setting/cloud/jgy/JgyBindViewKt.java:113 |
| 请输入坚果云应用密码 | cn/jianyun/workplan/main/setting/cloud/jgy/JgyBindViewKt.java:135 |
| 查看坚果云webdav账号设置教程? | cn/jianyun/workplan/main/setting/cloud/jgy/JgyBindViewKt.java:157 |

### cn/jianyun/workplan/main/setting/cloud/jgy/JgyBindViewModel.java

| 文案 | 证据 |
|---|---|
| 绑定成功 | cn/jianyun/workplan/main/setting/cloud/jgy/JgyBindViewModel.java:109 |

## 07 桌面小组件（36 条）

_Glance 小组件与配置；timetable 小组件遗留代码_

### cn/jianyun/workplan/widget/calendar/WidgetCalendarViewKt.java

| 文案 | 证据 |
|---|---|
| 排班 | cn/jianyun/workplan/widget/calendar/WidgetCalendarViewKt.java:105 |
| 上个月 | cn/jianyun/workplan/widget/calendar/WidgetCalendarViewKt.java:107 |
| 下个月 | cn/jianyun/workplan/widget/calendar/WidgetCalendarViewKt.java:111 |

### cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java

| 文案 | 证据 |
|---|---|
| 桌面小组件 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:135 |
| 桌面小组件样式设置 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:189 |
| 显示备注 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:211 |
| 显示上班时间 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:232 |
| 显示下班时间 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:253 |
| 日期字号 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:297 |
| 班次字号 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:323 |
| 时间字号 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:349 |
| 标题背景透明度 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:352 |
| 日历背景透明度 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:373 |
| 标题背景色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:422 |
| 标题文字色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:445 |
| 日历背景色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:468 |
| 日历文字颜色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:491 |
| 农历颜色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:514 |
| 备注颜色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:537 |
| 暗黑模式配色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:567 |
| 暗黑标题背景色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:589 |
| 暗黑标题文字色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:612 |
| 暗黑日历背景色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:635 |
| 暗黑日历文字色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:658 |
| 暗黑农历颜色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:681 |
| 暗黑备注颜色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:704 |
| 恢复默认配色 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:747 |
| 白色字体 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:769 |
| 黑色字体 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:793 |
| 保存并刷新桌面小组件 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:831 |
| 开启闹钟权限，可优化小组件更新 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:853 |
| 该功能只针对部分厂商设备，如果你的设备点击后仍然没有桌面小组件，请在手机桌面自行添加小组件 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:896 |
| 添加一个小组件到桌面 | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:911 |
| 温馨提示: / 1.桌面小组件可以长按后拖拽改变高度 / 2.点击小组件标题栏「本月」文字，可以强制刷新小组件数据 / 3.如果小组件一直不更新，试试删除后重新添加 / 4.由于安卓厂商太多，小组件添加形式各有差异，请自行探索自己的设备如何添加桌面小组件（部分设备在小组件添加页面最底部有一行很小的字，点击进去就可以看到了） | cn/jianyun/workplan/widget/config/WidgetConfigViewKt.java:988 |

### cn/jianyun/workplan/widget/config/WidgetConfigViewModel.java

| 文案 | 证据 |
|---|---|
| 快去桌面看看实际效果吧 | cn/jianyun/workplan/widget/config/WidgetConfigViewModel.java:172 |

### cn/jianyun/timetable/widget/AppWidgetView.java

| 文案 | 证据 |
|---|---|
| 待初始化 | cn/jianyun/timetable/widget/AppWidgetView.java:169 |

## 08 导入导出·分享·备份（84 条）

_WebDAV 云盘；云备份；分享/导入导出；后台服务；基础组件；微信小程序数据导入；通用云备份_

### cn/jianyun/workplan/module/schedule/views/wechat/ComposableSingletons$WechatViewKt.java

| 文案 | 证据 |
|---|---|
| 如果你之前使用过「极简排班」微信小程序，你只要在下方输入排班小程序「我的」页面头像下的用户ID（8位字母数字串），即可快速将小程序排班数据直接导入当前APP中 | cn/jianyun/workplan/module/schedule/views/wechat/ComposableSingletons$WechatViewKt.java:44 |

### cn/jianyun/workplan/module/schedule/views/wechat/WechatViewKt.java

| 文案 | 证据 |
|---|---|
| 导入微信小程序排班数据 | cn/jianyun/workplan/module/schedule/views/wechat/WechatViewKt.java:73 |
| 排班小程序用户ID | cn/jianyun/workplan/module/schedule/views/wechat/WechatViewKt.java:146 |
| 导入排班数据 | cn/jianyun/workplan/module/schedule/views/wechat/WechatViewKt.java:174 |

### cn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel.java

| 文案 | 证据 |
|---|---|
| 用户ID不能为空 | cn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel.java:84 |
| 用户ID是8位喔 | cn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel.java:88 |
| 没有数据 | cn/jianyun/workplan/module/schedule/views/wechat/WechatViewModel.java:304 |

### cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudManageViewKt.java

| 文案 | 证据 |
|---|---|
| 备份日期:  | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudManageViewKt.java:130 |
| 排班数据:  | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudManageViewKt.java:131 |
| 条 | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudManageViewKt.java:131 |
| 数据容量:  | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudManageViewKt.java:132 |
| 备份来源:  | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudManageViewKt.java:133 |

### cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudRecoveryViewKt.java

| 文案 | 证据 |
|---|---|
| 从备份文件导入数据 | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudRecoveryViewKt.java:65 |
| 全量覆盖导入 | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudRecoveryViewKt.java:184 |
| 删除备份 | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudRecoveryViewKt.java:184 |
| 增量导入 | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudRecoveryViewKt.java:366 |
| 覆盖导入 | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudRecoveryViewKt.java:386 |
| 全新导入 | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudRecoveryViewKt.java:416 |
| 确定要删除此备份 | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudRecoveryViewKt.java:491 |
|  /                 1. 增量导入：将备份文件中新的数据写入当前项目<br> /                 2. 覆盖导入：先将本地项目删除，然后导入备份文件里的项目，即以备份文件项目为主<br> /                 3. 全新导入：将备份文件里新的项目直接导入<br> /              | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudRecoveryViewKt.java:512 |
| 关于几种导入 | cn/jianyun/workplan/module/schedule/views/cloud/ScheduleCloudRecoveryViewKt.java:514 |

### cn/jianyun/workplan/module/schedule/views/service/ScheduleService.java

| 文案 | 证据 |
|---|---|
| 该班次已被用于组合班次，禁止删除 | cn/jianyun/workplan/module/schedule/views/service/ScheduleService.java:2570 |
| 该班次已被用于周期排班，禁止删除 | cn/jianyun/workplan/module/schedule/views/service/ScheduleService.java:2587 |
| 该班次已被排班，禁止删除 | cn/jianyun/workplan/module/schedule/views/service/ScheduleService.java:2602 |
| 默认项目 | cn/jianyun/workplan/module/schedule/views/service/ScheduleService.java:4408 |

### cn/jianyun/workplan/module/schedule/views/share/ComposableSingletons$ScheduleShareViewKt.java

| 文案 | 证据 |
|---|---|
| 如果你在旧手机、iPhone、Android 或未来鸿蒙设备上已经分享过排班数据，把分享秘钥填到这里即可导入。 | cn/jianyun/workplan/module/schedule/views/share/ComposableSingletons$ScheduleShareViewKt.java:45 |
| 导入会新建一个排班项目，不会覆盖当前手机里已有的数据。导入成功后会自动回到首页，并切换到刚导入的项目。 | cn/jianyun/workplan/module/schedule/views/share/ComposableSingletons$ScheduleShareViewKt.java:47 |

### cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java

| 文案 | 证据 |
|---|---|
| 分享 | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:146 |
| 导入 | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:146 |
| 当前项目： | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:239 |
| 排班数据默认只保存在当前手机本地。换手机、换系统，或想把当前排班给家人同事使用时，可以先在这里分享当前项目，生成一个 6 位秘钥。 | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:242 |
| 拿到秘钥后，可以在 Android 或 iOS 端的「导入」里恢复成一个新的排班项目；后续鸿蒙版本也会使用同一套秘钥格式。 | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:244 |
| 分享秘钥 | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:274 |
| 复制秘钥 | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:285 |
| 分享排班数据 | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:306 |
| 秘钥 | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:380 |
| 项目命名 | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:401 |
| 确定导入 | cn/jianyun/workplan/module/schedule/views/share/ScheduleShareViewKt.java:429 |

### cn/jianyun/workplan/module/base/vm/BaseCloudViewModel.java

| 文案 | 证据 |
|---|---|
| 当前没有数据可以备份 | cn/jianyun/workplan/module/base/vm/BaseCloudViewModel.java:454 |

### cn/jianyun/workplan/module/base/vm/WebDAVUserViewModel.java

| 文案 | 证据 |
|---|---|
| 服务器连接失败 | cn/jianyun/workplan/module/base/vm/WebDAVUserViewModel.java:292 |
| 该平台已经绑定 | cn/jianyun/workplan/module/base/vm/WebDAVUserViewModel.java:403 |
| 账号了 | cn/jianyun/workplan/module/base/vm/WebDAVUserViewModel.java:403 |

### cn/jianyun/workplan/module/base/model/WebDAVUser.java

| 文案 | 证据 |
|---|---|
| 账号密码均不能为空 | cn/jianyun/workplan/module/base/model/WebDAVUser.java:331 |

### cn/jianyun/workplan/module/base/views/cloud/CommonCloudViewKt.java

| 文案 | 证据 |
|---|---|
| 全量备份 | cn/jianyun/workplan/module/base/views/cloud/CommonCloudViewKt.java:116 |
| 清空备份 | cn/jianyun/workplan/module/base/views/cloud/CommonCloudViewKt.java:116 |
| 点击设置本地备份目录 | cn/jianyun/workplan/module/base/views/cloud/CommonCloudViewKt.java:211 |
| 暂无本地备份数据 | cn/jianyun/workplan/module/base/views/cloud/CommonCloudViewKt.java:249 |
| 点击绑定云备份账号 | cn/jianyun/workplan/module/base/views/cloud/CommonCloudViewKt.java:264 |
| 暂无云备份数据 | cn/jianyun/workplan/module/base/views/cloud/CommonCloudViewKt.java:287 |

### cn/jianyun/workplan/module/base/views/cloud/ComposableSingletons$CommonCloudViewKt.java

| 文案 | 证据 |
|---|---|
| 本地备份与还原 | cn/jianyun/workplan/module/base/views/cloud/ComposableSingletons$CommonCloudViewKt.java:44 |

### cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java

| 文案 | 证据 |
|---|---|
| 云备份使用说明 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:51 |
| 为什么需要云备份？ | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:86 |
|  /            云备份可以帮助用户实现多设备数据同步，同时也可以防止手机损坏或者丢失导致数据无法找回， /          | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:86 |
| 云备份安全吗？ | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:87 |
|  /            我们的云备份是将数据保存在用户自己的网盘空间，开发者不会将用户数据上传至开发者服务器，所以这个对于用户来说是比较安全的 /          | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:87 |
| 云备份和本地备份区别在哪？ | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:88 |
|  /            本地备份最大的优点无疑是加载速度快，用户日常的操作都是通过本地备份来实现的，开发者会在合适的时机将用户数据上传至用户个人的网盘空间（前提得先配置云备份账号） /          | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:88 |
| 为什么推荐使用坚果云？ | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:89 |
|  /             在中国，坚果云独树一帜，提供业界领先的免费WebDAV协议访问服务。这一服务使得用户能够享受到更为便捷、高效的云端文件管理体验。WebDAV协议的兼容性和灵活性，让用户无论身处何地，都能轻松同步和共享文件，如同使用本地存储设备一样自如。 /             坚果云虽然免费，但是它有上传和下载容量限制，如果觉得容量不足，也可以选择其他几种云存储服务 /          | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:89 |
| 为什么不支持百度网盘？ | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:90 |
|  /             因为它不支持WebDAV协议访问服务 /          | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:90 |
| 什么是Koofr？ | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:92 |
|  /            Koofr本身是一个网盘，同时还支持绑定第三方网盘，并且它向用户免费提供WebDAV协议访问服务， /            使得用户可以直接通过它来对第三方网盘进行读取和写入文件，比如微软OneDrive,谷歌GoogleDrive,Dropbox， /            Koofr自己也向用户提供10GB的存储空间，只是这个平台访问速度比较慢，但是不影响我们数据的云备份 /          | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:110 |
| 注册koofr账号 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:113 |
| 如何绑定微软OneDrive空间？ | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:141 |
|  /             由于微软OneDrive空间并没有直接向个人提供WebDAV协议访问服务，但是用户可以借用Koofr平台，先将OneDrive绑定到Koofr,然后通过Koofr免费提供的webDAV协议向OneDrive读取和写入文件 /          | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:141 |
| 如何绑定GoogleDrive空间？ | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:142 |
|  /            由于GoogleDrive空间并没有直接向个人提供WebDAV协议访问服务，但是用户可以借用Koofr平台，先将GoogleDrive绑定到Koofr,然后通过Koofr免费提供的webDAV协议向GoogleDrive读取和写入文件 /          | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserDocViewKt.java:142 |

### cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java

| 文案 | 证据 |
|---|---|
| 添加 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:85 |
| 编辑 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:85 |
| 选择云备份平台 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:151 |
| initSingleValues("坚果云","…ive", "DropBox", "Koofr") | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:175 |
| 账号信息 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:208 |
| 用户名 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:231 |
| 密码 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:255 |
| 主节点 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:281 |
| 开发者郑重承诺，默认情况下，你们的云备份账号密码仅会存储到本地，不会上传至开发者服务器，如果觉得每次换设备都要绑定一次云备份账号，你们也可以选择将云备份账号同计划师账号绑定在一起,这样只要登录计划师账号，就可以把你们的云备份账号自动同步到本地 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:310 |
| 是否跟计划师登录账号绑定 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:333 |
| 复制 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserEditViewKt.java:387 |

### cn/jianyun/workplan/module/base/views/webdav/WebDAVUserManageViewKt.java

| 文案 | 证据 |
|---|---|
| 云备份账号 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserManageViewKt.java:104 |
| 已连接 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserManageViewKt.java:284 |
| 已断开 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserManageViewKt.java:284 |
| 查看 | cn/jianyun/workplan/module/base/views/webdav/WebDAVUserManageViewKt.java:313 |

### cn/jianyun/workplan/module/base/views/webdav/WebDavDataViewKt.java

| 文案 | 证据 |
|---|---|
| 我的文件 | cn/jianyun/workplan/module/base/views/webdav/WebDavDataViewKt.java:78 |

## 09 业务 ViewModel 提示（62 条）

_API/依赖注入/模型；全局 VM 的 Toast/对话框文案；排班模型/DAO；排班相关 VM 的 Toast/对话框文案_

### cn/jianyun/workplan/module/schedule/vm/ScheduleAlarmViewModel.java

| 文案 | 证据 |
|---|---|
| 添加成功 | cn/jianyun/workplan/module/schedule/vm/ScheduleAlarmViewModel.java:477 |
| 编辑成功 | cn/jianyun/workplan/module/schedule/vm/ScheduleAlarmViewModel.java:486 |

### cn/jianyun/workplan/module/schedule/vm/ScheduleCloudManageViewModel.java

| 文案 | 证据 |
|---|---|
| 读取失败，请联系开发者 | cn/jianyun/workplan/module/schedule/vm/ScheduleCloudManageViewModel.java:280 |

### cn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel.java

| 文案 | 证据 |
|---|---|
| 请先设置好班次再来排班 | cn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel.java:365 |
| 周期轮班设置成功 | cn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel.java:2023 |
| 班次统计 | cn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel.java:2139 |
| 周期内班次已被清空 | cn/jianyun/workplan/module/schedule/vm/ScheduleMasterViewModel.java:2554 |

### cn/jianyun/workplan/module/schedule/vm/SchedulePlanViewModel.java

| 文案 | 证据 |
|---|---|
| 存在相同名称 | cn/jianyun/workplan/module/schedule/vm/SchedulePlanViewModel.java:280 |

### cn/jianyun/workplan/module/schedule/vm/ScheduleShareViewModel.java

| 文案 | 证据 |
|---|---|
| 暂无可复制秘钥 | cn/jianyun/workplan/module/schedule/vm/ScheduleShareViewModel.java:352 |
| 分享失败，请检查网络是否正常 | cn/jianyun/workplan/module/schedule/vm/ScheduleShareViewModel.java:428 |
| 秘钥不能为空 | cn/jianyun/workplan/module/schedule/vm/ScheduleShareViewModel.java:488 |
| 没有数据喔 | cn/jianyun/workplan/module/schedule/vm/ScheduleShareViewModel.java:554 |
| 导入成功 | cn/jianyun/workplan/module/schedule/vm/ScheduleShareViewModel.java:565 |
| 条排班数据 | cn/jianyun/workplan/module/schedule/vm/ScheduleShareViewModel.java:773 |
| _导入 | cn/jianyun/workplan/module/schedule/vm/ScheduleShareViewModel.java:1796 |
| 导入排班 | cn/jianyun/workplan/module/schedule/vm/ScheduleShareViewModel.java:1798 |

### cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java

| 文案 | 证据 |
|---|---|
| 时长统计 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:1971 |
| 没有数据可导出 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2035 |
| 排班明细 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2052 |
| 日期 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2055 |
| 星期 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2055 |
| 班次 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2055 |
| 上班 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2055 |
| 下班 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2055 |
| 休息时长 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2055 |
| 工作时长 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2055 |
| 备注 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2055 |
| 导出目录不可用 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2102 |
| 极简排班明细_ | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2115 |
| 分享排班明细 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2128 |
| 已导出到下载目录 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2131 |
| 导出失败 | cn/jianyun/workplan/module/schedule/vm/ScheduleStatViewModel.java:2164 |

### cn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel.java

| 文案 | 证据 |
|---|---|
| 必须选择两个普通班次 | cn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel.java:338 |
| 最多选择两个普通班次 | cn/jianyun/workplan/module/schedule/vm/ScheduleWorkViewModel.java:776 |

### cn/jianyun/workplan/module/schedule/model/ScheduleAlarm.java

| 文案 | 证据 |
|---|---|
| 什么时候提醒不能为空 | cn/jianyun/workplan/module/schedule/model/ScheduleAlarm.java:414 |
| 提醒时间不能为空 | cn/jianyun/workplan/module/schedule/model/ScheduleAlarm.java:417 |
| 提醒班次不能为空 | cn/jianyun/workplan/module/schedule/model/ScheduleAlarm.java:419 |
| 错误 | cn/jianyun/workplan/module/schedule/model/ScheduleAlarm.java:436 |
| 来自计划师提醒 | cn/jianyun/workplan/module/schedule/model/ScheduleAlarm.java:447 |
| 近7天无提醒 | cn/jianyun/workplan/module/schedule/model/ScheduleAlarm.java:452 |
| 提醒 | cn/jianyun/workplan/module/schedule/model/ScheduleAlarm.java:454 |

### cn/jianyun/workplan/module/schedule/model/ScheduleDuty.java

| 文案 | 证据 |
|---|---|
| 名称不能为空 | cn/jianyun/workplan/module/schedule/model/ScheduleDuty.java:298 |

### cn/jianyun/workplan/module/schedule/model/SchedulePlan.java

| 文案 | 证据 |
|---|---|
| 至少选择一个班次来轮班 | cn/jianyun/workplan/module/schedule/model/SchedulePlan.java:381 |

### cn/jianyun/workplan/module/schedule/model/ScheduleProject.java

| 文案 | 证据 |
|---|---|
| 项目不能为空 | cn/jianyun/workplan/module/schedule/model/ScheduleProject.java:307 |

### cn/jianyun/workplan/module/schedule/model/ScheduleWork.java

| 文案 | 证据 |
|---|---|
| 全天 | cn/jianyun/workplan/module/schedule/model/ScheduleWork.java:466 |
| ~次日 | cn/jianyun/workplan/module/schedule/model/ScheduleWork.java:471 |
| 班次不能为空 | cn/jianyun/workplan/module/schedule/model/ScheduleWork.java:484 |
| 班次名字不能超过5个字 | cn/jianyun/workplan/module/schedule/model/ScheduleWork.java:487 |
| 开始时间不能为空 | cn/jianyun/workplan/module/schedule/model/ScheduleWork.java:494 |
| 结束时间不能为空 | cn/jianyun/workplan/module/schedule/model/ScheduleWork.java:497 |
| 班次样式不能为空 | cn/jianyun/workplan/module/schedule/model/ScheduleWork.java:500 |

### cn/jianyun/workplan/vm/AppSettingViewModel.java

| 文案 | 证据 |
|---|---|
| 登录成功 | cn/jianyun/workplan/vm/AppSettingViewModel.java:776 |
| 账号或密码错误 | cn/jianyun/workplan/vm/AppSettingViewModel.java:780 |
| 暂时失败 | cn/jianyun/workplan/vm/AppSettingViewModel.java:1342 |
| 购买成功，感谢您的支持 | cn/jianyun/workplan/vm/AppSettingViewModel.java:1610 |
| 密码不正确 | cn/jianyun/workplan/vm/AppSettingViewModel.java:1733 |

### cn/jianyun/workplan/model/FormType.java

| 文案 | 证据 |
|---|---|
| 确定要清空 | cn/jianyun/workplan/model/FormType.java:169 |

### cn/jianyun/workplan/api/FeedbackModel.java

| 文案 | 证据 |
|---|---|
| 反馈模块不能为空 | cn/jianyun/workplan/api/FeedbackModel.java:403 |
| 反馈类型不能为空 | cn/jianyun/workplan/api/FeedbackModel.java:406 |
| 内容不能为空 | cn/jianyun/workplan/api/FeedbackModel.java:408 |

### cn/jianyun/workplan/hilt/respo/BaseRepository.java

| 文案 | 证据 |
|---|---|
| 复制成功 | cn/jianyun/workplan/hilt/respo/BaseRepository.java:2210 |
| 错误：比值格式不正确，应为 '权重1:权重2' 的正整数格式 | cn/jianyun/workplan/hilt/respo/BaseRepository.java:2392 |

## 10 通用组件文案（90 条）

_其他通用组件；导航/面板/滑动行/头部；表单/按钮/对话框组件_

### cn/jianyun/workplan/ui/component/form/ButtonViewKt.java

| 文案 | 证据 |
|---|---|
| 确定 | cn/jianyun/workplan/ui/component/form/ButtonViewKt.java:205 |
| 取消 | cn/jianyun/workplan/ui/component/form/ButtonViewKt.java:3993 |
| 确认 | cn/jianyun/workplan/ui/component/form/ButtonViewKt.java:5560 |
| 删除 | cn/jianyun/workplan/ui/component/form/ButtonViewKt.java:5799 |
| 隐藏 | cn/jianyun/workplan/ui/component/form/ButtonViewKt.java:5951 |
| 按钮1 | cn/jianyun/workplan/ui/component/form/ButtonViewKt.java:11197 |
| 按钮2 | cn/jianyun/workplan/ui/component/form/ButtonViewKt.java:11202 |

### cn/jianyun/workplan/ui/component/form/ComposableSingletons$DialogViewKt.java

| 文案 | 证据 |
|---|---|
| 温馨提示 | cn/jianyun/workplan/ui/component/form/ComposableSingletons$DialogViewKt.java:48 |

### cn/jianyun/workplan/ui/component/form/DialogViewKt.java

| 文案 | 证据 |
|---|---|
| 真的要删除吗? | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:816 |
| 这里是内容 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:2869 |
| 我知道了 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:2943 |
| 用户使用协议 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:3483 |
| 你好 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:3593 |
| 很高兴看到你下载极简排班，为了保护您的隐私和个人信息，在你使用APP前请认真阅读以下协议: | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:3594 |
| App隐私政策 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:3662 |
| 如果你点击下方的「同意」按钮表示你愿意遵循以上协议，最后祝你使用愉快！ | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:3664 |
| 同意 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:3698 |
| 不同意 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:3698 |
| 选择周数 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:4465 |
| 全部 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:4647 |
| 单周 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:4667 |
| 双周 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:4687 |
| 清空 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:4707 |
| 反选 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:4727 |
| 先长按列表项，然后拖动即可排序 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:4941 |
| 更新说明 | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:5215 |
| 请先阅读  | cn/jianyun/workplan/ui/component/form/DialogViewKt.java:5390 |

### cn/jianyun/workplan/ui/component/form/FormItemKt$MultiSelectItemView$2$3$1$3.java

| 文案 | 证据 |
|---|---|
| 最多选择 | cn/jianyun/workplan/ui/component/form/FormItemKt$MultiSelectItemView$2$3$1$3.java:83 |
| 个 | cn/jianyun/workplan/ui/component/form/FormItemKt$MultiSelectItemView$2$3$1$3.java:83 |

### cn/jianyun/workplan/ui/component/form/FormItemKt.java

| 文案 | 证据 |
|---|---|
| 请输入 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:593 |
| 请选择 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:593 |
| 请填写 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:90544 |
| 粘贴 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:90814 |
| 粘贴板内容为空 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:90837 |
| 格式非法,请正确填写 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:113955 |
| 最小值是 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:113959 |
| 最大值是 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:113962 |
| 禁止隐藏dialog | cn/jianyun/workplan/ui/component/form/FormItemKt.java:113986 |
| 选择日期 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:132928 |
| ifv(value == "", "请选择", lunarDate) | cn/jianyun/workplan/ui/component/form/FormItemKt.java:141774 |
| 选择时间 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:142372 |
| 小时 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:142810 |
| 分钟 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:142816 |
| 选择时长 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:143057 |
| 到 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:145841 |
| 请选择一项操作 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:146591 |
| 条记录 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:146810 |
| 手动输入 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:148686 |
| 收藏颜色 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:148798 |
| 收藏成功 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:148815 |
| 每 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:149355 |
| 天 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:149357 |
| 周 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:149357 |
| 月 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:149357 |
| 年 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:149357 |
| 不重复 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:149358 |
| 选择重复机制 | cn/jianyun/workplan/ui/component/form/FormItemKt.java:149567 |

### cn/jianyun/workplan/ui/component/model/kt/RangeDate.java

| 文案 | 证据 |
|---|---|
| 开始日期 | cn/jianyun/workplan/ui/component/model/kt/RangeDate.java:106 |
| 结束日期 | cn/jianyun/workplan/ui/component/model/kt/RangeDate.java:110 |

### cn/jianyun/workplan/ui/component/nav/BoxViewKt.java

| 文案 | 证据 |
|---|---|
| 删除记录 | cn/jianyun/workplan/ui/component/nav/BoxViewKt.java:2169 |

### cn/jianyun/workplan/ui/component/nav/ComposableSingletons$MonthChooseViewKt.java

| 文案 | 证据 |
|---|---|
| 日期区间 | cn/jianyun/workplan/ui/component/nav/ComposableSingletons$MonthChooseViewKt.java:46 |
| 至 | cn/jianyun/workplan/ui/component/nav/ComposableSingletons$MonthChooseViewKt.java:75 |

### cn/jianyun/workplan/ui/component/nav/HeaderViewKt.java

| 文案 | 证据 |
|---|---|
| 标题 | cn/jianyun/workplan/ui/component/nav/HeaderViewKt.java:3063 |
| 暂无记录 | cn/jianyun/workplan/ui/component/nav/HeaderViewKt.java:7714 |
| 共 | cn/jianyun/workplan/ui/component/nav/HeaderViewKt.java:7896 |

### cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java

| 文案 | 证据 |
|---|---|
| 选择月份 | cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java:493 |
| initWithUnit("", "月", 1, 12) | cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java:736 |
| 选择年份 | cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java:10040 |
| 选择日期区间 | cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java:10763 |
| 最近7天 | cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java:10847 |
| 最近1个月 | cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java:10885 |
| 最近3个月 | cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java:10923 |
| 最近一年 | cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java:10961 |
| 本月 | cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java:10996 |
| 本年 | cn/jianyun/workplan/ui/component/nav/MonthChooseViewKt.java:11031 |

### cn/jianyun/workplan/ui/component/nav/SecretCheckViewKt.java

| 文案 | 证据 |
|---|---|
| 成功 | cn/jianyun/workplan/ui/component/nav/SecretCheckViewKt.java:390 |
| 已锁住, | cn/jianyun/workplan/ui/component/nav/SecretCheckViewKt.java:396 |
| 后解锁 | cn/jianyun/workplan/ui/component/nav/SecretCheckViewKt.java:396 |
| 还剩 | cn/jianyun/workplan/ui/component/nav/SecretCheckViewKt.java:400 |
| 次尝试机会 | cn/jianyun/workplan/ui/component/nav/SecretCheckViewKt.java:400 |

### cn/jianyun/workplan/ui/component/nav/SecretViewModel.java

| 文案 | 证据 |
|---|---|
| 校验秘钥 | cn/jianyun/workplan/ui/component/nav/SecretViewModel.java:474 |
| 请输入新秘钥 | cn/jianyun/workplan/ui/component/nav/SecretViewModel.java:474 |
| 设置秘钥 | cn/jianyun/workplan/ui/component/nav/SecretViewModel.java:476 |
| 请输入旧秘钥 | cn/jianyun/workplan/ui/component/nav/SecretViewModel.java:481 |
| 确认秘钥 | cn/jianyun/workplan/ui/component/nav/SecretViewModel.java:483 |
| 确认秘钥错误 | cn/jianyun/workplan/ui/component/nav/SecretViewModel.java:666 |
| 设置成功 | cn/jianyun/workplan/ui/component/nav/SecretViewModel.java:690 |
| 旧秘钥错误 | cn/jianyun/workplan/ui/component/nav/SecretViewModel.java:709 |
| 秘钥错误 | cn/jianyun/workplan/ui/component/nav/SecretViewModel.java:744 |

### cn/jianyun/workplan/ui/component/nav/SwipeRowViewKt.java

| 文案 | 证据 |
|---|---|
| 真的要删除吗？ | cn/jianyun/workplan/ui/component/nav/SwipeRowViewKt.java:11416 |

## 11 工具·选项·提示文案（129 条）

_工具类与常量表；插件_

### cn/jianyun/workplan/util/CalendarReminderUtils.java

| 文案 | 证据 |
|---|---|
| 极简排班通知 | cn/jianyun/workplan/util/CalendarReminderUtils.java:24 |
| 极简排班账户 | cn/jianyun/workplan/util/CalendarReminderUtils.java:26 |
| 极简排班 | cn/jianyun/workplan/util/CalendarReminderUtils.java:27 |
| 获取日历账户失败01 | cn/jianyun/workplan/util/CalendarReminderUtils.java:79 |
| 获取日历账户失败 | cn/jianyun/workplan/util/CalendarReminderUtils.java:84 |
| 准备写入日历 | cn/jianyun/workplan/util/CalendarReminderUtils.java:87 |
| 添加日历事件失败 | cn/jianyun/workplan/util/CalendarReminderUtils.java:107 |
| 成功添加日历事件: | cn/jianyun/workplan/util/CalendarReminderUtils.java:110 |
| 添加日程提醒失败 | cn/jianyun/workplan/util/CalendarReminderUtils.java:116 |
| 添加日程提醒成功 | cn/jianyun/workplan/util/CalendarReminderUtils.java:118 |
| 小米 | cn/jianyun/workplan/util/CalendarReminderUtils.java:124 |
| 添加日程闹钟失败 | cn/jianyun/workplan/util/CalendarReminderUtils.java:132 |
| 添加日程闹钟成功 | cn/jianyun/workplan/util/CalendarReminderUtils.java:134 |
| 添加日程闹钟失败嘞 | cn/jianyun/workplan/util/CalendarReminderUtils.java:137 |
| 写入日历失败 | cn/jianyun/workplan/util/CalendarReminderUtils.java:142 |
| 普通测试 | cn/jianyun/workplan/util/CalendarReminderUtils.java:196 |
| 删除事件成功 | cn/jianyun/workplan/util/CalendarReminderUtils.java:266 |

### cn/jianyun/workplan/util/CommonDateToolKt.java

| 文案 | 证据 |
|---|---|
| yyyy年MM月 | cn/jianyun/workplan/util/CommonDateToolKt.java:48 |

### cn/jianyun/workplan/util/CommonToolKt.java

| 文案 | 证据 |
|---|---|
| 已经到顶部路由了 | cn/jianyun/workplan/util/CommonToolKt.java:576 |
| 回到上一页 | cn/jianyun/workplan/util/CommonToolKt.java:585 |
| 暂时不可用，请稍后再试 | cn/jianyun/workplan/util/CommonToolKt.java:674 |

### cn/jianyun/workplan/util/LunarCalendar.java

| 文案 | 证据 |
|---|---|
| 冬 | cn/jianyun/workplan/util/LunarCalendar.java:16 |
| 腊 | cn/jianyun/workplan/util/LunarCalendar.java:16 |
| 初 | cn/jianyun/workplan/util/LunarCalendar.java:158 |
| 廿 | cn/jianyun/workplan/util/LunarCalendar.java:158 |

### cn/jianyun/workplan/util/MyDateTool.java

| 文案 | 证据 |
|---|---|
| dd日 | cn/jianyun/workplan/util/MyDateTool.java:33 |
| MM月 | cn/jianyun/workplan/util/MyDateTool.java:36 |
| yyyy年 | cn/jianyun/workplan/util/MyDateTool.java:40 |
| 周日 | cn/jianyun/workplan/util/MyDateTool.java:65 |
| 周一 | cn/jianyun/workplan/util/MyDateTool.java:66 |
| 周二 | cn/jianyun/workplan/util/MyDateTool.java:67 |
| 周三 | cn/jianyun/workplan/util/MyDateTool.java:68 |
| 周四 | cn/jianyun/workplan/util/MyDateTool.java:69 |
| 周五 | cn/jianyun/workplan/util/MyDateTool.java:70 |
| 周六 | cn/jianyun/workplan/util/MyDateTool.java:71 |
| 今天 | cn/jianyun/workplan/util/MyDateTool.java:327 |
| 明天 | cn/jianyun/workplan/util/MyDateTool.java:330 |
| 昨天 | cn/jianyun/workplan/util/MyDateTool.java:330 |
| 后天 | cn/jianyun/workplan/util/MyDateTool.java:333 |
| 前天 | cn/jianyun/workplan/util/MyDateTool.java:333 |
| 后 | cn/jianyun/workplan/util/MyDateTool.java:335 |
| 前 | cn/jianyun/workplan/util/MyDateTool.java:335 |
| 秒 | cn/jianyun/workplan/util/MyDateTool.java:564 |

### cn/jianyun/workplan/util/MyFileUtil.java

| 文案 | 证据 |
|---|---|
| 文件不存在 | cn/jianyun/workplan/util/MyFileUtil.java:253 |

### cn/jianyun/workplan/util/MyWebdavTool.java

| 文案 | 证据 |
|---|---|
| 加载失败 | cn/jianyun/workplan/util/MyWebdavTool.java:131 |
| 读取失败 | cn/jianyun/workplan/util/MyWebdavTool.java:301 |
| 坚果云 | cn/jianyun/workplan/util/MyWebdavTool.java:325 |

### cn/jianyun/workplan/util/SelectUtil.java

| 文案 | 证据 |
|---|---|
| 本地备份 | cn/jianyun/workplan/util/SelectUtil.java:20 |
| 云备份 | cn/jianyun/workplan/util/SelectUtil.java:20 |
| 功能缺陷 | cn/jianyun/workplan/util/SelectUtil.java:21 |
| 产品建议 | cn/jianyun/workplan/util/SelectUtil.java:21 |
| 月度 | cn/jianyun/workplan/util/SelectUtil.java:22 |
| 年度 | cn/jianyun/workplan/util/SelectUtil.java:22 |
| 自定义 | cn/jianyun/workplan/util/SelectUtil.java:22 |
| 工时 | cn/jianyun/workplan/util/SelectUtil.java:24 |
| 日结 | cn/jianyun/workplan/util/SelectUtil.java:24 |
| 时间 | cn/jianyun/workplan/util/SelectUtil.java:24 |
| 休息 | cn/jianyun/workplan/util/SelectUtil.java:24 |
| 请假 | cn/jianyun/workplan/util/SelectUtil.java:24 |
| 按工时 | cn/jianyun/workplan/util/SelectUtil.java:25 |
| 按日结 | cn/jianyun/workplan/util/SelectUtil.java:25 |
| 按时间 | cn/jianyun/workplan/util/SelectUtil.java:25 |
| 按补扣 | cn/jianyun/workplan/util/SelectUtil.java:25 |
| 打卡 | cn/jianyun/workplan/util/SelectUtil.java:28 |
| 补贴 | cn/jianyun/workplan/util/SelectUtil.java:28 |
| 扣款 | cn/jianyun/workplan/util/SelectUtil.java:28 |
| 正班薪水 | cn/jianyun/workplan/util/SelectUtil.java:30 |
| 加班薪水 | cn/jianyun/workplan/util/SelectUtil.java:30 |
| 固定工时费 | cn/jianyun/workplan/util/SelectUtil.java:31 |
| 按月计算 | cn/jianyun/workplan/util/SelectUtil.java:31 |
| 按倍数 | cn/jianyun/workplan/util/SelectUtil.java:32 |
| 单休(25.75天) | cn/jianyun/workplan/util/SelectUtil.java:33 |
| 单休(26天) | cn/jianyun/workplan/util/SelectUtil.java:33 |
| 单双休(23.75天) | cn/jianyun/workplan/util/SelectUtil.java:33 |
| 单双休(24天) | cn/jianyun/workplan/util/SelectUtil.java:33 |
| 双休(21.75天) | cn/jianyun/workplan/util/SelectUtil.java:33 |
| 双休(22天) | cn/jianyun/workplan/util/SelectUtil.java:33 |
| 收礼 | cn/jianyun/workplan/util/SelectUtil.java:34 |
| 送礼 | cn/jianyun/workplan/util/SelectUtil.java:34 |
| 登录 | cn/jianyun/workplan/util/SelectUtil.java:35 |
| 注册 | cn/jianyun/workplan/util/SelectUtil.java:35 |
| 借出 | cn/jianyun/workplan/util/SelectUtil.java:37 |
| 借进 | cn/jianyun/workplan/util/SelectUtil.java:37 |
| 亲属 | cn/jianyun/workplan/util/SelectUtil.java:38 |
| 同学 | cn/jianyun/workplan/util/SelectUtil.java:38 |
| 朋友 | cn/jianyun/workplan/util/SelectUtil.java:38 |
| 领导 | cn/jianyun/workplan/util/SelectUtil.java:38 |
| 同事 | cn/jianyun/workplan/util/SelectUtil.java:38 |
| 支付宝 | cn/jianyun/workplan/util/SelectUtil.java:39 |
| 微信 | cn/jianyun/workplan/util/SelectUtil.java:39 |
| 银行卡 | cn/jianyun/workplan/util/SelectUtil.java:39 |
| 现金 | cn/jianyun/workplan/util/SelectUtil.java:39 |
| 次 | cn/jianyun/workplan/util/SelectUtil.java:40 |
| 无提醒 | cn/jianyun/workplan/util/SelectUtil.java:41 |
| 分期 | cn/jianyun/workplan/util/SelectUtil.java:41 |
| 结婚 | cn/jianyun/workplan/util/SelectUtil.java:42 |
| 乔迁 | cn/jianyun/workplan/util/SelectUtil.java:42 |
| 生日 | cn/jianyun/workplan/util/SelectUtil.java:42 |
| 本科 | cn/jianyun/workplan/util/SelectUtil.java:43 |
| 硕士 | cn/jianyun/workplan/util/SelectUtil.java:43 |
| 专科 | cn/jianyun/workplan/util/SelectUtil.java:43 |
| 教师 | cn/jianyun/workplan/util/SelectUtil.java:43 |
| 中国色 | cn/jianyun/workplan/util/SelectUtil.java:44 |
| 我收藏的 | cn/jianyun/workplan/util/SelectUtil.java:44 |
| 学生 | cn/jianyun/workplan/util/SelectUtil.java:45 |
| 其他 | cn/jianyun/workplan/util/SelectUtil.java:45 |
| 亮白主题 | cn/jianyun/workplan/util/SelectUtil.java:46 |
| 暗黑主题 | cn/jianyun/workplan/util/SelectUtil.java:46 |
| 追随系统 | cn/jianyun/workplan/util/SelectUtil.java:46 |
| 节课 | cn/jianyun/workplan/util/SelectUtil.java:50 |
| 普通班次 | cn/jianyun/workplan/util/SelectUtil.java:55 |
| 组合班次 | cn/jianyun/workplan/util/SelectUtil.java:55 |
| 当天 | cn/jianyun/workplan/util/SelectUtil.java:56 |
| 第二天 | cn/jianyun/workplan/util/SelectUtil.java:56 |
| 提前1天 | cn/jianyun/workplan/util/SelectUtil.java:56 |
| 每月 | cn/jianyun/workplan/util/SelectUtil.java:57 |
| 每年 | cn/jianyun/workplan/util/SelectUtil.java:57 |
| 永久 | cn/jianyun/workplan/util/SelectUtil.java:57 |
| 所有周 | cn/jianyun/workplan/util/SelectUtil.java:59 |
| 单行 | cn/jianyun/workplan/util/SelectUtil.java:61 |
| 双行 | cn/jianyun/workplan/util/SelectUtil.java:61 |
| 本月1号到月底 | cn/jianyun/workplan/util/SelectUtil.java:95 |
| 号到次月 | cn/jianyun/workplan/util/SelectUtil.java:97 |
| 号 | cn/jianyun/workplan/util/SelectUtil.java:97 |
| 未知 | cn/jianyun/workplan/util/SelectUtil.java:203 |

### cn/jianyun/workplan/util/WeekTool.java

| 文案 | 证据 |
|---|---|
| 异常 | cn/jianyun/workplan/util/WeekTool.java:19 |

### cn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender.java

| 文案 | 证据 |
|---|---|
| viewConfig为空 | cn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender.java:802 |
| touch角度 =  | cn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/render/PieChartRender.java:974 |

### cn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/PLog.java

| 文案 | 证据 |
|---|---|
| json为空 | cn/jianyun/workplan/plugin/razerdp/widget/animatedpieview/utils/PLog.java:95 |

## 12 农历·日期（109 条）

_农历/节日算法内置数据_

### cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java

| 文案 | 证据 |
|---|---|
| 星期日 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:42 |
| 星期一 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:42 |
| 星期二 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:42 |
| 星期三 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:42 |
| 星期四 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:42 |
| 星期五 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:42 |
| 星期六 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:42 |
| 正 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 二 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 三 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 四 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 五 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 六 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 七 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 八 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 九 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 十 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 十一 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 十二 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:43 |
| 初一 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 初二 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 初三 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 初四 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 初五 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 初六 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 初七 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 初八 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 初九 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 初十 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 十三 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 十四 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 十五 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 十六 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 十七 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 十八 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 十九 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 二十 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 廿一 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 廿二 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 廿三 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 廿四 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 廿五 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 廿六 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 廿七 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 廿八 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 廿九 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 三十 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:44 |
| 大寒 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 雨水 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 春分 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 谷雨 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 夏满 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 夏至 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 大暑 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 处暑 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 秋分 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 霜降 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 小雪 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 冬至 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:45 |
| 小寒 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 立春 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 惊蛰 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 清明 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 立夏 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 芒种 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 小暑 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 立秋 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 白露 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 寒露 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 立冬 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 大雪 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:46 |
| 甲 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:47 |
| 乙 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:47 |
| 丙 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:47 |
| 丁 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:47 |
| 戊 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:47 |
| 己 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:47 |
| 庚 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:47 |
| 辛 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:47 |
| 壬 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:47 |
| 癸 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:47 |
| 子 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 丑 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 寅 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 卯 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 辰 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 巳 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 午 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 未 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 申 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 酉 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 戌 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 亥 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:48 |
| 鼠 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 牛 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 虎 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 兔 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 龙 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 蛇 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 马 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 羊 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 猴 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 鸡 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 狗 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 猪 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:49 |
| 闰 | cn/jianyun/workplan/ui/android/lunar/ChineseCalendar.java:278 |

### cn/jianyun/workplan/ui/android/lunar/Util.java

| 文案 | 证据 |
|---|---|
| 零 | cn/jianyun/workplan/ui/android/lunar/Util.java:8 |
| 一 | cn/jianyun/workplan/ui/android/lunar/Util.java:8 |
| 廿十 | cn/jianyun/workplan/ui/android/lunar/Util.java:10 |

## 14 资源 strings.xml 中的 App 自有文案

筛选方法：decoded/res/values/strings.xml 共 455 条，其中 217 条含中文；带广告 SDK 前缀（tt_/tianmu_/adgain_/beizi_/ms_/abc_ 等）的均属三方库。真正属于 App 的中文条目仅以下 4 条（其余 App 文案在 Kotlin 代码里）：

| name | value | 证据 |
|---|---|---|
| app_name | 极简排班 | decoded/res/values/strings.xml |
| day | 日 | decoded/res/values/strings.xml |
| month | 月 | decoded/res/values/strings.xml |
| year | 年 | decoded/res/values/strings.xml |

values-zh-rCN/strings.xml（168 条）是 Material/AndroidX 中文翻译，未被 App 自有 UI 使用（App 为 Compose + 自绘组件）。

## 15 枚举/选项文案（SelectUtil.java 常量表）

完整机器可读版本见 copy-options.md。以下为摘要（每个 List 的显示名序列）：

| 常量 | 函数 | 条数 | 显示名(存储值) | 证据 |
|---|---|---|---|---|
| BACK_TYPES | initValues | 4 | 本地备份(local) / 云备份(cloud) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| FEEDBACK_TYPES | initValues | 4 | 功能缺陷(bug) / 产品建议(advice) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| DATE_CHOOSE_TYPES | initValues | 5 | 月度(month) / 年度(year) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| MONDAY_OR_SUNDAY | initValues | 4 | 周一(monday) / 周日(sunday) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| ALL_SIGN_TYPES | initValues | 10 | 工时(hour) / 日结(day) / 时间(time) / 休息(rest) / 请假(leave) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| WORK_DATA_TYPES | initValues | 8 | 按工时(hour) / 按日结(day) / 按时间(time) / 按补扣(award) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| SIGN_TYPES | initValues | 6 | 工时(hour) / 日结(day) / 时间(time) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| LEAVE_TYPES | initValues | 4 | 请假(leave) / 休息(rest) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| DEFAULT_TYPES | initValuesAndColor | 9 | 打卡(sign,#776AD4) / 补贴(award,#1974E8) / 扣款(fine,#F87679) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| AWARD_TYPES | initValues | 4 | 补贴(award) / 扣款(fine) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| SALARY_TYPES | initValues | 4 | 正班薪水(normal) / 加班薪水(over) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| SALARY_CALC_TYPES | initValues | 4 | 固定工时费(fix) / 按月计算(month) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| OVER_SALARY_CALC_TYPES | initValues | 4 | 按倍数(times) / 固定工时费(fix) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| REST_TYPES | initValues | 12 | 单休(25.75天)(25.75) / 单休(26天)(26) / 单双休(23.75天)(23.75) / 单双休(24天)(24) / 双休(21.75天)(21.75) / 双休(22天)(22) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| GIFT_TYPES | initValues | 4 | 收礼(receive) / 送礼(send) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| LOGIN_TYPES | initValues | 4 | 登录(login) / 注册(regist) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| GIFT_ALL_TYPES | initValues | 6 | 全部() / 送礼(send) / 收礼(receive) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| BORROW_TYPES | initValues | 4 | 借出(send) / 借进(receive) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| RELATIONS | initSingleValues | 5 | 亲属 / 同学 / 朋友 / 领导 / 同事 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| GIFT_PAY_TYPES | initSingleValues | 4 | 支付宝 / 微信 / 银行卡 / 现金 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| BORROW_TIMES | initWithUnit | 2 |  / 次 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| BORROW_NOTIFY_TYPES | initValues | 4 | 无提醒(分期) / period(自定义) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| GIFT_REASON_TYPES | initSingleValues | 3 | 结婚 / 乔迁 / 生日 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| IDENTITYS | initSingleValues | 4 | 本科 / 硕士 / 专科 / 教师 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| COLOR_MODES | initValues | 4 | 中国色(自定义) / 我收藏的(collect) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| JOBS | initValues | 5 | 学生(student) / 教师(teacher) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| THEMES | initValues | 6 | 亮白主题(light) / 暗黑主题(dark) / 追随系统(auto) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| WEEKDAYS | initValues | 13 | 周一(2) / 周二(周三) / 4(周四) / 5(周五) / 6(周六) / 7(周日) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| ALL_WEEKS | initWithUnit | 2 |  / 周 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| START_DAYS | initValues | 4 | 周一(1) / 周日(7) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| CHOOSE_COURSES | initWithUnit | 2 |  / 节课 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| EARLY_CHOOSE_COURSES | initWithUnit | 2 |  / 节课 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| CHOOSE_PERIODS | initWithUnit | 18 |  / 分钟 / 1 / 2 / 5 / 20 / 25 / 30 / 35 / 40 / 45 / 50 / 55 / 60 / 70 / 80 / 85 / 90 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| CHOOSE_PERIOD_GAPS | initWithUnit | 12 |  / 分钟 / 1 / 2 / 5 / 15 / 20 / 25 / 30 / 40 / 50 / 60 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| BEFORE_NOTIFY_TIMES | initWithUnit | 9 |  / 分钟 / 1 / 2 / 5 / 15 / 20 / 30 / 50 | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| WORK_TYPES | initValues | 3 | 普通班次(组合班次) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| BEFORE_NOTIFY_DAYS | initValues | 5 | 当天(第二天) / 1(提前1天) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| VIP_TYPES | initValues | 6 | 每月(month) / 每年(year) / 永久(forever) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| CHOOSE_TIMES | initTime | 0 |  | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| CHOOSE_WEEK_TYPES | initValues | 5 | 自定义(所有周) / 单周(single) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| CHOOSE_FONT_SIZES | initWithUnit | 2 |  /  | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| CHOOSE_WIDGET_STYLES | initValues | 3 | 单行(双行) | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| CHOOSE_WIDTH_SIZES | initWithUnitAndGap | 2 |  /  | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |
| CHOOSE_WIDTH_SIZES2 | initWithUnitAndGap | 2 |  /  | jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java |

