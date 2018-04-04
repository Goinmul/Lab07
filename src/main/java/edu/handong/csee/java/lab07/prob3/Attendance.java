package edu.handong.csee.java.lab07.prob3;
/**
 * The actual methods for this package.
 * @author HyunwooKwon
 *
 */
public class Attendance {
	//initializing variables(int, String type) to use them.
	private String name = "";
	private int year = 0;
	private String student_id = "";
	private int missed = 0;

	public Attendance(){ // creating default constructor
		this.name = ""; 
		this.year = 0;
		this.student_id = "";
		this.missed = 0;
		//consists of name, year, student id, missed number with String and integer type respectively.
	}

	public Attendance(String name, int year, String student_id, int missed){ // different from above constructor, this thing shows when user gives 4 inputs.
		this.name = name;
		this.year = year;
		this.student_id = student_id;
		this.missed = missed;
	} // this is constructor for 4 inputs. (You can say this 'overloading', since I made two same name's constructor.
	// + if the user doesn't give any inputs, upper constructor(default) comes out.


	//now, just by clicking generating getters and setters, I can make them.
	//below are getters and setters, as you may well see.
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getStudent_id() {
		return student_id;
	}

	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}

	public int getMissed() {
		return missed;
	}

	public void setMissed(int missed) {
		this.missed = missed;
	}

} // end of class..
