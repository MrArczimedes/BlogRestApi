package com.blog.restapp.controller.dto;

import com.blog.restapp.model.Users;
import org.apache.catalina.User;

import java.util.List;
import java.util.stream.Collectors;

public class UsersDTOMapper {
    private UsersDTOMapper() {
    }

    public static List<UsersDTO> mapToUsersDTOs(List<Users> users){
        return users.stream()
                .map(user -> mapToUsersDTO(user))
                .collect(Collectors.toList());
    }

    private static UsersDTO mapToUsersDTO(Users users) {
        return UsersDTO.builder()
                .nick(users.getNick())
                .name(users.getName())
                .surname(users.getSurname())
                .age(users.getAge())
                .build();
    }
}
