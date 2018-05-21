package com.bridgelabz.algorithms;

import com.bridgelabz.functionalprogramming.util.Utility;

/**
 * GUESS THE NUMBER BY USING TIME COMPLEXITY OF LOG n BASE 2
 * @version 1.0.0
 * @author Akshay
 * @since 18-05-2018
 */
public class MyNumberFinder {
	static int N;

	public static void main(String[] args) {
		// THIS METHOD WILL TAKE THE INPUTS FROM THE USER AND THEN ASK FOR THE USER TO
		// INPUT THE TRUE/FALSE FOR THE NUMBER RANGE

		N = Integer.parseInt(args[0]);

		numberFinder(createArray(N));

	}

	private static int[] createArray(int n2) {
		// THIS METHOD WILL CREATE ARRAY WITH VALUES SAME AS INDEX

		int[] arrayData = new int[n2];
		for (int i = 0; i < n2; i++) {

			arrayData[i] = i;

		}
		return arrayData;
	}

	private static void numberFinder(int[] array) {
		// THIS METHOD WILL RETURN THE NUMBER THAT THE USER HAD IN MIND
		int low = 0;
		int high = array.length - 1;
		int mid = (low + high) / 2;
		while (low <= high) {

			if (low == high) {
				System.out.println("The number choosen is " + mid);
				break;
			} else {
				if (getUserResponse(mid)) {
					high = mid;
					mid = (low + high) / 2;

				} else {
					low = mid + 1;
					mid = (low + high) / 2;

				}

			}
		}

	}

	private static boolean getUserResponse(int mid) {
		// THIS METHOD WILL TAKE IN THE USER RESPONSE AS OF FALSE OR TRUE DEPENDING UON
		// THE INTEGRITY OF THE QUESTION

		System.out.println("Is number lower than " + mid + " ?");
		return Utility.getBooleanValue();
	}

}
