package com.Teaching.reprositery;


import com.Teaching.entity.Chapter.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepositery extends JpaRepository<Course,Long> {
    
}
