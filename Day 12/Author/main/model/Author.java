package com.capgemini.Author.model;

/**
 * 
 * @author joysu
 *
 */

public class Author {
	/**
	 * name is for Name
	 * email is for EmailID
	 * gender is for Gender
	 */
	private String name;
	private String email;
	private char gender;
	
	/**
	 * default constructor of class author.java
	 */
	public Author() {
		super();
	}
	
	/**
	 * parameterized constructor for author class
	 * @param name
	 * @param email
	 * @param gender
	 */
	public Author(String name, String email, char gender) {
		super();
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	/**
	 *getName returns the name 
	 *@return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 *accepts the name 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 *getEmail returns the email 
	 *@return email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 *accepts the email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 *getGender returns the gender
	 *@return gender
	 */
	public char getGender() {
		return gender;
	}
	
	/**
	 *accepts the gender
	 * @param gender
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + gender;
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
		Author other = (Author) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (gender != other.gender)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Author [name =" + name + ", email =" + email + ", gender =" + gender + "]";
	}
	
	/**
	 * validates name
	 */
	public void validateName() {
		if (this.name.isBlank())
			throw new RuntimeException("Name cannot be null or empty");
	}
	
	/**
	 * validates email
	 */
	
	public void validateEmail() {
		if (this.email.isBlank())
			throw new RuntimeException("Email cannot be null or empty");
		if(!this.email.contains("@"))
			throw new RuntimeException("Email should contain a @");
	}
	
	/**
	 * validates gender
	 */

	public void validateGender() {
		if (this.gender != 'm' || this.gender != 'f' || this.gender != 'u')
			throw new RuntimeException("Gender should be either m or f or u");
	}

}
