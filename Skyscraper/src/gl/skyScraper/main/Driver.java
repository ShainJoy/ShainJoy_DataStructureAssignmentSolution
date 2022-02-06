package gl.skyScraper.main;
import java.util.Scanner;
import gl.skyScraper.service.MyLinkedList;

/**	Graded Assignment 3 - Data Structures: Solution for Question 1
 * -----------------------------------------------------------------
 * This is the program to schedule 'daily floor work plan' of skyscraper.
 * 
 * Linked list Data Structure is used for the implementation of this code.
 * Custom linked list class is in separate file: MyLinkedList 
 * 
 * @author Shain Joy
 */

public class Driver {
	/* This class accepts value from user and 
	 * make use of 'MyLinkedList' class for all logical operations
	 */
	public static void main(String[] args) {
		Scanner rdr = new Scanner(System.in);
		MyLinkedList list = new MyLinkedList(); //custom linked list
		
		// Taking input from the user using scanner class 
		//and passes to maintain linked list
		System.out.println("Enter the total no of floors in the building: ");
		int totalFloors = rdr.nextInt();
		int florSize;
		
		for(int i = 1; i <= totalFloors; i++) {
			System.out.println("Enter the floor size given on day : " + i);
			florSize = rdr.nextInt();
			list.insert(florSize, i);
		}
		// Prints out 'daily floor work plan'
		list.dailyFloorPlan(totalFloors);
		rdr.close();
	}
}