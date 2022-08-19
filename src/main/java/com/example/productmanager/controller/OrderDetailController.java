package com.example.productmanager.controller;

import com.example.productmanager.entity.Order;
import com.example.productmanager.entity.OrderDetail;
import com.example.productmanager.repository.OrderDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/orderdetail")
public class OrderDetailController {
    @Autowired
    public OrderDetailRepository orderDetailRepository;

    @GetMapping("list")
    public List<OrderDetail> getAll() {
        return orderDetailRepository.findAll();
    }

    @PostMapping("create")
    public String create(@RequestBody OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
        return "Success";
    }

    @PostMapping("update")
    public String update(@RequestBody OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
        return "Success";
    }

    @PostMapping("delete")
    public String delete(@RequestBody OrderDetail orderDetail) {
        orderDetailRepository.delete(orderDetail);
        return "Success";
    }

}
