package rashmi;

import java.util.Scanner;

//find the factorial of number

public class Factorial 
{
	void factorial(int num)
	{
		int factNum=1;
		for(int index=1; index<=num; index++)
		{
			factNum=factNum*index;
			
		}System.out.println(factNum);
		
	}
	

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		Factorial obj = new Factorial();
		obj.factorial(num);
	}

}
