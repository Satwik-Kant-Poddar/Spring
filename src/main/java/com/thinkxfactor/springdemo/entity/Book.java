package com.thinkxfactor.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_book")
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id ; 

    @Column(name = "name")
    private String name;

    @Column(name = "isbn")
    private String isbn;
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getISBN() {
        return isbn;
    }
    public void setISBN(String iSBN) {
        isbn= iSBN;
    }
    
}
