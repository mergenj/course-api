package com.springboot.coursesapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;



    @GetMapping("/topics/{topicId}/courses")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return courseService.getAllCourses(topicId);
    }

    @GetMapping("/topics/{topicId}/courses/{id}")
    public Course getCourseById(@PathVariable String id){
        return courseService.getCourseById(id);
    }

    @PostMapping("/topics/{topicId}/courses")
    public void addCourse(@PathVariable String topicId,@RequestBody Course course) {
        courseService.addCourse(topicId, course);
    }

    @PutMapping("/topics/{topicId}/courses/{id}")
    public void updateCourseById(@PathVariable String topicId, @RequestBody Course course){
        courseService.updateCourseById(topicId, course);
    }

    @DeleteMapping("/topics/{topicId}/courses/{id}")
    public void deleteCourseById(@PathVariable String id){
        courseService.deleteCourseById(id);
    }
}
