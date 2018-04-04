package edu.handong.csee.java.lab07.prob1; // a unique package name
/**
 * this is about calculating century, by using constructor.
 * constructor is basically something that makes initializing(instanciating) easier.
 * for example, if you had many integers under the YearCalculator class, you should initialize every integers by taking up many lines.
 * but if you use constructor, you can just do it in one line. for example,
 * 
 * say that in the main you instantiated class YearCalculator nw = new YearCalculator();
 * and you have bunch of integers a, b, c, d, ... , which you initialized to
 * int a = 1
 * int b = 2
 * int c = 3 ... so on.
 * 
 * and you reasign the values of the intgers like
 * nw.a = 1;
 * nw.b = 4; .. so on.
 * 
 * but by using constructor, you can just do like this.
 * 
 * public YearCalculator (int a, int b, int c, ...) // Name of constructor = class name
 * {
 * 		a = 1;
 * 		b = 4; ... so on
 * }
 * 
 * and then instantiate them like YearCalculator m1 = new YearCalculator (1,4,5,...);
 * sine they are instantiated, you can just use them.
 * @author HyunWoo Kwon
 */
public class YearCalculator { // class name

	int year = 0; // initializing an integer.

	/*public YearCalculator() // looks similar to a method, but is a CONSTRUCTOR.
	{
		year = 0; // initializing integer to use it.
	} // actually, this part is unnecessary(?).
*/
	public YearCalculator(int year) // the input year and this.year is different year!!!
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