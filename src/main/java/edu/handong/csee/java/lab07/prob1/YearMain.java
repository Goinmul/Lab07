package edu.handong.csee.java.lab07.prob1;
import java.util.Scanner;

/**
 *  main method where the program starts.
 * @author HyunWoo Kwon
 */
public class YearMain {

	public static void main (String args[]){

		int yearNum = 0;
		Scanner myS = new Scanner(System.in);

		System.out.print("Enter a year you want to know : ");
		yearNum = myS.nextInt();

		YearCalculator y1 = new YearCalculator(yearNum);

		yearNum = y1.calculator();
		System.out.print("It is " + yearNum + "th century.");

	}

}
