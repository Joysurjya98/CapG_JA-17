package com.capgemini.cmapp.model;

/**
 * 
 * @author Joysurjya
 *
 */

public class Contact {
	/**
	 * fname is for firstName
	 * lname is for last name
	 * phnNo is for phone number
	 */
	private String fname;
	private String lname;
	private String phnNo;
	/**
	 * default constructor of class contact.java
	 */
	public Contact() {

	}

	/**
	 * parameterized constructor for contact class
	 * @param fname
	 * @param lname
	 * @param phnNo
	 */
	public Contact(String fname, String lname, String phnNo) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.phnNo = phnNo;
	}
	/**
	 *getFname returns the first name 
	 *@return fname
	 */
	public String getFname() {
		return fname;
	}
	/**
	 *accepts the first name 
	 * @param fname
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}
	/**
	 * getLname returns the first name 
	 * @return lname 
	 */
	public String getLname() {
		return lname;
	}
	/**
	 * accepts the Last name 
	 * @param lname
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	/**
	 * getPhnNo returns the Phone number 
	 * @return phnNo
	 */
	public String getPhnNo() {
		return phnNo;
	}
	/**
	 * accepts the phone number
	 * @param phnNo
	 */
	public void setPhnNo(String phnNo) {
		this.phnNo = phnNo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fname == null) ? 0 : fname.hashCode());
		result = prime * result + ((lname == null) ? 0 : lname.hashCode());
		result = prime * result + ((phnNo == null) ? 0 : phnNo.hashCode());
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
		Contact other = (Contact) obj;
		if (fname == null) {
			if (other.fname != null)
				return false;
		} else if (!fname.equals(other.fname))
			return false;
		if (lname == null) {
			if (other.lname != null)
				return false;
		} else if (!lname.equals(other.lname))
			return false;
		if (phnNo == null) {
			if (other.phnNo != null)
				return false;
		} else if (!phnNo.equals(other.phnNo))
			return false;
		return true;
	}
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Contact [fname=" + fname + ", lname=" + lname + ", phnNo=" + phnNo + "]";
	}
	
	/**
	 * validates first name
	 */
	public void validateFirstName() {
		if (this.fname.isBlank())
			throw new RuntimeException("First Name cannot be null or empty");
	}
	
	/**
	 * validates last name
	 */
	
	public void validateLastName() {
		if (this.lname.isBlank())
			throw new RuntimeException("Last Name cannot be null or empty");
	}
	
	/**
	 * validates PhNo
	 */

	public void validatePhNo() {
		if (this.phnNo.isBlank())
			throw new RuntimeException("Phone number cannot be null or empty");
		if (this.phnNo.length() != 11)
			throw new RuntimeException("Phone number should be 11 digits long.");
		if (!this.phnNo.matches("\\d+"))
			throw new RuntimeException("Phone number should contain only digits!");
		if (!this.phnNo.startsWith("0"))
			throw new RuntimeException("Phone number should start with 0");
	}
}
