package com.example.productmanager.entity;

import lombok.Data;

import javax.persistence.*;

@Table(name = "order_detail")
@Entity
@Data
public class OrderDetail {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Integer Id;

    @Column (name = "quantity",nullable = true)
    private Integer quantity;

    @Column (name = "amount",nullable = true)
    private Float amount;

    @Column (name = "product_id",nullable = true)
    private Integer productid;

    @Column (name = "order_id",nullable = true)
    private Integer orderid;

    @Column (name = "user_id",nullable = true)
    private Integer userid;



}
