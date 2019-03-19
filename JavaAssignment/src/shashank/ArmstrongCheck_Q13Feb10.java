package shashank;

import java.util.Scanner;

public class ArmstrongCheck_Q13Feb10 
{
	public static void main(String[] args) 
	{
		ArmstrongCheck_Q13Feb10 ac = new ArmstrongCheck_Q13Feb10();
		System.out.println("Please enter the number : ");
		Scanner sc = new Scanner (System.in);
		int num1=sc.nextInt();
		int num2=ac.numberArmstrongCheck(num1);
		if(num1==num2)
			System.out.println("Number is Armstrong!");
		else
			System.out.println("Number is not Armstrong!");
	}
	
	int numberArmstrongCheck(int num)
	{
		int armNum=0;
		int rem=0;
		while(num>0)
		{
			rem=num%10;
			armNum=armNum+rem*rem*rem;
			num=num/10;
		}
		return armNum;
	}
}
