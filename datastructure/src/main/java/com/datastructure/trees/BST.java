package com.datastructure.trees;

public class BST {
	
	class Node{
		
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			this.value = value;
			left = right = null;
		}
		
	}
	
	public Node insert(Node root, int value) {
		
		if(root == null) {
			root = new Node(value);
			return root;
		}
		
		if(value > root.value) {
			root.right = insert(root.right, value);
		}
		
		else {
			root.left = insert(root.left, value);
		}
		
		return root;
		
	}

	public void inOrder(Node root) {
		
		if(root!=null) {
			
			inOrder(root.left);
			System.out.println(root.value);
			inOrder(root.right);
			
		}
	
	}
	
	public void preOrder(Node root) {
			
		if(root!=null) {
				
			System.out.println(root.value);
			inOrder(root.left);
			inOrder(root.right);
				
		}
	
	}
			
	public void postOrder(Node root) {
				
		if(root!=null) {
					
			inOrder(root.left);
			inOrder(root.right);
			System.out.println(root.value);
					
		}
		
		
	}
	
	public static void main(String[] args) {

		BST tree = new BST();
		Node root = null;
		root = tree.insert(root, 8);
		root = tree.insert(root, 5);
		root = tree.insert(root, 10);
		root = tree.insert(root, 15);
		root = tree.insert(root, 9);
		root = tree.insert(root, 3);
		root = tree.insert(root, 1);
		root = tree.insert(root, 2);
		
		System.out.println("InOrder Traversal");
		tree.inOrder(root);
		
		System.out.println("PreOrder Traversal");
		tree.preOrder(root);
		
		System.out.println("PostOrder Traversal");
		tree.postOrder(root);
		
		System.out.println("Tree Created");
		
	}

}
