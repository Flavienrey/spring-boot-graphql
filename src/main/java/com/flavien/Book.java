package com.flavien;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Book(Integer id, String name, Integer pageCount, Integer authorId) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Bible", 302, 1),
            new Book(2, "Quran", 404, 2),
            new Book(3, "Foobar", 508, 3),
            new Book(4, "Java Development", 12, 4));

    public static Optional<Book> getBookById(Integer requestedId) {
        return books.stream().filter(b -> b.id.equals(requestedId)).findFirst();
    }

}
