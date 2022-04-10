package com.thinkxfactor.springdemo.controllers;

import java.util.List;

import com.thinkxfactor.springdemo.entity.Admin;
import com.thinkxfactor.springdemo.repository.AdimRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    AdimRepository adminTable;

   @PostMapping("/add")
   public String add(@RequestBody Admin a){
       adminTable.save(a);
       return "admin saved";
   }

   @GetMapping("/delete")
   public String delete(@RequestParam long a){
       adminTable.deleteById(a);
       return "deleted";
   }

   @PostMapping("/update")
   public String update(@RequestBody Admin a){
       adminTable.save(a);
       return "updated";
   }

   @GetMapping("/getall")
   public List<Admin> getAll(){
       return adminTable.findAll();
   }
    
}
