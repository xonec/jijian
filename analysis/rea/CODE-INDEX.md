# 极简排班 3.5.0 · REA/JADX 深度代码索引

> 由 REA（morluto/rea）依赖的 jadx-headless-mcp 0.7.1 引擎在**单个常驻会话**中批量提取：
> 436 个类成员清单 + 367 个顶层类反编译源码 + 15 组交叉引用。原始数据见 inventories/、source/、xrefs/。

## 总览

| 项 | 数值 |
|---|---|
| 应用类（manifest 包 + timetable） | 436 |
| 已提取反编译源码（顶层类） | 367 |
| 方法总数 | 5290 |
| Compose Composable 方法 | 262 |
| 交叉引用目标 | 15 |

## 按包统计（类数 / 方法数）

| 包 | 类数 | 方法数 |
|---|---|---|
| `module.schedule.vm` | 38 | 393 |
| `util` | 26 | 445 |
| `vm` | 24 | 185 |
| `ui.component.nav` | 23 | 208 |
| `main.test` | 17 | 69 |
| `module.schedule.model` | 17 | 851 |
| `ui.component.form.picker` | 15 | 87 |
| `hilt` | 14 | 55 |
| `ui.component.form` | 13 | 281 |
| `module.schedule.dao` | 12 | 133 |
| `module.schedule` | 11 | 78 |
| `main` | 10 | 65 |
| `module.base.views.webdav` | 10 | 43 |
| `ui.graph.test` | 9 | 18 |
| `api` | 9 | 138 |
| `module.base.vm` | 8 | 109 |
| `widget` | 8 | 201 |
| `hilt.respo` | 8 | 157 |
| `model` | 7 | 127 |
| `ui.graph` | 7 | 33 |
| `main.question` | 7 | 44 |
| `ui.component.sort` | 7 | 53 |
| `module.schedule.views.wechat` | 7 | 28 |
| `main.setting.local` | 6 | 25 |
| `plugin.razerdp.widget.animatedpieview.utils` | 6 | 32 |
| `plugin.razerdp.widget.animatedpieview` | 6 | 166 |
| `ui.graph.model` | 6 | 102 |
| `module.base` | 6 | 35 |
| `module.schedule.views.work` | 5 | 7 |
| `main.setting.cloud.jgy` | 5 | 17 |
| `widget.config` | 5 | 23 |
| `api.dto` | 5 | 222 |
| `main.receiver` | 4 | 12 |
| `widget.calendar` | 4 | 5 |
| `main.setting.user` | 4 | 81 |
| `plugin.razerdp.widget.animatedpieview.render` | 4 | 92 |
| `ui.android.lunar` | 4 | 192 |
| `module.base.model` | 3 | 74 |
| `module.schedule.views.main` | 3 | 5 |
| `ui.theme` | 3 | 33 |
| `ui.component.model.kt` | 3 | 50 |
| `module.schedule.views.plan` | 3 | 4 |
| `plugin.razerdp.widget.animatedpieview.data` | 3 | 44 |
| `module.schedule.views.alarm` | 3 | 3 |
| `main.base` | 2 | 7 |
| `plugin.razerdp.widget.animatedpieview.callback` | 2 | 3 |
| `module.schedule.views.biz` | 2 | 22 |
| `main.base.model` | 2 | 56 |
| `module.schedule.views.cloud` | 2 | 2 |
| `module.schedule.views.share` | 2 | 6 |
| `module.schedule.views.setting` | 2 | 5 |
| `module.base.dao` | 2 | 16 |
| `main.setting.vip` | 2 | 8 |
| `workplan` | 2 | 2 |
| `module.base.views.cloud` | 2 | 5 |
| `module.schedule.views.service` | 2 | 52 |
| `timetable.widget` | 2 | 9 |
| `ui.component.bottomdialog` | 2 | 19 |
| `module.schedule.views` | 1 | 1 |
| `plugin.razerdp.widget.animatedpieview.manager` | 1 | 9 |
| `module.schedule.views.config` | 1 | 2 |
| `module.base.dto` | 1 | 2 |
| `module.schedule.route` | 1 | 3 |
| `main.base.service` | 1 | 24 |
| `module.base.router` | 1 | 3 |
| `module.schedule.views.stat` | 1 | 3 |
| `module.schedule.views.project` | 1 | 1 |
| `main.setting.notify` | 1 | 5 |

## Compose Composable 方法索引（按类）

| 类 | Composable 方法 |
|---|---|
| `timetable.widget.AppWidgetView` | Content() |
| `main.MainActivityKt` | MainScreen() |
| `main.MainViewKt` | MainView() |
| `main.base.PrivatePolicyKt` | PrivacyPolicyWebView(), PrivatePolicy(), PrivatePolicyView() |
| `main.base.UserPolicyKt` | UserPolicy(), UserPolicyView() |
| `main.question.QuestionViewKt` | QuestionView() |
| `main.setting.cloud.jgy.JgyBindViewKt` | JgyBindView() |
| `main.setting.local.LocalBackupViewKt` | LocalBackupView() |
| `main.setting.notify.NotifySettingViewKt` | NotifySettingView() |
| `main.setting.user.LoginDialogKt` | LoginDialog() |
| `main.setting.user.UserDetailViewKt` | UserDetailView() |
| `main.setting.vip.VipViewKt` | PriceItemView(), VipItemView(), VipPage(), VipView() |
| `main.test.TestMainViewKt` | TestMainView() |
| `main.test.TestV1Kt` | ScheduleCalendarBodyV1View(), TestV1() |
| `main.test.TestV2Kt` | ScheduleCalendarBodyV2View(), TestV2() |
| `model.AppConfigModel` | getDarkTheme() |
| `model.MonthDateInfo` | m6704fetchDayColorWaAFU9c() |
| `module.base.views.cloud.CommonCloudViewKt` | CommonCloudView() |
| `module.base.views.webdav.WebDAVUserDocViewKt` | WebDAVUserDocView() |
| `module.base.views.webdav.WebDAVUserEditViewKt` | WebDAVUserEditView() |
| `module.base.views.webdav.WebDAVUserManageViewKt` | WebDAVUserManageView() |
| `module.base.views.webdav.WebDavDataViewKt` | WebDavDataView() |
| `module.schedule.views.ScheduleMainViewKt` | ScheduleMainView() |
| `module.schedule.views.alarm.ScheduleAlarmEditViewKt` | ScheduleAlarmEditView() |
| `module.schedule.views.alarm.ScheduleAlarmManageViewKt` | ScheduleAlarmManageView() |
| `module.schedule.views.biz.ScheduleCalendarViewKt` | BottomNavView(), ScheduleCalendarBodyView(), ScheduleCalendarMonthView(), ScheduleCalendarView() |
| `module.schedule.views.cloud.ScheduleCloudManageViewKt` | ScheduleCloudManageView() |
| `module.schedule.views.cloud.ScheduleCloudRecoveryViewKt` | ScheduleCloudRecoveryView() |
| `module.schedule.views.config.ScheduleConfigViewKt` | BottomScheduleConfigView(), m6750ScheduleConfigViewuFdPcIQ() |
| `module.schedule.views.main.BottomProjectChooseViewKt` | BottomProjectChooseView() |
| `module.schedule.views.main.ScheduleHomeViewKt` | BottomWorkChoose1View(), BottomWorkChoose2View(), ScheduleHomeView() |
| `module.schedule.views.main.ScheduleOperViewKt` | ScheduleOperView() |
| `module.schedule.views.plan.PlanItemViewKt` | EditPlanItemView(), PlanItemView() |
| `module.schedule.views.plan.SchdulePlanEditViewKt` | SchedulePlanEditView() |
| `module.schedule.views.plan.SchedulePlanManageViewKt` | SchedulePlanManageView() |
| `module.schedule.views.project.ScheduleProjectManagerViewKt` | ScheduleProjectManagerView() |
| `module.schedule.views.setting.ScheduleSettingViewKt` | ScheduleSettingView() |
| `module.schedule.views.share.ScheduleShareViewKt` | ImportContent(), ScheduleShareView(), ShareContent(), access$ImportContent(), access$ShareContent() |
| `module.schedule.views.stat.ScheduleStatViewKt` | ScheduleStatView() |
| `module.schedule.views.wechat.WechatViewKt` | WechatView() |
| `module.schedule.views.work.SchduleWorkEditViewKt` | ScheduleWorkEditView() |
| `module.schedule.views.work.ScheduleWorkManageViewKt` | ScheduleWorkManageView() |
| `module.schedule.views.work.WorkItemViewKt` | WorkTimeView(), m6757EditWorkItemViewTN_CM5M(), m6758WholeWorkItemViewvz2T9sI(), m6759WorkItemViewKBW6s6s() |
| `ui.component.bottomdialog.BottomSheetDialogViewKt` | BottomSheetDialog(), InnerDialog(), access$InnerDialog() |
| `ui.component.form.ButtonViewKt` | Cancel2Button(), DeleteOrHideButton(), DoubleButtonGroup(), LongDeleteButton(), LongOkButton(), LongPrivateButton(), LongVipButton(), OkAndDeleteButtonGroup(), OkButton(), m6813CancelButtonvHmCa5Y(), m6814LinkButtoniPolEAI(), m6815LongCancelButtonvHmCa5Y() …(+1) |
| `ui.component.form.DialogViewKt` | ConfirmDialog(), DeleteDialog(), FullDialog(), LoadingDialog(), SelfDialog(), SheetDialog(), SortDialogView(), TipDialog(), UpdateIntroDialog(), WeekChooseDialog(), WelcomeDialog(), m6840BottomDialogVieweHTjO5g() |
| `ui.component.form.FormItemKt` | AdderView(), BottomConfirmButtonGroup(), ColorSelectItemView(), ColorValueItemView(), DatePickerItemView(), DoublePickerItemView(), DoublePickerItemView2(), ExtraInputItemView(), FloatAdderView(), InnerInputItemView(), InputItemView(), InputNumberView() …(+24) |
| `ui.component.form.GroupViewKt` | m6847BlockViewG5g98fw(), m6848CenterGroupViewJ8oBhFo(), m6849GroupTitleViewKLGhzwk(), m6850GroupViewfIyqwc(), m6851SettingGroupViewfIyqwc(), m6852ZeroGroupViewKz89ssw() |
| `ui.component.form.PickerKt` | m6853Picker88mDfTA(), pixelsToDp(), rememberPickerState() |
| `ui.component.form.picker.ComposableSingletons$FWheelPickerFocusVerticalKt$lambda1$1` | invoke(), invoke() |
| `ui.component.form.picker.FWheelPickerContentScopeKt` | m6864FHorizontalWheelPicker05tvjtU(), m6865FVerticalWheelPicker05tvjtU(), m6866ItemSizeBox942rkJo(), m6867WheelPickerlYrZsNM(), m6868access$ItemSizeBox942rkJo(), m6869access$WheelPickerlYrZsNM() |
| `ui.component.form.picker.FWheelPickerContentWrapperScope` | content() |
| `ui.component.form.picker.FWheelPickerContentWrapperScopeImpl` | content() |
| `ui.component.form.picker.FWheelPickerFocusVerticalKt` | getDefaultDividerColor(), m6872FWheelPickerFocusHorizontal9IZ8Weo(), m6873FWheelPickerFocusVertical9IZ8Weo() |
| `ui.component.form.picker.RememberFWheelPickerStateKt` | rememberFWheelPickerState() |
| `ui.component.nav.BoxViewKt` | DeleteText(), HeaderMoreMenu(), m6874BoxView536wdKU(), m6875CenterColumndjqsMU(), m6876CenterRowdjqsMU(), m6877CenterSmallTipTextBazWgJc(), m6878CircleBoxView8s8adOk(), m6879DeleteLinkTextPZHvWI(), m6880EmptyDataView6BXD4ec(), m6881EmptyIconDataViewjxWH9Kg(), m6882FixCircleIconSizeViewDzVHIIc(), m6883FixCircleSizeViewAjpBEmI() …(+16) |
| `ui.component.nav.HeaderViewKt` | AppHeaderView(), BigHeaderView(), HeaderTitle(), HeaderView(), LazyAppPageView(), PageView(), SelfHeaderView(), SelfPageView(), SimpleSubAppPageView(), SinglePageView(), SubAppHeaderView(), SubAppMainPageView() …(+6) |
| `ui.component.nav.IconViewKt` | m6907CircleIconViewB6Dfk3U(), m6908FocusTexta5Y_hM(), m6909IconViewRidXid8() |
| `ui.component.nav.MonthChooseViewKt` | DateRangeChooseView(), YearChooseView(), m6910MonthChooseViewWxQOpUA() |
| `ui.component.nav.NavItemViewKt` | NavItemView(), m6911AppLogoVieworJrPs() |
| `ui.component.nav.PanelViewKt` | m6912PanelView3f6hBDE() |
| `ui.component.nav.PartTitleViewKt` | DialogTitleView(), PartTitleView(), m6913FlowTagView1tP8Re8(), m6914FlowTagViewDzVHIIc(), m6915TagViewo4cevVk() |
| `ui.component.nav.SecretCheckViewKt` | GlobalSecretCheckView(), SecretCheckView() |
| `ui.component.nav.SecretViewModel` | m6916typeColorWaAFU9c() |
| `ui.component.nav.SwipeRowViewKt` | SwipeDeleteView(), m6918SwipeRowViewUR9CgXA() |
| `ui.component.sort.DragDropColumnKt` | DragDropColumn() |
| `ui.component.sort.RememberDragDropStateKt` | DraggableItem(), rememberDragDropState() |
| `ui.component.sort.TestSortViewKt` | DragNDropItemsList() |
| `ui.graph.GraphBarViewKt` | GraphBarView() |
| `ui.graph.GraphLineViewKt` | GraphLineView() |
| `ui.graph.GroupBarViewKt` | GroupBarView() |
| `ui.graph.GroupLineViewKt` | GroupLineView() |
| `ui.graph.MarkerKt` | rememberMarker() |
| `ui.graph.PieGraphKt` | PieGraph() |
| `ui.graph.test.Bar2ViewKt` | Bar2View() |
| `ui.graph.test.Bar3ViewKt` | Bar3View(), rememberComposeHorizontalLine() |
| `ui.graph.test.Bar4ViewKt` | Bar4View() |
| `ui.graph.test.Bar5ViewKt` | Bar5View() |
| `ui.graph.test.Bar6ViewKt` | Bar6View(), rememberHorizontalBox() |
| `ui.graph.test.Bar7ViewKt` | Bar7View(), rememberLegend(), rememberStartAxisLabel() |
| `ui.graph.test.Bar8ViewKt` | Bar8View() |
| `ui.graph.test.Bar9ViewKt` | Bar9View(), getChartColors() |
| `ui.graph.test.BarTestViewKt` | BarTestView() |
| `ui.theme.ThemeKt` | WorkplanTheme() |
| `util.CommonToolKt` | focusColor() |
| `util.CommonUIKt` | m6943BigBlankkHDZbjc(), m6944BlankkHDZbjc(), m6945GlanceBlankkHDZbjc(), m6946GlanceOffsetViewpBklqvs(), m6947GlancePaddingView5DNhBc(), m6948GlancePaddingViewpBklqvs(), m6949GrayLinkText53ZIcWk(), m6950LinkTexthfI1UA(), m6951SmallButtonPLvOf0(), m6952WarnTexthfI1UA(), m6955mainBg9IZ8Weo(), m6956mainBguFdPcIQ() …(+1) |
| `widget.calendar.WidgetCalendarBodyViewKt` | WidgetCalendarBodyView(), m6965WidgetVerticalViewJHQioms() |
| `widget.calendar.WidgetCalendarHeaderViewKt` | WidgetCalendarHeaderView() |
| `widget.calendar.WidgetCalendarViewKt` | WidgetCalendarView() |
| `widget.calendar.WidgetWorkItemViewKt` | m6966WidgetWorkItemViewEQC0FA8() |
| `widget.config.WidgetConfigViewKt` | WidgetConfigView() |

## 方法最多的类（定位核心逻辑）

| 类 | 方法数 | 字段数 | 内部类 | 源码 |
|---|---|---|---|---|
| `ui.component.form.FormItemKt` | 151 | 0 | 0 | — |
| `api.dto.AppTipInfo` | 125 | 39 | 1 | ✅ |
| `ui.android.lunar.NumberPickerView` | 112 | 111 | 6 | ✅ |
| `hilt.respo.BaseRepository` | 111 | 25 | 39 | — |
| `plugin.razerdp.widget.animatedpieview.AnimatedPieViewConfig` | 106 | 64 | 2 | ✅ |
| `module.schedule.model.ScheduleConfig` | 89 | 27 | 0 | ✅ |
| `module.schedule.model.IosShowModel` | 86 | 27 | 0 | ✅ |
| `widget.WidgetConfig` | 86 | 25 | 0 | ✅ |
| `module.schedule.model.ScheduleWork` | 82 | 22 | 0 | ✅ |
| `module.schedule.vm.ScheduleStatViewModel` | 77 | 24 | 13 | — |
| `util.MyDateTool` | 73 | 25 | 0 | ✅ |
| `main.setting.user.User` | 72 | 20 | 0 | ✅ |
| `module.schedule.vm.ScheduleMasterViewModel` | 71 | 23 | 14 | — |
| `module.schedule.model.ScheduleAlarm` | 70 | 20 | 0 | ✅ |
| `api.FeedbackModel` | 67 | 19 | 0 | ✅ |
| `module.schedule.model.SchedulePlan` | 63 | 18 | 0 | ✅ |
| `module.schedule.model.IosWorkPlanDO` | 62 | 19 | 0 | ✅ |
| `util.CommonToolKt` | 60 | 2 | 2 | ✅ |
| `module.schedule.model.IosAlarmDO` | 53 | 16 | 0 | ✅ |
| `widget.DefaultWidgetConfig` | 52 | 15 | 0 | ✅ |
| `module.base.model.WebDAVUser` | 51 | 14 | 0 | ✅ |
| `module.schedule.model.ScheduleProject` | 50 | 14 | 0 | ✅ |
| `module.schedule.model.ScheduleDuty` | 49 | 14 | 0 | ✅ |
| `vm.AppSettingViewModel` | 49 | 15 | 12 | ✅ |
| `module.schedule.model.ScheduleSharePostData` | 47 | 14 | 0 | ✅ |
| `module.schedule.views.service.ScheduleService` | 47 | 8 | 17 | — |
| `module.schedule.model.ScheduleShareData` | 46 | 14 | 1 | ✅ |
| `module.base.vm.BaseCloudViewModel` | 44 | 14 | 8 | ✅ |
| `plugin.razerdp.widget.animatedpieview.render.PieChartRender` | 42 | 16 | 8 | — |
| `module.schedule.model.IosDutyDO` | 41 | 12 | 0 | ✅ |

