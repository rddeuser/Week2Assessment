/**
 * @author Becca Deuser - rddeuser
 * CIS175 - Fall 2021
 * Sep 9, 2021
 */
package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Student;

public class StudentTest1 {
	Student student = new Student();
	
	@Before
	public void setUp() throws Exception {
	}//end setUp

	@Test
	public void testAttendElementary() {
		student.setGrade(5);
		String school = "Elementary School";
		assertEquals(school, student.schoolAttended());
	}//end testAttendElementary
	
	@Test
	public void testAttendMiddle() {
		student.setGrade(6);
		String school = "Middle School";
		assertEquals(school, student.schoolAttended());
	}//end testAttendMiddle
	
	@Test
	public void testAttendHighSchool() {
		student.setGrade(11);
		String school = "High School";
		assertEquals(school, student.schoolAttended());
	}//end testAttendHighSchool
	
	

}//end StudentTest1
