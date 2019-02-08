package shashank;

import java.util.Scanner;

public class StudentProgress_Q6Feb03 
{
	void studentResult(int marks)
	{
		if (marks>=0 && marks<50)
			System.out.println("Student is failed. Needs improvement!");
		else if (marks>=50 && marks<75)
			System.out.println("Student has received 1st class");
		else if (marks>=75 && marks<=100)
			System.out.println("Congratulations! Studence has passed with distinction");
		else
			System.out.println("Please enter valid input!");
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter student's marks");
		Scanner sc = new Scanner(System.in);
		StudentProgress_Q6Feb03 sp = new StudentProgress_Q6Feb03();
		sp.studentResult(sc.nextInt());
	}
}
