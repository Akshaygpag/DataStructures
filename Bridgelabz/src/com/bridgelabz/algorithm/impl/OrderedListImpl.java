package com.bridgelabz.algorithm.impl;

import javax.rmi.CORBA.Util;

import com.bridgelabz.algorithm.interfaces.OrderedList;
import com.bridgelabz.datastructures.programs.Node;
import com.bridgelabz.functionalprogramming.util.Utility;

public class OrderedListImpl implements OrderedList {
	Node first;

	public OrderedListImpl() {
		// ZERO ARGUMENT CONSTRUCTOR
		this.first = null;
	}

	@Override
	public OrderedList list() {
		// CREATES THE ORDERED LIST WITH 0 SIZE
		System.out.println("Created an empty ordered list");
		return new OrderedListImpl();
	}

	@Override
	public void add(Node item) {
		// ADDS THE ELEMENT TOT THE CORRECT POSITION DEPENDING ON THE NATURAL SORTING
		// ORDER
		Node previous = first;
		Node current = first;
		if (first == null) {

			first = item;

		} else {
			int data = Utility.stringToInteger(item.getInfo());
			if (data < Utility.stringToInteger(current.getInfo())) {
				item.setNext(first);
				first = item;
			} else {
				System.out.println("success in creating the data which is numeric in nature " + data);
				while (current != null) {
System.out.println("inside the main method");
					if (data > Utility.stringToInteger(current.getInfo())) {

						previous = current;
						current = current.getNext();

					} else {
						break;

					}
				}

				previous.setNext(item);
				item.setNext(current);

			}

		}

	}

	@Override
	public boolean isEmpty() {
		// CHECKS IF THE LIST IS EMPTY OR NOT
		if (first != null) {
			return false;
		}
		return true;
	}

	@Override
	public int size() {
		// FINDS OUT THE NUMBER OF ITEMS PRESENT IN THE LIST

		Node iterator = first;

		int sizeCounter = 0;

		while (iterator != null) {
			sizeCounter++;
			System.out.println(iterator.getInfo());
			iterator = iterator.getNext();
		}
		return sizeCounter;

	}

	@Override
	public int index(Node item) {
		// RETURNS THE RAEAL INDEX OF THE ELEMENT IF FOUND ELSE IT WILL RETURN -1
		if (first != null) {
			int counter = 0;
			Node iterator = first;

			while (iterator != null) {
				System.out.println("The value of list item is " + iterator.getInfo());
				if (item.getInfo().equalsIgnoreCase(iterator.getInfo())) {

					return counter;
				}
				counter++;
				iterator = iterator.getNext();
			}

		}
		return -1;
	}

	@Override // yet to be tested
	public Node pop() {

		if (first == null) {

			System.out.println("No elements found list is empty");
			return null;

		} else if (this.size() == 1) {
			Node returningNode = first;
			Node temp = first;
			temp = temp.getNext();
			first.setNext(null);
			first = temp;
			return returningNode;
		}

		else {
			Node iterator = first;
			Node previous = iterator;
			Node previousOfPrevious = previous;
			while (iterator != null) {
				previousOfPrevious = previous;
				previous = iterator;
				iterator = iterator.getNext();
			}
			previousOfPrevious.setNext(null);
			return previous;
		}

	}

	@Override
	public Node pop(int position) {
		// DELETE THE ELEMENT AT THE SPECIFIED POSITION
		if (position == 0) {
			Node returningNode = first;
			Node temp = first;
			temp = temp.getNext();
			first.setNext(null);
			first = temp;

			return returningNode;
		} else if (this.size() == 1) {
			Node returningNode = first;
			Node temp = first;
			temp = temp.getNext();
			first.setNext(null);
			first = temp;
			return returningNode;
		}

		else {

			if ((this.size() - 1) >= position) {
				Node next = first;
				Node previous = first;
				Node current = first;
				while (position >= 0) {
					previous = current;
					current = next;
					next = next.getNext();
					position--;
				}

				previous.setNext(next);

				return current;

			} else {

				System.out.println("lack of elemnts present in the list insert more and try again later");

			}
			return null;
		}

	}

	@Override
	public void remove(Node item) {
		// REMOVES THE FIRST MATCHED ITEM
		if(this.size()==0) {
			System.out.println("All elements removed ");
			return;
			
		}else {
			
			if (first.getInfo().equalsIgnoreCase(item.getInfo())) {

				Node temp = first;
				temp = temp.getNext();
				first.setNext(null);
				first = temp;
				return;
			}
			Node iterator = first;
			Node previous = iterator;
			while (iterator != null) {
				if (iterator.getInfo() == item.getInfo()) {

					System.out.println("match found removing the element");
					break;
				}

				previous = iterator;
				iterator = iterator.getNext();
			}

			Node next = iterator.getNext();
			previous.setNext(next);
			iterator.setNext(null);

			
		}
	}

	@Override
	public boolean search(Node item) {
		// RETURNS TRUE FOR THE METHOD IF THE ITEM IS PRESENT ELSE IT RETURNS FALSE
		Node iterator = first;

		while (iterator != null) {
			if (item.getInfo().equalsIgnoreCase(iterator.getInfo())) {

				return true;
			}
			iterator = iterator.getNext();
		}
		return false;

	}

}
