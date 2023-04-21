package com.Teaching.Controller;

import com.Teaching.entity.Chapter.Chapter;
import com.Teaching.reprositery.ChapterRepositery;
import com.Teaching.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class ChapterController {

    @Autowired
    private ChapterService service;

    @Autowired
    private ChapterRepositery repositery;

   @RequestMapping(value = "/chapter", method = RequestMethod.POST)
    public Chapter saveChapter(@RequestBody Chapter chapter){
        return this.service.saveChapter(chapter);
    }

    @RequestMapping(value = "/chapter", method = RequestMethod.GET)
    public List<Chapter> getAllChapter(){
        return this.service.allChapter();
    }

    @GetMapping("/course/{course}")
    public List<Chapter> allData(@PathVariable String course){
       return this.repositery.findByCourseName(course);
    }
}
