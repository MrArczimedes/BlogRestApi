package com.blog.restapp.controller;


import com.blog.restapp.model.Users;
import com.blog.restapp.service.UsersService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {

    private UsersService usersService;

    @GetMapping("/users")
    public List<Users> getUsers(Model model) {
        return usersService.findAll();
    }
}
