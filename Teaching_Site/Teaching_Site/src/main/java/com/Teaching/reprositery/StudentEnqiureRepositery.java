package com.Teaching.reprositery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Teaching.entity.StudentEnqiure;

@Repository
public interface StudentEnqiureRepositery extends JpaRepository<StudentEnqiure,String> {
    
}
