package com.adichi.gql.controller;

import com.adichi.gql.dto.PostDTO;
import com.adichi.gql.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.adichi.gql.transformer.EntityTransformer.transformPosts;

@RestController
public class PostController {

    private final PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/posts")
    public List<PostDTO> getAllPosts() {

        return transformPosts(postService.getRecentPosts());
    }
}
