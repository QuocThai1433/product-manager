package com.example.productmanager.controller.interfaces;

import com.example.productmanager.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/api/v1/product/")
public interface IProductController {
    @GetMapping("list")
    ResponseEntity<List<Product>> getAll();
    @PostMapping("info")
    ResponseEntity<?> create(@RequestBody Product product);
    @PutMapping("info")
    ResponseEntity<?> update(@RequestBody Product product);
    @DeleteMapping("{id}/info")
    ResponseEntity<?> delete(@PathVariable Integer id);
}
