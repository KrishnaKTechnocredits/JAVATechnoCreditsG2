package soumya;

import java.util.Scanner;

public class Student_Service {
	int rNo, marks;
	String name;

	// Method for getting input from user
	void scannerInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Roll Number:");
		rNo = sc.nextInt();
		System.out.print("Enter Name:");
		name = sc.next();
		System.out.print("Enter marks:");
		marks = sc.nextInt();
	}

	// Method for displaying details
	void details() {
		System.out.println("Student Roll Number is: " + rNo);
		System.out.println("Student Name is: " + name);
		System.out.println("Student Marks is: " + marks);
	}
}
