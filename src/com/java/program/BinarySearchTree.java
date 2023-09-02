package com.java.program;

public class BinarySearchTree {
	
	
	class Node{		
		int key;
		Node left;
		Node right;
		
		public Node(int item){
			key = item;
			left = null;
			right = null;			
		}
	}
	
	Node root = null;
	public void insert(int key){		
		root = insertRec(root,key);
		//System.out.println(root.key);
	}
	
	public Node insertRec(Node node,int key){		
		if(node ==  null){
			node = new Node(key);
			return node;
		}
		
		if(key < node.key){			
			node.left = insertRec(node.left,key);			
			
		}else if(key > node.key){
			node.right = insertRec(node.right,key);
		}
		
		return node;
	}
	
	public void inOrder(){		
		inOrderRec(root);		
	}	
	public void inOrderRec(Node node){
		if(node != null){			
			inOrderRec(node.left);
			System.out.println(node.key);
			inOrderRec(node.right);
		}		
	}

	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(60);
		bst.insert(70);
		bst.insert(40);
		//System.out.println(bst.root.key);
		bst.insert(30);
		bst.insert(45);
		System.out.println("Inserted..............");
		
		bst.inOrder();

	}

}
