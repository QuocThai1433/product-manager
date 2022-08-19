package com.example.productmanager.repository;

import com.example.productmanager.controller.OrderDetailController;
import com.example.productmanager.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Integer> {
}
