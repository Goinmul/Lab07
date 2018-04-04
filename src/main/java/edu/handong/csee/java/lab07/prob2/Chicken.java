package edu.handong.csee.java.lab07.prob2;
/**
 * well, the chicken problem.
 * @author HYUNWOO KWON
 *
 */
public class Chicken {
	private String name; // initializing values to use them.
	private double price;
	private int stars;



	public Chicken(){ // constructor(name should be the same as class name)
		this.name = "";
		this.price = 0.0;
		this.stars = 0;
	} // initializing things up above. I don't think this part is needed.

	public Chicken(String name, double price, int stars) { // constructor again.
		this.name = name;
		this.price = price;
		this.stars = stars;
	} // giving values to the constructor's variable


	// made getters and setters by what JC taught us.(source - generate getters and setters)
	// reason for using these is that the variables we want to access is 'private', so we cannot directly pick them up and manipulate them
	// except by using getters and setters, until now that I learned.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}
	// just by clicking once, all the getters and setters are made!
}//end of class.

