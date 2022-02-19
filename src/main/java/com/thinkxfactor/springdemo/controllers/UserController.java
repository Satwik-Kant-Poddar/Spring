package com.thinkxfactor.springdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    int count =0;
    @GetMapping("/")
    public String welcome(){
        return "welcome to the basic site";
    }
    @GetMapping("")
    public String nothing(){
        return "nothing to show";
    }
    @GetMapping("/counter")
    public String counter(){
        count++;
        return "this counter of web " +count ;
    }
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World !!!";
    }

   @GetMapping("/hello/{name}")
   public String hello(@PathVariable String name){
       return "hello "+name + "!!!";
   }
   
}
