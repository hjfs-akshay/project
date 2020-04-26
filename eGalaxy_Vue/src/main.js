import Vue from 'vue'
import App from './App.vue'
import create_course from './components/create_course.vue'
import course_details from './components/course_details'
import update_course from './components/update_course'

import VueForm from 'vue-form';
import 'bootstrap'; 
import 'bootstrap/dist/css/bootstrap.min.css';
import axios from 'axios'
import course_list from './components/course_list.vue'
import VueRouter from 'vue-router';

Vue.config.productionTip = false
axios.defaults.baseURL = 'http://localhost:9999/eGalaxy/api'



Vue.use(VueForm);
Vue.use(VueRouter);

const routes =
[
  { path : '/', redirect: '/courses'},
  { path : '/addcourse', component : create_course, name :'addCourse'},
  { path : '/courses', component : course_list, name :'courseList'},
  { path : '/courses/:id', component : course_details, name :'courseDetails'},
  { path : '/courses/:id', component : update_course, name :'updateCourse'}
];

const router = new VueRouter
({
    routes,
    mode: 'history'
});

Vue.filter('currency', function (value) {
  return '₹' + parseFloat(value).toFixed(2);
});

new Vue({
  router,
  render: h => h(App),
}).$mount('#app')
