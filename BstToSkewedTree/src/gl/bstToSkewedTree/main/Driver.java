package gl.bstToSkewedTree.main;

import gl.bstToSkewedTree.model.Node;
import gl.bstToSkewedTree.services.Main;

/** Graded Assignment 3 - Data Structures: Solution for Question 2
 * -----------------------------------------------------------------
 * 	This program converts given BST into a Right Skewed Tree 
 *  and prints the elements.
 *  
 *  Using 2 other classes (Separate files: Main & Node) to implement this program. 
 *  Main class - contains all logical code.
 *  Node class - contains code for defining a node.
 *
 * @author Shain Joy
 */

public class Driver {
		
	public static void main(String[] args) {
		
		// Creating BST
		Main tree = new Main();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left= new Node(55);
		
		// Converting BST to skewed tree
		tree.buildSkewedTree(tree.node);
		
		// Printing elements of SKEWED tree.
		tree.traverse(tree.skewed);
	}
}
