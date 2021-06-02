package com.capgemini.Book.exception;

public class BookNotFound extends Exception {
	public String toString() {
        return "Book does not exist in the list";
    }

}
