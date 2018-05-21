package com.bridgelabz.datastructures.programs;

import com.bridgelabz.algorithm.impl.OrderedListImpl;
import com.bridgelabz.algorithm.interfaces.OrderedList;
import com.bridgelabz.functionalprogramming.util.Utility;

public class OrderedListMain {

	public static void main(String[] args) {
		// TAKES THE FILE DATA AND ADDS DATA AND STORES THEM BACK
		OrderedList list = new OrderedListImpl();

		while (true) {
			System.out.println();
			System.out.println();
			System.out.println("---------------------------------");
			System.out.println();
			System.out.println("1.Create an empty list");
			System.out.println("2.Add element to list");
			System.out.println("3.Remove element from list");
			System.out.println("4.Search element from the list");
			System.out.println("5.Check if the list is empty");
			System.out.println("6.Check the number of elements present in the list");
			System.out.println("7.Add element in the end of the list");
			System.out.println("8.Insert element at the specified position(starts from 0)");
			System.out.println("9.Pop element from the list");
			System.out.println("10.Pop specified element from the list by position(starts from 0) ");
			System.out.println("11.Get the index of element from the list (Always will give the first match)");
			System.out.println("press anything ele to exit");
			int choice = Utility.getIntergerValue();
			Node item = null;
			Node n = null;
			int position = -1;
			switch (choice) {
			case 1:
				list.list();
				break;
			case 2:
				System.out.println("Enter the element");
				item = Utility.getNodeValue();
				list.add(item);
				break;
			case 3:
				System.out.println("Enter the element");
				item = Utility.getNodeValue();
				list.remove(item);
				break;
			case 4:
				System.out.println("Enter the element");
				item = Utility.getNodeValue();
				System.out.println("Element found : " + list.search(item));
				break;
			case 5:
				System.out.println("List is empty : " + list.isEmpty());
				break;
			case 6:
				System.out.println("Number of elements in the list : " + list.size());
				break;
			case 7:
				System.out.println("Enter the element");
				item = Utility.getNodeValue();
//				list.append(item);
				break;

			
			case 9:
				if ((n = list.pop()) != null) {

					System.out.println("Element is : " + n.getInfo());

					break;
				}
				System.out.println("List is empty");
				break;
			case 10:
				System.out.println("Enter the posiiton (0....n)");
				position = Utility.getIntergerValue();
				if ((n = list.pop(position)) != null) {

					System.out.println("Element is : " + n.getInfo());

					break;
				}
				System.out.println("List is empty");
				break;
			case 11:
				System.out.println("Enter the element");
				item = Utility.getNodeValue();
				int index = list.index(item);
				String result = (index != -1) ? "The element is at : " + index : "Element not found";
				System.out.println(result);

			default:

				System.out.println("Exiting the menu.....");
				System.exit(1);

			}

		}

	}

}
