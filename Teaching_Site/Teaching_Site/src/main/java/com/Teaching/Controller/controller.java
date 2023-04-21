package com.Teaching.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
   @GetMapping("/home")
    public String Home(){
        return "/home";
    }

    @GetMapping("/about")
    public String About(){
        return "/about";
    } 

    @GetMapping("/bca")
    public String Bca(){
        return "bca";
    }

   @GetMapping("/mca")
    public String Mca(){
        return "mca";
    }

    @GetMapping("/java")
    public String javaContent(){
        return "java";
    }

    @GetMapping("/c")
    public String c(){
        return "c";
    }

   @GetMapping("/c++")
    public String c1(){
        return "c++";
    }

    
    @GetMapping("/dataScience")
    public String dataScience(){
        return "dataScience";
    }

    
    @GetMapping("/dsa")
    public String dsa(){
        return "dsa";
    }

    
    @GetMapping("/javaBackend")
    public String javaBackend(){
        return "javaBackend";
    }

   
    @GetMapping("/resume")
    public String resume(){
        return "resume";
    }

   @GetMapping("/web")
    public String web(){
        return "web";
    }

   @GetMapping("/loginPage")
    public String DoLogin(){
        return "login";
    }

    @GetMapping("/register")
    public String Registration(){
        return "register";
    }

   
    @PostMapping("/postData")
    public String postData(){
        
        return "redirect:register";
    }

    @GetMapping("/access")
    public String Denie(){
        return "denied";
    }
}
