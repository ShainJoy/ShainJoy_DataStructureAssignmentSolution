package gl.skyScraper.service;

import gl.skyScraper.model.Node;

public class MyLinkedList {
	private Node head;

	public void insert(int size, int day) {
		/* This method receives both values and inserting into 
		 * linked list as a new node.
		 * But code ensures that, all the nodes are following
		 * the descending order based on floor size.
		 */
		Node newNode = new Node(size, day);
		if(head == null) {
			head = newNode;
			return;
		}
		Node prevNode = null;
		Node curNode = head;
		// Traverses through list and loop breaks at the point
		// where the current node has to be inserted. 
		while (curNode != null) {
			if (curNode.floorSize > newNode.floorSize) {
				prevNode = curNode;
				curNode = curNode.next;
			}
			else 
				break;
		}
		// insertion of node
		if (prevNode == null) {
			newNode.next = head;
			head = newNode;
		}
		else {
			prevNode.next = newNode;
			newNode.next = curNode;
		}
	}
	
	public void dailyFloorPlan(int floors) {
		// Method prints the floor size checking the corresponding day value. 
		Node curNode = head;
		for (int i = 1; i <= floors; i++) {
			System.out.println("\nDay: " + i);
			while (curNode != null) {
				if (curNode.dayNo <= i) {
					System.out.print(curNode.floorSize + " ");
					curNode = curNode.next;
				}
				else
					break;
			}
		}
	}
}

