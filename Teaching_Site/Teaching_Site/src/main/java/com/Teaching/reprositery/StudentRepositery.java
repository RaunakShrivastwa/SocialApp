package com.Teaching.reprositery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Teaching.entity.Student;

@Repository
public interface StudentRepositery extends JpaRepository<Student,String> {
    Student findByEmail(String UserName);
}
