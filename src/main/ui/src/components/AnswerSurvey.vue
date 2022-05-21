<template>
  <div class="main">

    <h1>The survey is {{ $route.params.id }}</h1>
    <div v-if="$route.params.id === ''">
      <n-input v-model:value="id" type="text" placeholder="Find Survey By ID"/>
      <n-button size="small" color="green" @click="findSurvey(id)">Find</n-button>
    </div>

    <n-form
        ref="formRef"
        :label-width="80"
        :model="answer"
        :rules="rules"
        :size="medium"
    >
      <h1>Title: {{ this.answer.title }}</h1>
      <n-form-item label="Name" path="user.name">
        <n-input v-model:value="answer.name" placeholder="Input Name"/>
      </n-form-item>
      <n-form-item label="Age" path="user.age">
        <n-input v-model:value="answer.age" placeholder="Input Age"/>
      </n-form-item>
      <n-form-item label="Phone" path="phone">
        <n-input v-model:value="answer.phone" placeholder="Phone Number"/>
      </n-form-item>
      <n-form-item>
        <n-button @click="handleValidateClick">
          Validate
        </n-button>
      </n-form-item>
    </n-form>

    <pre>{{ JSON.stringify(formValue, null, 2) }}
</pre>
  </div>


</template>

<script>
import {NInput, NButton, NFormItem, NForm} from "naive-ui";

export default {
  name: "AnswerSurvey",
  components: {NInput, NButton, NForm, NFormItem},
  data() {
    return {
      id: "",
      survey: {},
      answer: {},
      rules: {
        user: {
          name: {
            required: true,
            message: "Please input your name",
            trigger: "blur"
          },
          age: {
            required: true,
            message: "Please input your age",
            trigger: ["input", "blur"]
          }
        },
        phone: {
          required: true,
          message: "Please input your number",
          trigger: ["input"]
        }
      }
    }
  },
  methods: {
    async findSurvey(id) {
      const res = await fetch("/api/survey/" + id)
      if (res.status === 200) {
        this.survey = await res.json()
      }
    }
  }
}
</script>

<style scoped>
.main {
  margin-right: 10%;
  margin-left: 10%;
}
</style>
