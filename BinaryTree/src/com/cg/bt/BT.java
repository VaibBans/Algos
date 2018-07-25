package com.cg.bt;

public class BT {

	class Node{
		int key;
		Node left,right;
		public Node(int key) {
			this.key = key;
		}
	}
	Node root;
	
	void insert(int key) {
		root = insertData(key, root);
	}
	
	Node insertData(int key, Node root) {
		if(root == null) {
			root = new Node(key);
			return root;
		}
		else {
			if(key<root.key)
				root.left = insertData(key, root.left);
			
			else if(key>root.key) 
				root.right = insertData(key, root.right);
		}
		
		return root;
	}
	
	/*void searchKey(Node root,int key) {
		if(root!=null) {
		if(key>root.key) 
			searchKey(root.right, key);
		else if(key<root.key)
			searchKey(root.left, key);
		else if(key==root.key) {
			System.out.println("Key exists");
			System.exit(0);
		}
	}
		if(root==null) {
			System.out.println("Can't find key");
			System.exit(0);
		}			
	}*/
	
	void searchKey(Node root,int key) {
		if(root==null) {
			System.out.println("Can't find key");
			System.exit(1);
		}			 
		if(key>root.key) 
			searchKey(root.right, key);
		else if(key<root.key)
			searchKey(root.left, key);
		else if(key==root.key) 
			System.out.println("Key exists");
	}
	public static void main(String[] args) {
				
		BT b = new BT();
		b.insert(50);
		b.insert(60);
		b.insert(40);
		b.insert(100);
		b.insert(1500);
	
		System.out.println(b.root.key);
		System.out.println(b.root.right.key);
		System.out.println(b.root.left.key);
		System.out.println(b.root.right.right.key);
		System.out.println(b.root.right.right.right.key);
		
		b.searchKey(b.root, 1500);
	}

}
