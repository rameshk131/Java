package com.java.thread;

public class MyThread  extends Thread{

	public void run() {		
		for(int i=0;i<5;i++) {
			
		System.out.println("count = "+i);
		}
	}
	
 public static void main(String arg[]) {
	 
	 MyThread t1 = new MyThread();
	 t1.setName("A");
	 MyThread t2 = new MyThread();
	 t2.setName("B");
	 MyThread t3 = new MyThread();
	 t3.setName("C");
	 t1.start();
	 t2.start();
	 t3.start();
	 
 }

}
