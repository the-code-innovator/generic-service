package com.thecodeinnovator.genericservice.specific.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int adminId;
    @Column(length = 20)
    private String username;
    @Column(length = 20)
    private String password;
    @Column(length = 60)
    private String name;
    @Column(length = 60)
    private String surname;
    @Column(length = 254)
    private String email;
}