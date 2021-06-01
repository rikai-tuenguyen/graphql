package com.example.demo.services;


import com.example.demo.model.Author;

import java.util.List;

public interface AuthorService {
    List<Author> findAllAuthors();
    Author createAuthor(Author author);
    List<Author> top100Author();
}