package com.adichi.gql.service;

import com.adichi.gql.entity.Author;

import java.util.List;

public interface AuthorService {

    List<Author> getAllAuthors();

    Author getAuthor(Long id);
}
