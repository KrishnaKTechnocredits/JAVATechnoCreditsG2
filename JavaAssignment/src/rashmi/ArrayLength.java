package rashmi;

import java.util.Scanner;

public class ArrayLength 
{
	void length(int[] num1,int[] num2)
	{
		if(num1.length==num2.length)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
     public static void main(String[] a)
     {
    	Scanner sc=new Scanner(System.in);
     	System.out.println("Enter the size of input");
     	int size1=sc.nextInt();
     	int[] num1=new int[size1];
     	System.out.println("Enter the size of input");
     	int size2=sc.nextInt();
     	int[] num2=new int[size2];
     	ArrayLength obj=new ArrayLength();
     	obj.length(num1, num2);
     }

}
