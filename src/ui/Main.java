package ui;

import binarySearchTree.BinarySearchTree;

public class Main {

	public static void main(String[] args) {
		BinarySearchTree<Integer, String> bst1 = new BinarySearchTree<Integer, String>();
		
		bst1.add(15, "Juan");
		bst1.add(7, "Cristian");
		bst1.add(23, "Sergio");
		bst1.add(12, "Andres");
		bst1.add(5, "Felipe");
		bst1.add(2, "Mateo");
		bst1.add(36, "Nicolas");
		
		System.out.println(bst1);
		
		bst1.leftRotate(7);
		
		System.out.println(bst1);
	}

}
