package com.example.productmanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.security.PrivateKey;

@Table(name = "users")
@Entity
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id",nullable = false,updatable = false)
    private Integer id;

    @Column (name = "user_name",nullable = true)
    private String name;

    @Column (name = "pass",nullable = true)
    private String pass;

    @Column (name = "gmail",nullable = true)
    private String gamil;

}
