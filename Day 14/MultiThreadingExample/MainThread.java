package com.capgemini.multithreadingexample;

public class MainThread {

	public static void main(String[] args) {

		new MyThread("Thread 1");
		new MyThread("Thread 2");
		new MyThread("Thread 3");
		new MyThread("Thread 4");
		new MyThread("Thread 5");
		new MyThread("Thread 6");
		try {
			Thread.sleep(10000);
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
		System.out.println("Main thread exiting.....");
	}

}
