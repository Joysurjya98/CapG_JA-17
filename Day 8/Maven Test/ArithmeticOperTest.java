package com.capgemini.FirstMavenProject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArithmeticOperTest {
	
	ArithmeticOper aop = new ArithmeticOper();
	
	@Test
	public void addTest() {
		assertEquals(24,aop.add(15, 9));
	}
	
	@Test
	public void subTest() {
		assertEquals(6,aop.subtract(15, 9));
	}
	
	@Test
	public void multiTest() {
		assertEquals(45,aop.multiply(5, 9));
	}
	
	@Test
	public void divTest() {
		assertEquals(3,aop.div(34, 9));
	}

}
