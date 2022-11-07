<template>
  <div class="app">
    <router-link style="text-decoration: none;" :to="{ name: 'TestPage' }">
        &nbsp;TestPage&nbsp;
    </router-link>
    <router-link style="text-decoration: none;" :to="{ name: 'JpaBoardListPage' }">
      &nbsp;BoardList&nbsp;
    </router-link>
  </div>
</template>

<script>


  export default {
    name: 'MainHome',

  }
</script>

<style scoped>
  
</style>
