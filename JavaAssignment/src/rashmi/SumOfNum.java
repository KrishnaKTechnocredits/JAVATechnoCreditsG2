package rashmi;

import java.util.Scanner;

// find the sum of user given number

public class SumOfNum 
{
	int findSum(int num)
	{
		int temp1,temp2=0;
		for(int i=0;i<num;i++)
		{
			
			temp1=num%10;
			temp2=temp2+temp1;
			num=num/10;	
		}return temp2;
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		SumOfNum obj = new SumOfNum();
		int sum=obj.findSum(num);
        System.out.println(sum);
	}

}
