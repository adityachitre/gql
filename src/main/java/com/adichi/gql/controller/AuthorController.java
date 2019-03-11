package com.adichi.gql.controller;

import com.adichi.gql.dto.AuthorDTO;
import com.adichi.gql.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.adichi.gql.transformer.EntityTransformer.transformAuthor;
import static com.adichi.gql.transformer.EntityTransformer.transformAuthors;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    @Autowired
    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public List<AuthorDTO> getAllAuthors() {

        return transformAuthors(authorService.getAllAuthors());
    }

    @GetMapping("/authors/{id}")
    public AuthorDTO getAuthor(@PathVariable Long id) {

        return transformAuthor(authorService.getAuthor(id));
    }
}
