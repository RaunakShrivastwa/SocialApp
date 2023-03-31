package com.Teaching.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller {
   @GetMapping("/home")
    public String Home(){
        return "home.html";
    }
}
