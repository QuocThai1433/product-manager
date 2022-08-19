package com.example.productmanager.controller;

import com.example.productmanager.entity.Order;
import com.example.productmanager.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/order/")
public class OrderController {
    @Autowired
    public OrderRepository orderRepository;

    @GetMapping("list")
    private List<Order> getAll() {
        return orderRepository.findAll();
    }

    @PostMapping("create")
    public String create(@RequestBody Order order) {
        orderRepository.save(order);
        return "Success";
    }

    @PostMapping("update")
    public String update(@RequestBody Order order) {
        orderRepository.save(order);
        return "Success";
    }

    @PostMapping("delete")
    public String delete(@RequestBody Order order) {
        orderRepository.delete(order);
        return "Success";
    }


}
