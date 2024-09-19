package com.springset1.springset1.services;

import com.springset1.springset1.dao.CourseDao;
import com.springset1.springset1.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private CourseDao courseDao;
    List<Course> list;
    public CourseServiceImpl() {
        //  list = new ArrayList<>();
        //list.add(new Course(122, "Java","basics of java"));
        //list.add(new Course(133, "python","basics of python"));
    }

    @Override


    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId)
    {
//        Course c=null;
//        for(Course course: list){
//          if(course.getId() == courseId){
//            c=course;
//          break;
//         }
//        }
        return courseDao.findById(courseId).get();
    }

    @Override
    public Course addCourse(Course course) {
        // list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course updatedCourse) {
        //  for (Course course : list) {
        //    if (course.getId() == updatedCourse.getId()) {
        //      course.setTitle(updatedCourse.getTitle());
        //  course.setDescription(updatedCourse.getDescription());
        //return course;
        //}
        // }
        courseDao.save(updatedCourse);


        return updatedCourse;
    }

    @Override
    public Course deleteCourse(long parseLong) {
        Course entity=courseDao.getOne(parseLong);
        courseDao.delete(entity);
        return entity;
    }

}