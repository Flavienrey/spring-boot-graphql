package com.flavien;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Represents an Author with an id and name.
 * This is a record class which provides a compact syntax for declaring
 * immutable data classes.
 * 
 * <p>
 * Example usage:
 * </p>
 * 
 * <pre>{@code
 * Author author = new Author(1, "Harlan Coben");
 * }</pre>
 * 
 * <p>
 * This class also provides a static list of predefined authors and a method to
 * retrieve an author by their id.
 * </p>
 * 
 * @param id   the unique identifier of the author
 * @param name the name of the author
 */
public record Author(Integer id, String name) {

    /**
     * A static list of predefined authors.
     * This list contains instances of the {@link Author} class, each representing
     * an author with a unique ID and name.
     */
    public static List<Author> authors = Arrays.asList(
            new Author(1, "Harlan Coben"),
            new Author(2, "Michael Connely"),
            new Author(3, "Stephen King"),
            new Author(4, "Mary Clark Higgins"));

    /**
     * Retrieves an Author by their unique identifier.
     *
     * @param requestedId the unique identifier of the Author to be retrieved
     * @return an Optional containing the Author if found, or an empty Optional if
     *         not found
     */
    public static Optional<Author> getAuthorById(Integer requestedId) {
        return authors.stream().filter(b -> b.id.equals(requestedId)).findFirst();
    }

}
