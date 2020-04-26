<template lang="html">
  <div style="width: 400px;">
    <vue-form :state="formstate" @submit.prevent="onSubmit" >

      <div class="form-group">
          <label for="name">Course Name</label>
          <input type="text" class="form-control" id="courseName" required v-model="course.courseName" name="courseName">
      </div>
      
      <div class="form-group">
            <label for="name">Course Author</label>
            <input type="text" class="form-control" id="courseAuthor" required v-model="course.courseAuthor" name="courseAuthor">
        </div>

      <div class="form-group">
            <label for="name">Course Description</label>
            <input type="text" class="form-control" id="courseDiscription" required v-model="course.courseDiscription" name="courseDiscription">
        </div>

        <div class="form-group">
            <label for="name">Course Price</label>
            <input type="text" class="form-control" id="coursePrice" required v-model="course.coursePrice" name="coursePrice">
        </div>  

    <button   type="submit"  class="btn btn-success">Submit</button>
    </vue-form>  
  </div>
</template>

<script lang="js">
  import CourseService from '../services/CourseService';
  export default  {
   
    name: 'update-course',
    props: [],
    mounted () {

    },
    data () {
      return {
         formstate: {},
        course: {},
        id : this.$route.params.id,
      }
    },
    methods: {
      onSubmit: function (){
        CourseService.updateCourse(this.id, this.course)
        .then(response => {console.log(response.data);
        this.course = {};
        this.$router.push({name :'courseList'})});
    }
    },
    created(){
      CourseService.getCourse(this.id)
        .then(response => {this.course = response.data});
    },
    computed: {

    }
}


</script>

<style scopedx>
</style>
