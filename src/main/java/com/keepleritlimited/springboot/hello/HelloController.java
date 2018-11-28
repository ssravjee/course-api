package com.keepleritlimited.springboot.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")//GET is default
    public String sayHi(){
        return "Hello, World";
    }
}
