package com.Teaching.Controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Teaching.entity.StudentEnqiure;
import com.Teaching.service.StudentEnqiureService;

@Controller
public class StudentEnqiureController {

   @Autowired
   private StudentEnqiureService service;

   @GetMapping("/enquire")
    public String saveStudent(@RequestParam("userName") String userName,
                                      @RequestParam("email") String email,
                                      @RequestParam("contact") String contact){
    
       StudentEnqiure enqiure=new StudentEnqiure();
       enqiure.setId(UUID.randomUUID().toString());
       enqiure.setName(userName);
       enqiure.setEmail(email);
       enqiure.setContact(contact);
       this.service.saveStudent(enqiure);

       return "redirect:/home";
    
    }


}
