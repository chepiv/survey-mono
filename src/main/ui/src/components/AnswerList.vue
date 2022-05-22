<template>
  <div>
    <textarea v-model="jsonstr" rows="8" cols="40"></textarea>
    <pre>{{ jsonstr | pretty }}</pre>
  </div>
</template>

<script>
export default {
  name: "AnswerList",
//   data(): {
//     return {
//     jsonstr: '{"id":1,"name":"A green door","price":12.50,"tags":["home","green"]}'
//   }
// }
// ,
// filters: {
//   pretty: function (value) {
//     return JSON.stringify(JSON.parse(value), null, 2);
//   }
// }
}
</script>

<style scoped>

</style>
