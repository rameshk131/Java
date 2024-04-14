package aptitudeTest;

import java.util.*;

class C{
	
	private int x=10;
	private void m1() {
		System.out.println("C m1");
	}
	
	public  void m2() {  
    	
    	System.out.println("B m1()");
    }
}

class B extends C{ 
	
	private int x= 10;
    private void m1() {    	
    	System.out.println("B m1()");
    }
     public void m2() {  
    	m1();
    	System.out.println("B m1()");
    }
} 
  
public class Test5 {     
  
    public static void main(String[] args) { 
       C c = new B();
       c.m2();
       
    } 
} 
