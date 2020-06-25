package com.blog.restapp.repositories;

import com.blog.restapp.model.Posts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<Posts, Long> {

    @Query("select p from Posts p where p.createdBy = ?1")
    List<Posts> findAllPostByUserId(Long id);
}
