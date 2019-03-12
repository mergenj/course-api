package com.springboot.coursesapi.course;

import com.springboot.coursesapi.topic.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;



    public List<Course> getAllCourses(String topicId) {
        return courseRepository.findByTopicId(topicId);
    }

    public Course getCourseById(String id) {
        return courseRepository.findById(id).get();
    }

    public void addCourse(String topicId, Course course) {
        course.setTopic(new Topic(topicId));
        courseRepository.save(course);
    }

    public void updateCourseById(String topicId, Course course) {
        course.setTopic(new Topic(topicId));
        courseRepository.save(course);
    }

    public void deleteCourseById(String id) {
        courseRepository.deleteById(id);
    }
}