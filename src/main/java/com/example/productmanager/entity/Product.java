package com.example.productmanager.entity;

import lombok.Data;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Table (name = "product")
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id",nullable = false,updatable = false)
    private Integer id;

    @Column (name = "name",nullable = true)
    private String name;

    @Column (name = "price",nullable = true)
    private Integer price;

    @Column (name = "image_url",nullable = true)
    private String imageUrl;

    @Column (name = "category_id",nullable = true)
    private Integer categoryId;

}
