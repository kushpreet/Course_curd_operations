package com.springset1.springset1.dao;
import com.springset1.springset1.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {



}