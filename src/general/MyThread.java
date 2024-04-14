package general;

public class MyThread implements Runnable{
	
	public void run() {
		
		System.out.println("Thread run methods running.......");		
		try {
			System.out.println("Thread run methods going to sleep.......");
			Thread.sleep(1000);
		} catch (InterruptedException e) {			
			e.printStackTrace();
		}
		
		System.out.println("Threan run methods sleep time up and running now.......");
	}

}
