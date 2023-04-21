package com.Teaching.service;

import com.Teaching.entity.Chapter.Chapter;

import java.util.List;

public interface ChapterService {
    Chapter saveChapter(Chapter chapter);

    List<Chapter> allChapter();

    Chapter singleData(Long l);
}
