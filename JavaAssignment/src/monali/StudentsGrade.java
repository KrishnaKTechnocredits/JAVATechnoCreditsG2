package monali;

import java.util.Scanner;

public class StudentsGrade {

	void Grade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks: ");
		int marks = sc.nextInt();
		sc.close();
		if (marks >= 0 && marks <= 50)
			System.out.println("FAIILED");
		else if (marks >= 50 && marks <= 75)
			System.out.println("1st Class");
		else if (marks >= 75 && marks <= 100)
			System.out.println("Distinction");
		else
			System.out.println("Entered marks are not valid");
	}

	public static void main(String[] args) {
		StudentsGrade sg = new StudentsGrade();
		sg.Grade();

	}
}
