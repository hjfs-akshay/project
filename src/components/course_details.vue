<template lang="html">

<section class="course-details">
  <h2>Employee Details</h2> 
  <hr/>
  <div>
    <div>
      <label><b>Course Name: </b></label> {{course.courseName}}
    </div>
    <div>
      <label><b>Course Author : </b></label> {{course.courseAuthor}}
    </div>
    <div>
      <label><b>Course Description: </b></label> {{course.courseDiscription}}
    </div>
    <div>
      <label><b>Course Price: </b></label> {{course.coursePrice | currency }}
    </div>  
    <br>
  <br>
  <button @click="list()" class="btn btn-primary">Back to Course List</button><br>

  </div>
</section>

</template>

<script lang="js">
  import CourseService from '../services/CourseService';
  export default  {
    
    name: 'course-details',
    props: [],
    mounted () {

    },
    data () {
      return {
        course :{}
      }
    },
    created(){
        CourseService.getCourse(this.$route.params.id)
        .then(response => {this.course = response.data});
        
    },
    methods: {
      list()
      {
        this.$router.push({name :'courseList'});
      }
    },
    computed: {

    }
}


</script>

<style scoped >
</style>
