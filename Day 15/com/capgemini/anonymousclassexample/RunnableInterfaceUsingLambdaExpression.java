package com.capgemini.anonymousclassexample;

public class RunnableInterfaceUsingLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//implementing Runnable Interface using Lambda Expression
		Runnable runnable1=()->{
			System.out.println("run method using lambda expression");
			System.out.println("Run method in anonymous class");
		};

		//implementing using anonymous class
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Implementation of Runnable Functional Interface using anonymous class");
				System.out.println("Run method in anonymous class");
				
				Thread th = new Thread(runnable1);
				th.start();
			}
		}).start();
	}
	
}
