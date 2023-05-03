package com.Teaching.Controller;

import com.Teaching.entity.Chapter.Chapter;
import com.Teaching.entity.Chapter.Course;
import com.Teaching.reprositery.ChapterRepositery;
import com.Teaching.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ListController {

    @Autowired
    private ChapterRepositery repositery;

    @Autowired
    private CourseService courseService;

    String name;

    @GetMapping("/ListContent/{course}")
    public String list(@PathVariable String course,Model model){
        List<Chapter> userList=this.repositery.findByCourseName(course);
        userList.stream().map(course1 ->{
          name =course1.getCourseName();
            return name;
        }).collect(Collectors.toList());
        model.addAttribute("userList",userList);
        model.addAttribute("name", name);
        return "/JavaCourseDataContent/listData";
    }

    @GetMapping("/javaContent1")
    public String CourseContent(Model model){
          List<Course> courses=this.courseService.allCourse();
          model.addAttribute("course", courses);
        return "/JavaCourseDataContent/Course";
    }
}
