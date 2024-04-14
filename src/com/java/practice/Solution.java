package com.java.practice;

class Base { 
     void foo() {} 
}  
class Derived extends Base { 
	protected void foo() {} 
}  
public class Solution { 
    public static void main(String args[]) { 
        Derived d = new Derived(); 
        d.foo(); 
    } 
} 
