package technoCredits.constructor;

import java.util.Scanner;

public class StudentDetails {
	String stdName;
	int stdAge;
	
	public StudentDetails(String name, int age) {
		stdAge = age;
		stdName = name;
	}
	
	void display()
	{
		System.out.println(stdName);
		System.out.println(stdAge);
		System.out.println("----------------");
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Enter stdname and age");
			StudentDetails s1 = new StudentDetails(sc.next(), sc.nextInt());
			s1.display();
		}
	}
}
