package edu.handong.csee.java.lab07.prob1; // a unique package name
import java.util.Scanner; // importing scanner class
/**
 *  main method where the program starts.
 * @author HyunWoo Kwon
 */
public class YearMain { // Class for main

	public static void main (String[] args){ // Method main, where the program starts

		int yearNum = 0; // initializing an integer
		Scanner myS = new Scanner(System.in); // Instantiating Scanner

		System.out.print("Enter a year you want to know : "); // showing a sentence
		yearNum = myS.nextInt(); // getting an integer from keyboard to 'yearNum'

		YearCalculator y1 = new YearCalculator(yearNum); // instantiating class 'YearCalculator'

		yearNum = y1.calculator(); // Using method 'calculator' in the instantiated class 'YearCalculator'.
		System.out.print("It is " + yearNum + "th century."); // showing a sentence.
	} // end of main
} // end of class.
