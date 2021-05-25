package com.capg.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FlowerMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    HashSet<Flower> f = new HashSet<>();
	    int ch = 0;
	    do {
	        System.out.println("Select which operation to perform: \n1. Create the list of flowers\n2. Display the list\n3. Remove the flower based on qty\n4. Exit\n");
	        try {
	            ch = sc.nextInt();
	            switch (ch) {
	                case 1:
	                    System.out.println("Enter the number of flowers to add: ");
	                    int number = sc.nextInt();
	                    for (int i = 0; i < number; i++) {
	                        System.out.println("Enter the details: ");
	                        System.out.print("Enter flower id: ");
	                        int fId = sc.nextInt();
	                        System.out.print("Enter flower name: ");
	                        String fname = sc.next();
	                        System.out.print("Enter flower price per kg: ");
	                        double ppkg = sc.nextDouble();
	                        System.out.print("Enter quantity: ");
	                        double qty = sc.nextDouble();
	                        f.add(new Flower(fId, fname, ppkg, qty));
	                    }
	                    break;
	                case 2:
	                    Iterator<Flower> itr = f.iterator();
	                    System.out.println("Flower values using iterator: ");
	                    while (itr.hasNext()) {
	                        Flower fl = itr.next();
	                        System.out.print("ID: " + fl.getfId() + "Name: " + fl.getFname() + ", Price per Kg: " + fl.getPpkg() + ", Quantity: " + fl.getQty() + "\n");
	                    }
	                    break;
	                case 3:
	                    System.out.println("Enter the flower id to delete: ");
	                    Iterator<Flower> itrator = f.iterator();
	                    int id = sc.nextInt();
	                    while (itrator.hasNext()) {
	                        Flower flower = itrator.next();
	                        if (flower.getfId() == id)
	                            itrator.remove();
	                    }
	                    break;
	                default:
	                    System.out.println("Exiting!");
	            }
	        } 
	        catch (NumberFormatException e) { 
	        	e.printStackTrace(); 
	        }

	    } while(ch != 4);
	    sc.close();

	}

}
