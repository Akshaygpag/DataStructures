package com.bridgelabz.algorithms;

import com.bridgelabz.algoritms.util.AlgorithmUtil;

/**
 * SORT INTS USING MERGE SORT
 * @version 1.0.0
 * @author Akshay
 * @since 18-05-2018
 */
public class MergeSort {
	static int[] finaldata;

	public static void main(String[] args) {
		int a[] = { 41, 2, 3, 5, 17, 3 };

		System.out.println("printing the value befor sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		finaldata = new int[a.length];
		AlgorithmUtil.mergeSort(a);
		System.out.println("printing the value after sorting ");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

}