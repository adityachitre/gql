package com.adichi.gql.init;

import com.adichi.gql.entity.Author;
import com.adichi.gql.entity.Post;
import com.adichi.gql.repository.AuthorRepository;
import com.adichi.gql.repository.PostRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class DatabaseLoader {

    @Bean
    CommandLineRunner initDatabase(AuthorRepository authorRepository, PostRepository postRepository) {
        return args -> {

            Author author = authorRepository.save(createAuthor("John Smith", "john@smith.com"));
            Post post = createPost("Hahaha!! LOL!! ROFL!!", "How to write clean code?");
            post.setAuthor(author);
            log.info("Pre-loading: " + postRepository.save(post));
        };
    }

    private Author createAuthor(String name, String email) {

        Author author = new Author();
        author.setName(name);
        author.setEmail(email);
        return author;
    }

    private Post createPost(String msg, String category) {

        Post post = new Post();
        post.setMsg(msg);
        post.setCategory(category);
        return post;
    }
}
