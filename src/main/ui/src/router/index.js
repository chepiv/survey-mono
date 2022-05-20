import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import AnswerSurvey from "@/components/AnswerSurvey";

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/survey/:id',
    name: 'survey',
    component: AnswerSurvey
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
