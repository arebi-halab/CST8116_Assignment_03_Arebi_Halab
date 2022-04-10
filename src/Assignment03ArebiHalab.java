/*
 * Author Name: Arebi Halab
 * Lab Professor: Professor Stanley Pieda
 * Due Date: Apirl 10, 2022
 * Description: Starter Code for Assignment 03 Section 303
 */

public class Assignment03ArebiHalab {

	public static void main(String[] args) {
		// program rolls a 10 sided dice 1000 times and records the number
		// of occurrences of each result.
		// See:https://en.wikipedia.org/wiki/Dice#Common_variations

		int roll = 0;
		int[] diceRolls = new int[10];
		int totalRolls = 0;

		// sample the rolls
		for(int count = 0; count < 1000; count++) {
		    roll = (int)(Math.random() * 10) + 1; // Math.random() returns 0.0 to 1.0 excluding 1.0
		    // i.e. we could get 0.99999999999 etc. but not 1.0
		    // so Math.random() times upper range of 10 is 0 to 9
		    // add 1 to get correct range, then cast to int to remove any decimal fraction.
		    diceRolls[roll - 1] = diceRolls[roll - 1] + 1; // adjust 1-10 value to 0-9 for index
		}
		
		// run a report
		for(int index = 0; index <= diceRolls.length; index++) {  // crashes
		    System.out.printf("Count of %d is: %d%n", (index + 1), diceRolls[index]);
		    totalRolls = totalRolls + diceRolls[index];
		}
		System.out.println("Total rolls were: " + totalRolls);
		System.out.println("Program by Arebi Halab");

	}

}
