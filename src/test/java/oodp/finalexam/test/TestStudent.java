package oodp.finalexam.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


import oodp.finalexam.student.Student;
import oodp.finalexam.student.StudentReader;

public class TestStudent {
	StudentReader sr;
	Student student;
	List<Student> students = new ArrayList<>();
	String fileName = "students.txt";
	
	
	@Before
	public void setup() {
		sr = new StudentReader();
	}
	
	@Test
	public void testLoadStudent() {
		students = sr.loadStudents(fileName);
		Student st;
		
		st = students.get(0);
		assertTrue(st.getId().equals("001"));
		assertTrue(st.getName().equals("Anna"));
		assertTrue(st.getYear()==1);
		assertTrue(st.getGPA()==3.00);
		
		st = students.get(1);
		assertTrue(st.getId().equals("002"));
		assertTrue(st.getName().equals("Bee"));
		assertTrue(st.getYear()==2);
		assertTrue(st.getGPA()==3.02);
		
		st = students.get(2);
		assertTrue(st.getId().equals("003"));
		assertTrue(st.getName().equals("Cat"));
		assertTrue(st.getYear()==3);
		assertTrue(st.getGPA()==3.03);		

	}
	@Test
	public void testprintStudentsArray() {
		//List<Student> students
		students = sr.loadStudents(fileName);
		Student st = sr.getHighestGPA(students);
		assertTrue(st.getId().equals("003"));
	}
	
	@Test
	public void testsearchByID() {
		
		students = sr.loadStudents(fileName);
		String temp = sr.searchByID("002",students);		
		assertTrue(temp.equals("002 is Bee"));
		
		temp = sr.searchByID("005",students);	
		assertTrue(temp.equals("005 is not in the student list."));
	}
	
	@Test
	public void testtoString() {
		student =  new Student("David", "004", 4, 3.05);
		
		String temp = student.toString();

		assertTrue(temp.equals("Student ID:004, name:David, year:4 ,GPA:3.05"));
	}
	
}
