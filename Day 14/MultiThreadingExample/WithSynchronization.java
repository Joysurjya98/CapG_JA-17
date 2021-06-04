package com.capgemini.multithreadingexample;

public class WithSynchronization implements Runnable {

	int token = 1;
	@Override
	public void run() {
		
		synchronized(this) {
			Thread t = Thread.currentThread();
			String name = t.getName();
			System.out.println(token + "....alloted to " + name);
			token++;
		}
	}
	
	public static void main(String[] args) {
		WithSynchronization ws = new WithSynchronization();
		Thread t1 = new Thread(ws);
		Thread t2 = new Thread(ws);
		Thread t3 = new Thread(ws);
		Thread t4 = new Thread(ws);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
