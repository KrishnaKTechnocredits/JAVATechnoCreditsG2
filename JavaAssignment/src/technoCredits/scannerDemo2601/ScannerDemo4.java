package technoCredits.scannerDemo2601;

import java.util.Scanner;

public class ScannerDemo4 {
	
	int sum(int[] x)
	{
		int sum =0;
		for(int i=0;i<x.length;i++)
		{
			sum = sum + x[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of students:");
		Scanner sc = new Scanner(System.in);
		int totalStudents = sc.nextInt();
		System.out.println("Total students : " + totalStudents);
		
		int[] stdMarks = new int[totalStudents];
		for(int i=0;i<stdMarks.length;i++)
		{
			stdMarks[i] = sc.nextInt();
		}
		System.out.println("Values taken");
		
		ScannerDemo4 scannerDemo4 = new ScannerDemo4();
		int totalSum = scannerDemo4.sum(stdMarks);
		System.out.println(totalSum);
		/*int sum=0;
		for(int i=0;i<student.length;i++){
			System.out.println(student[i]);
			sum = sum+student[i];
		}
		System.out.println(sum);*/
	}
}
