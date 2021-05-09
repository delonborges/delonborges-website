<template>
  <MainPage msg="Welcome to Delon Borges page" />
</template>

<script lang="ts">
import { defineComponent } from "vue";
import MainPage from "./components/MainPage.vue";

export default defineComponent({
  name: "App",
  components: {
    MainPage,
  },
});
</script>

<style>
#app {
  @import url("https://fonts.googleapis.com/css2?family=JetBrains+Mono&display=swap");
  font-family: "JetBrains Mono", monospace;
  height: calc(100vh - 28px);
}

body {
  background-size: cover;
  background: #333333;
  background: url("assets/images/background/code_background.jpg");
  padding: 12px;
  margin: 0;
  opacity: 0.9;
}

section {
  margin: auto;
  color: #dddddd;
  background-color: #333333;
  border: 2px solid #ff5100;
  height: calc(100% - 50px);
  padding: 24px;
}

img {
  filter: invert(100%);
}

a:link,
a:visited {
  color: #ff5100;
}
</style>
