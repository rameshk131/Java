package aptitudeTest;

import java.util.*;

class Alpha 
{ 
    public String type = "a "; 
    public Alpha() {  System.out.print("alpha "); } 
} 
  
public class Test4 extends Alpha 
{ 
    public Test4()  {  System.out.print("beta ");  } 
  
    void go() 
    { 
        type = "b "; 
        System.out.print(this.type + super.type); 
    } 
  
    public static void main(String[] args) 
    { 
        new Test4().go(); 
    } 
} 
