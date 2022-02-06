package gl.bstToSkewedTree.services;

import gl.bstToSkewedTree.model.Node;

public class Main {
	/* This class holds logical functions supporting 
	 * Driver class of BST to Skewed Tree conversion.
	 */
	public Node node;
	public Node skewed;
	
	public void traverse(Node root) {
		// This recursive method traverse through the nodes
		//and prints elements.
		if (root==null)
			return;
		traverse(root.left);
		System.out.print(root.data + " ");
		traverse(root.right);
	}
	
	public void buildSkewedTree(Node root) {
		/* Since in-order traverse provides ascending order of a BST
		 * we are making use of it to read-out the values of the input BST
		 * and build the right skewed tree.
		 */
		inOrderTraverse(root);
	}
	
	private void inOrderTraverse(Node root) {
		/* This is a recursive method reads, the tree values in-order
		 * and passes the value to another method to build tree.
		 */
		if (root==null)
			return;
		buildSkewedTree(root.left);
		build_BST(root.data);
		buildSkewedTree(root.right);
	}
	
	private void build_BST(int value) {
		/* This method builds a BST.
		 * Since we are getting the values in ascending order,
		 * the tree will be a right skewed one.
		 */
		if (skewed == null) 
			skewed = new Node(value);
		else 
			skewed = add_NewNode(skewed, value);
	}
	
	private Node add_NewNode(Node root, int value) {
		// recursive method for creating BST
		if (root == null)
			return new Node(value);
		else if(value < root.data)
			root.left = add_NewNode(root.left, value);
		else
			root.right = add_NewNode(root.right, value);
		return root;
	}
}


