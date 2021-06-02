package com.capgemini.Book.exception;

public class PriceIsNotValid extends Exception {
	public String toString() {
        return "Price can not be null or zero or negative";
    }

}
