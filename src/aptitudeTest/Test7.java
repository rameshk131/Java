package aptitudeTest;
class One implements Runnable  
{ 
    public void run()  
    { 
        System.out.print(Thread.currentThread().getName()); 
    } 
} 
class Two implements Runnable  
{ 
    public void run()  
    { 
        new One().run(); 
        new Thread(new One(),"gfg2").run(); 
        new Thread(new One(),"gfg3").start(); 
    } 
} 
class Test7  
{ 
    public static void main (String[] args)  
    { 
        new Thread(new Two(),"gfg1").start();
        
    } 
}