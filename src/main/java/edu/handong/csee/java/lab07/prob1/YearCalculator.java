package edu.handong.csee.java.lab07.prob1;

/**
 * @author HyunWoo Kwon
 * this is about calculating century, by using constructor.
 */
public class YearCalculator {

	int year = 0;

	public YearCalculator() // looks similar to a method, but is a CONSTRUCTOR.
	{
		year = 0; // initializing integer to use it.
	} // actually, this part is unnecessary(?).

	public YearCalculator(int year)
	{
		this.year = year; // this means defining class' member variable 'year'.
	}

	public int calculator() // now this is a method, returning int type.
	{
		if (year%100 == 0) { // if statement.
			year = year/100; // just divide since there is no remainer(ex 1900 becomes 19th century)
		}

		else { // for the other conditions of if statement
			year = (year/100)+1; // at first thought about (int), but it is the same.
		}
		return year; // returning calculated 'year' integer. should be the century number.
	}

}