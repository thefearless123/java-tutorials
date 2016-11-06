package com.blogspot.buildjavaapps.tutorials;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MathOperations {

	private static final Logger LOGGER = Logger.getLogger(MathOperations.class.getName());

	public int add(int a, int b) {
		return (a + b);
	}

	public int subtract(int a, int b) {
		return (a - b);
	}

	public int multiply(int a, int b) {
		return (a * b);
	}

	public double divide(double a, double b) {
		return (a / b);
	}

	public int modulo(int a, int b) {
		return (a % b);
	}

	public static void main(String[] args) {
		MathOperations math = new MathOperations();
		LOGGER.log(Level.INFO, String.valueOf(math.add(10, 20)));
		LOGGER.log(Level.INFO, String.valueOf(math.subtract(10, 20)));
		LOGGER.log(Level.INFO, String.valueOf(math.multiply(10, 20)));
		LOGGER.log(Level.INFO, String.valueOf(math.divide(10, 20)));
		LOGGER.log(Level.INFO, String.valueOf(math.modulo(10, 20)));
	}
}
