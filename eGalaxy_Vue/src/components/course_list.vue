<template lang="html">
<div class="panel panel-primary">
    <div class="panel-heading">
        <div class="well" style="color:brown">
            <h3>List of Courses</h3>
        </div>
    </div>
    <div class="panel-body">
        <table class="table table-striped">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Author</th>
                    <th>Descrption</th>
                    <th>Price</th>
                    <th>Actions</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for = "course in courses" :key = "course.Author">
                    <td>{{course.courseName}}</td>
                    <td>{{course.courseAuthor}}</td>
                    <td>{{course.courseDiscription}}</td>
                    <td>{{course.coursePrice | currency }}</td>
                    <td><button  @click = "deleteCourse(course.id)" class="btn btn-danger">Delete</button>
                        <button  @click = "updateCourse(course.id)" class="btn btn-warning" style="margin-left: 10px">Update</button>
                        <button  @click = "courseDetails(course.id)" class="btn btn-success" style="margin-left: 10px">Details</button>
                    </td>
                </tr>
            </tbody>
        </table>
    </div>
</div>
  
</template>

<script lang="js">
  import CourseService from '../services/CourseService';
  export default  {
    name: 'test',
    props: [],
    mounted () {
    },
    
    data () {
      return {
          courses: {}
      }
    },
    created()
    {
      //this.courseList();
    },
    beforeMount()
    {
      this.courseList();
    },
    methods: {
      courseDetails(id)
      {
        this.$router.push({name :'courseDetails', params:{id : id}})
      },
      updateCourse(id)
      {
        this.$router.push({name :'updateCourse', params:{id : id}})
      },
      deleteCourse(id)
      {
        CourseService.deleteCourse(id)
        .then(response => {console.log(response.data);
          this.courseList();
        }); 
      },
      courseList()
      {
        console.log("in course list");
        CourseService.getCourses().then(response => {
             this.courses = response.data
         });
      }

    },
    computed: {

    }
}


</script>

<style scoped>
 
</style>
