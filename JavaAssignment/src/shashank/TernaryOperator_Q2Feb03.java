package shashank;

import java.util.Scanner;

public class TernaryOperator_Q2Feb03 {
	int findGreaterNum(int num1, int num2)
	{
		return (num1>num2 ? num1 : num2);
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter 2 numbers of which greater is to be find: ");
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		TernaryOperator_Q2Feb03 TO1= new TernaryOperator_Q2Feb03();
		if (num1==num2)
			System.out.println("Both numbers are equal");
		else
			System.out.println("The greater number is : "+ TO1.findGreaterNum(num1, num2));
	}

}
