package com.capgemini.cmapp;

import java.util.Scanner;

import com.capgemini.cmapp.model.Contact;
import com.capgemini.cmapp.service.ContactManager;
import java.util.Collection;

public class ContactMain {

	static Scanner ip = new Scanner(System.in);
	static String fname;
	static String lname;
	static String phno;
	public static void main(String[] args) {
		ContactManager cm = new ContactManager();
		char choice='y';
		while(choice=='y'){
			System.out.println("Enter the choice");
			System.out.println("a:add contact");
			System.out.println("g:get contact list");
			char ch=ip.next().charAt(0);
		switch(ch){
		case 'a':
			readDetails();
			cm.addContact(fname, lname, phno);
			break;
		case 'g':
			Collection<Contact> data = cm.getAllContacts();
			System.out.println(data);
			break;
		default:
			break;
		}//switch close
		System.out.println("Do you want to continue");
		choice=ip.next().charAt(0);
		}//while close
	}

	public static void readDetails() {
		System.out.println("Enter contact details: ");
		System.out.println("Enter first name: ");
		fname = ip.next();
		System.out.println("Enter last name: ");
		lname = ip.next();
		System.out.println("Enter phone number: ");
		phno = ip.next();
		
	}

}
