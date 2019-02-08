package shashank;

import java.util.Scanner;

public class Addition_Feb03 
{
	void add(int num1, int num2)
	{
		System.out.println("Addition of two input integers is "+(num1+num2));
	}

	void add(float val1, float val2)
	{
		System.out.println("Addition of two input decimal values is "+(val1+val2));
	}
	
	void add(String str1, String str2)
	{
		System.out.println("Concatenation of two input strings is "+str1+str2);
	}

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Addition_Feb03 ad = new Addition_Feb03();
		System.out.println("What values you want to add/concatenate? 1. Integers 2. Decimal 3. String");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Please enter 2 integer values to add - ");
			ad.add(sc.nextInt(), sc.nextInt());
			break;
		case 2:
			System.out.println("Please enter 2 decimal values to add - ");
			ad.add(sc.nextFloat(), sc.nextFloat());
			break;
		case 3: 
			System.out.println("Please enter 2 strings to concatenate - ");
			ad.add(sc.next(), sc.next());
			break;
		default: 
				System.out.println("Invalid input");
	
		}
	}	
}


