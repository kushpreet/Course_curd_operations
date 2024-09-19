package com.springset1.springset1.controller;

import com.springset1.springset1.entities.Course;
import com.springset1.springset1.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    private CourseService courseService;


    @GetMapping("/home")
    public String home() {
        return "Hello World";

    }

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId) {
        return this.courseService.getCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);

    }
    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return this.courseService.updateCourse(course);
    }
    public Course deleteCourse(@PathVariable String courseId) {

        return this.courseService.deleteCourse(Long.parseLong(courseId));
    }
}