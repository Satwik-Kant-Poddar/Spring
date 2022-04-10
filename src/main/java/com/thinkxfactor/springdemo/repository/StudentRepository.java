package com.thinkxfactor.springdemo.repository;

import com.thinkxfactor.springdemo.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.*;
public interface StudentRepository extends JpaRepository<Student,Long> {
   List<Student> findByName( String a);   
}
