package org.csci4050.bookstore.Bookstore.exceptions;

public class ValidationException extends Exception {

    public ValidationException(final String message, final String... params) {
        super(String.format(message, params));
    }
}
