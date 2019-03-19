package shashank;

import java.util.Scanner;

public class Calculator_Q4Feb03 
{
	int calculation(int operation, int num1, int num2)
	{
		int output=0;
		switch(operation)
		{
			case 1:
				output=num1+num2;
				break;
			case 2:
				output=num1-num2;
				break;
			case 3:
				output=num1*num2;
				break;
			case 4:
				output=num1/num2;
				break;
			case 5:
				output=num1%num2;
				break;
		}
		return output;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Please enter two numbers on which operation needs to be performed");
		Scanner sc = new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		System.out.println("Please select any one operation: 1.Addition 2.Subtraction 3.Multiplication 4.Devision 5.Modulo");
		Calculator_Q4Feb03 cal = new Calculator_Q4Feb03();
		System.out.println("Operation on 2 input numbers gives output as : "+cal.calculation(sc.nextInt(), num1, num2));
	}
}
