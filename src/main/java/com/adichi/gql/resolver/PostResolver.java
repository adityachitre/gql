package com.adichi.gql.resolver;

import com.adichi.gql.entity.Author;
import com.adichi.gql.entity.Post;
import com.adichi.gql.service.AuthorService;
import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PostResolver implements GraphQLResolver<Post> {

    private final AuthorService authorService;

    @Autowired
    public PostResolver(AuthorService authorService) {
        this.authorService = authorService;
    }

    public Author getAuthor(Post post) {

        return authorService.getAuthor(post.getAuthor().getId());
    }

}
