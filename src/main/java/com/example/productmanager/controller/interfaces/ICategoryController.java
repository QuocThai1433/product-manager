package com.example.productmanager.controller.interfaces;

import com.example.productmanager.entity.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/category")
public interface ICategoryController {
    @GetMapping("list")
    ResponseEntity<List<Category>> getAll();
    @PostMapping ("info")
    ResponseEntity<?> create(@RequestBody Category category);
    @PutMapping("info")
    ResponseEntity<?> update(@RequestBody Category category);
    @DeleteMapping("{id}/delete")
    ResponseEntity<?> delete(@PathVariable Integer id);

}
