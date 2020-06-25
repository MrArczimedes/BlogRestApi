package com.blog.restapp.controller.dto;

import com.blog.restapp.model.Users;

public class UsersWithPostsDTOMapper {

    private UsersWithPostsDTOMapper(){}

    public static UsersWithPostsDTO mapToUsersWithPostDTO(Users users){
        return UsersWithPostsDTO.builder()
                .age(users.getAge())
                .name(users.getName())
                .nick(users.getNick())
                .surname(users.getSurname())
                .posts(users.getPosts())
                .build();
    }

}
