package com.amazon.seller.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Table
@Data
@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long id;
    public String fname;
    public String lname;
    public String mobile;
    public String email;
    public String password;
    public String recordCreated;
}
