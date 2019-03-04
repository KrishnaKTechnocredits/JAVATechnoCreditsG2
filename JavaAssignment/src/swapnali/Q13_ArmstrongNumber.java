package swapnali;

import java.util.Scanner;

public class Q13_ArmstrongNumber {
static Scanner scanner;

	public static void main(String[] args) {
		
		Q13_ArmstrongNumber armstrong=new Q13_ArmstrongNumber();
		scanner=new Scanner(System.in);
		System.out.println("Enter the number to check: ");
		int number=scanner.nextInt();
		scanner.close();
		armstrong.checkArmstrongNumber(number);		
	}
	void checkArmstrongNumber(int number)
	{
		int armstrongNo=0,temp=0,num=0;		
		temp=number;
		while(number>0)
		{
			num=number%10;
			number=number/10;
			armstrongNo=armstrongNo+(num*num*num);
		}
		
		if(temp==armstrongNo)
		{
			System.out.println("Entererd number is armstrong number");
		}
		else
		{
			System.out.println("Entererd number is not armstrong number");
		}
	}
}
