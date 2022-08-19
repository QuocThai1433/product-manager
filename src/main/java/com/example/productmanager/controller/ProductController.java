package com.example.productmanager.controller;

import com.example.productmanager.controller.interfaces.IProductController;
import com.example.productmanager.entity.Product;
import com.example.productmanager.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductController implements IProductController {
    private final ProductRepository productRepository;

    @Override
    public ResponseEntity<List<Product>> getAll() {
        return ResponseEntity.ok(productRepository.findAll());
    }

    @Override
    public ResponseEntity<?> create(Product product) {
        return ResponseEntity.ok(productRepository.save(product));
    }

    @Override
    public ResponseEntity<?> update(Product product) {
        return ResponseEntity.ok(productRepository.save(product));
    }

    @Override
    public ResponseEntity<?> delete(Integer id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok(id);
    }

}
