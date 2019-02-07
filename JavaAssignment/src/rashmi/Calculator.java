package rashmi;

import java.util.Scanner;

public class Calculator 
{    
	 int Add(int num1, int num2)
	 {
	  int res1=num1+num2;
	  return res1;
	 }
	 
	 int Sub(int num1, int num2)
	 {
	 int res2=num1-num2;
	 return res2;
	 }

	 int Mul(int num1, int num2)
	 {
	 int res3=num1*num2;
	 return res3;
	 }

	 int Div(int num1, int num2)
	 {
	 int res4=num1/num2;
	 return res4;
	 }
	 public static void main(String[] args)
	 {
		 Scanner sc=new Scanner(System.in);
		 int num1=sc.nextInt();
		 int num2=sc.nextInt();
		 int choice=sc.nextInt();
		 
		 Calculator cal = new Calculator();
		 switch(choice)
		 {
			case 1: int res1=cal.Add(num1,num2);
			    System.out.println(res1);
				break;
			case 2: int res2=cal.Sub(num1,num2);
			    System.out.println(res2);
				break;
			case 3: int res3=cal.Mul(num1,num2);
			    System.out.println(res3);
				break;
			case 4: int res4=cal.Div(num1,num2);
			    System.out.println(res4);
			default:
				break;
					
	     }
	 }
}
