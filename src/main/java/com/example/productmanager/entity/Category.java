package com.example.productmanager.entity;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Table(name = "Category")
@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id",nullable = false,updatable = false)
    private Integer id;

    @Column(name = "cate_name")
    private String catename;

}
