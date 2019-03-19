package rashmi;

import java.util.Scanner;

public class LargestOf3 {
   
	void findLarge(int num1,int num2,int num3)
	{
		if(num1 > num2 && num1 > num3)
			System.out.println(num1);
		
		else if(num2 > num3 && num2 > num1)
			System.out.println(num2);
		
		else
			System.out.println(num3);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		LargestOf3 l = new LargestOf3();
		l.findLarge(num1,num2,num3);
		
	}

}
