package com.bridgelabz.datastructures.programs;


public class UnOrderedList implements List {
	Node first;

	@Override
	public UnOrderedList list() {
		System.out.println("Returning an empty list");
		return new UnOrderedList();
	}

	@Override
	public void add(Node item) {
		if (first == null) {
			first = item;
		} else {
			Node iterator = first;
			Node previous = iterator;
			while (iterator != null) {
				previous = iterator;
				iterator = iterator.getNext();
			}
			previous.setNext(item);

		}

	}

	@Override
	public void remove(Node item) {
		// REMOVES THE FIRST MATCHED ITEM
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
			if (iterator.getInfo() != item.getInfo()) {

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

	@Override
	public void append(Node item) {
		// INSERTS THE ITEM IN THE LIST POSITION OF THE LIST

		if (first == null) {

			first = item;
			return;

		} else {

			Node iterator = first;

			while (iterator.getNext() != null) {

				iterator = iterator.getNext();
			}
			iterator.setNext(item);

		}

	}

	@Override
	public void insert(int position, Node item) {
		// INSERT THE ITEM IN THE SPECIFIED POSITION

		if (position == 0) {
			Node returningNode = first;
			/*
			 * Node temp = first; temp = temp.getNext(); first.setNext(null); first = temp;
			 */
			item.setNext(returningNode.getNext());
			first = item;

			return;
		} else {

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

				previous.setNext(item);

				item.setNext(current);

			} else {

				System.out.println("lack of elemnts present in the list insert at a lesser position again");

			}

		}

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

}
