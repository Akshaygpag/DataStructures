package com.bridgelabz.algorithms;

import com.bridgelabz.algoritms.util.AlgorithmUtil;
import com.bridgelabz.functionalprogramming.util.Utility;

/**
 * CONVERT TEMPERATURE FROM CELCIUS TO FARANITE AND VICE VERSA
 * @version 1.0.0
 * @author Akshay
 * @since 18-05-2018
 */
public class TemperatureConvertor {

	public static void main(String[] args) {
		char symbol = ' ';
		while (true) {
			System.out.println("How to convert");
			System.out.println("1.To Faranite");
			System.out.println("2.To Celcius");
			int value = Utility.getIntergerValue();

			if (value == 1) {
				symbol = 'F';

			} else if (value == 2) {
				symbol = 'C';
			} else {
				System.out.println("Invalid Inputs ");
				System.exit(1);

			}
			System.out.println("Enter the temperature to convert");
			double temp = Utility.getDoubleValue();
			AlgorithmUtil.temperaturConversion(symbol, temp);

		}

	}

}
