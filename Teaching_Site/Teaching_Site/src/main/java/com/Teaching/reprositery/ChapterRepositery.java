package com.Teaching.reprositery;

import com.Teaching.entity.Chapter.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChapterRepositery extends JpaRepository<Chapter,Long> {
    List<Chapter> findByCourseName(String course);
     
}
