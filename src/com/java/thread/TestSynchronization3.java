package com.java.thread;

class MySyncMethods {

	public synchronized static void disp(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}

	public synchronized void print(int n) {

		for (int i = 1; i <= 10; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
			}
		}
	}

}

class MyThread1 extends Thread {
	public void run() {
		MySyncMethods.disp(1);
	}
}

class MyThread2 extends Thread {
	
	MySyncMethods t ;
	
	MyThread2(MySyncMethods t){
		this.t=t;
	}
	
	public void run() {
		t.print(10);
	}
}

class MyThread3 extends Thread {
	public void run() {
		MySyncMethods.disp(100);
	}
}

class MyThread4 extends Thread {
	
	MySyncMethods t ;
	
	MyThread4(MySyncMethods t){
		this.t=t;
	}
	public void run() {		
		t.print(1000);
	}
}

public class TestSynchronization3 {
	
	/*
	 * public static void main(String t[]){
	 * 
	 * MySyncMethods tt = new MySyncMethods();
	 * 
	 * MyThread1 t1=new MyThread1(); #MyThread3 t2=new MyThread3(); MyThread3 t3=new
	 * MyThread3(); MyThread4 t4=new MyThread4(tt); t1.start(); t2.start();
	 * //t3.start(); //t4.start(); }
	 */

}
