package com.Capgemini.CntctManager;

import java.util.Scanner;

public class Contact {
	private String firstName;
	private String lastName;
	private String mobileNumber;
	
	
//	Constructor
	public Contact() { }
	
	public Contact(String firstName, String lastName, String mobileNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobileNumber = mobileNumber;
 }
	
//	Getters
	public String getFirstName() { return firstName; }
	
	public String getLastName() { return lastName; }
	public String getMobileNo() { return mobileNumber; }
	
//	Setters
	public void setFirstName(String firstName) { this.firstName = firstName; }
	public void setLastName(String lastName) { this.lastName = lastName; }
	public void setMobielNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }
	
//	Methods
	public String validateFirstName(String firstName) { return firstName == null ? "First Name cannot be null" : "First name is valid"; }
	public String validateLastName(String lastName) { return lastName == null ? "Lastname cannot be null" : "Last name is valid";	}
	
	public String validateMobileNo(String mobileNumber) {
		if (mobileNumber.length() != 10)
			return "Mobile number cannot be less than 10 digits!";
		else if (mobileNumber.matches("\\d+"))
			 return "Mobile number can contain only digits!";
		else if (!mobileNumber.startsWith("9"))
			return "Mobile number should start with 9!";
		else
			return "Mobile Number is valid";
	}
	
	public void readDetails() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the details of contact: ");
		
		System.out.print("Enter the first name: ");
		System.out.println(validateFirstName(firstName = sc.nextLine()));
		System.out.print("Enter the last name: ");
		System.out.println(validateLastName(lastName = sc.nextLine()));
		System.out.print("Enter the mobile number: ");
		System.out.println(validateMobileNo(mobileNumber = sc.nextLine()));
		
		sc.close();
	}
	
	public String displayDetails() {
		return "The details of contact are:\nFirst Name: " + firstName + "\nLast Name: " + lastName + "\nMobile Number: " + mobileNumber + "\n";
	}
}
