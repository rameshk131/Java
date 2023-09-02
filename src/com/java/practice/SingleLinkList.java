package com.java.practice;

import java.util.HashSet;

public class SingleLinkList {
	
	class Node{		
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	Node nextNode = null;
	
	public void insert(int data) {
		
		Node newNode = new Node(data);		
		if(head == null) {
			head = newNode ;
			nextNode = head;
			return;
		}		
		while(nextNode.next != null) {
			nextNode = nextNode.next;			
		}	  
	    nextNode.next = newNode;
					
	}
	
	 public  void display() {
		 nextNode = head;
		 
		 while(nextNode != null) {
			 System.out.println(nextNode.data);
			 nextNode = nextNode.next;
		 }
	    	
	  }
	 
		
	 
	
	public void deleteOdd() {

		nextNode = head;
		Node preNode = head;
		if (head.data % 2 != 0) {
			head = head.next;
			nextNode = head;
			preNode = head;
		}

		while (nextNode != null) {

			if (nextNode.data % 2 != 0) {
				preNode.next = nextNode.next;
				nextNode = nextNode.next;

			} else {
				preNode = nextNode;
				nextNode = nextNode.next;
			}

		}

	}
	
	public void removeDuplicate() {

		nextNode = head;
		Node preNode = head;
		
		HashSet<Integer> set = new HashSet<>();

		while (nextNode != null) {
			int key = nextNode.data;
			if (set.contains(key)) {
				preNode.next = nextNode.next;
				nextNode = nextNode.next;

			} else {
				set.add(key);
				preNode = nextNode;
				nextNode = nextNode.next;
			}

		}
		set.stream().forEach(System.out::println);

	}
	 

	public static void main(String[] args) {
		
		SingleLinkList list = new SingleLinkList();
		
		list.insert(10);
		list.insert(11);
		list.insert(10);
		list.insert(13);
		list.insert(14);
		list.insert(15);
		list.insert(10);
		list.insert(17);
		list.display();
		System.out.println("------------------------------");
		
		//list.deleteOdd();
		list.removeDuplicate();
		//list.display();
		
	}

}













