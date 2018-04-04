package edu.handong.csee.java.lab07.prob3;
// import java.util.Scanner; //no need for this.
import java.util.Random;
/**
 * Main method is here.
 * @author Hyunwoo Kwon
 *
 */
public class Attendance_main {

	public static void main(String[] args) {

		Random randomGen = new Random();

		//format : Attendance(String name, int year, String student_id, int missed)
		Attendance a1 = new Attendance("Jess", 4, "21400999", 0);
		Attendance a2 = new Attendance("Kent", 2, "21700111", 0);
		Attendance a3 = new Attendance("Lucas", 1, "21833222", 0);
		Attendance a4 = new Attendance("Martha", 2, "21733444", 0);
		// giving values to my instanciated constructors. By using constructor,
		// I can save a lot of lines.

		//giving the value 'missed' in constructor a radom intger.
		a1.setMissed(randomGen.nextInt(10));
		a2.setMissed(randomGen.nextInt(10));
		a3.setMissed(randomGen.nextInt(10));
		a4.setMissed(randomGen.nextInt(10));

		if(a1.getMissed() > 6) { // the if statement for a1(Jess), using if and else statement. if the missed number is more than 6, if activates.
			System.out.println("I'm sorry " + a1.getName() + ". You failed this course."); // showing name and a sentence.
			System.out.println(a1.getName() + " - number of absence : " + a1.getMissed()); // showing name and number of missed class.
		}
		else {
			System.out.println("We'll see the grade, " + a1.getName()); // if missed number is not more than 6, else activates. showing a name and a sentence.
		}

		if(a2.getMissed() > 6) { // the if statement for a1(Jess), using if and else statement. if the missed number is more than 6, if activates.
			System.out.println("I'm sorry " + a2.getName() + ". You failed this course."); // showing name and a sentence.
			System.out.println(a2.getName() + " - number of absence : " + a2.getMissed()); // showing name and number of missed class.
		}
		else {
			System.out.println("We'll see the grade, " + a2.getName()); // if missed number is not more than 6, else activates. showing a name and a sentence.
		}

		if(a3.getMissed() > 6) { // the if statement for a1(Jess), using if and else statement. if the missed number is more than 6, if activates.
			System.out.println("I'm sorry " + a3.getName() + ". You failed this course."); // showing name and a sentence.
			System.out.println(a3.getName() + " - number of absence : " + a3.getMissed()); // showing name and number of missed class.
		}
		else {
			System.out.println("We'll see the grade, " + a3.getName()); // if missed number is not more than 6, else activates. showing a name and a sentence.
		}

		if(a4.getMissed() > 6) { // the if statement for a1(Jess), using if and else statement. if the missed number is more than 6, if activates.
			System.out.println("I'm sorry " + a4.getName() + ". You failed this course."); // showing name and a sentence.
			System.out.println(a4.getName() + " - number of absence : " + a4.getMissed()); // showing name and number of missed class.
		}
		else {
			System.out.println("We'll see the grade, " + a4.getName()); // if missed number is not more than 6, else activates. showing a name and a sentence.
		}

	}//end of main

} // end of class.