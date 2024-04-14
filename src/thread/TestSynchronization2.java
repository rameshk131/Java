package thread;

class Table2 {

	 void printTable(int n) {// method not synchronized
		 
		 synchronized(this) {
			 
			 for (int i = 1; i <= 5; i++) {
					System.out.println(n * i);
					try {
						Thread.sleep(400);
					} catch (Exception e) {
						System.out.println(e);
					}
				}			 
		 }
		 
		 System.out.println("This is non synchronized Block");
		
	}
}

class MyThreadA extends Thread {
	Table2 t;

	MyThreadA(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThreadB extends Thread {
	Table2 t;

	MyThreadB(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}


class MyThreadC extends Thread {
	Table2 t;

	MyThreadC(Table2 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(1000);
	}
}

public class TestSynchronization2 {

	public static void main(String args[]) {
		Table2 obj = new Table2();// only one object
		MyThreadA t1 = new MyThreadA(obj);
		MyThreadB t2 = new MyThreadB(obj);
		MyThreadC t3 = new MyThreadC(obj);
		t1.start();
		t2.start();
		//t3.start();
		
	}

}
