/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package model;

public class Student {
	//declare fields
	private String firstName;
	private String lastName;
	private String idNum;
	private int grade;
	private double gpa;
	
	//declare default constructor
	public Student() {
		this.firstName = "";
		this.lastName = "";
		this.idNum = "";
		this.grade = 0;
		this.gpa = 0.0;
	}//end default constructor

	//declare non-default constructor with all fields
	public Student(String firstName, String lastName, String idNum, int grade, double gpa) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNum = idNum;
		setGrade(grade);
		setGpa(gpa);
	}//end non-default constructor

	//declare getters and setters
	public String getFirstName() {
		return firstName;
	}//end getFirstName

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}//end setFirstName

	public String getLastName() {
		return lastName;
	}//end getLastName

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}//end setLastName

	public String getIdNum() {
		return idNum;
	}//end getIdNum

	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}//end setIdNum

	public int getGrade() {
		return grade;
	}//end getGrade

	public void setGrade(int grade) {
		final int KINDERGARTEN = 0;
		final int SENIOR_YEAR = 12;
		
		if (grade >= KINDERGARTEN && grade <= SENIOR_YEAR) {
			this.grade = grade;
		}//end if
	}//end setGrade

	public double getGpa() {
		return gpa;
	}//end getGpa

	public void setGpa(double gpa) {
		final double LOWEST_GPA = 0.0;
		final double HIGHEST_GPA = 4.0;
		
		if (gpa >= LOWEST_GPA && gpa <= HIGHEST_GPA) {
			this.gpa = gpa;
		}//end if
	}//end setGpa
	
	//method to determine school
	public String schoolAttended() {
		final int ELEMENTARY = 5;
		final int MIDDLE = 8;
		
		if (grade <= ELEMENTARY) {
			return "Elementary School";
		}//end if
		else if (this.grade <= MIDDLE) {
			return "Middle School";
		}//end else if
		else {
			return "High School";
		}//end else
	}//end schoolAttended
	
	//method to determine good academic standing
	public boolean isGoodAcademicStanding() {
		final double GOOD_STANDING = 2.0;
		
		if (gpa >= GOOD_STANDING) {
			return true;
		}//end if
		else {
			return false;
		}//end else
	}//end isGoodAcademicStanding
	
	//method to print student data
	public String printStudent() {
		return "Name: " + lastName + ", " + firstName + "\nID: " + idNum + 
				"\nSchool: " + schoolAttended() + ", grade " + grade + "\nGPA: " + gpa;
	}//end printStudent
}//end Student
