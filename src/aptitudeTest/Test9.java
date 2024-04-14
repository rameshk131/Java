package aptitudeTest;

public class Test9 
{ 
    public static void main(String[] args) throws InterruptedException 
    { 
    	Test9 t = new Test9(); 
        
        // making t eligible for garbage collection 
        t = null;  
              
        // calling garbage collector 
        System.gc();  
              
        // waiting for gc to complete 
        Thread.sleep(1000);  
      
        System.out.println("end main"); 
    } 
  
    @Override
    protected void finalize()  
    { 
        System.out.println("finalize method called"); 
        System.out.println(10/0); 
    } 
      
} 