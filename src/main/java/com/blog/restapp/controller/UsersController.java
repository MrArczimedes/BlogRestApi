package com.blog.restapp.controller;


import com.blog.restapp.controller.dto.*;
import com.blog.restapp.model.Users;
import com.blog.restapp.service.UsersService;
import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/users")
    public List<UsersDTO> getUsers() {
        return UsersDTOMapper.mapToUsersDTOs(usersService.findAll());
    }

    @GetMapping("/users/{id}/posts")
    public UsersWithPostsDTO getUsersWithPosts(@PathVariable Long id){
        return UsersWithPostsDTOMapper.mapToUsersWithPostDTO(usersService.findSingleUserById(id));
    }

    @GetMapping("/users/{nick}")
    public List<Users> getSingleUser(@PathVariable String nick) {
        return usersService.findSingleUserByNick(nick);
    }

    @PostMapping("/users/create")
    public Users addUser(@RequestBody Users users){
        return usersService.addUser(users);
    }

    
}
