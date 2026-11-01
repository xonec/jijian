# 极简排班 3.5.0 · 枚举/选项文案速查（SelectUtil.java）

来源：jadx-src/sources/cn/jianyun/workplan/util/SelectUtil.java。格式：显示名 → 存储值（App 内部 code）。原型下拉/选择器/分段控件可直接复用。

## BACK_TYPES

| 显示名 | 存储值 |
|---|---|
| 本地备份 | local |
| 云备份 | cloud |

## FEEDBACK_TYPES

| 显示名 | 存储值 |
|---|---|
| 功能缺陷 | bug |
| 产品建议 | advice |

## DATE_CHOOSE_TYPES

| 显示名 | 存储值 |
|---|---|
| 月度 | month |
| 年度 | year |

## MONDAY_OR_SUNDAY

| 显示名 | 存储值 |
|---|---|
| 周一 | monday |
| 周日 | sunday |

## ALL_SIGN_TYPES

| 显示名 | 存储值 |
|---|---|
| 工时 | hour |
| 日结 | day |
| 时间 | time |
| 休息 | rest |
| 请假 | leave |

## WORK_DATA_TYPES

| 显示名 | 存储值 |
|---|---|
| 按工时 | hour |
| 按日结 | day |
| 按时间 | time |
| 按补扣 | award |

## SIGN_TYPES

| 显示名 | 存储值 |
|---|---|
| 工时 | hour |
| 日结 | day |
| 时间 | time |

## LEAVE_TYPES

| 显示名 | 存储值 |
|---|---|
| 请假 | leave |
| 休息 | rest |

## DEFAULT_TYPES

| 显示名 | 存储值 | 颜色 |
|---|---|---|
| 打卡 | sign | #776AD4 |
| 补贴 | award | #1974E8 |
| 扣款 | fine | #F87679 |

## AWARD_TYPES

| 显示名 | 存储值 |
|---|---|
| 补贴 | award |
| 扣款 | fine |

## SALARY_TYPES

| 显示名 | 存储值 |
|---|---|
| 正班薪水 | normal |
| 加班薪水 | over |

## SALARY_CALC_TYPES

| 显示名 | 存储值 |
|---|---|
| 固定工时费 | fix |
| 按月计算 | month |

## OVER_SALARY_CALC_TYPES

| 显示名 | 存储值 |
|---|---|
| 按倍数 | times |
| 固定工时费 | fix |

## REST_TYPES

| 显示名 | 存储值 |
|---|---|
| 单休(25.75天) | 25.75 |
| 单休(26天) | 26 |
| 单双休(23.75天) | 23.75 |
| 单双休(24天) | 24 |
| 双休(21.75天) | 21.75 |
| 双休(22天) | 22 |

## GIFT_TYPES

| 显示名 | 存储值 |
|---|---|
| 收礼 | receive |
| 送礼 | send |

## LOGIN_TYPES

| 显示名 | 存储值 |
|---|---|
| 登录 | login |
| 注册 | regist |

## GIFT_ALL_TYPES

| 显示名 | 存储值 |
|---|---|
| 全部 |  |
| 送礼 | send |
| 收礼 | receive |

## BORROW_TYPES

| 显示名 | 存储值 |
|---|---|
| 借出 | send |
| 借进 | receive |

## RELATIONS

值：亲属 / 同学 / 朋友 / 领导 / 同事

## GIFT_PAY_TYPES

值：支付宝 / 微信 / 银行卡 / 现金

## BORROW_TIMES

前缀='' 单位='次' 值=

## BORROW_NOTIFY_TYPES

| 显示名 | 存储值 |
|---|---|
| 无提醒 | 分期 |
| period | 自定义 |

## GIFT_REASON_TYPES

值：结婚 / 乔迁 / 生日

## IDENTITYS

值：本科 / 硕士 / 专科 / 教师

## COLOR_MODES

| 显示名 | 存储值 |
|---|---|
| 中国色 | 自定义 |
| 我收藏的 | collect |

## JOBS

| 显示名 | 存储值 |
|---|---|
| 学生 | student |
| 教师 | teacher |

## THEMES

| 显示名 | 存储值 |
|---|---|
| 亮白主题 | light |
| 暗黑主题 | dark |
| 追随系统 | auto |

## WEEKDAYS

| 显示名 | 存储值 |
|---|---|
| 周一 | 2 |
| 周二 | 周三 |
| 4 | 周四 |
| 5 | 周五 |
| 6 | 周六 |
| 7 | 周日 |

## ALL_WEEKS

前缀='' 单位='周' 值=

## START_DAYS

| 显示名 | 存储值 |
|---|---|
| 周一 | 1 |
| 周日 | 7 |

## CHOOSE_COURSES

前缀='' 单位='节课' 值=

## EARLY_CHOOSE_COURSES

前缀='' 单位='节课' 值=

## CHOOSE_PERIODS

前缀='' 单位='分钟' 值=1, 2, 5, 20, 25, 30, 35, 40, 45, 50, 55, 60, 70, 80, 85, 90

## CHOOSE_PERIOD_GAPS

前缀='' 单位='分钟' 值=1, 2, 5, 15, 20, 25, 30, 40, 50, 60

## BEFORE_NOTIFY_TIMES

前缀='' 单位='分钟' 值=1, 2, 5, 15, 20, 30, 50

## WORK_TYPES

| 显示名 | 存储值 |
|---|---|
| 普通班次 | 组合班次 |

## BEFORE_NOTIFY_DAYS

| 显示名 | 存储值 |
|---|---|
| 当天 | 第二天 |
| 1 | 提前1天 |

## VIP_TYPES

| 显示名 | 存储值 |
|---|---|
| 每月 | month |
| 每年 | year |
| 永久 | forever |

## CHOOSE_TIMES

值：

## CHOOSE_WEEK_TYPES

| 显示名 | 存储值 |
|---|---|
| 自定义 | 所有周 |
| 单周 | single |

## CHOOSE_FONT_SIZES

前缀='' 单位='' 值=

## CHOOSE_WIDGET_STYLES

| 显示名 | 存储值 |
|---|---|
| 单行 | 双行 |

## CHOOSE_WIDTH_SIZES

值：, 

## CHOOSE_WIDTH_SIZES2

值：, 

