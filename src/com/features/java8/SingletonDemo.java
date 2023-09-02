package com.features.java8;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.lang.reflect.InvocationTargetException;

// Break the Singalton Class

public class SingletonDemo {

	public static void main(String[] args) throws CloneNotSupportedException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, FileNotFoundException, IOException, ClassNotFoundException {
		
		
		
		/*
		 * 1. Use Cloenable Interface to break Singleton Concept
		 * 
		MySingalton obj1 = MySingalton.getInstance();		
		System.out.println(obj1.hashCode());
		MySingalton obj2 = (MySingalton) obj1.clone();
		System.out.println(obj2.hashCode());
		
		*/
		
		/*	
		 * 2. Use Reflection to break Singleton Concept
		 * 	
		MySingalton obj1 = MySingalton.getInstance();		
		System.out.println(obj1.hashCode());
		Constructor[]  constructors= MySingalton.class.getDeclaredConstructors();
		for(Constructor cons :  constructors) {			
			cons.setAccessible(true);
			MySingalton obj2 = (MySingalton) cons.newInstance();
			System.out.println(obj2.hashCode());
		}
		*/
		
		/*Use Serializable Interface to break Singleton Concept */
		
		MySingleton obj1 = MySingleton.getInstance();		
		System.out.println(obj1.hashCode());		
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singelton.ser"));
		out.writeObject(obj1);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("singelton.ser"));
		MySingleton obj2 = (MySingleton) in.readObject();
		in.close();
		System.out.println(obj2.hashCode());
		
		
		
	}

}
