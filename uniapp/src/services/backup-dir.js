/**
 * Android 系统目录备份（Storage Access Framework）
 * 仅 App-Plus 生效；H5/小程序不支持。
 */
const KEY = 'jy_backup_tree_uri'
const REQ = 60021

export function isSupported() {
  // #ifdef APP-PLUS
  return true
  // #endif
  // #ifndef APP-PLUS
  return false
  // #endif
}

export function getDirUri() {
  try { return uni.getStorageSync(KEY) || '' } catch (e) { return '' }
}

export function clearDir() {
  try { uni.removeStorageSync(KEY) } catch (e) {}
}

export function dirLabel() {
  const uri = getDirUri()
  if (!uri) return ''
  try {
    if (isSupported()) {
      const Uri = plus.android.importClass('android.net.Uri')
      const DocumentsContract = plus.android.importClass('android.provider.DocumentsContract')
      const treeId = String(DocumentsContract.getTreeDocumentId(Uri.parse(uri)) || '')
      const tail = decodeURIComponent(treeId.split(':').pop() || '')
      if (tail) return tail
    }
    return '已选择系统目录'
  } catch (e) { return '已选择系统目录' }
}

function getMain() {
  return plus.android.runtimeMainActivity()
}

function getTreeUri() {
  const plusUri = plus.android.importClass('android.net.Uri')
  return plusUri.parse(getDirUri())
}

export function chooseDir() {
  return new Promise((resolve, reject) => {
    if (!isSupported()) {
      reject(new Error('仅 Android App 支持系统目录'))
      return
    }
    try {
      const main = getMain()
      const Intent = plus.android.importClass('android.content.Intent')
      const intent = new Intent(Intent.ACTION_OPEN_DOCUMENT_TREE)
      intent.addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION | Intent.FLAG_GRANT_PERSISTABLE_URI_PERMISSION)
      main.onActivityResult = (requestCode, resultCode, data) => {
        if (requestCode !== REQ) return
        if (resultCode !== -1 || !data) {
          resolve('')
          return
        }
        try {
          const uri = data.getData()
          if (!uri) { resolve(''); return }
          const resolver = main.getContentResolver()
          const flags = Intent.FLAG_GRANT_READ_URI_PERMISSION | Intent.FLAG_GRANT_WRITE_URI_PERMISSION
          try {
            resolver.takePersistableUriPermission(uri, flags)
          } catch (e) {
            reject(new Error('系统目录授权失败：' + ((e && (e.message || e.errMsg)) || e)))
            return
          }
          const uriText = String(uri.toString())
          uni.setStorageSync(KEY, uriText)
          resolve(uriText)
        } catch (e) {
          reject(e)
        }
      }
      main.startActivityForResult(intent, REQ)
    } catch (e) {
      reject(e)
    }
  })
}

function writeJson(treeUri, json, filename) {
  return new Promise((resolve, reject) => {
    try {
      const main = getMain()
      const DocumentsContract = plus.android.importClass('android.provider.DocumentsContract')
      const resolver = main.getContentResolver()
      const fileUri = DocumentsContract.createDocument(resolver, treeUri, 'application/json', filename)
      if (!fileUri) throw new Error('无法在系统目录创建文件')
      const out = resolver.openOutputStream(fileUri)
      if (!out) throw new Error('无法写入系统目录')
      const OutputStreamWriter = plus.android.importClass('java.io.OutputStreamWriter')
      const writer = new OutputStreamWriter(out, 'UTF-8')
      writer.write(json)
      writer.flush()
      writer.close()
      out.close()
      resolve(String(fileUri.toString()))
    } catch (e) {
      reject(e)
    }
  })
}

export async function writeBackupFile(item) {
  if (!isSupported()) throw new Error('仅 Android App 支持系统目录')
  const uriText = getDirUri()
  if (!uriText) throw new Error('未选择系统目录')
  const treeUri = getTreeUri()
  const name = '极简排班备份-' + new Date().toISOString().replace(/[:.]/g, '-').slice(0, 19) + '.json'
  await writeJson(treeUri, JSON.stringify(item, null, 2), name)
  return name
}
