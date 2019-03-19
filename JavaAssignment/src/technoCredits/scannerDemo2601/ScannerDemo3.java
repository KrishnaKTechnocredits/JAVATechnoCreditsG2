package technoCredits.scannerDemo2601;

import java.util.Scanner;

public class ScannerDemo3 {
	
	public static void main(String[] args) {
		System.out.println("Enter number of students:");
		Scanner sc = new Scanner(System.in);
		int totalStudents = sc.nextInt();
		System.out.println("Total students : " + totalStudents);
		
		int[] student = new int[totalStudents];
		for(int i=0;i<student.length;i++)
		{
			student[i] = sc.nextInt();
		}
		System.out.println("Values taken");
		int sum=0;
		for(int i=0;i<student.length;i++){
			System.out.println(student[i]);
			sum = sum+student[i];
		}
		System.out.println(sum);
	}
}
