package rashmi;

import java.util.Scanner;

public class TernaryOperation 
{
	void ternary(int a,int b)
	{
        int maxval;
		maxval=(a>b)?a:b;
		System.out.println(maxval);	
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		TernaryOperation t1 = new TernaryOperation();
		t1.ternary(a,b);
		
	}

}
