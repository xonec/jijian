<script>
import { initTheme } from '@/composables/use-theme.js'
export default {
  onLaunch() {
    initTheme()
  }
}
</script>

<style lang="scss">
@import '@/styles/tokens.scss';
@import '@/styles/base.scss';
@import '@/styles/icons.scss';
</style>
