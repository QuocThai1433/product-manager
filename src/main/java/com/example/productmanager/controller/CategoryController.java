package com.example.productmanager.controller;

import com.example.productmanager.controller.interfaces.ICategoryController;
import com.example.productmanager.entity.Category;
import com.example.productmanager.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CategoryController implements ICategoryController {
    public final CategoryRepository categoryRepository;

    @Override
    public ResponseEntity<List<Category>> getAll() {
        return ResponseEntity.ok(categoryRepository.findAll());
    }

    @Override
    public ResponseEntity<?> create(Category category) {
        return ResponseEntity.ok(categoryRepository.save(category));
    }

    @Override
    public ResponseEntity<?> update(Category category) {
        return ResponseEntity.ok(categoryRepository.save(category));
    }

    @Override
    public ResponseEntity<?> delete(Integer id) {
        categoryRepository.deleteById(id);
        return ResponseEntity.ok(id);
    }


//    @GetMapping("list")
//    public List<Category> getAll() {
//        return categoryRepository.findAll();
//    }
//
//    @PostMapping("info")
//    public String create(@RequestBody Category category)
//    {
//        categoryRepository.save(category);
//        return "Success";
//    }
//
//    @PutMapping("info")
//    public String update(@RequestBody Category category)
//    {
//        categoryRepository.save(category);
//        return "Success";
//    }
//    @DeleteMapping("info")
//    public String delete(@RequestBody Category category)
//    {
//        categoryRepository.delete(category);
//        return "Success";
//    }
}
