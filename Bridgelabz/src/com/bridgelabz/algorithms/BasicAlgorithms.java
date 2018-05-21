package com.bridgelabz.algorithms;

import com.bridgelabz.algoritms.util.AlgorithmUtil;
import com.bridgelabz.functionalprogramming.util.Utility;

/**
 * INSERTION SORT ,BUBBLE SORT AND BINARY SEARCH FOR BOTH INTS AND STRINGS
 * @version 1.0.0
 * @author Akshay
 * @since 18-05-2018
 */
public class BasicAlgorithms {

	public static void main(String[] args) {
		// THIS METHOD WILL TAKE IN THE USER INPUT FOR THE CHOICE OF OPERATIONS TO BE
		// PERFORMED

		while (true) {
			System.out.println("------------------------------------");
			System.out.println("Enter choice for the operations ");
			System.out.println("1. binarySearch for int");
			System.out.println("2. binarySearch for String");
			System.out.println("3. insertion sort for int");
			System.out.println("4. insertion sort for String");
			System.out.println("5. bubble sort for int");
			System.out.println("6. bubble sort for Stirng");
			System.out.println("7.Exit");
			int request = Utility.getIntergerValue();
			int[] sortedIntData = null;
			String[] sortedStringData = null;
			int mid = -1;
			switch (request) {

			case 1:
				System.out.println("Enter the key value to be searched in the data list");
				int intKey = Utility.getIntergerValue();
				mid = AlgorithmUtil.binarySearchInt(Utility.getArrayDataInt(), intKey);

				if (mid != -1) {
					System.out.println("Element found at position " + mid);

				}
				break;

			case 2:
				System.out.println("Enter the key value to be searched in the data list");
				String stringKey = null;
				stringKey = Utility.getUserStringValue();
				mid = AlgorithmUtil.binarySearchString(Utility.getArrayDataString(), stringKey);

				if (mid != -1) {
					System.out.println("Element found at position " + mid);

				}
				break;

			case 3:
				System.out.println("Enter the unsorted  int array to sort using insertion sort");
				sortedIntData = AlgorithmUtil.insertionSortInt(Utility.getArrayDataInt());
				Utility.printIntArray(sortedIntData);
				break;

			case 4:

				System.out.println("Enter the unsorted string array to sort using insertion sort");
				sortedStringData = AlgorithmUtil.insertionSortString(Utility.getArrayDataString());
				Utility.printStringArray(sortedStringData);
				break;

			case 5:
				System.out.println("Sorting the ints using bubble sort");
				sortedIntData = AlgorithmUtil.bubbleSortInt(Utility.getArrayDataInt());
				Utility.printIntArray(sortedIntData);

				break;

			case 6:
				System.out.println("Sorting the Stirngs using bubble sort ");
				String[] sortedData = AlgorithmUtil.bubbleSortString(Utility.getArrayDataString());
				Utility.printStringArray(sortedData);

				break;
			default:
				System.out.println("Exiting froim the menu....");
				System.exit(1);

			}

		}

	}

}
