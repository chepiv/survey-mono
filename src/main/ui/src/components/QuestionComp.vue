<template>
  <van-cell-group>
    <van-cell>
      <van-field v-model="question.name" label="Question" placeholder="Question"/>
    </van-cell>

    <van-cell title="Question type">
      <van-radio-group v-model="question.type">
        <van-radio name="text">Text</van-radio>
        <van-radio name="radio">Radio</van-radio>
      </van-radio-group>
    </van-cell>

    <!--    <div v-if="question.type === 'radio'">-->
    <!--      <h5>Options:</h5>-->
    <!--      <div style="margin: 16px; padding-left: 50%">-->
    <!--        <van-button @click="addOption(q)" size="small" round icon="plus" color="green"-->
    <!--                    type="primary"></van-button>-->
    <!--      </div>-->
    <!--      <van-cell v-for="opt in question.options" v-bind:key="opt.id">-->
    <!--        <van-field v-model="opt.text" label="Option" placeholder="Option"/>-->
    <!--      </van-cell>-->
    <!--    </div>-->


  </van-cell-group>
</template>

<script>
export default {
  name: "QuestionComp",
  data() {
    return {
      question: {}
    }
  },
}
</script>

<style scoped>

</style>
