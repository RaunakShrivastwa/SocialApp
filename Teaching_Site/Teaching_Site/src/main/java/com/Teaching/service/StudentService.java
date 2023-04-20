package com.Teaching.service;

import java.util.List;

import com.Teaching.entity.Student;

public interface StudentService {

    Student saveStudent(Student student);

    List<Student> getAllStudent();
    
}
