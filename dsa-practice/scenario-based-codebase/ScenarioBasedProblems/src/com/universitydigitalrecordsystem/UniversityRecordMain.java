package com.universitydigitalrecordsystem;

public class UniversityRecordMain {
	public static void main(String[] args) {
		BST studentRecords = new BST();

		System.out.println("========================================================");
		System.out.println("         UNIVERSITY STUDENT DIGITAL RECORDS");
		System.out.println("========================================================");

		// Scenario 1: Insertions (new enrollments)
		studentRecords.insert(new Student("0111IT221124", "Shivam Mishra", "IT", 4));
		studentRecords.insert(new Student("0111CS221060", "Ayush Mishra", "CSE", 3));
		studentRecords.insert(new Student("0111CS251003", "Gourav Thakur", "ME", 2));
		studentRecords.insert(new Student("0111CS251004", "Rohit Gupta", "ECE", 1));
		studentRecords.insert(new Student("0111CS251005", "Hariom Roy", "IT", 4));

		System.out.println("After inserting 5 students (sorted order):");
		studentRecords.printSorted();

		// Scenario 3: Search example
		System.out.println("\nSearching for roll number: 0111CS251005");
		Student found = studentRecords.search("0111CS251005");
		if (found != null) {
			System.out.println("Found:\n" + found);
		} else {
			System.out.println("Not found");
		}

		// Scenario 2: Deletion (student leaves)
		System.out.println("\nDeleting student 0111CS251005 (left university)");
		studentRecords.delete("0111CS251005");

		System.out.println("\nUpdated sorted list after deletion:");
		studentRecords.printSorted();

		System.out.println("\nBST maintains sorted order automatically - useful for attendance lists!");
	}
}