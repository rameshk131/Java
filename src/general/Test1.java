package general;

public class Test1 {

	public static void main(String[] args) {
		
		Runnable runn = ()->{
			
			System.out.println("Thread run methods running.......");			
			try {
				System.out.println("Thread run methods going to sleep.......");
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}			
			System.out.println("Threan run methods sleep time up and running now.......");
			
		};
		Thread obj = new Thread(runn);
		obj.start();		
		
	}
}
