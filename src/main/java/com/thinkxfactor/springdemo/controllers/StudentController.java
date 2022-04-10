package com.thinkxfactor.springdemo.controllers;

import java.util.List;

import com.thinkxfactor.springdemo.entity.Student;
import com.thinkxfactor.springdemo.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/student")
public class StudentController {
   
    @Autowired
    StudentRepository studentTable;

    @PostMapping("/add")
    public String add(@RequestBody Student a){
        studentTable.save(a);
        return "student added";
    }

    @PostMapping("/update")
    public String update(@RequestBody Student a){
        studentTable.save(a);
        return "updated" ;
    }

    @GetMapping("/delete")
    public String delete(@RequestParam long a){
        studentTable.deleteById(a);
        return "deleted";
    }

    @GetMapping("/getall")
    public List<Student> getAll(){
        return studentTable.findAll();
    }

    @GetMapping("/getnamesame")
    public List<Student> getbyname(@RequestParam String a){
        return studentTable.findByName(a);
    }

//functions to add student
//fuction to remove student 
//fuction to update student 
//find student by any feild


}
