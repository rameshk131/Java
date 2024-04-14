package thread;

class Table {

	synchronized void printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class MyThread10 extends Thread {
	Table t;

	MyThread10(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread20 extends Thread {
	Table t;

	MyThread20(Table t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class TestSynchronization1 {

	public static void main(String args[]) {
		Table obj = new Table();// only one object
		MyThread10 t1 = new MyThread10(obj);
		MyThread20 t2 = new MyThread20(obj);
		t1.start();
		t2.start();
		
		System.out.println("main thread completed");
	}

}
