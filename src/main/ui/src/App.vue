<template>
  <nav>

    <n-tabs default-value="oasis" justify-content="space-evenly" type="line">

        <router-link to="/" >
          <n-tab-pane name="oasis" tab="Create Survey"/>
        </router-link>
      <router-link to="/survey/:id">
        <n-tab-pane name="fill survey" tab="Fill Survey"/>
      </router-link>

      <router-link to="/answers/:id">
      <n-tab-pane name="answers" tab="Answers"/>
      </router-link>
    </n-tabs>



  </nav>
  <router-view/>
</template>

<script>
import {NTabs} from "naive-ui";
import {NTabPane} from "naive-ui";

export default {
  components: {NTabs, NTabPane}
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

nav {
  padding: 30px;
}

nav a {
  font-weight: bold;
  color: #2c3e50;
}

nav a.router-link-exact-active {
  color: #42b983;
}
</style>
