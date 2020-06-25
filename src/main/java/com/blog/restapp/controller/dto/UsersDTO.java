package com.blog.restapp.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UsersDTO {
    private String name;
    private String surname;
    private int age;
    private String nick;
}
