package cues;

public class Node {
	
	Object value;
	Node next;
	
	
	public Node(Object value) {
		super();
		this.value = value;
	}


	public Object getValue() {
		return value;
	}


	public void setValue(Object value) {
		this.value = value;
	}


	public Node getNext() {
		return next;
	}


	public void setNext(Node next) {
		this.next = next;
	}
	

}