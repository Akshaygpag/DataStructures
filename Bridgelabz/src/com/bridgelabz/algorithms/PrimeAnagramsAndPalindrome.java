package com.bridgelabz.algorithms;

import com.bridgelabz.algorithm.interfaces.*;

import com.bridgelabz.algoritms.util.AlgorithmUtil;
import com.bridgelabz.functionalprogramming.util.*;

/**
 * FIND PRIME NUMBERS THAT ARE ANAGRAMS AND PALINDROMES
 * @version 1.0.0
 * @author Akshay
 * @since 18-05-2018
 */
public class PrimeAnagramsAndPalindrome {

	public static void main(String[] args) {
		// THIS METHOD WILL TAKE THE USER INPUT FOR THE RANGE OF NUMBER

		System.out.println("Enter the number between range 0-1000");
		int numberRange = Utility.getIntergerValue();
		if (numberRange > 1000 || numberRange < 0) {
			System.out.println("range from 0 to 1000");
			return;
		}
		Integer[] allPrimeNumbers = (Integer[]) AlgorithmUtil.allPrimesInRange(numberRange);
		System.out.println("Find 1.anagrams and 2.palindromes");
		int value = Utility.getIntergerValue();
		switch (value) {

		case 1:
			findAnagramPrimes(allPrimeNumbers);

			break;
		case 2:
			findPalindromes(allPrimeNumbers);
			break;
		default:
			System.out.println("Invalid inputs made");
			System.exit(1);

		}

	}

	public static void findAnagramPrimes(Integer[] allPrimeNumbers) {
//FINDS THE PRIME ANAGRAMS
		for (int i = 0; i < allPrimeNumbers.length - 1; i++) {
			if (allPrimeNumbers[i] < 10) {
				continue;
			}
			for (int j = i + 1; j < allPrimeNumbers.length; j++) {

				String result = AlgorithmUtil.isAnagram(String.valueOf(allPrimeNumbers[i]),
						String.valueOf(allPrimeNumbers[j]));
				if (result.equalsIgnoreCase(UtilInterface.ISANAGRAM)) {
					System.out.println(allPrimeNumbers[i] + " and " + allPrimeNumbers[j] + " are anagrams");
				}

			}
		}

	}

	public static void findPalindromes(Integer[] allPrimeNumbers) {
//FINDS THE PRIME PALINDROMES
		for (int i = 0; i < allPrimeNumbers.length; i++) {
			if (allPrimeNumbers[i] < 10) {
				continue;
			}
			if (AlgorithmUtil.isIntPalindrome(allPrimeNumbers[i])) {
				System.out.println(allPrimeNumbers[i] + " is a palindrome ");

			}
		}

	}

}
