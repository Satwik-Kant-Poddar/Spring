package com.thinkxfactor.springdemo.repository;

import com.thinkxfactor.springdemo.entity.Admin;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AdimRepository extends JpaRepository<Admin,Long> {
    
}
