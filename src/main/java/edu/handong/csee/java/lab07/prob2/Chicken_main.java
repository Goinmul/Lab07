package edu.handong.csee.java.lab07.prob2;
/**
 * Main method is here.
 * @author Hyun Woo Kwon
 *
 */
public class Chicken_main {

	public static void main(String[] args) { //main method, where the program starts.
		// TODO Auto-generated method stub

		Chicken menu1 = new Chicken("Cheese_mustard", 16000.00, 5); // string, double, int
		Chicken menu2 = new Chicken("Honey_mustard",16000.00,5); // giving all 5 stars!
		Chicken menu3 = new Chicken("Spicy_chicken",16000.00,1); // dislike spicy food...?

		menu1.setStars(3); // giving values to star.
		menu2.setStars(4);
		menu3.setStars(1);

		System.out.println(menu1.getName() + "'s rating is " + menu1.getStars()); // printing out the ratings.
		System.out.println(menu2.getName() + "'s rating is " + menu2.getStars());
		System.out.println(menu3.getName() + "'s rating is " + menu3.getStars());
	} // end of main

} // end of class..
