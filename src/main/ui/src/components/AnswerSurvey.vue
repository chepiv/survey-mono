<template>
  <n-input v-model:value="value" type="text" placeholder="Basic Input" />
</template>

<script>
import {NInput} from "naive-ui";

export default {
  name: "AnswerSurvey",
  components: {NInput},
  data() {
    return {
    value: ""
  }
  }
}
</script>

<style scoped>

</style>
