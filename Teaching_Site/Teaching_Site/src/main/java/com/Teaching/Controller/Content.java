package com.Teaching.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Content {

    @GetMapping("/javaContent")
    public String javaContent(){
        return "/JavaCourseDataContent/JavaContent/javaContent";
    }
}
