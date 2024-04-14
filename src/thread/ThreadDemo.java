package thread;

public class ThreadDemo{	
	public static void main(String arg[]) {	
		
		for(int i=0;i<5;i++) {			
			Thread obj = new Thread(()->{
				System.out.println("Thread with Name "+Thread.currentThread().getName()+" is running.....");
				
			});
			obj.setName("A -> "+i);
			obj.start();
		}
		
	  System.out.println("Main methods end");
	}
	





}
