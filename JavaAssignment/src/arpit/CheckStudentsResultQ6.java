package arpit;

import java.util.Scanner;

public class CheckStudentsResultQ6 {

	// This function take the marks from user and display the result.
	void displayResult(int marks) {

		if (marks > 0 & marks < 50) {
			System.out.println("Result of student is: Failed");
		}

		else if (marks >= 50 & marks < 75) {
			System.out.println("Result of student is: First Class");
		}

		else if (marks >= 75 & marks <= 100) {
			System.out.println("Result of student is: Distinction");
		}

		else {
			System.out.println("Result not display");
		}

	}

	public static void main(String[] args) {

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the marks: ");

		// Take marks from user to check result
		int marks = sc.nextInt();

		// Creating object of the class
		CheckStudentsResultQ6 checkResult = new CheckStudentsResultQ6();

		// To call displayResult method and provide marks to that method
		checkResult.displayResult(marks);
		sc.close();

	}

}
