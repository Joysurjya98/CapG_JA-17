package com.capg.jdbcCRUDexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ProductManagementSystem {

	static Connection con = null;
	static Statement stmt = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;
	static Scanner sc = new Scanner(System.in);
	
	public Connection dbConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
	
	public void createTableProduct() {
		try {
			stmt=con.createStatement();
			String createTable="create table product(pid number primary key,pname varchar2(20),price number(10,2))";
			int i=stmt.executeUpdate(createTable);
			if(i==0) {
				System.out.println("Table created successfully");
			}else {
				System.out.println("Table not created successfully");
			}
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void insertIntoProduct() {
		try {
			stmt=con.createStatement();
			String insertData="insert into product values(123,'Pen',25.45)";
			int i = stmt.executeUpdate(insertData);
			if(i!=0) {
				System.out.println("data inserted successfully");
			}else {
				System.out.println("data is not inserted successfully");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}

	// insert data into product table using prepared statement
	int productId;
	String productName;
	float productPrice;
	public void readProductDetails() {
		System.out.println("Enter the product Details");
		System.out.println("Enter the product id");
		productId=sc.nextInt();
		System.out.println("Enter the product name");
		sc.nextLine();
		productName=sc.nextLine();
		System.out.println("Enter the product price");
		productPrice=sc.nextFloat();
	}

	// insert data into product table using prepared statement
	public void insertIntoProductUsingPS() {
		try {
			String insertData="insert into product values(?,?,?)";

			pstmt=con.prepareStatement(insertData);
			readProductDetails();
			pstmt.setInt(1, productId);
			pstmt.setString(2, productName);
			pstmt.setFloat(3, productPrice);
			
			int i=pstmt.executeUpdate();
			
			if(i !=0) {
				System.out.println("Item inserted Successfully");
			} else {
				System.out.println("Item not inserted Successfully");
			}
		}catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void getAllProduct() {
		try {
			stmt = con.createStatement();
			rs = stmt.executeQuery("select * from product");
			System.out.println("PID\t\tPNAME\t\t\t\tPRICE");
			System.out.println("==============================================");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+
				rs.getString(2)+"\t\t\t\t"+rs.getDouble(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void getProductById() {
		try {
			String displayByID = "select * from product where pid = ?";
			pstmt = con.prepareStatement(displayByID);
			System.out.println("Enter Product ID: ");
			int piid = sc.nextInt();
			pstmt.setInt(1, piid);
			rs = pstmt.executeQuery();
			System.out.println("PID\t\tPNAME\t\t\t\tPRICE");
			System.out.println("==============================================");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+"\t\t"+
				rs.getString(2)+"\t\t\t\t"+rs.getDouble(3));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void updateProduct() {
		try {
			String updateProduct = "update product set price = ?,pname=? where pid = ?";
			pstmt = con.prepareStatement(updateProduct);
			System.out.println("Enter the product id");
			int id = sc.nextInt();
			System.out.println("Enter the product price");
			float price = sc.nextFloat();
			System.out.println("Enter the product name");
			String name = sc.next();
			pstmt.setFloat(1, price);
			pstmt.setString(2, name);
			pstmt.setInt(3, id);
			int i = pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("Data updated successfully");
			}else {
				System.out.println("Data not updated successfully");
			}
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			
			}
	}
	
	public void deleteProduct() {
		try {
			String deleteProduct = "delete from product where pid = ?";
			pstmt = con.prepareStatement(deleteProduct);
			System.out.println("Enter the product id");
			int id = sc.nextInt();
			pstmt.setInt(1, id);
			int i = pstmt.executeUpdate();
			if(i != 0) {
				System.out.println("product deleted successfully");
			}else {
				System.out.println("product not deleted  successfully");
			}
		} catch (SQLException e) {
				e.printStackTrace();
		}finally {
			try {
				pstmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}
	}
	
}
