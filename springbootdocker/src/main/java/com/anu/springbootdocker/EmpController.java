package com.anu.springbootdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmpController {
    @GetMapping("/hello")
    public String getName(){
        System.out.println("Hello Spring boot");
        return "Hello this is spring boot";
    }
}
