package com.Teaching.Controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Teaching.entity.Student;
import com.Teaching.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/postData")
    public String saveUser(@RequestParam("fName") String fName,
                           @RequestParam("lName") String lName,
                           @RequestParam("email") String email,
                           @RequestParam("password") String password,
                           @RequestParam("dob") String dob,
                           @RequestParam("number") String number,
                           @RequestParam("height") String height,
                           @RequestParam("weight") String weight,
                           @RequestParam("gender") String gender){
                            BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
                            String encode = bCryptPasswordEncoder.encode(password);

                            Student student=Student.builder()
                                         .id(UUID.randomUUID().toString())
                                          .dob(dob)
                                          .email(email)
                                          .fName(fName)
                                          .lName(lName)
                                          .gender(gender)
                                          .lName(lName)
                                          .password(encode)
                                          .height(height)
                                          .role("ROLE_NORMAL")
                                          .weight(weight)
                                          .number(number)
                                          .build();
              

                this.service.saveStudent(student);
                return "redirect:/register";
                           }
    
}
