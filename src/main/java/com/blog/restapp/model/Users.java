package com.blog.restapp.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private int age;
    private String nick;
    private String password;

    @OneToMany(cascade = CascadeType.REMOVE)
    @JoinColumn(name = "createdBy", updatable = false, insertable = false)
    private List<Posts> posts;

}
