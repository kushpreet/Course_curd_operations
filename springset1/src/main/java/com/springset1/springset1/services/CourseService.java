package com.springset1.springset1.services;

import com.springset1.springset1.entities.Course;
import lombok.Data;
import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface CourseService {
    public List<Course> getCourses();
    public Course getCourse(long courseId);
    public Course addCourse(Course course);
    public Course updateCourse(Course course);
    public Course deleteCourse(long parseLong); }