package com.java.program;

import java.util.HashSet;

public class SingleLinkList {
	
	class Node{		
		int data;
		Node next;		
		Node(int data){
		this.data = data;
		this.next= null;
		}
	}
	
	Node head = null;
	Node nextNode = null;
	public void insert(int data){
		
		Node newNode = new Node(data);		
		if(head == null){
			head = newNode;
			nextNode = head;
			return;
		}		
		while(nextNode.next != null){				
			nextNode = nextNode.next;
		}
		nextNode.next = newNode;
	}
	
	public void printList(){
		Node temp = head;
		while(temp != null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void deleteOdd(){		
		
		Node nxt = head;
		Node pre = head;		
		while(nxt != null){
			if(nxt.data % 2 == 0){
				head = nxt;
				break;
			}else{
				pre = nxt;
				nxt=nxt.next;
				pre.next = null;
			}			
		}
		//System.out.println("------------------");
		//System.out.println(head.data+"  "+head.next);
		
	}

// remove duplicate from Linked List using Hashing technique
public void removeDuplicate(){		
		Node current = head;
		Node pre = null;		
		HashSet<Integer> hs = new HashSet<Integer>();
		while(current != null){
			int data = current.data;
			if(!hs.contains(data)){
				hs.add(data);
				pre = current;
				
			}else{
				pre.next=current.next;				
			}
			current = current.next;
		}
}
	
	
	public static void main(String [] args)
    {
		SingleLinkList llist = new SingleLinkList();
        llist.insert(10);
        llist.insert(12);
        llist.insert(11);
        llist.insert(13);
        llist.insert(19);
        llist.insert(21);
        llist.insert(100);       
               
        llist.printList(); 
        System.out.println("-------------Delete Odd---------------");
        llist.deleteOdd();
        llist.printList();
        
       // System.out.println("------------------------------------");
       // llist.removeDuplicate();
       // llist.printList();
    }

}
