package com.blog.restapp.repositories;

import com.blog.restapp.model.Posts;
import com.blog.restapp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
    @Query("select u from Users u")
    List<Users> findAllUsers();
}
