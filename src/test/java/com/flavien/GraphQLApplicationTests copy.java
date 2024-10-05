package com.flavien;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.graphql.GraphQlTest;
import org.springframework.graphql.test.tester.GraphQlTester;

/**
 * Test class for the BookController using GraphQL.
 */
@GraphQlTest(BookController.class)
class GraphQLBookControllerTests {

    @Autowired
    private GraphQlTester graphQlTester;

    /**
     * Test to verify that the GraphQL query for books returns a list of 4 books.
     */
    @Test
    void canGetBook() {
        graphQlTester.documentName("books").execute().path("books").entityList(Book.class).hasSize(4);
    }

}
