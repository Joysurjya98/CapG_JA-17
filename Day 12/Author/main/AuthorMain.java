package com.capgemini.Author;

import java.util.Collection;
import java.util.Scanner;

import com.capgemini.Author.model.Author;
import com.capgemini.Author.service.AuthorManager;

public class AuthorMain {

		static Scanner ip = new Scanner(System.in);
		static String name;
		static String email;
		static char gender;
		public static void main(String[] args) {
			AuthorManager am = new AuthorManager();
			char choice='y';
			while(choice=='y'){
				System.out.println("Enter the choice");
				System.out.println("a: Add Author");
				System.out.println("g: Get author list");
				char ch=ip.next().charAt(0);
			switch(ch){
			case 'a':
				readDetails();
				am.addAuthor(name, email, gender);
				break;
			case 'g':
				Collection<Author> data = am.getAllAuthors();
				System.out.println(data);
				break;
			default:
				break;
			}//switch close
			System.out.println("Do you want to continue?");
			choice = ip.next().charAt(0);
			}//while close
		}

		public static void readDetails() {
			System.out.println("Enter author details: ");
			System.out.println("Enter name: ");
			name = ip.next();
			System.out.println("Enter email: ");
			email = ip.next();
			System.out.println("Enter gender: ");
			gender = ip.next().charAt(0);
			
		}

	}

