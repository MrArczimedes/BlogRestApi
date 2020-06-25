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

    @Query("select u from Users u where u.nick = ?1")
    List<Users> findAllByNick(String nick);

    @Query("select u from Users u where u.name = ?1")
    List<Users> findAllByName(String nick);

    @Query("select u from Users u where u.surname = ?1")
    List<Users> findAllBySurname(String nick);

    @Query("select u from Users u where u.id = ?1")
    Users findByUserId(long id);


}
