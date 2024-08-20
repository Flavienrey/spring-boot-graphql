package com.amigoscode;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public record Author(Integer id, String name) {

    public static List<Author> authors = Arrays.asList(
            new Author(1, "Harlan Coben"),
            new Author(2, "Michael Connely"),
            new Author(3, "Stephen King"),
            new Author(4, "Mary Clark Higgins"));

    public static Optional<Author> getAuthorById(Integer requestedId) {
        return authors.stream().filter(b -> b.id.equals(requestedId)).findFirst();
    }

}
