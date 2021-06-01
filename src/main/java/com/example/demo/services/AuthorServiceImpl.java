package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Author;
import com.example.demo.repository.AuthorRepository;

@Service
public class AuthorServiceImpl implements AuthorService {
	@Autowired
	AuthorRepository authorRepository;
	
	@Override
	 public List<Author> findAllAuthors() {
		 return authorRepository.findAll();
	}
	
	@Override
	 public Author createAuthor(Author author) {
		 return authorRepository.save(author);
	}
	
	@Override
	 public List<Author> top100Author() {
		 return authorRepository.top100Author();
	}
}
