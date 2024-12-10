package com.promineotech;

/**
 * Example Object that covers braces. Braces are used in Java to define the
 * beginning and ending of statements. Look at the comments below for the Object
 * ExampleObject the main method and a new method that prints out a string.
 * 
 * The comments are just meant to help see the start and end of the braces.
 */
public class ExampleSyntaxObject { // start of my ExampleObject

	/**
	 * This is how Java executes my Object by finding this main method.
	 */
	public static void main(String[] args) { // start of my main method

		/**
		 * Creates a simple String variable called test.
		 */
		String test = "ThisIsATest";

		if (test.length() > 5) { // start of my if statement
			printString(test);
		} // end of my if statement
		else { // start of my else statement
			System.out.println("String is to short.");
		} // end of my else statement

	} // end of my main method

	public static void printString(String str) { // start of my printString method
		System.out.println(str);
	} // end of my printString method

} // end of my ExampleObject

/**
 * As you can see above, my ExampleObject has a start '{' and an end '}' and all
 * my code will go inside of those braces.
 * 
 * Every Object has this format.
 * 
 * public class Example { // methods and variables all go here. }
 * 
 */
