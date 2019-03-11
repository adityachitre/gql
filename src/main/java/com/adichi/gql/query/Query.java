package com.adichi.gql.query;

import com.adichi.gql.entity.Post;
import com.adichi.gql.service.PostService;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private final PostService postService;

    @Autowired
    public Query(PostService postService) {
        this.postService = postService;
    }

    public List<Post> recentPosts() {

        return postService.getRecentPosts();
    }
}
