package com.example.productmanager.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Integer id;

    @Column(name = "total_price")
    private Float totalPrice;

    @Column(name = "date_created")
    private Date dateCreated;

    @Column(name = "user_id")
    private Integer userid;


}
