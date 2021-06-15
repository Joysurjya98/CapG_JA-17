package com.capg.jdbcCRUDexample;

import java.util.Scanner;

public class ProductManagement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ProductManagementSystem pms = new ProductManagementSystem();
		pms.dbConnection();
		// pms.createTableProduct();
		// pms.insertIntoProduct();

		char cont = 'y';
		while (cont == 'y') {
			System.out.println("Enter your choice: ");
			System.out.println("insert: To insert a product");
			System.out.println("update: To update a product");
			System.out.println("delete: To delete a product");
			System.out.println("getproduct: To get details of a single product");
			System.out.println("getallproducts: To get details of all product");
			System.out.println("exit : to exit");
			String transaction = sc.next();
			switch (transaction) {
			case "insert":
				pms.insertIntoProductUsingPS();
				break;
			case "update":
				pms.updateProduct();
				break;
			case "delete":
				pms.deleteProduct();
				break;
			case "getproduct":
				pms.getProductById();
				break;
			case "getallproducts":
				pms.getAllProduct();
				break;
			case "exit":
				System.out.println("Thank you for visiting......");
				System.out.println("Please visit again");
				System.exit(0);
				break;
			default:
				break;
			}// switch close
			System.out.println("do you want continue");
			cont = sc.next().trim().charAt(0);
		} // while

	}

}
