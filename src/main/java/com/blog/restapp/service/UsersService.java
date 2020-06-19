package com.blog.restapp.service;

import com.blog.restapp.model.Posts;
import com.blog.restapp.model.Users;
import com.blog.restapp.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {
    private UsersRepository usersRepository;

    public List<Users> findAll() {
        return usersRepository.findAll();
    }
}
