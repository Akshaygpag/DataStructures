package com.bridgelabz.datastructures.programs;

public interface List {
	UnOrderedList list();

	void add(Node item);

	void remove(Node item);

	boolean search(Node item);

	boolean isEmpty();

	int size();

	void append(Node item);

	int index(Node item);

	void insert(int position, Node item);

	Node pop();

	Node pop(int position);
}
