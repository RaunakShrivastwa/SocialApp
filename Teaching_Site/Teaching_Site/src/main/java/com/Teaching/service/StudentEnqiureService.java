package com.Teaching.service;

import java.util.List;

import com.Teaching.entity.StudentEnqiure;

public interface StudentEnqiureService {

    StudentEnqiure saveStudent(StudentEnqiure student);
    List<StudentEnqiure> getAllStudent();
    
}
