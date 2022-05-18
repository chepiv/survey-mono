<template>
  <van-row justify="space-around">
    <van-col span="6">
      <van-form @submit="onSubmit">
        <van-cell-group inset>
          <van-field
              v-model="email"
              name="email"
              label="Email"
              placeholder="Email"
              :rules="[{ required: true, message: 'Email is required' }]"
          />
          <van-field
              v-model="title"
              type="title"
              name="title"
              label="Title"
              placeholder="Survey Title"
              :rules="[{ required: true, message: 'Title is required' }]"
          />
        </van-cell-group>



        <div style="margin: 16px; padding-left: 50%">
          <van-button @click="addQuestion" icon="plus" color="green" type="primary">Add Question</van-button>
        </div>

        <div style="margin: 16px; padding-left: 30% ; padding-right: 30%">
          <van-button round block type="primary" native-type="submit">
            Submit
          </van-button>
        </div>
      </van-form>
    </van-col>
  </van-row>
</template>

<script>

import QuestionComp from "@/components/QuestionComp";

export default {
  name: "CreateSurvey",
  components: [QuestionComp],
  data() {
    return {
      questions: [],
      email: "",
      title: "",
    }
  },
  methods: {
    onSubmit(e) {
      console.log(e)
      e.preventDefault()
      const surveyReq = {
        email: this.email,
        title: this.title,
      }
      console.log(surveyReq)
    },
    addQuestion() {

    }
  }
}
</script>

<style scoped>

</style>
