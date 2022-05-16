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
        <div style="margin: 16px;">
          <van-button round block type="primary"  native-type="submit">
            Submit
          </van-button>
        </div>
      </van-form>
    </van-col>
  </van-row>
</template>

<script>
import { ref } from 'vue';

export default {
  name: "CreateSurvey",
  setup() {
    const email = ref('');
    const title = ref('');
    const onSubmit = (values) => {
      console.log('submit', values);
    };

    return {
      email,
      title,
      onSubmit,
    };
  },
}
</script>

<style scoped>

</style>
