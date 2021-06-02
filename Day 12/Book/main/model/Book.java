package com.capgemini.Book.model;

import com.capgemini.Book.exception.*;

/**
 * 
 * @author joysu
 *
 */

public class Book {
	/**
	 * bid is for Book Id
	 * bname is for Book Name
	 * price is for Book Price
	 */
	private int bid;
	private String bname;
	private double price;
	
	/**
	 * default constructor of class author.java
	 */
	public Book() {
		super();
	}
	
	/**
	 * parameterized constructor for author class
	 * @param name
	 * @param email
	 * @param gender
	 */
	public Book(int bid, String bname, double price) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.price = price;
	}
	
	/**
	 *getBid returns the book id 
	 *@return bid
	 */
	public int getBid() {
		return bid;
	}
	
	/**
	 *accepts the book id 
	 * @param bid
	 */
	public void setBid(int bid) {
		this.bid = bid;
	}
	
	/**
	 *getBname returns the book name 
	 *@return bname
	 */
	public String getBname() {
		return bname;
	}
	
	/**
	 *accepts the book name 
	 * @param bname
	 */
	public void setBname(String bname) {
		this.bname = bname;
	}

	/**
	 *getPrice returns the book price 
	 *@return price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 *accepts the book price 
	 * @param price
	 */
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bid;
		result = prime * result + ((bname == null) ? 0 : bname.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (bid != other.bid)
			return false;
		if (bname == null) {
			if (other.bname != null)
				return false;
		} else if (!bname.equals(other.bname))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		return true;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Book [Book id =" + bid + ", Book name =" + bname + ", Price =" + price + "]";
	}
	
	public void validateBookID() throws BookIDCannotBeNegative {
		if (this.bid < 0)
			throw new BookIDCannotBeNegative();
	}
	public void validateBookName() throws BookNameCannotBeNull {
		if (this.bname.isBlank())
			throw new BookNameCannotBeNull();
	}
	public void validatePrice() throws PriceIsNotValid {
		if (this.price == 0 || this.price < 0 || new Double(price) == null)
			throw new PriceIsNotValid();
	}
	
	public void checker(Book b) throws Exception {
		b.validateBookID();
		b.validateBookName();
		b.validatePrice();
	}
	
}
