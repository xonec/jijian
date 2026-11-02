/**
 * 数据层：uniCloud 云函数 / 本地 mock 双后端
 * 页面只依赖这里的方法，切换后端不需要改页面代码。
 */
import config from '@/config.js'
import * as local from './local-db.js'
import { FAQ } from '@/data/mock.js'

const DEVICE_KEY = 'jy_device_id'

export function deviceId() {
  let id = ''
  try {
    id = uni.getStorageSync(DEVICE_KEY)
    if (!id) {
      id = 'dev-' + Date.now().toString(36) + '-' + Math.random().toString(36).slice(2, 8)
      uni.setStorageSync(DEVICE_KEY, id)
    }
  } catch (e) {
    id = 'dev-anonymous'
  }
  return id
}

export function isCloud() {
  return !!config.useCloud && typeof uniCloud !== 'undefined'
}

/* uni-id 登录态（token 由云函数签发；本地模式为 local-xxx 假 token） */
export function authToken() {
  try {
    return uni.getStorageSync('uni_id_token') || ''
  } catch (e) {
    return ''
  }
}

export function userId() {
  try {
    const u = uni.getStorageSync('uni_id_user')
    return (u && (u._id || u.uid)) || ''
  } catch (e) {
    return ''
  }
}

/* 数据归属：已登录用 uid，未登录回落 deviceId（游客模式） */
export function ownerId() {
  return userId() || deviceId()
}

function callCloud(action, data, fnName) {
  return new Promise((resolve, reject) => {
    uniCloud.callFunction({
      name: fnName || config.cloudFunction,
      data: { action, deviceId: deviceId(), userId: userId(), uniIdToken: authToken(), ...(data || {}) },
      success: (res) => {
        const r = res.result || {}
        if (r.code && r.code !== 0) reject(new Error(r.message || 'cloud error'))
        else resolve(r.data)
      },
      fail: (err) => reject(err)
    })
  })
}

/* ---------------- 统一 API ---------------- */
export const api = {
  /* 初始化 / 首屏数据 */
  async bootstrap() {
    if (isCloud()) return callCloud('bootstrap')
    return local.fetchAll()
  },

  /* 排班 */
  async fetchSchedule(start, end) {
    if (isCloud()) return callCloud('schedule.range', { start, end })
    const db = await local.fetchAll()
    return db.schedule.filter((d) => d.date >= start && d.date <= end)
  },
  async setDay(payload) {
    if (isCloud()) return callCloud('schedule.set', payload)
    return local.setDay(payload)
  },

  /* 班次 */
  async fetchShifts() {
    if (isCloud()) return callCloud('shift.list')
    return (await local.fetchAll()).shifts
  },
  async saveShift(shift) {
    if (isCloud()) return callCloud('shift.save', { shift })
    return local.saveShift(shift)
  },
  async deleteShift(id) {
    if (isCloud()) return callCloud('shift.delete', { id })
    return local.deleteShift(id)
  },

  /* 周期轮班方案 */
  async fetchPlans() {
    if (isCloud()) return callCloud('plan.list')
    return []
  },
  async savePlan(plan) {
    if (isCloud()) return callCloud('plan.save', { plan })
    return plan
  },
  async deletePlan(id) {
    if (isCloud()) return callCloud('plan.delete', { id })
    return true
  },

  /* 提醒 */
  async fetchAlarms() {
    if (isCloud()) return callCloud('alarm.list')
    return (await local.fetchAll()).alarms
  },
  async saveAlarm(alarm) {
    if (isCloud()) return callCloud('alarm.save', { alarm })
    return local.saveAlarm(alarm)
  },
  async toggleAlarm(id, on) {
    if (isCloud()) return callCloud('alarm.toggle', { id, on })
    return local.toggleAlarm(id, on)
  },
  async deleteAlarm(id) {
    if (isCloud()) return callCloud('alarm.delete', { id })
    return local.deleteAlarm(id)
  },

  /* 项目（班组） */
  async fetchProjects() {
    if (isCloud()) return callCloud('project.list')
    return (await local.fetchAll()).projects
  },
  async saveProject(project) {
    if (isCloud()) return callCloud('project.save', { project })
    return local.saveProject(project)
  },
  async sortProjects(ids) {
    for (let i = 0; i < ids.length; i += 1) {
      await this.saveProject({ _id: ids[i], id: ids[i], sort: i })
    }
    return true
  },
  async setCurrentProject(id) {
    if (isCloud()) return callCloud('project.setCurrent', { id })
    return local.setCurrentProject(id)
  },
  async deleteProject(id) {
    if (isCloud()) return callCloud('project.delete', { id })
    return local.deleteProject(id)
  },

  /* 显示配置 */
  async fetchConfig() {
    if (isCloud()) return callCloud('config.get')
    return (await local.fetchAll()).config
  },
  async saveConfig(cfg) {
    if (isCloud()) return callCloud('config.save', { config: cfg })
    return local.saveConfig(cfg)
  },

  /* 统计 */
  async fetchStat(start, end) {
    if (isCloud()) return callCloud('stat.range', { start, end })
    return local.computeStat(start, end)
  },

  /* 分享 / 导入 */
  async generateShareKey(projectId) {
    if (isCloud()) return callCloud('share.generate', { projectId })
    const db = await local.fetchAll()
    const key = Math.random().toString(36).slice(2, 8).toUpperCase()
    try {
      uni.setStorageSync('jy_share_' + key, JSON.stringify(db))
    } catch (e) {}
    return { key }
  },
  async importShareKey(key) {
    if (isCloud()) return callCloud('share.import', { key })
    const raw = uni.getStorageSync('jy_share_' + String(key).toUpperCase())
    if (!raw) throw new Error('秘钥不存在或已过期')
    return { ok: true }
  },

  /* FAQ（云端下发；本地兜底） */
  async fetchFaq() {
    if (isCloud()) {
      try {
        return await callCloud('faq.list')
      } catch (e) {
        return FAQ
      }
    }
    return FAQ
  },

  /* ---------------- 认证（uni-id） ---------------- */
  auth: {
    async register(payload) {
      if (isCloud()) return callCloud('auth.register', payload, 'user')
      return local.authRegister(payload)
    },
    async login(payload) {
      if (isCloud()) return callCloud('auth.login', payload, 'user')
      return local.authLogin(payload)
    },
    async logout() {
      if (isCloud()) return callCloud('auth.logout', {}, 'user')
      return local.authLogout()
    },
    async getInfo() {
      if (isCloud()) return callCloud('auth.getInfo', {}, 'user')
      return local.authGetInfo()
    },
    async updateInfo(payload) {
      if (isCloud()) return callCloud('auth.updateInfo', payload, 'user')
      return local.authUpdateInfo(payload)
    },
    async changePassword(payload) {
      if (isCloud()) return callCloud('auth.changePassword', payload, 'user')
      return local.authChangePassword(payload)
    },
    async deleteAccount(payload) {
      if (isCloud()) return callCloud('auth.deleteAccount', payload, 'user')
      throw new Error('本地模式不支持注销账号')
    }
  },

  /* ---------------- 团队 ---------------- */
  team: {
    create(data) { return callCloud('team.create', data, 'team') },
    listMine() { return callCloud('team.listMine', {}, 'team') },
    detail(teamId) { return callCloud('team.detail', { teamId }, 'team') },
    generateInvite(teamId) { return callCloud('team.generateInvite', { teamId }, 'team') },
    memberList(teamId) { return callCloud('team.memberList', { teamId }, 'team') },
    join(data) { return callCloud('team.join', data, 'team') },
    listPending(teamId) { return callCloud('teamJoin.listPending', { teamId }, 'team') },
    approve(teamId, requestId) { return callCloud('teamJoin.approve', { teamId, requestId }, 'team') },
    reject(teamId, requestId) { return callCloud('teamJoin.reject', { teamId, requestId }, 'team') },
    updateMemberProfile(data) { return callCloud('team.updateMemberProfile', data, 'team') },
    setRole(teamId, uid, role) { return callCloud('team.setRole', { teamId, uid, role }, 'team') },
    removeMember(teamId, uid) { return callCloud('team.removeMember', { teamId, uid }, 'team') },
    shifts(teamId) { return callCloud('teamShift.list', { teamId }, 'team') },
    saveShift(teamId, shift) { return callCloud('teamShift.save', { teamId, shift }, 'team') },
    deleteShift(teamId, id) { return callCloud('teamShift.delete', { teamId, id }, 'team') },
    scheduleRange(data) { return callCloud('teamSchedule.range', data, 'team') },
    setSchedule(data) { return callCloud('teamSchedule.set', data, 'team') },
    clearSchedule(data) { return callCloud('teamSchedule.clear', data, 'team') },
    notifications(teamId, offset) { return callCloud('teamNotification.list', { teamId, offset }, 'team') },
    unreadCount(teamId) { return callCloud('teamNotification.unreadCount', { teamId }, 'team') },
    markAllRead(teamId) { return callCloud('teamNotification.markAllRead', { teamId }, 'team') },
    audits(teamId) { return callCloud('teamAudit.list', { teamId }, 'team') }
  },

  /* ---------------- 备份（本地 / 云） ---------------- */
  backup: {
    async list(scope) {
      if (isCloud()) return callCloud('backup.list', { scope }, 'backup')
      return local.backupList(scope)
    },
    async create(payload) {
      if (isCloud()) return callCloud('backup.create', payload, 'backup')
      return local.backupCreate(payload)
    },
    async restore(id) {
      if (isCloud()) return callCloud('backup.restore', { id }, 'backup')
      return local.backupRestore(id)
    },
    async importBackup(payload) {
      if (isCloud()) return callCloud('backup.import', payload, 'backup')
      return local.backupImport(payload.name, payload.snapshot)
    },
    async remove(id) {
      if (isCloud()) return callCloud('backup.delete', { id }, 'backup')
      return local.backupDelete(id)
    }
  },

  /* ---------------- WebDAV 云备份 ---------------- */
  webdav: {
    async accounts() {
      if (isCloud()) return callCloud('webdav.accounts', {}, 'webdav')
      return local.webdavAccounts()
    },
    async saveAccount(account) {
      if (isCloud()) return callCloud('webdav.saveAccount', { account }, 'webdav')
      return local.webdavSaveAccount(account)
    },
    async removeAccount(id) {
      if (isCloud()) return callCloud('webdav.deleteAccount', { id }, 'webdav')
      return local.webdavDeleteAccount(id)
    },
    async testAccount(id) {
      if (isCloud()) return callCloud('webdav.testAccount', { id }, 'webdav')
      return local.webdavTestAccount(id)
    },
    async files(payload) {
      if (isCloud()) return callCloud('webdav.files', payload, 'webdav')
      return local.webdavFiles(payload)
    },
    async upload(payload) {
      if (isCloud()) return callCloud('webdav.upload', payload, 'webdav')
      return local.webdavUpload(payload)
    },
    async download(payload) {
      if (isCloud()) return callCloud('webdav.download', payload, 'webdav')
      return local.webdavDownload(payload)
    },
    async removeFile(payload) {
      if (isCloud()) return callCloud('webdav.deleteFile', payload, 'webdav')
      return local.webdavDeleteFile(payload)
    }
  },

  /* ---------------- 反馈 ---------------- */
  async submitFeedback(payload) {
    if (isCloud()) return callCloud('feedback.submit', payload, 'feedback')
    return local.submitFeedback(payload)
  },

  /* ---------------- 会员（赞助）/ 支付 ---------------- */
  vip: {
    async plans() {
      if (isCloud()) return callCloud('plans', {}, 'vip')
      return local.vipPlans()
    },
    async status() {
      if (isCloud()) return callCloud('status', {}, 'vip')
      return local.vipStatus()
    },
    async createOrder(payload) {
      if (isCloud()) return callCloud('createOrder', payload, 'vip')
      return local.vipCreateOrder(payload)
    },
    async queryOrder(outTradeNo) {
      if (isCloud()) return callCloud('queryOrder', { outTradeNo }, 'vip')
      return local.vipQueryOrder({ outTradeNo })
    },
    async mockPay(outTradeNo) {
      if (isCloud()) return callCloud('mockPay', { outTradeNo }, 'vip')
      return local.vipMockPay({ outTradeNo })
    }
  }
}

export default api
