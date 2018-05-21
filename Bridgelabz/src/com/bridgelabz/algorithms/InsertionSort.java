package com.bridgelabz.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bridgelabz.algoritms.util.AlgorithmUtil;
/**
 * SORT STRINGS USING INSERTION SORT
 * @version 1.0.0
 * @author Akshay
 * @since 18-05-2018
 */
public class InsertionSort {

	public static void main(String[] args) {
		// THIS METHOD USED LIST AS INPUTS AND CALLS THE INSERTION SORT FROM THE
		// ALGOUTILITY CLASS FOR THE STRING
		List<String> listWords = new ArrayList<String>();
		listWords.add("apple");
		listWords.add("ball");
		listWords.add("dog");
		listWords.add("cat");
		listWords.add("elephant");
		listWords.add("fan");
		listWords.add("goat");
		listWords.add("helicopter");
		listWords.add("india");
		listWords.add("joker");
		String[] unsortedData = new String[listWords.size()];

		unsortedData = listWords.toArray(unsortedData);

		System.out.println("------------------------------");
		String[] sortedData = AlgorithmUtil.insertionSortString(unsortedData);

		for (String s : sortedData) {
			System.out.println(s);
		}

	}

}
