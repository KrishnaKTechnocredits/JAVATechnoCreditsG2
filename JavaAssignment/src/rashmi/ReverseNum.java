package rashmi;

import java.util.Scanner;

public class ReverseNum 
{
	void reverse(int num)
	{
		int temp1=0,temp2=0;
		
		while(num>0)
		{
			temp1=num%10;
			temp2=temp2*10+temp1;
			num=num/10;
			System.out.print(temp1);
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ReverseNum obj = new ReverseNum();
		obj.reverse(num);
	}

}
