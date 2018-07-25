package com.cg.bt;

public class BinarySearchTree {

	class Node {
		int key;
		Node left, right;

		public Node(int item) {
			key = item;
			left = right = null;
		}
	}

	Node root;

	BinarySearchTree() { 
		root = null; 
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root,int key) {

		if (root == null) {
			root = new Node(key);
			return root;
		}

		if (key < root.key)
			root.left = insertRec(root.left,key);
		else if (key > root.key)
			root.right = insertRec(root.right,key);

		return root;
	}

	void inorder()  {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if (root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();

		tree.insert(80);
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);

		System.out.println(tree.root.key);             //80
		System.out.println(tree.root.left.key);        //50
		System.out.println(tree.root.left.left.key);   //30
		System.out.println(tree.root.left.left.left.key);       //20
		System.out.println(tree.root.left.right.key);           //70
		System.out.println(tree.root.left.right.left.key);      //60

	}
}