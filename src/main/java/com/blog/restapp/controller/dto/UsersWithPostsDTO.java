package com.blog.restapp.controller.dto;

import com.blog.restapp.model.Posts;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.List;

@Builder
@Getter
public class UsersWithPostsDTO {
    private String name;
    private String surname;
    private int age;
    private String nick;
    private List<Posts> posts;
}
