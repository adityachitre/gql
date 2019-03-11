package com.adichi.gql.service;

import com.adichi.gql.entity.Post;

import java.util.List;

public interface PostService {

    List<Post> getRecentPosts();
}
