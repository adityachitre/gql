package com.adichi.gql.service.impl;

import com.adichi.gql.entity.Post;
import com.adichi.gql.repository.PostRepository;
import com.adichi.gql.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    @Autowired
    public PostServiceImpl(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public List<Post> getRecentPosts() {

        return postRepository.findAll();
    }
}
