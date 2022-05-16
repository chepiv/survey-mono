import { createApp } from 'vue'
import App from './App.vue'
import router from './router'
import {Form, Field, CellGroup, Button} from 'vant';
import { Col, Row } from 'vant';

const app = createApp(App);
app.use(router)
    .use(Form)
    .use(Field)
    .use(CellGroup)
    .use(Button)
    .use(Col).use(Row)
    .mount('#app')
