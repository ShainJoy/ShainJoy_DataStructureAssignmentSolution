package gl.skyScraper.model;

public class Node {
	// implementation of node
	public int floorSize, dayNo;
	public Node next;
	
	public Node(int size, int day){
		floorSize = size;
		dayNo = day;
		next = null;
	}

}
