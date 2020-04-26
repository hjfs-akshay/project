import axios  from 'axios';


export default
{
    getCourses()
    {
        return axios.get('/courses');
    },

    addCourse(course)
    {
        return axios.post('/courses',course);
    },

    getCourse(id)
    {
        return axios.get('/courses/' + id);
    },

    updateCourse(id, course)
    {
        return axios.put('/courses/' + id, course);
    },

    deleteCourse(id)
    {
        return axios.delete('/courses/' + id)
    }
}