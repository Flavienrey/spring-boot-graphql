package com.flavien;

import java.util.List;
import java.util.Optional;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

/**
 * Controller class for handling GraphQL queries related to books and authors.
 */
@Controller
public class BookController {

    /**
     * Retrieves a list of all books.
     * This method is mapped to the 'books' query in the GraphQL schema.
     *
     * @return a list of all books.
     */
    @QueryMapping
    public List<Book> books() {
        return Book.books;
    }

    /**
     * Retrieves a book by its ID.
     * This method is mapped to the 'bookById' query in the GraphQL schema.
     *
     * @param id the ID of the book to retrieve.
     * @return an Optional containing the book if found, or empty if not found.
     */
    @QueryMapping
    public Optional<Book> bookById(@Argument("id") Integer id) {
        return Book.getBookById(id);
    }

    /**
     * Retrieves the author associated with a given book.
     * This method maps the Author to the associated books in the GraphQL schema.
     *
     * @param book the book for which to retrieve the author.
     * @return an Optional containing the author if found, or empty if not found.
     */
    @SchemaMapping
    public Optional<Author> author(Book book) {
        return Author.getAuthorById(book.authorId());
    }

}
