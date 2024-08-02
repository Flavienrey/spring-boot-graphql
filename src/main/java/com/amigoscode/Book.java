package com.amigoscode;

import java.util.Arrays;
import java.util.List;

public record Book(Integer id, String name, Integer pageCount) {

    public static List<Book> books = Arrays.asList(
            new Book(1, "Bible", 302),
            new Book(2, "Quran", 404),
            new Book(3, "Foobar", 508),
            new Book(4, "Java Development", 12));

}
