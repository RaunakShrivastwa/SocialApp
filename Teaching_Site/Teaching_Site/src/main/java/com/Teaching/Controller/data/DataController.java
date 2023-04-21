package com.Teaching.Controller.data;
import com.Teaching.entity.Chapter.Chapter;
import com.Teaching.reprositery.ChapterRepositery;
import com.Teaching.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class DataController {

    // for thr 
    @Autowired
    private ChapterRepositery repositery;

    @Autowired
    private ChapterService service;
    @GetMapping("/lec/{id}")
    public String lec1(@PathVariable long id, Model model){
        Chapter link=this.service.singleData(id);
        List<Chapter> userList=this.repositery.findByCourseName(link.getCourseName());
        model.addAttribute("userList", userList);
        model.addAttribute("link", link);
        return "lec1";
    }

    @GetMapping("/Decr/{id}")
    public String lec1Decr(@PathVariable long id, Model model){
        System.out.println(id);
        if(id!=1){
            Chapter link=this.service.singleData(id-1);
            List<Chapter> userList=this.repositery.findByCourseName(link.getCourseName());
            model.addAttribute("userList", userList);
            model.addAttribute("link", link);
            return "lec1";
        }else{
            Chapter link=this.service.singleData(id);
        List<Chapter> userList=this.repositery.findByCourseName(link.getCourseName());
        model.addAttribute("userList", userList);
        model.addAttribute("link", link);
        return "lec1";
        }
        
    }

    @GetMapping("/Incr/{id}")
    public String lec1Incr(@PathVariable long id, Model model){
        id=id+1;
        Chapter link=this.service.singleData(id);
        List<Chapter> userList=this.repositery.findByCourseName(link.getCourseName());
        model.addAttribute("userList", userList);
        model.addAttribute("link", link);
        return "lec1";
    }
}
