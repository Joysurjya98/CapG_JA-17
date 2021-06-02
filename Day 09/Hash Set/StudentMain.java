package com.capg.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
	    hs.add(123);
	    hs.add(124);
	    hs.add(124);
	    hs.add(null);
	    hs.add(125);
	    hs.add(129);
	    hs.add(145);
	    System.out.println(hs);

	    //	Accessing hashset elements/objects in sequence
	    Iterator<Integer> it = hs.iterator();
	    System.out.println("Hashset values using iterator");
	    while (it.hasNext())
	    	System.out.println(it.next() + "\n");
	    HashSet<String> flowerList = new HashSet<>(8, 0.60f);
	    //	capacity=8
	    //	load factor = 0.6 means if hash set is filled by 60% then the size of hash set will be doubled
	    flowerList.add("Rose");
	    flowerList.add("Jasmine");
		flowerList.add("Marigold");

	    //adding Student objects in to hash set
	    HashSet<Student> stdList = new HashSet<Student>();
	    Scanner sc= new Scanner(System.in);
	    for(int i=0;i<3;i++) {
	        System.out.println("Enter the details of Student");
	        System.out.println("Enter the Student id");
	        int id = sc.nextInt();
	        System.out.println("Enter the Student Name");
	        String name = sc.next();
	        stdList.add(new Student(id,name));
	    }

	    //	Displaying student details
	    Iterator<Student> stuItr = stdList.iterator();
	    System.out.println("Student HashSet values using Iterator");
	    while(stuItr.hasNext()) {
	        Student st = stuItr.next();
	        System.out.println(st.getSname() + " \t\t\t " + st.getSid());
	        System.out.println();
	    }

	    //	Removing the student
	    System.out.println("Enter the Student id to remove");
	    int id = sc.nextInt();
	    while(stuItr.hasNext()) {
	        Student st = stuItr.next();
	        if (st.getSid() == id) {
	            stuItr.remove();
	        }
	    }
	    sc.close();

	}

}
