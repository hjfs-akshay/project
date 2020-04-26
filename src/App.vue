<template>
  <div id="app">
    <nav class="navbar navbar-expand-sm navbar  navbar-dark" style="background-color: black;">
      <ul class="navbar-nav ">
        <li class="nav-item">
          <router-link class="nav-link" to ="/" >Course List</router-link>
        </li>
        <li class="nav-item">  
          <router-link class="nav-link" to ="/addcourse">Add course</router-link>
        </li>
      </ul>  
    </nav>
 

    <div class="container">
    <br>
    <h2 style="text-align: center; color:cornflowerblue">eGalaxy</h2>
    <hr>
      <div class="card">
      <div class="card-body">
          <router-view></router-view>
          <!-- <create_course></create_course> -->
          <!-- <test></test> -->
      </div>
  </div>   
  </div>
  </div>
</template>

<script>




export default {
  name: 'app',
}
</script>

<style>
</style>
