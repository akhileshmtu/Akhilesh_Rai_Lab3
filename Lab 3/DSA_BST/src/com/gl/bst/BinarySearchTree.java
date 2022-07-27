package com.gl.bst;

import java.util.ArrayList;

public class BinarySearchTree {
	// BST node
	class Node {

		int data;
		Node left, right;

		Node(int d) {
			data = d;
			left = right = null;
		}
	}

	// Root of BST
	Node root;

	// Constructor
	BinarySearchTree() {
		root = null;
	}

	// Inorder traversal of the tree
	void inorder() {
		inorderUtil(this.root);
	}

	// function for inorder traversal of the tree
	void inorderUtil(Node node) {
		if (node == null)
			return;

		inorderUtil(node.left);
		System.out.print(node.data + " ");
		inorderUtil(node.right);
	}

	
	void insert(int key) {
		root = insertRec(root, key);
	}

	/* A recursive function to insert a new key in BST */
	Node insertRec(Node root, int data) {

		/* If the tree is empty, return a new node */
		if (root == null) {
			root = new Node(data);
			return root;
		}

		
		if (data < root.data)
			root.left = insertRec(root.left, data);
		else if (data > root.data)
			root.right = insertRec(root.right, data);

		return root;
	}

	ArrayList<Integer> treeToList(Node node, ArrayList<Integer> list) {
// Base Case
		if (node == null)
			return list;

		treeToList(node.left, list);
		list.add(node.data);
		treeToList(node.right, list);

		return list;
	}

	// method that checks if there is a pair present
	boolean isPairPresent(Node node, int target) {
		
		
		ArrayList<Integer> a1 = new ArrayList<>();

		
		ArrayList<Integer> a2 = treeToList(node, a1);

		int start = 0; 

		int end = a2.size() - 1; // Ending index of a2

		while (start < end) {

			if (a2.get(start) + a2.get(end) == target) // Target Found!
			{
				System.out.println("Pair Found: " + a2.get(start) + " + " + a2.get(end) + " " + "= " + target);
				return true;
			}

			if (a2.get(start) + a2.get(end) > target) // decrements end
			{
				end--;
			}

			if (a2.get(start) + a2.get(end) < target) // increments start
			{
				start++;
			}
		}

		System.out.println("nodes are not found.");

		return false;
	}
}
