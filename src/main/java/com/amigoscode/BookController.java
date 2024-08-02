package com.amigoscode;

import java.util.List;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class BookController {

    // Query mapped to books in schema.graphqls
    @QueryMapping
    public List<Book> books() {
        return Book.books;
    }

}
