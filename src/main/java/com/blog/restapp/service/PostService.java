package com.blog.restapp.service;

import com.blog.restapp.model.Posts;
import com.blog.restapp.repositories.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {
    private PostRepository postRepository;

    public List<Posts> getPostsById(Long id){
        return postRepository.findAllPostByUserId(id);
    }
}
