package com.constructor.level01;

public class UniversityManagementSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PostgraduateStudent student =
	             new PostgraduateStudent(101, "Shivam Mishra", 7.89, "Information Technology");

	     student.displayDetails();

	     System.out.println("\nUpdating CGPA...\n");

	     // Modifying CGPA using public setter
	     student.setCGPA(8.0);

	     student.displayDetails();
	}

}
 