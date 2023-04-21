package com.Teaching.service;

import com.Teaching.entity.Chapter.Course;

import java.util.List;

public interface CourseService {
    Course saveCourse(Course course);

    List<Course> allCourse();

    Course getSingle(Long id);
}
