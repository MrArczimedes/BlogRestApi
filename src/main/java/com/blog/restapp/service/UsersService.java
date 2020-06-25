package com.blog.restapp.service;

import com.blog.restapp.model.Posts;
import com.blog.restapp.model.Users;
import com.blog.restapp.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.LinkedList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsersService {
    private final UsersRepository usersRepository;

    public List<Users> findAll() {
        return usersRepository.findAllUsers();
    }

    public List<Users> findSingleUserByNick(String nick) {
        List<Users> users = new LinkedList<>();
        users.addAll(usersRepository.findAllByNick(nick));
        users.addAll(usersRepository.findAllByName(nick));
        users.addAll(usersRepository.findAllBySurname(nick));
        return users;
    }
    public Users findSingleUserById(Long id){
        return usersRepository.findByUserId(id);
    }

    public Users addUser(Users users) {
        return usersRepository.save(users);
    }
}
