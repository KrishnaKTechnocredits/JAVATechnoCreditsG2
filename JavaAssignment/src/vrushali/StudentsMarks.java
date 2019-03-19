package vrushali;

import java.util.Scanner;

public class StudentsMarks {
	public static void main(String[] args) {
		StudentsMarks stdmarks = new StudentsMarks();
		stdmarks.studentMarksCalc();
	}

	public void studentMarksCalc() {
		System.out.println("Please enter marks to know student result");
		Scanner sc = new Scanner(System.in);
		int marks = sc.nextInt();

		if (marks > 0 && marks < 50) {
			System.out.println("FAILED");
		} else if (marks >= 50 && marks < 75) {
			System.out.println("1 Class");
		} else if (marks >= 75 && marks < 100) {
			System.out.println("Distiction");
		} else {
			System.out.println("Invalid marks entered");
		}
	}

}
