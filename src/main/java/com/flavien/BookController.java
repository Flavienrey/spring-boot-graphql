package com.flavien;

import java.util.List;
import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    // Query mapped to books in schema.graphqls
    @QueryMapping
    public List<Book> books() {
        return Book.books;
    }

    // Query mapped to bookById in schema.graphqls
    @QueryMapping
    public Optional<Book> bookById(@Argument("id") Integer id) {
        return Book.getBookById(id);
    }

    // Mapping the Author to the associated books
    @SchemaMapping
    public Optional<Author> author(Book book) {
        return Author.getAuthorById(book.authorId());
    }

}
