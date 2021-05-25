package com.capg.crud;

import java.util.Scanner;

public class Employee {
	private int empId;
	private String empName;
	
	//	Constructors
	public Employee() { 
		super(); 
	}
	public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	//	Getters
	public int getEmpId() { 
		return empId; 
	}
	public String getEmpName() { 
		return empName; 
	}
	
	//	Setters
	public void setEmpId(int empId) { 
		this.empId = empId; 
	}
	public void setEmpName(String empName) { 
		this.empName = empName; 
	}

	//	Methods
	public void displayEmpDetails() { 
		System.out.println("Emp Id: " + empId + "Emp name: " + empName + "\n"); 
	}

	//	displayEmpDetails with Employee Object as argument 
	public void displayEmpDetails(Employee emp) { 
		System.out.println("Emp Id: " + emp.getEmpId() + "Emp name: " + emp.getEmpName() + "\n"); 
	}

	//	overloaded the method displayEmpDetails by Employee[] object as argument
	public void displayEmpDetails(Employee[] emp) {
		for (int i = 0; i < emp.length; i++) 
			System.out.println("Emp Id: " + emp[i].getEmpId() + "Emp name: " + emp[i].getEmpName() + "\n");
	}
	
	//	find an employee by id
	public void findEmployeeById(Employee[] emp,int id) {
		for(int i = 0; i < emp.length; i++) {
			if(emp[i].getEmpId() == id)
			{
				System.out.println("Employee found at " + i);
				System.out.println("Emp Id: " + emp[i].getEmpId() + "Emp name: " + emp[i].getEmpName() + "\n");
				break;
			}
			else {
				System.out.println("No employee found\n");
			}
		}
	}
	
	//	creating the list of employees using array and returning an array
	Scanner sc = new Scanner(System.in);
	Employee[] empList1 = new Employee[3];
	public Employee[] createEmpList() {
		for(int i = 0; i < empList1.length; i++) {
			System.out.println("Enter the employee details for  "+ i + " emp object");
			empList1[i] = new Employee();
			empList1[i].setEmpId(sc.nextInt());
			empList1[i].setEmpName(sc.next());
		}
		   return empList1;
	}

	//	find an employee by id
	public void updateEmployeeById(Employee[] emp,int id) {
		for(int i = 0; i < emp.length; i++) {
			if(emp[i].getEmpId() == id) {
				System.out.println("Employee found at " + i);
				System.out.println("Enter new name to update for the employee");
				String updatedname = sc.next();
				emp[i].setEmpName(updatedname);
				System.out.println("Emp Id: " + emp[i].getEmpId() + "Emp name: " + emp[i].getEmpName() + "\n");
				break;
			}
			else {
				System.out.println("No employee found\n");
			}
		}
	}
	
	//delete an employee by id
	public Employee[] deleteEmployeeById(Employee[] emp,int id) {
		int originalLength = emp.length;
		for(int i = 0; i < originalLength; i++) {
			if(emp[i].getEmpId() == id) {
				System.out.println("Employee found at " + i + "\n");
				emp[i] = emp[originalLength-1];
				originalLength--;
				break;
			}
			else {
				System.out.println("No employee found\n");
			}
		}
		return emp;
	}

}
