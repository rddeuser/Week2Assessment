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

public class StudentTest2 {
	Student student = new Student();
	
	@Before
	public void setUp() throws Exception {
	}//end setUp

	@Test
	public void testGoodAcademicStanding() {
		student.setGpa(3.6);
		assertTrue(student.isGoodAcademicStanding());
	}//end testGoodAcademicStanding

	@Test
	public void testPoorAcademicStanding() {
		student.setGpa(1.9);
		assertFalse(student.isGoodAcademicStanding());
	}//end testPoorAcademicStanding
	
	@Test
	public void testPrintNotNull() {
		assertNotNull(student.printStudent());
	}//end testPrintNotNull
}//end StudentTest2
