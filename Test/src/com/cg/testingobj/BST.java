package com.cg.testingobj;

public class BST {

	class Node{
		int key;
		Node left,right;
		
		public Node(int key) {
			this.key = key;
		}
	}
	
	Node root;
	BST bst;
	
	void insert(int key) {
		System.out.println("Before function insertRec "+root);
		root = insertRec(root,key);
		System.out.println("After function insertRec "+root);
	}
	
	Node insertRec(Node root,int key) {
			if(root==null) {
				System.out.println("Calling new root");
				root = new Node(key);
				System.out.println("Root Value"+root.key);
				System.out.println("New Root reference "+root);
//				return root;
			}

			if(key<root.key) { 
				System.out.println("Inside if < Root Value"+root.key);
				System.out.println("In root.left value of root "+root);
				System.out.println("Root.left "+root.left);
				root.left = insertRec(root.left,key);
			}
				
			else if(key>root.key) {
				System.out.println("Inside if > Root Value"+root.key);
				root.right = insertRec(root.right,key);
			}
				return root;
	}
	
	public static void main(String[] args) {
		BST b = new BST();
		
		b.insert(50);
		b.insert(30);
		b.insert(20);
		b.insert(40);
		b.insert(70);
		b.insert(60);
		b.insert(80);
				
		System.out.println(b.root.key);
		System.out.println(b.root.left.key);
		System.out.println(b.root.left.left.key);
		System.out.println(b.root.left.right.key);
		System.out.println(b.root.right.key);
		System.out.println(b.root.right.left.key);
		System.out.println(b.root.right.right.key);

	}

}
