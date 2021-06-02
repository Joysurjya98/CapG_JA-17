package com.capgemini.Book.exception;

public class BookAlreadyFound extends Exception {
	public String toString() {
        return "Book already exists";
    }
}
