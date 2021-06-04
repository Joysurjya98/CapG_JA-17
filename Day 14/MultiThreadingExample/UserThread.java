package com.capgemini.multithreadingexample;

public class UserThread extends Thread {

	//to assign a action/task to a thread
		public void run() {
			System.out.println("Thread is in running state");
			for(int i=1;i<10;i++) {
				try {
					Thread.sleep(500);
				}catch(Exception e) {
					System.out.println(e);
				}
				System.out.println(i);
			}
		}
		
		public static void main(String[] args) throws InterruptedException {
			UserThread ut = new UserThread();
			ut.start();//thread one
			try {
				ut.join();
			}catch(Exception e) {
				System.out.println(e);
			}
			UserThread ut1 = new UserThread();
			ut1.start();//thread two
			UserThread ut2 = new UserThread();
			ut2.start();//thread three
		}

}
