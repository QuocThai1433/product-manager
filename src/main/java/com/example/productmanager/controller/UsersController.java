package com.example.productmanager.controller;

import com.example.productmanager.entity.Users;
import com.example.productmanager.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users/")
public class UsersController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping ("list")
    public List<Users> getAll()
    {
        return userRepository.findAll();
    }

    @PostMapping("create")
    public String create (@RequestBody Users users)
    {
        userRepository.save(users);
        return"Success";
    }

    @PostMapping("update")
    public String update (@RequestBody Users users)
    {
        userRepository.save(users);
        return"Success";
    }

    @PostMapping("delete")
    public String delete (@RequestBody Users users)
    {
        userRepository.delete(users);
        return"Success";
    }




}
