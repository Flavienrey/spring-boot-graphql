package com.flavien;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Represents a Book with an id, name, page count, and author id.
 * This class also provides a static list of books and a method to retrieve a
 * book by its id.
 * 
 * @param id        the unique identifier of the book
 * @param name      the name of the book
 * @param pageCount the number of pages in the book
 * @param authorId  the unique identifier of the author of the book
 */
public record Book(Integer id, String name, Integer pageCount, Integer authorId) {

    /**
     * A static list of predefined books.
     */
    public static List<Book> books = Arrays.asList(
            new Book(1, "Bible", 302, 1),
            new Book(2, "Quran", 404, 2),
            new Book(3, "Foobar", 508, 3),
            new Book(4, "Java Development", 12, 4));

    /**
     * Retrieves a book by its unique identifier.
     * 
     * @param requestedId the unique identifier of the book to retrieve
     * @return an Optional containing the book if found, or an empty Optional if not
     *         found
     */
    public static Optional<Book> getBookById(Integer requestedId) {
        return books.stream().filter(b -> b.id.equals(requestedId)).findFirst();
    }

}
