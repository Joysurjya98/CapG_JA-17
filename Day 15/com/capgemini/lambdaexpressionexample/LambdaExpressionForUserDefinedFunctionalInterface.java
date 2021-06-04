package com.capgemini.lambdaexpressionexample;

public class LambdaExpressionForUserDefinedFunctionalInterface {

	public static void main(String[] args) {
		Addition a = () -> {
			System.out.println("Addition of two numbers: " + (12+76));
		};
		
		a.add();
		
		Multiplication m = () -> {
			System.out.println("Multiplication of two numbers: " + (12*76));
		};
		
		m.mul();
	}
	
}
