package soumya;

import java.util.Scanner;

public class StudentMarks_Service {
	double mark;
	int choice;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		mark = sc.nextDouble();
		if (mark > 0 && mark < 50) {
			choice = 1;
		} else if (mark > 50 && mark < 75) {
			choice = 2;
		} else if (mark > 75 && mark < 100) {
			choice = 3;
		}
		sc.close();
	}

	// Method for calculating marks
	void calculateMark() {
		InputOutput();
		switch (choice) {
		case 1:
			System.out.println("Failed");
			break;
		case 2:
			System.out.println("1st Class");
			break;
		case 3:
			System.out.println("Distinction");
			break;
		default:
			System.out.println("Incorrect Marks Entered");
		}
	}
}
