package swapnali;

import java.util.Scanner;

public class Q6_Student_Marks {

	public static void main(String[] args) {
		
		Q6_Student_Marks student_marks=new Q6_Student_Marks();
		student_marks.calculateGrade();
	}
	void calculateGrade()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the student marks: ");
		int marks = scanner.nextInt();
		scanner.close();

		if (marks>0 && marks<50) {
			System.out.println("Failed");
		}
		else if (marks>50 && marks<75) {
			System.out.println("First Class");
		}
		else if (marks>75 && marks<100) {
			System.out.println("Destinction");
		}
	}
}
