package com.adichi.gql.transformer;

import com.adichi.gql.dto.AuthorDTO;
import com.adichi.gql.dto.PostDTO;
import com.adichi.gql.entity.Author;
import com.adichi.gql.entity.Post;

import java.util.List;

import static java.util.stream.Collectors.toList;

public final class EntityTransformer {

    public static PostDTO transformPost(Post post) {

        PostDTO dto = new PostDTO();
        dto.setId(post.getId());
        dto.setMsg(post.getMsg());
        dto.setCategory(post.getCategory());
        dto.setAuthorId(post.getAuthor().getId());
        return dto;
    }

    public static List<PostDTO> transformPosts(List<Post> posts) {

        return posts
                .stream()
                .map(EntityTransformer::transformPost)
                .collect(toList());
    }

    public static AuthorDTO transformAuthor(Author author) {

        AuthorDTO dto = new AuthorDTO();
        dto.setId(author.getId());
        dto.setName(author.getName());
        dto.setEmail(author.getEmail());
        dto.setPostIds(author.getPosts()
                .stream()
                .map(Post::getId)
                .collect(toList()));
        return dto;
    }

    public static List<AuthorDTO> transformAuthors(List<Author> authors) {

        return authors
                .stream()
                .map(EntityTransformer::transformAuthor)
                .collect(toList());
    }
}
