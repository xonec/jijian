# 反编译质量对比（REA/JADX vs 之前 jadx 批量输出）

> 统计 Code decompiled incorrectly / Failed to decompile / JADX WARN 标记，并区分真实 Java / partial Java / smali 回退。

| 项 | 数值 |
|---|---|
| REA 提取的**真实 Java 源码**（顶层类） | 367 |
| 其中仍带反编译告警的类 | 155 |
| **smali 回退类**（Java 反编译完全失败，源码在 source-smali/） | 13 |
| 对应 partial Java（带反编译桩，供阅读，source-partial/） | 13 |
| 旧 jadx-src 中带告警的类 | 202 |
| **旧 jadx 有告警、REA 得到干净 Java 的类** | 34 |

## 恢复列表（旧 jadx 有告警、REA 得到干净 Java）

- `cn.jianyun.workplan.hilt.respo.BaseRepository$2$ds$1`
- `cn.jianyun.workplan.hilt.respo.BaseRepository$getLatestVersion$version$1`
- `cn.jianyun.workplan.hilt.respo.BaseRepository$postEvent$dd$1`
- `cn.jianyun.workplan.hilt.respo.BaseRepository$postEvent2$1$dd$1`
- `cn.jianyun.workplan.hilt.respo.BaseRepository$postPage$dd$1`
- `cn.jianyun.workplan.module.base.views.webdav.WebDavViewModel$loadData$1$rst$1`
- `cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$copyOne$1$flag$1`
- `cn.jianyun.workplan.module.base.vm.WebDAVUserViewModel$save$1$flag$1`
- `cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel$doSave$1$data$1`
- `cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel$doImport$2$result$1`
- `cn.jianyun.workplan.module.schedule.vm.ScheduleShareViewModel$doShare$1$result$1`
- `cn.jianyun.workplan.ui.component.bottomdialog.BottomSheetDialogViewKt$InnerDialog$6$1`
- `cn.jianyun.workplan.ui.component.form.DialogViewKt$UpdateIntroDialog$1$1`
- `cn.jianyun.workplan.ui.component.form.FormItemKt$MultiSelectItemView$2$3$1$3`
- `cn.jianyun.workplan.ui.component.form.FormItemKt$SegmentPickerView$1$1`
- `cn.jianyun.workplan.ui.component.form.PickerKt$Picker$1`
- `cn.jianyun.workplan.ui.component.form.picker.ComposableSingletons$FWheelPickerFocusVerticalKt$lambda1$1`
- `cn.jianyun.workplan.ui.component.form.picker.FWheelPickerContentScopeKt$WheelPicker$3`
- `cn.jianyun.workplan.ui.component.form.picker.FWheelPickerState$notifyCountChanged$1`
- `cn.jianyun.workplan.ui.component.form.picker.WheelPickerNestedScrollConnection$onPreFling$1`
- `cn.jianyun.workplan.ui.component.nav.MonthChooseViewKt$DateRangeChooseView$1$1`
- `cn.jianyun.workplan.ui.component.nav.SecretViewModel$startTimer$1$task$1$run$1`
- `cn.jianyun.workplan.ui.component.nav.SwipeRowViewKt$SwipeRowView$1`
- `cn.jianyun.workplan.ui.component.sort.DragDropColumnKt$DragDropColumn$1$4$2$1`
- `cn.jianyun.workplan.ui.component.sort.DragDropColumnKt$DragDropColumn$2$invoke$$inlined$itemsIndexed$default$1`
- `cn.jianyun.workplan.ui.component.sort.DragDropState$onDrag$1$1$3$1$1`
- `cn.jianyun.workplan.ui.graph.PieGraphKt$PieGraph$1$1`
- `cn.jianyun.workplan.vm.AppSettingViewModel$doLogOut$1$rst$1`
- `cn.jianyun.workplan.vm.AppSettingViewModel$doPurchase$1$info$1`
- `cn.jianyun.workplan.vm.AppSettingViewModel$doPurchase$1$result$1`
- `cn.jianyun.workplan.vm.AppSettingViewModel$doRegist$1$rst$1`
- `cn.jianyun.workplan.vm.AppSettingViewModel$doUpdateInfo$1$rst$1`
- `cn.jianyun.workplan.vm.AppSettingViewModel$refresh$1$dd$1`
- `cn.jianyun.workplan.widget.MyAppWidgetReceiver$observeData$1$1$1`

## smali 回退类（源码在 source-smali/，同类 partial Java 在 source-partial/）

- `cn.jianyun.workplan.hilt.respo.BaseRepository`
- `cn.jianyun.workplan.module.schedule.dao.ScheduleConfigDao_Impl`
- `cn.jianyun.workplan.module.schedule.views.main.ScheduleOperViewKt`
- `cn.jianyun.workplan.module.schedule.views.project.ScheduleProjectManagerViewKt`
- `cn.jianyun.workplan.module.schedule.views.service.ScheduleService`
- `cn.jianyun.workplan.module.schedule.views.wechat.WechatViewModel`
- `cn.jianyun.workplan.module.schedule.vm.ScheduleMasterViewModel`
- `cn.jianyun.workplan.module.schedule.vm.ScheduleStatViewModel`
- `cn.jianyun.workplan.module.schedule.vm.ScheduleWorkViewModel`
- `cn.jianyun.workplan.plugin.razerdp.widget.animatedpieview.render.PieChartRender`
- `cn.jianyun.workplan.ui.android.lunar.ChineseCalendar`
- `cn.jianyun.workplan.ui.component.form.FormItemKt`
- `cn.jianyun.workplan.widget.MyAppWidgetReceiver`

