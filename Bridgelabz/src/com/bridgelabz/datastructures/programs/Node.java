package com.bridgelabz.datastructures.programs;

public class Node {
	private String info;
	private Node next;


	public Node() {
		// ZERO ARGUMENT CONSTRUCTOR
		super();
		this.next = null;
		this.info = null;

	}

	public Node(Node firstNode) {
	
		this.next = firstNode.getNext();
		this.info = firstNode.getInfo();

	}

	@Override
	public String toString() {
		return "Node [info=" + info + ", next=" + next + "]";
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	
	
	
	
}
