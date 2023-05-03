package com.Teaching.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class controller {
   @GetMapping("/home")
    public String Home(){
        return "/HomePage/home";
    }

    @GetMapping("/about")
    public String About(){
        return "/About/about";
    } 

    @GetMapping("/bca")
    public String Bca(){
        return "/SpecialCertificatesCourse/bca";
    }

   @GetMapping("/mca")
    public String Mca(){
        return "/SpecialCertificatesCourse/mca";
    }

    @GetMapping("/java")
    public String javaContent(){
        return "/Course/java";
    }

    @GetMapping("/c")
    public String c(){
        return "/Course/c";
    }

   @GetMapping("/c++")
    public String c1(){
        return "/Course/c++";
    }

    
    @GetMapping("/dataScience")
    public String dataScience(){
        return "/Course/dataScience";
    }

    
    @GetMapping("/dsa")
    public String dsa(){
        return "/Course/dsa";
    }

    
    @GetMapping("/javaBackend")
    public String javaBackend(){
        return "/JavaCourseDataContent/JavaAllContent/javaBackend";
    }

   
    @GetMapping("/resume")
    public String resume(){
        return "resume";
    }

   @GetMapping("/web")
    public String web(){
        return "/Course/web";
    }

   @GetMapping("/loginPage")
    public String DoLogin(){
        return "/Login/login";
    }

    @GetMapping("/register")
    public String Registration(){
        return "/Registration/register";
    }

   
    @PostMapping("/postData")
    public String postData(){
        
        return "redirect:/Registration/register";
    }

    @GetMapping("/access")
    public String Denie(){
        return "/Acess/denied";
    }
}
