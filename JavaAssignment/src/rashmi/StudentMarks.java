package rashmi;

import java.util.Scanner;

public class StudentMarks 
{
	void studentGrade(int marks)
	{
		if(marks>=75 && marks<=100)
		{
			System.out.println("Distinction");
		}
		else if(marks>=50 && marks<75)
		{
			System.out.println("First Class");
		}
		else if(marks<50)
		{
			System.out.println("Fail");
		}
	}
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
		int marks=sc.nextInt();
		StudentMarks obj = new StudentMarks();
		obj.studentGrade(marks);
    }
}
