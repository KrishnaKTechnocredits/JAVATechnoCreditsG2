package shashank;

import java.util.Scanner;

public class SumOfNumbers_Q4Feb10 
{
	
	int sumOfIntergersInNumber(int num)
	{		
		//int length= String.valueOf(num).length();
		//System.out.println(length);
		int sumNum=0;
		int rem=0;
		
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sumNum=sumNum+rem;
		}
		
		/*div=num/100;  123
		num=num-(div*100);
		sumNum=div;
		div=num/10;
		num=num-(div*10);
		sumNum=sumNum+div+num;*/
		
		return sumNum;
	}
	public static void main(String[] args) {
		System.out.println("Please enter the number: ");
		Scanner sc = new Scanner(System.in);
		SumOfNumbers_Q4Feb10 sm = new SumOfNumbers_Q4Feb10();
		System.out.println("Sum of digits is : "+sm.sumOfIntergersInNumber(sc.nextInt()));
	}
		
}

