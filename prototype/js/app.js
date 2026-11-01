/* ============================================================
   极简排班 · 高保真原型渲染层（原生 JS，无依赖）
   结构与尺寸依据 APK 反编译的 Compose 源码，见 README
   ============================================================ */
(function () {
  const A = window.APP;
  const qs = new URLSearchParams(location.search);
  const $ = (s, r) => (r || document).querySelector(s);
  const esc = (s) => String(s).replace(/&/g, '&amp;').replace(/</g, '&lt;').replace(/>/g, '&gt;');

  /* ---------- 状态 ---------- */
  const state = {
    theme: qs.get('theme') || 'dark',
    primary: qs.get('primary') || A.shifts[0] && '#55BB8A',
    tab: qs.get('screen') || 'home',
    stack: [],
    selected: A.selected,
    weekStart: 0, /* 0=周日 1=周一（APK 默认周一，官方截图用周日） */
    view: Object.assign({}, A.view),
    workTab: 'work',
    shareTab: 'share',
    vipPlan: 1,
    editMode: false,
    tipVisible: false,
    configHintVisible: false,
    alarms: A.alarms.map((x) => Object.assign({}, x)),
    sheet: null,
    dialog: null,
    bare: qs.get('bare') === '1',
    selectedColor: '#1BA784',
    workForm: { name: '早班', allDay: false, start: '09:00', end: '18:00', rest: '60' },
    alarmForm: { shift: 'late', when: '上班前30分钟', day: '当天', strong: false }
  };
  if (qs.get('tab')) state.tab = qs.get('tab');

  /* ---------- 小工具 ---------- */
  const icon = (n, cls) => '<i class="ri ri-' + n + (cls ? ' ' + cls : '') + '"></i>';
  const shiftById = (id) => A.shifts.find((s) => s.id === id) || A.shifts[0];
  const shiftByName = (n) => A.shifts.find((s) => s.name === n);
  const fmtTime = (sh) => (sh.allDay ? '全天' : sh.start + '~' + sh.end);

  function chip(id, cls) {
    const sh = shiftById(id);
    return '<span class="chip ' + (cls || '') + '" style="background:' + sh.color + '">' + sh.name + '</span>';
  }
  function badge(id) {
    const sh = shiftById(id);
    if (!sh) return '';
    return (
      '<div class="shift-badge" style="background:' + sh.color + '">' +
      '<span class="n">' + sh.name + '</span>' +
      (sh.allDay ? '<span class="t">全天</span>' : '<span class="t">' + sh.start + '</span>') +
      '</div>'
    );
  }

  /* ---------- 日历 ---------- */
  const WEEK = ['周日', '周一', '周二', '周三', '周四', '周五', '周六'];
  function weekdayOf(y, m, d) { return new Date(y, m - 1, d).getDay(); }
  function monthDays(y, m) { return new Date(y, m, 0).getDate(); }

  function calendarHTML() {
    const { y, m } = state.view;
    const days = monthDays(y, m);
    const first = (weekdayOf(y, m, 1) - state.weekStart + 7) % 7;
    const work = {};
    if (y === 2024 && m === 9) A.days.forEach((x) => (work[x.d] = x));
    let cells = '';
    for (let i = 0; i < first; i++) cells += '<div class="cal-cell other"></div>';
    for (let d = 1; d <= days; d++) {
      const info = work[d] || { d, lunar: '', work: null };
      const isToday = y === A.today.y && m === A.today.m && d === A.today.d;
      const isSel = d === state.selected;
      let lunarCls = 'cal-lunar';
      if (info.holiday) lunarCls += ' holiday';
      else if (info.swap) lunarCls += ' swap';
      cells +=
        '<div class="cal-cell' + (isToday ? ' today' : '') + (isSel ? ' selected' : '') + '" data-day="' + d + '">' +
          '<div class="cal-date">' +
            '<span class="cal-num">' + d + '</span>' +
            (info.lunar ? '<span class="' + lunarCls + '">' + info.lunar + '</span>' : '') +
            (info.swap ? '<span class="cal-lunar swap">调班</span>' : '') +
          '</div>' +
          (info.work ? badge(info.work) : '') +
        '</div>';
    }
    const weekOrder = WEEK.slice(state.weekStart).concat(WEEK.slice(0, state.weekStart));
    const week = weekOrder.map((w) => '<span>' + w + '</span>').join('');
    const CN_MONTH = ['一', '二', '三', '四', '五', '六', '七', '八', '九', '十', '十一', '十二'][state.view.m - 1];
    return (
      '<div class="calendar">' +
        '<div class="cal-watermark">' + CN_MONTH + '月</div>' +
        '<div class="cal-week">' + week + '</div>' +
        '<div class="cal-grid" id="calGrid">' + cells + '</div>' +
        '<div class="cal-foot">' +
          '<button data-action="step-month" data-value="-1">' + icon('back2') + ' <span>上个月</span></button>' +
          '<button class="today-btn" data-action="jump-today">今天</button>' +
          '<button data-action="step-month" data-value="1"><span>下个月</span> ' + icon('right') + '</button>' +
        '</div>' +
      '</div>'
    );
  }

  function legendHTML() {
    return (
      '<div class="legend">' +
      A.stat.donut
        .map(
          (x) =>
            '<div class="item"><span class="dot" style="background:' + x.color + '"></span>' +
            '<span>' + x.name + '(' + x.value + ')</span></div>'
        )
        .join('') +
      '</div>'
    );
  }

  /* ---------- 通用组件 ---------- */
  function header(title, opts) {
    opts = opts || {};
    const left = opts.left || (opts.back ? '<button class="back" data-action="back">' + icon('back') + '</button>' : '');
    const right = opts.right || '';
    const cls = opts.center === false ? 'header' : 'header center';
    return (
      '<div class="' + cls + '">' +
        '<div class="left">' + left + '</div>' +
        (title ? '<div class="title">' + title + '</div>' : '') +
        '<div class="right">' + right + '</div>' +
      '</div>'
    );
  }

  function row(item, action) {
    return (
      '<button class="row" data-action="' + (action || 'row') + '" data-value="' + esc(item.value || '') + '">' +
        (item.icon ? '<span class="ri-lead">' + icon(item.icon) + '</span>' : '') +
        '<span class="label">' + item.label + '</span>' +
        (item.value ? '<span class="value">' + item.value + '</span>' : '') +
        (item.noChev ? '' : '<span class="chev">' + icon('arrow_right') + '</span>') +
      '</button>'
    );
  }

  function tabbar() {
    const items = [
      ['home', '排班', 'home'],
      ['work', '班次', 'sun'],
      ['alarm', '提醒', 'alarm'],
      ['stat', '统计', 'stat'],
      ['setting', '我的', 'user']
    ];
    return (
      '<nav class="tabbar">' +
      items
        .map(
          ([k, label, ic]) =>
            '<button class="tab-item' + (state.tab === k ? ' on' : '') + '" data-tab="' + k + '">' +
            icon(ic) + '<span>' + label + '</span></button>'
        )
        .join('') +
      '<div class="home-indicator"></div></nav>'
    );
  }

  function segment(items, current, action) {
    return (
      '<div class="segment">' +
      items
        .map(
          ([k, label]) =>
            '<button class="' + (current === k ? 'on' : '') + '" data-action="' + action + '" data-value="' + k + '">' + label + '</button>'
        )
        .join('') +
      '</div>'
    );
  }

  /* ---------- 屏 1：排班首页 ---------- */
  function screenHome() {
    const sel = state.selected;
    const info = A.days.find((x) => x.d === sel) || {};
    const sh = info.work ? shiftById(info.work) : null;
    const w = WEEK[weekdayOf(state.view.y, state.view.m, sel)];
    const remark = A.remarks[sel];

    const tip =
      state.tipVisible
        ? '<div class="tip">' + icon('notification', 'ico') +
          '<p>温馨提示: 点击右上角设置按钮，可以设置日历字号大小、显示农历等个性化选项</p>' +
          '<button class="close" data-action="close-tip">' + icon('remove') + '</button></div>'
        : '';

    const dayDetail =
      '<div class="card" style="margin-top:10px">' +
        '<div class="day-head"><span class="d">' + state.view.y + '-' + String(state.view.m).padStart(2, '0') + '-' + String(sel).padStart(2, '0') + '</span><span class="w">' + w + '</span></div>' +
        '<div class="work-row" data-action="pick-shift" data-value="first">' +
          (sh ? chip(sh.id) : '<span class="add">' + icon('add') + ' 选择第一班次</span>') +
          (sh ? '<span class="time">' + fmtTime(sh) + '</span>' : '') +
          '<span class="blank"></span><span class="chev">' + icon('arrow_right') + '</span>' +
        '</div>' +
        '<div class="work-row" data-action="pick-shift" data-value="second">' +
          '<span class="add">' + icon('add') + ' 选择第二班次</span><span class="blank"></span>' +
        '</div>' +
        '<div class="remark' + (remark ? '' : ' accent') + '" data-action="edit-remark">' +
          (remark ? icon('pencil') + ' ' + remark : icon('add') + ' 设置备注') +
        '</div>' +
      '</div>';

    const actions =
      '<div class="home-actions">' +
        '<button class="btn btn-primary" data-action="toggle-edit">' + (state.editMode ? '完成排班' : '开启排班') + '</button>' +
        (state.editMode ? '' : '<button class="btn btn-ghost" data-action="pick-shift" data-value="second">第二班次</button>') +
      '</div>';

    return (
      header('', {
        center: false,
        left: '<button class="month-btn" data-action="month-picker">' + state.view.y + '年' + state.view.m + '月' + icon('down') + '</button>',
        right:
          '<button class="small-btn" data-action="remove-ads">去广告</button>' +
          '<button class="icon-btn" data-action="project-sheet">' + icon('list') + '</button>' +
          '<button class="icon-btn" data-action="config-sheet">' + icon('settings') + '</button>'
      }) +
      '<div class="scroll"><div class="page-pad">' +
        tip +
        legendHTML() +
        calendarHTML() +
        dayDetail +
        actions +
      '</div></div>'
    );
  }

  /* ---------- 屏 2：班次 / 轮班 ---------- */
  function screenWork() {
    const isWork = state.workTab === 'work';
    const body = isWork
      ? '<div class="card">' +
        A.shifts
          .map(
            (sh) =>
              '<button class="shift-row" data-action="work-edit">' +
                '<span class="chip" style="background:' + sh.color + '">' + sh.name + '</span>' +
                '<span class="name"></span>' +
                '<span class="time">' + fmtTime(sh).replace('~', '~') + '</span>' +
              '</button>'
          )
          .join('') +
        '</div>' +
        '<button class="add-row" data-action="work-edit">添加班次</button>' +
        '<div class="sort-link" data-action="sort">班次排序</div>'
      : (A.plans.length
          ? '<div class="card">' +
            A.plans
              .map(
                (p) =>
                  '<button class="shift-row" data-action="plan-edit">' +
                    '<span class="chip" style="background:' + (shiftByName(p.shifts[0]) || A.shifts[0]).color + '">' + p.shifts.length + '班</span>' +
                    '<span class="name">' + p.name + '</span>' +
                    '<span class="time">' + p.period + '天周期</span>' +
                  '</button>'
              )
              .join('') +
            '</div>'
          : '<div class="empty">暂无轮班</div>') +
        '<button class="add-row" data-action="plan-edit">添加轮班</button>' +
        '<div class="sort-link" data-action="sort">' + (isWork ? '班次排序' : '轮班排序') + '</div>';

    return (
      '<div class="scroll"><div class="page-pad">' +
        '<div style="display:flex;justify-content:center;padding:18px 0 14px">' +
        segment([['work', '班次'], ['plan', '轮班']], state.workTab, 'work-tab') +
        '</div>' + body +
      '</div></div>'
    );
  }

  /* ---------- 屏 3：提醒 ---------- */
  function screenAlarm() {
    return (
      header('班次提醒', { right: '<button class="icon-btn" data-action="alarm-edit">' + icon('add') + '</button>' }) +
      '<div class="scroll"><div class="page-pad">' +
      '<button class="btn btn-primary mt6" style="font-size:14px;height:42px" data-action="row">授权极简排班操作您的日历（更新数据）</button>' +
      '<button class="btn btn-primary mt10" style="font-size:14px;height:42px" data-action="row">授权极简排班查询您的日历（查询数据）</button>' +
      '<div class="group mt10">' +
        row({ icon: 'info', label: '关于班次提醒？' }) +
        row({ icon: 'check', label: '检查班次提醒是否生效？' }) +
      '</div>' +
      '<div class="section-label">我的提醒</div>' +
      (state.alarms.length
        ? state.alarms
            .map((al) => {
              const sh = shiftById(al.shift);
              return (
                '<div class="alarm-card">' +
                  '<div class="alarm-top">' +
                    '<span class="alarm-time">' + al.time + '</span>' +
                    chip(al.shift) +
                    '<span class="alarm-range">' + al.range + '</span>' +
                    '<span class="spacer"></span>' +
                    '<button class="switch' + (al.on ? ' on' : '') + '" data-action="toggle-alarm" data-value="' + al.id + '"></button>' +
                  '</div>' +
                  '<div class="alarm-meta">' +
                    al.tags.map((t, i) => '<span class="tag' + (i === 0 ? ' ok' : '') + '">' + t + '</span>').join('') +
                  '</div>' +
                  '<div class="alarm-next">' + al.next + '</div>' +
                '</div>'
              );
            })
            .join('')
        : '<div class="empty">暂无提醒</div>') +
      '<div class="hint center">提醒会写入系统日历，由系统日历在设定时间通知</div>' +
      '</div></div>'
    );
  }

  /* ---------- 屏 4：统计 ---------- */
  function donutSVG() {
    const W = 322, H = 236, cx = 161, cy = 116, r = 66, sw = 24;
    const C = 2 * Math.PI * r;
    let off = 0, segs = '', labels = '';
    const gaps = 3;
    const n = A.stat.donut.length;
    A.stat.donut.forEach((x, i) => {
      const len = Math.max(2, (x.pct / 100) * C - gaps);
      segs +=
        '<circle cx="' + cx + '" cy="' + cy + '" r="' + r + '" fill="none" stroke="' + x.color + '" stroke-width="' + sw + '"' +
        ' stroke-dasharray="' + len + ' ' + (C - len) + '" stroke-dashoffset="' + (-off) + '" transform="rotate(-90 ' + cx + ' ' + cy + ')"/>';
      const mid = ((off + len / 2) / C) * 360 - 90;
      const rad = (mid * Math.PI) / 180;
      const rl = r + sw / 2 + 2;
      const lx = cx + Math.cos(rad) * rl, ly = cy + Math.sin(rad) * rl;
      const dir = Math.cos(rad) >= 0 ? 1 : -1;
      const up = Math.sin(rad) < 0;
      const ex = lx + dir * 14, ey = ly + (up ? -9 : 9);
      const tx = Math.min(Math.max(ex + dir * 4, 8), W - 8);
      const ty = ey + (up ? -7 : 13);
      labels +=
        '<polyline points="' + lx.toFixed(1) + ',' + ly.toFixed(1) + ' ' + ex.toFixed(1) + ',' + ey.toFixed(1) + '" stroke="' + x.color + '" stroke-width="1.6" fill="none" stroke-linecap="round"/>' +
        '<text x="' + tx.toFixed(1) + '" y="' + ty.toFixed(1) + '" fill="' + x.color + '" font-size="12.5" font-weight="500" text-anchor="' + (dir > 0 ? 'start' : 'end') + '">' +
        x.name + ' ' + x.pct + '%</text>';
      off += (x.pct / 100) * C;
    });
    return (
      '<svg width="' + W + '" height="' + H + '" viewBox="0 0 ' + W + ' ' + H + '" style="max-width:100%">' +
      '<circle cx="' + cx + '" cy="' + cy + '" r="' + r + '" fill="none" stroke="var(--surface-2)" stroke-width="' + sw + '"/>' +
      segs + labels + '</svg>'
    );
  }

  function screenStat() {
    const st = A.stat;
    return (
      header('排班统计', { right: '<button class="btn-text accent" style="font-size:14px;height:auto;padding:6px" data-action="export">导出数据</button>' }) +
      '<div class="scroll"><div class="page-pad">' +
        '<div class="stat-range" data-action="range-picker">' + st.range[0] + ' 至 ' + st.range[1] + icon('down', '', '') + '</div>' +
        '<div class="card mt10">' +
          '<div class="donut-wrap">' + donutSVG() + '</div>' +
          '<div class="legend-grid">' +
          st.donut
            .map(
              (x) =>
                '<div class="item"><span class="dot" style="background:' + x.color + '"></span>' +
                '<span>' + x.name + '</span><span class="muted">' + x.value + '次 ' + x.pct + '%</span></div>'
            )
            .join('') +
          '</div>' +
        '</div>' +
        '<div class="stat-card">' +
          '<h4>时长统计</h4>' +
          '<div class="metric-row">' +
            '<div class="metric"><div class="v">' + st.totalHours + '<span style="font-size:12px;color:var(--text-3)"> 小时</span></div><div class="k">总工作时长</div></div>' +
            '<div class="metric"><div class="v">' + st.avgHours + '<span style="font-size:12px;color:var(--text-3)"> 小时</span></div><div class="k">平均每班</div></div>' +
            '<div class="metric"><div class="v">' + st.restHours + '<span style="font-size:12px;color:var(--text-3)"> 小时</span></div><div class="k">休息时长</div></div>' +
          '</div>' +
          '<div class="bar-line"><span>早班</span><span class="bar" style="width:56%;background:' + st.donut[0].color + '"></span><span class="muted" style="font-size:12px;color:var(--text-3)">126h</span></div>' +
          '<div class="bar-line"><span>晚班</span><span class="bar" style="width:64%;background:' + st.donut[1].color + '"></span><span class="muted" style="font-size:12px;color:var(--text-3)">144h</span></div>' +
        '</div>' +
        '<div class="stat-card detail-list">' +
          '<h4>排班详情</h4>' +
          st.details
            .map(
              (d) =>
                '<div class="row">' +
                  '<span class="d">' + d.d + '</span>' +
                  '<span class="d" style="width:auto;color:var(--text-3)">' + d.w + '</span>' +
                  chip(d.work) +
                  '<span class="blank" style="flex:1"></span>' +
                  '<span class="muted" style="font-size:12.5px;color:var(--text-3)">' + d.start + ' – ' + d.end + '</span>' +
                  '<span style="font-size:12.5px;width:34px;text-align:right">' + d.dur + '</span>' +
                '</div>'
            )
            .join('') +
          '<div class="hint center" data-action="export">查看并导出全部 Excel</div>' +
        '</div>' +
      '</div></div>'
    );
  }

  /* ---------- 屏 5：我的 / 排班设置 ---------- */
  function screenSetting() {
    return (
      header('排班设置', {}) +
      '<div class="scroll"><div class="page-pad">' +
        '<button class="user-card" style="width:100%;text-align:left;margin-top:2px" data-action="user-detail">' +
          '<span class="avatar">' + icon('user') + '</span>' +
          '<span class="user-info"><div class="name">登录或注册账号</div><div class="sub">普通用户</div></span>' +
          '<span class="chev">' + icon('arrow_right') + '</span>' +
        '</button>' +
        '<button class="vip-card" style="width:100%;text-align:left" data-action="go-vip">' +
          '<span class="ri-lead" style="font-size:24px;color:var(--vip)">' + icon('vip') + '</span>' +
          '<span class="txt">购买会员，获取更多APP使用特权，您的支持能够让极简排班更好地发展下去</span>' +
          '<span class="go">去开通</span>' +
        '</button>' +
        A.settingGroups
          .map(
            (g) =>
              '<div class="group">' +
              g.items.map((it) => row(it, it.label === '常见问题解答' ? 'faq' : it.label === '本次更新说明' ? 'update-intro' : 'row')).join('') +
              '</div>'
          )
          .join('') +
        '<div class="version">极简排班 v3.5.0 · 独立开发者</div>' +
      '</div></div>'
    );
  }

  /* ---------- 班次编辑 ---------- */
  function screenWorkEdit() {
    const f = state.workForm;
    return (
      header('添加班次', { back: true }) +
      '<div class="scroll"><div class="page-pad">' +
        '<div style="display:flex;justify-content:center;padding:2px 0 14px">' +
        segment([['normal', '普通班次'], ['combo', '组合班次']], state.workForm.tab || 'normal', 'work-form-tab') +
        '</div>' +
        '<div class="group-title" style="padding-top:0">基本信息</div>' +
        '<div class="form-card" style="margin-top:0">' +
          '<div class="form-row"><span class="k">班次名称</span><input class="input" value="' + esc(f.name) + '" data-input="name" placeholder="早班"></div>' +
          '<div class="form-row"><span class="k">是否全天</span><span class="blank" style="flex:1"></span>' +
            '<button class="switch' + (f.allDay ? ' on' : '') + '" data-action="toggle-allday"></button></div>' +
          (f.allDay ? '' :
            '<div class="form-row"><span class="k">开始时间</span><span class="v">' + f.start + '</span></div>' +
            '<div class="form-row"><span class="k">结束时间</span><span class="v">' + f.end + '</span></div>') +
          '<div class="form-row"><span class="k">休息时长</span><span class="v muted">' + f.rest + ' 分钟' + icon('arrow_right') + '</span></div>' +
          '<div class="form-row"><span class="k">备注</span><span class="v muted">选填</span></div>' +
        '</div>' +
        '<div class="group-title">班次颜色</div>' +
        '<div class="form-card"><div class="color-dots">' +
        ['#1BA784', '#303048', '#F8723D', '#3E7BD6', '#C04851', '#E0A12E', '#806D9E', '#4A4A4A', '#2D8A7A', '#B5563F']
          .map((c) => '<button class="color-dot' + (state.selectedColor === c ? ' on' : '') + '" style="background:' + c + '" data-action="pick-color" data-value="' + c + '"></button>')
          .join('') +
        '</div></div>' +
        '<div class="group-title">样式预览</div>' +
        '<div class="form-card"><div class="preview-box">' +
          '<div style="display:flex;align-items:center;gap:8px">' +
            '<span class="chip big" style="background:' + state.selectedColor + '">' + esc(f.name || '班次') + '</span>' +
            '<span style="font-size:13px;color:var(--text-2)">' + (f.allDay ? '全天' : f.start + '~' + f.end) + '</span>' +
          '</div>' +
          '<span class="pv-label">首页日历效果</span>' +
        '</div></div>' +
        '<button class="btn btn-primary mt14" data-action="save">保存</button>' +
        '<div class="hint">提示：班次颜色会用于首页日历色块、统计图表与桌面小组件。休息类班次可开启「是否全天」。组合班次由两个普通班次组成，可一次在某天设置 2 个班次。</div>' +
      '</div></div>'
    );
  }

  /* ---------- 提醒编辑 ---------- */
  function screenAlarmEdit() {
    const f = state.alarmForm;
    const quick = ['上班前30分钟', '上班前10分钟', '下班前5分钟'];
    return (
      header('添加提醒', { back: true, right: '<button class="btn-text accent" style="height:auto;padding:6px" data-action="save">保存</button>' }) +
      '<div class="scroll"><div class="page-pad">' +
        '<div class="group-title">基本信息</div>' +
        '<div class="form-card">' +
          '<div class="form-row"><span class="k">选择班次</span><span class="v">' + chip(f.shift) + icon('arrow_right') + '</span></div>' +
          '<div class="form-row"><span class="k">什么时候提醒</span><span class="v">' + f.when + icon('arrow_right') + '</span></div>' +
          '<div class="form-row"><span class="k">是否强提醒</span><span class="blank" style="flex:1"></span><button class="switch' + (f.strong ? ' on' : '') + '" data-action="toggle-strong"></button></div>' +
        '</div>' +
        '<div class="hint">开启后，系统日程提醒会有铃声提醒，不只是滴一下的那种提醒，但这个只有部分安卓机型支持</div>' +
        '<div class="group-title">快捷选项</div>' +
        '<div class="form-card"><div class="color-dots" style="gap:8px">' +
        quick.map((q) => '<button class="tag' + (f.when === q ? ' ok' : '') + '" style="font-size:12.5px;padding:7px 11px;border-radius:8px" data-action="quick-when" data-value="' + q + '">' + q + '</button>').join('') +
        '</div></div>' +
        '<div class="hint">提醒会写入系统日历：需要授权极简排班操作您的日历（更新数据）与查询您的日历（查询数据）。</div>' +
      '</div></div>'
    );
  }

  /* ---------- 分享与导入 ---------- */
  function screenShare() {
    const share = state.shareTab === 'share';
    return (
      header('分享与导入排班', { back: true }) +
      '<div class="scroll"><div class="page-pad">' +
        '<div style="display:flex;justify-content:center;padding:4px 0 14px">' + segment([['share', '分享'], ['import', '导入']], state.shareTab, 'share-tab') + '</div>' +
        (share
          ? '<div class="card" style="padding:16px">' +
            '<div style="font-size:13px;color:var(--text-2);line-height:1.7">排班数据默认只保存在当前手机本地。换手机、换系统，或想把当前排班给家人同事使用时，可以先在这里分享当前项目，生成一个 6 位秘钥。</div>' +
            '<div class="hint">拿到秘钥后，可以在 Android 或 iOS 端的「导入」里恢复成一个新的排班项目；后续鸿蒙版本也会使用同一套秘钥格式。</div>' +
            '<div class="divider" style="margin:14px 0"></div>' +
            '<div class="form-row" style="padding:0"><span class="k">分享秘钥</span><span class="v" style="font-size:20px;letter-spacing:3px;color:var(--primary);font-weight:600">JY9K2M</span></div>' +
            '<div class="btn-row mt14"><button class="btn btn-ghost btn-sm" data-action="copy-key">' + icon('copy') + ' 复制秘钥</button><button class="btn btn-primary btn-sm" data-action="share-img">' + icon('share') + ' 分享排班数据</button></div>' +
            '</div>'
          : '<div class="card" style="padding:16px">' +
            '<div class="form-row" style="padding:0"><span class="k">秘钥</span><input class="input" placeholder="请输入 6 位秘钥"></div>' +
            '<div class="form-row" style="padding:14px 0 0"><span class="k">项目命名</span><input class="input" placeholder="导入后的项目名称" value=""></div>' +
            '<button class="btn btn-primary mt14" data-action="import">确定导入</button>' +
            '<div class="hint">导入会新建一个排班项目，不会覆盖当前手机里已有的数据。导入成功后会自动回到首页，并切换到刚导入的项目。</div>' +
            '</div>') +
      '</div></div>'
    );
  }

  /* ---------- 会员 ---------- */
  function screenVip() {
    const v = A.vip;
    return (
      header('会员', { back: true }) +
      '<div class="scroll"><div class="page-pad">' +
        '<div class="vip-hero"><div class="crown">' + icon('vip') + '</div><h2>极简排班 · 会员</h2><p>一次付费，解锁全部特权</p></div>' +
        '<div class="plan-grid">' +
        v.plans
          .map(
            (p, i) =>
              '<button class="plan' + (state.vipPlan === i ? ' on' : '') + '" data-action="pick-plan" data-value="' + i + '">' +
              (p.best ? '<span class="tag-best">最划算</span>' : '') +
              '<div class="p">' + p.price + '</div><div class="d">' + p.unit + '</div><div class="d">' + p.note + '</div></button>'
          )
          .join('') +
        '</div>' +
        '<div class="group-title">会员权益</div>' +
        '<div class="card"><div class="rights">' +
        v.rights
          .map((r) => '<div class="right">' + icon(r.icon) + '<div><div class="t">' + r.title + '</div><div class="d">' + r.desc + '</div></div></div>')
          .join('') +
        '</div></div>' +
        '<button class="btn btn-primary mt14" style="background:var(--vip);color:#2b2415" data-action="buy">立即开通</button>' +
        '<div class="hint center">' + v.tip + '</div>' +
        '<div class="hint center">购买失败或使用微信支付，请微信联系客服</div>' +
      '</div></div>'
    );
  }

  /* ---------- 桌面小组件配置 ---------- */
  function screenWidget() {
    const cells = [];
    for (let i = 0; i < 35; i++) {
      const d = i - 0;
      const info = A.days[i];
      cells.push(
        '<div class="wc"><span class="dn">' + (i + 1 <= 30 ? i + 1 : '') + '</span>' +
        (info && info.work ? '<span class="dd" style="background:' + shiftById(info.work).color + '"></span>' : '') +
        '</div>'
      );
    }
    return (
      header('桌面小组件', { back: true, right: '<button class="btn-text accent" style="height:auto;padding:6px">保存</button>' }) +
      '<div class="scroll"><div class="page-pad">' +
        '<div class="widget-box"><div class="widget-preview">' +
          '<div class="wt"><span>2024年9月</span><span>' + icon('back2') + ' 本月 ' + icon('right') + '</span></div>' +
          '<div class="wg">' + cells.join('') + '</div>' +
        '</div></div>' +
        '<div class="group-title">显示内容</div>' +
        '<div class="form-card">' +
          row({ icon: 'calendar', label: '小组件样式', value: '月历' }) +
          row({ icon: 'pencil', label: '显示备注', value: '开' }) +
          row({ icon: 'time', label: '显示上班时间', value: '开' }) +
          row({ icon: 'time', label: '显示下班时间', value: '关' }) +
        '</div>' +
        '<div class="group-title">字体与配色</div>' +
        '<div class="form-card">' +
          row({ icon: 'doc', label: '日期字号', value: '12' }) +
          row({ icon: 'doc', label: '班次字号', value: '9' }) +
          row({ icon: 'doc', label: '时间字号', value: '8' }) +
          row({ icon: 'palette', label: '标题背景色', value: '' }) +
          row({ icon: 'palette', label: '日历背景色', value: '' }) +
          row({ icon: 'sun', label: '暗黑模式配色', value: '跟随系统' }) +
        '</div>' +
        '<div class="hint">若小组件一直显示“正在加载”，可以先删除小组件，重新添加</div>' +
      '</div></div>'
    );
  }

  /* ---------- 项目管理 ---------- */
  function screenProject() {
    return (
      header('项目管理', { back: true, right: '<button class="icon-btn" data-action="row">' + icon('add') + '</button>' }) +
      '<div class="scroll"><div class="page-pad">' +
        '<div class="card">' +
        A.projects
          .map(
            (p) =>
              '<div class="row" style="min-height:56px">' +
              '<span class="label">' + p.name + '</span>' +
              (p.current ? '<span class="tag ok" style="font-size:11px">当前</span>' : '<span class="value">' + p.count + ' 天</span>') +
              '<button class="icon-btn" data-action="project-menu">' + icon('more2') + '</button>' +
              '</div>'
          )
          .join('') +
        '</div>' +
        '<button class="add-row" data-action="row">添加项目</button>' +
        '<div class="sort-link" data-action="sort">项目排序</div>' +
        '<div class="hint">删除项目，会把项目下所有排班数据级联删除，确定还要继续吗？</div>' +
      '</div></div>'
    );
  }

  /* ---------- 常见问题 ---------- */
  function screenFaq() {
    return (
      header('常见问题解答', { back: true }) +
      '<div class="scroll"><div class="page-pad">' +
      A.faq
        .map(
          (f) =>
            '<div class="faq"><div class="cat">' + f.cat + '</div><div class="q">' + esc(f.q) + '</div><div class="a">' + esc(f.a) + '</div></div>'
        )
        .join('') +
      '</div></div>'
    );
  }

  function screenUserDetail() {
    return (
      header('我的信息', { back: true }) +
      '<div class="scroll"><div class="page-pad">' +
        '<div class="card mt10">' +
          '<div class="row"><span class="avatar" style="width:38px;height:38px;font-size:18px">' + icon('user') + '</span><span class="label">未登录</span><span class="value">普通用户</span></div>' +
          row({ icon: 'vip', label: '会员有效期', value: '未开通' }) +
        '</div>' +
        '<div class="group-title">其他信息</div>' +
        '<div class="form-card">' +
          '<div class="form-row"><span class="k">昵称</span><input class="input" placeholder="请输入昵称"></div>' +
          '<div class="form-row"><span class="k">微信</span><input class="input" placeholder="选填"></div>' +
          '<div class="form-row"><span class="k">城市</span><input class="input" placeholder="选填"></div>' +
        '</div>' +
        '<button class="btn btn-primary mt14" data-action="login">登录</button>' +
        '<button class="btn btn-text mt6" data-action="logout" style="color:var(--delete)">退出登录</button>' +
        '<div class="hint">登录账号仅用于记录用户付费状态，如果需要对数据进行云备份，请自行绑定第三方云备份账号。</div>' +
      '</div></div>'
    );
  }

  /* ---------- 底部操作面板（首页「开启排班」） ---------- */
  function operPanel() {
    const items = [
      ['自定义排班', 'pencil'],
      ['周期轮班', 'refresh'],
      ['清除', 'delete_bin'],
      ['上一天', 'down'],
      ['下一天', 'down2'],
      ['关闭', 'close']
    ];
    return (
      '<div class="oper-panel">' +
      items.map(([t, ic]) => '<button class="oper-item" data-action="oper" data-value="' + t + '">' + icon(ic) + '<span>' + t + '</span></button>').join('') +
      '</div>'
    );
  }

  /* ---------- 弹层 ---------- */
  const sheets = {
    month: function () {
      let months = '';
      for (let m = 1; m <= 12; m++) {
        months +=
          '<button class="' + (m === state.view.m ? 'tag ok' : 'tag') + '" style="padding:12px 0;font-size:15px;border-radius:10px;background:' +
          (m === state.view.m ? 'color-mix(in srgb, var(--primary) 15%, transparent)' : 'var(--surface-2)') + ';color:' +
          (m === state.view.m ? 'var(--primary)' : 'var(--text-1)') + '" data-action="pick-month" data-value="' + m + '">' + m + '月</button>';
      }
      return (
        '<div class="sheet-title">选择月份</div><div class="sheet-body">' +
        '<div style="display:flex;align-items:center;justify-content:space-between;padding:4px 6px 12px">' +
        '<button class="icon-btn">' + icon('back2') + '</button><span style="font-size:16px;font-weight:600">2024年</span><button class="icon-btn">' + icon('right') + '</button></div>' +
        '<div style="display:grid;grid-template-columns:repeat(4,1fr);gap:9px">' + months + '</div>' +
        '</div>'
      );
    },
    config: function () {
      const rows = A.displayConfig
        .map((it) => {
          if (it.k === '一周开始日') {
            return '<div class="form-row"><span class="k">一周开始日</span><span class="blank" style="flex:1"></span>' +
              '<div class="segment" style="height:28px"><button style="min-width:52px;height:22px;font-size:13px">周一</button>' +
              '<button class="on" style="min-width:52px;height:22px;font-size:13px">周日</button></div></div>';
          }
          if (typeof it.v === 'boolean') {
            return '<div class="form-row"><span class="k">' + it.k + '</span><span class="blank" style="flex:1"></span><button class="switch on"></button></div>';
          }
          return '<div class="form-row"><span class="k">' + it.k + '</span><span class="v">' + it.v + '</span></div>';
        })
        .join('');
      return (
        '<div class="sheet-title" style="text-align:left;padding:6px 18px 10px;font-size:17px">日历显示设置</div>' +
        '<div class="sheet-body"><div class="form-card" style="margin-top:0">' + rows + '</div></div>' +
        '<div style="padding:14px 12px 0"><button class="btn btn-primary" data-action="close-sheet">保存</button></div>'
      );
    },
    project: function () {
      return (
        '<div class="sheet-title">选择排班项目</div>' +
        '<div class="sheet-body">' +
        A.projects
          .map(
            (p) =>
              '<div class="sheet-row" data-action="pick-project" data-value="' + p.id + '">' +
              '<span class="t">' + p.name + '</span>' +
              (p.current ? '<span class="tag ok">当前</span>' : '<span class="sub">' + p.count + ' 天</span>') +
              '</div>'
          )
          .join('') +
        '<div class="sheet-row" data-action="manage-project" style="justify-content:center;color:var(--primary)"><span class="t" style="flex:none">管理</span></div>' +
        '</div>'
      );
    },
    shift: function (which) {
      return (
        '<div class="sheet-title">' + (which === 'second' ? '选择第二班次' : '选择第一班次') + '</div>' +
        '<div class="sheet-body">' +
        A.shifts
          .map(
            (sh) =>
              '<div class="sheet-row" data-action="set-shift" data-value="' + which + ':' + sh.id + '">' +
              '<span class="chip" style="background:' + sh.color + '">' + sh.name + '</span>' +
              '<span class="t">' + fmtTime(sh) + '</span>' +
              '</div>'
          )
          .join('') +
        (which === 'second' ? '<div class="sheet-row" data-action="set-shift" data-value="second:none" style="justify-content:center;color:var(--text-3)"><span class="t" style="flex:none">取消第二班次</span></div>' : '') +
        '</div>'
      );
    }
  };

  function dialogHTML() {
    if (!state.dialog) return '';
    const d = state.dialog;
    if (d.type === 'remark') {
      return (
        '<div class="dialog-mask" data-action="close-dialog"><div class="dialog" data-stop="1">' +
        '<h3>设置备注</h3>' +
        '<input class="dialog-input" id="remarkInput" placeholder="输入当天备注" value="' + esc(A.remarks[state.selected] || '') + '">' +
        '<div class="actions mt14"><button class="btn btn-ghost" data-action="close-dialog">取消</button><button class="btn btn-primary" data-action="save-remark">确定</button></div>' +
        '</div></div>'
      );
    }
    return (
      '<div class="dialog-mask" data-action="close-dialog"><div class="dialog" data-stop="1">' +
      '<h3>' + d.title + '</h3><p>' + esc(d.text || '') + '</p>' +
      '<div class="actions"><button class="btn btn-ghost" data-action="close-dialog">知道了</button></div>' +
      '</div></div>'
    );
  }

  /* ---------- 渲染 ---------- */
  const SCREENS = {
    home: { render: screenHome, tab: 'home' },
    work: { render: screenWork, tab: 'work' },
    alarm: { render: screenAlarm, tab: 'alarm' },
    stat: { render: screenStat, tab: 'stat' },
    setting: { render: screenSetting, tab: 'setting' },
    workEdit: { render: screenWorkEdit },
    alarmEdit: { render: screenAlarmEdit },
    share: { render: screenShare },
    vip: { render: screenVip },
    widget: { render: screenWidget },
    project: { render: screenProject },
    faq: { render: screenFaq },
    userDetail: { render: screenUserDetail }
  };

  function currentScreenKey() {
    return state.stack.length ? state.stack[state.stack.length - 1] : state.tab;
  }

  function render() {
    const key = currentScreenKey();
    const def = SCREENS[key] || SCREENS.home;
    const isTab = !!def.tab && state.stack.length === 0;
    document.documentElement.dataset.theme = state.theme;
    document.documentElement.style.setProperty('--primary', state.primary);

    const app = $('#app');
    app.innerHTML =
      '<div class="statusbar"><span>9:41</span><span class="glyphs">' + '<svg width="18" height="12" viewBox="0 0 18 12" fill="currentColor"><rect x="0" y="8" width="3" height="4" rx="1"/><rect x="5" y="5.5" width="3" height="6.5" rx="1"/><rect x="10" y="3" width="3" height="9" rx="1"/><rect x="15" y="0" width="3" height="12" rx="1"/></svg><svg width="16" height="12" viewBox="0 0 16 12" fill="currentColor"><path d="M8 11.2 5.6 8.6a3.6 3.6 0 0 1 4.8 0L8 11.2Zm-4.8-5.2L1.6 4.4a9.1 9.1 0 0 1 12.8 0l-1.6 1.6a6.9 6.9 0 0 0-9.6 0Z"/></svg>' + '<span class="bat"></span></span></div>' +
      '<div class="screen-wrap">' + def.render() + '</div>' +
      (isTab ? tabbar() : '');

    if (state.sheet) {
      const sh = sheets[state.sheet] ? sheets[state.sheet](state.sheetArg) : '';
      app.insertAdjacentHTML('beforeend', '<div class="mask" data-action="close-sheet"></div><div class="sheet" data-stop="1">' + sh + '</div>');
    }
    if (state.dialog) app.insertAdjacentHTML('beforeend', dialogHTML());
    if (state.editMode) app.insertAdjacentHTML('beforeend', operPanel());

    bind();
  }

  /* ---------- 交互绑定 ---------- */
  function bind() {
    const app = $('#app');
    app.addEventListener(
      'click',
      function (e) {
        const stop = e.target.closest('[data-stop]');
        const el = e.target.closest('[data-action]');
        if (!el) return;
        const action = el.dataset.action;
        const value = el.dataset.value;
        handle(action, value, el, e);
      },
      { once: false }
    );
  }

  function go(key) {
    state.stack.push(key);
    state.sheet = null;
    render();
  }
  function back() {
    state.stack.pop();
    render();
  }

  function handle(action, value, el) {
    switch (action) {
      case 'back': back(); break;
      case 'month-picker': state.sheet = 'month'; render(); break;
      case 'config-sheet': state.sheet = 'config'; render(); break;
      case 'project-sheet': state.sheet = 'project'; render(); break;
      case 'close-sheet': state.sheet = null; render(); break;
      case 'close-dialog': state.dialog = null; render(); break;
      case 'close-tip': state.tipVisible = false; render(); break;
      case 'step-month':
        state.view.m += Number(value);
        if (state.view.m > 12) { state.view.m = 1; state.view.y++; }
        if (state.view.m < 1) { state.view.m = 12; state.view.y--; }
        render(); break;
      case 'pick-month': state.view.m = Number(value); state.sheet = null; render(); break;
      case 'pick-plan': state.vipPlan = Number(value); render(); break;
      case 'work-form-tab': state.workForm.tab = value; render(); break;
      case 'week-start': state.weekStart = Number(value); render(); break;
      case 'jump-today':
        state.view.y = A.today.y; state.view.m = A.today.m; state.selected = A.today.d; render(); break;
      case 'share-tab': state.shareTab = value; render(); break;
      case 'work-tab': state.workTab = value; render(); break;
      case 'toggle-alarm': {
        const al = state.alarms.find((x) => x.id === value);
        if (al) { al.on = !al.on; al.next = al.on ? al.next : '提醒已关闭'; }
        render();
        break;
      }
      case 'toggle-edit':
        state.editMode = !state.editMode;
        render();
        break;
      case 'toggle-allday': state.workForm.allDay = !state.workForm.allDay; render(); break;
      case 'toggle-strong': state.alarmForm.strong = !state.alarmForm.strong; render(); break;
      case 'quick-when': state.alarmForm.when = value; render(); break;
      case 'pick-color': state.selectedColor = value; render(); break;
      case 'pick-shift': state.sheet = 'shift'; state.sheetArg = value; render(); break;
      case 'set-shift': {
        const [which, id] = value.split(':');
        state.sheet = null;
        render();
        break;
      }
      case 'edit-remark': state.dialog = { type: 'remark' }; render(); break;
      case 'save-remark': {
        const v = ($('#remarkInput') || {}).value || '';
        if (v) A.remarks[state.selected] = v; else delete A.remarks[state.selected];
        state.dialog = null;
        render();
        break;
      }
      case 'alarm-edit': go('alarmEdit'); break;
      case 'work-edit': go('workEdit'); break;
      case 'plan-edit': go('workEdit'); break;
      case 'share-img': go('share'); break;
      case 'faq': go('faq'); break;
      case 'user-detail': go('userDetail'); break;
      case 'go-vip': case 'remove-ads': go('vip'); break;
      case 'update-intro':
        state.dialog = { title: '本次更新说明', text: A.updateIntro };
        render();
        break;
      case 'save': state.stack.pop(); render(); break;
      case 'oper':
        if (value === '关闭') { state.editMode = false; }
        render();
        break;
      case 'toast':
        state.dialog = { title: '提示', text: value || '功能演示' };
        render();
        break;
      default:
        break;
    }
  }

  /* 日历点击（事件委托） */
  document.addEventListener('click', function (e) {
    const cell = e.target.closest('.cal-cell[data-day]');
    if (!cell) return;
    state.selected = Number(cell.dataset.day);
    if (state.editMode) {
      state.sheet = 'shift';
      state.sheetArg = 'first';
    }
    render();
  });

  /* Tab 点击 */
  document.addEventListener('click', function (e) {
    const t = e.target.closest('[data-tab]');
    if (!t) return;
    state.tab = t.dataset.tab;
    state.stack = [];
    state.editMode = false;
    render();
  });

  /* 主题控制面板 */
  function bindSide() {
    const side = $('#side');
    if (!side) return;
    side.addEventListener('click', function (e) {
      const btn = e.target.closest('[data-ctrl]');
      if (!btn) return;
      const ctrl = btn.dataset.ctrl;
      if (ctrl === 'theme') {
        state.theme = btn.dataset.value;
        side.querySelectorAll('[data-ctrl="theme"]').forEach((b) => b.classList.toggle('on', b === btn));
      } else if (ctrl === 'primary') {
        state.primary = btn.dataset.value;
        side.querySelectorAll('[data-ctrl="primary"]').forEach((b) => b.classList.toggle('on', b === btn));
      } else if (ctrl === 'weekStart') {
        state.weekStart = Number(btn.dataset.value);
        side.querySelectorAll('[data-ctrl="weekStart"]').forEach((b) => b.classList.toggle('on', b === btn));
      } else if (ctrl === 'screen') {
        const key = btn.dataset.value;
        state.stack = [];
        state.editMode = false;
        if (SCREENS[key] && SCREENS[key].tab) { state.tab = key; } else { state.stack.push(key); state.tab = 'home'; }
        side.querySelectorAll('[data-ctrl="screen"]').forEach((b) => b.classList.toggle('on', b === btn));
      }
      render();
    });
  }

  /* ---------- 启动 ---------- */
  function boot() {
    if (qs.get('sheet')) state.sheet = qs.get('sheet');
    if (qs.get('edit') === '1') state.editMode = true;
    if (state.bare) {
      document.body.innerHTML = '<div class="stage bare"><div class="phone"><div class="phone-screen"><div class="app" id="app"></div></div></div></div>';
    }
    render();
    bindSide();
    window.__APP__ = { state: state, render: render };
  }

  if (document.readyState === 'loading') document.addEventListener('DOMContentLoaded', boot);
  else boot();
})();
