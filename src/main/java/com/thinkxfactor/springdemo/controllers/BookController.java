package com.thinkxfactor.springdemo.controllers;

import java.util.*;
import com.thinkxfactor.springdemo.entity.Book;
import com.thinkxfactor.springdemo.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookRepository bookTable;

   @PostMapping("/add")
   public String add(@RequestBody Book a){
       bookTable.save(a);
       return "book added";
   }

   @GetMapping("/delete")
   public String delete(@RequestParam long a){
       bookTable.deleteById(a);
       return "deleted";
   }

   @PostMapping("/update")
   public String update(@RequestBody Book a){
       bookTable.save(a);
       return "updated";
   }

   @GetMapping("/getall")
   public List<Book> getAll(){
       return bookTable.findAll();
   }

}
