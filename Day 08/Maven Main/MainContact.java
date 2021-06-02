package com.Capgemini.CntctManager;

public class MainContact {

	public static void main(String[] args) {
		Contact c = new Contact();
		c.readDetails();
		String output = c.displayDetails();
		System.out.println(output);

	}

}
