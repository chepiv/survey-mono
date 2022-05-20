<template>
  <van-cell-group>
    <div v-for="(q, index) in questions" :key="index">
      <label for="index">{{index+1}}. Question:</label>
      <van-cell>
        <van-field v-model="q.name" label="Question" placeholder="Question"/>
      </van-cell>

      <van-cell title="Question type">
        <van-radio-group v-model="q.type">
          <van-radio name="text">Text</van-radio>
          <van-radio name="radio">Radio</van-radio>
        </van-radio-group>
      </van-cell>
    </div>


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

    <div style="margin: 16px; padding-left: 50%">
      <van-button @click="addQuestion" icon="plus" color="green" type="primary">Add Question
      </van-button>
    </div>
  </van-cell-group>
</template>

<script>
export default {
  name: "QuestionComp",
  data() {
    return {
      questions: []
    }
  },
  methods: {
    addQuestion() {
      this.questions.push({
        id: "",
        name: "",
        type: ""
      })
    }
  }
}
</script>

<style scoped>
van-cell-group {
  margin: 10%;
}
</style>
