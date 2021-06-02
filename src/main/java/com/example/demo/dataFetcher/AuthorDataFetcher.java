package com.example.demo.dataFetcher;

import com.example.demo.model.Author;
import com.example.demo.services.AuthorService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import java.util.List;

@DgsComponent
public class AuthorDataFetcher {

	private final AuthorService authorService;

  public AuthorDataFetcher(AuthorService authorService) {
    this.authorService = authorService;
}

  @DgsQuery
  public List<Author> findAllAuthors() {
    return authorService.findAllAuthors();
  }

  @DgsQuery
  public List<Author> top100Author() {
    return authorService.top100Author();
  }

  @DgsMutation
  public Author createAuthor(@InputArgument String name, Integer age) {
  	Author author = new Author(name, age);
  	Author newAuthor = authorService.createAuthor(author);

		return newAuthor;
  }
}