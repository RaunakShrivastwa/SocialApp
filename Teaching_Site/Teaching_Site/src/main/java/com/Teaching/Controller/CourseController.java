package com.Teaching.Controller;
import com.Teaching.entity.Chapter.Course;
import com.Teaching.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {
    
    @Autowired
    private CourseService service;

    @PostMapping("/course")
    public Course saveCourse(@RequestBody Course course){
        return this.service.saveCourse(course);
    }

    @GetMapping("/course")
   public List<Course> allCourses(){
        return this.service.allCourse();
    }
}
