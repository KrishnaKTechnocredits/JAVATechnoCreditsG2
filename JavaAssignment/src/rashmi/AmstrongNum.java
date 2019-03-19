package rashmi;

import java.util.Scanner;

public class AmstrongNum 
{
	void amstrong(int num)
	{
		int temp1=0,temp2=0;
		int input=num;
		while(num>0)
		{
			temp1=num%10;
			num=num/10;
			temp2=temp2+(temp1*temp1*temp1);
			
		}System.out.print(+temp2  +"  ");
		if(temp2==input)
		{
			System.out.println( "  is a amstrong");
		}
		else
		{
			System.out.println("  is not a amstrong");
		}
	}


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		AmstrongNum obj = new AmstrongNum();
		obj.amstrong(input);
		

	}

}
