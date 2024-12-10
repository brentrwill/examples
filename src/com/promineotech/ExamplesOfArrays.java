package com.promineotech;

/**
 * This is the class that will execute our code examples for Arrays.
 * 
 * One thing to remember is that all Objects have to match the file name, so I
 * will have a file called ExamplesOfArrays.java on my file system.
 * 
 * Then I can execute this in Eclipse.
 * 
 */
public class ExamplesOfArrays {

	/**
	 * Main entry point, again Java will look for this to execute our code!
	 */
	public static void main(String[] args) {

		/**
		 * This is an int value that I defined to equal 10. Any time I call this in the
		 * code, myAge will be 10, unless I change it later on.
		 */
		int myAge = 10;

		/**
		 * An Array of ints is very similar except it's a list of int values. Let's
		 * create the variable and assign it values just like the myAge variable.
		 * 
		 * the [] operator tells Java that we want a list of ints. It is not a List of
		 * Object but I can define some data and use it like a List.
		 * 
		 * So the syntax below tells Java I want a variable that is called myAgeArray
		 * but because I am using the [] in my syntax, Java now knows to make this an
		 * Array of 4 values.
		 * 
		 * Now the only difference between myAge and myAgeArray is that if I want a
		 * value from myAgeArray, I have to tell Java which entry I want.
		 * 
		 * Java indexes the values of myAgeArray like this: myAgeArray[0] = 10
		 * myAgeArray[1] = 20 myAgeArray[2] = 30 myAgeArray[3] = 40
		 * 
		 * So if I want to get a value out of myAgeArray, I need to know the index or
		 * the position in the Array.
		 * 
		 */
		int[] myAgeArray = { 10, 20, 30, 40 };

		/**
		 * Let't print out the age value 30. Array indexes or positions start at 0 and
		 * counts up. So I grab the index 2 because 0,1,2 is my third spot.
		 */
		System.out.println(myAgeArray[2]);

		/**
		 * Let's look at how we loop over Arrays and what it means.
		 */
		loopWithArrays();

		/**
		 * Let's look at how we index or uses indexes in our Array.
		 */
		indexesInArrays();

		/**
		 * Here is a method that will do all sorts of stuff with an Array that might
		 * help you understand how to work with an Array.
		 */
		variousThingsThatWeCanDoWithAnArray();
	}

	public static void loopWithArrays() {
		System.out.println("--------------------- loopWithArrays");
		/**
		 * When we talk about looping, think of looping as a race track. We circle the
		 * race tracking n-number of times. Each time you complete a circle, they call
		 * it a lap. Someone is counting the number of times we complete each lap so we
		 * know how many times we have gone around the track.
		 * 
		 * If I in a race and I had to go around the track 10 times, I want to make
		 * sure I only go 10 times or I might loss the race or, if I go around more
		 * 10 times or even less then 10 times.
		 * 
		 * The same concept works for loops and Arrays. If I have an Array of 10 items,
		 * and I want to print each item out, I don't want to go over 10 or less then
		 * 10. If I go over 10, Java will throw an error saying I am over my limit or it
		 * gives me an index out of bounds error. If I print less then the number of
		 * items in my Array, and I am adding all the values together, then I could have
		 * an incorrect value when finished.
		 * 
		 * Using the race track analogy, lets relate this to loops. A loop consists of 3
		 * parts.
		 * 
		 * @formatter:off
		 *  Part 1- The starting point, typically we start at 0. 
		 *  Part 2- This is the check part of the loop to make sure we don't run more laps then
		 *          we want to. 
		 *  Part 3- This is the part that counts the number of times we loop our laps we have taken.
		 * @formatter:on
		 * 
		 * for(starting point; check to make sure we loop the n-number of times; the
		 * counter) {
		 * 
		 * }
		 */

		/**
		 * Let's loop over an Array. Variables with [] Array notation have a special
		 * operation called 'length'. The operation 'length' will always tell us how
		 * many items are in my Array. This is important so we don't go over the number
		 * of items in my Array.
		 * 
		 * @formatter:off
		 * int index = 0 : this is my starting point 
		 * index < myArray.length : this is our check to make sure we don't exceed 
		 *                          the number of entries in our Array.
		 * index++ : this is our counter that tells me how many times I have looped.
		 * @formatter:on
		 */
		int[] myArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		System.out.println("I have " + myArray.length + " entries in my array.");
		for (int index = 0; index < myArray.length; index++) {
			/**
			 * This is printing out the value of each entry in my Array using the index
			 * variable.
			 */
			System.out.println(myArray[index]);

			/**
			 * This prints out the counter to show us how many times we have gone through
			 * the loop.
			 */
			System.out.println("We are on lap " + index + " of our loop");
		}

	}

	public static void indexesInArrays() {
		System.out.println("--------------------- indexesInArrays");

		/**
		 * So for Arrays, each entry has an index. This index is how we find a value at
		 * a given entry. An example of this is let's say I want to grab the index of a
		 * negative value because I want to see why it is negative.
		 * 
		 * Let's create an Array of doubles that represent my checking account's debts
		 * and credits.
		 */

		/**
		 * This Array has 10 entries, they are positive and negative values that
		 * represent money coming in and out of my checking account.
		 */
		double[] myCheckingAccountEntries = { 10.00, -15.00, -24.99, 23.00, -10.00, 45.00, -2.00, 5.00, -12.00, 11.00 };

		/**
		 * Let's loop over the entries to print out each of the debts and credits.
		 */
		for (int index = 0; index < myCheckingAccountEntries.length; index++) {
			/**
			 * This is printing out the value of each entry in my Array using the index.
			 */
			System.out.println(myCheckingAccountEntries[index]);

			/**
			 * This prints out the counter to show us how many times we have gone through
			 * the loop.
			 */
			System.out.println("We are on lap " + index + " of our loop");
		}

		System.out.println("---------------------");

		/**
		 * Now I want check for any values that are negative and print out just the
		 * negative values so I can see all the debts.
		 */
		for (int index = 0; index < myCheckingAccountEntries.length; index++) {
			/**
			 * We use our index variable from the loop to grab each entry, then check if it
			 * is negative as that represents a debt.
			 */
			if (myCheckingAccountEntries[index] < 0) {
				System.out.println("Found a debt of " + myCheckingAccountEntries[index]);
			}
			System.out.println("We are on lap " + index + " of our loop");
		}

		System.out.println("---------------------");

		/**
		 * You can get a specific entry by giving a number inside the [] and it will get
		 * you the value.
		 */
		System.out.println("My entry at 8 = " + myCheckingAccountEntries[8]); // Should print out -12.00
		System.out.println("My entry at 2 = " + myCheckingAccountEntries[2]); // Should print out -24.99
	}

	public static void variousThingsThatWeCanDoWithAnArray() {
		System.out.println("--------------------- variousThingsThatWeCanDoWithAnArray");
		int[] myArray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };
		System.out.println("I have " + myArray.length + " entries in my array.");
		/**
		 * Print out all the values in an Array.
		 */
		for (int index = 0; index < myArray.length; index++) {
			/**
			 * This is printing out the value of each entry in my Array using the index
			 * variable.
			 */
			System.out.println(myArray[index]);

			/**
			 * This prints out the counter to show us how many times we have gone through
			 * the loop.
			 */
			System.out.println("We are on lap " + index + " of our loop");
		}

		System.out.println("---------------------");

		/**
		 * Print out all the values in an Array backwards. Important, I set my starting
		 * point at length - 1 because I want to start at the end of the loop and move
		 * backwards. Instead of adding to my counter, I subtract 1 from my counter so I
		 * move backwards instead of forward.
		 * 
		 * Also, length = 10, so I have to start 1 less because indexes are 0-9 not
		 * 1-10.
		 */
		for (int index = myArray.length - 1; index > 0; index--) {
			/**
			 * This is printing out the value of each entry in my Array using the index
			 * variable
			 */
			System.out.println(myArray[index]);

			/**
			 * This prints out the counter to show us how many times we have gone through
			 * the loop.
			 */
			System.out.println("We are on lap " + index + " of our loop");
		}

		System.out.println("---------------------");

		/**
		 * Print out on the odd indexes of an Array. Remember this is odd indexes and
		 * not odd values. We will use the math notation called modulus.
		 * 
		 * Modulus is defined by if a number is divide by a number you either get 0 or
		 * the remainder.
		 * 
		 * For even numbers you would index % 2 = 0 means the indexes are even if the
		 * result == 0.
		 */
		for (int index = myArray.length - 1; index > 0; index--) {
			/**
			 * We check the index with the modulus operator and if the number is even, the
			 * results will be zero, so if the result is not zero we know it is odd.
			 */
			int evenOrOdd = index % 2;
			if (evenOrOdd != 0) {
				/**
				 * This is printing out the value of each entry in my Array using the index
				 * variable.
				 */
				System.out.println(myArray[index]);

				/**
				 * This prints out the counter to show us how many times we have gone through
				 * the loop.
				 */
				System.out.println("We are on lap " + index + " of our loop");
			}
		}

		System.out.println("---------------------");

		/**
		 * Let's create an Array and set all the entries to the value of the index.
		 * Below I have created a new Array of 10 entries but notice I have not set any
		 * of the entries. By default, Java will set all 10 entries to either 0,-1 as a
		 * default.
		 */
		int[] myValueSetArray = new int[10];

		/**
		 * Before we initialize the values.
		 */
		for (int index = 0; index < myValueSetArray.length; index++) {
			/**
			 * This is printing out the value of each entry in my Array using the index
			 * variable.
			 */
			System.out.println(myValueSetArray[index]);

			/**
			 * This prints out the counter to show us how many times we have gone through
			 * the loop.
			 */
			System.out.println("We are on lap " + index + " of our loop");
		}

		System.out.println("---------------------");

		/**
		 * Now let's loop over the Array and set the values using the index
		 */
		for (int index = 0; index < myValueSetArray.length; index++) {
			/**
			 * This is printing out the value of each entry in my Array using the index
			 * variable.
			 */
			myValueSetArray[index] = index;
			System.out.println(myValueSetArray[index]);

			/**
			 * This prints out the counter to show us how many times we have gone through
			 * the loop.
			 */
			System.out.println("We are on lap " + index + " of our loop");
		}
	}
}
