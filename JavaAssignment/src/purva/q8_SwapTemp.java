package purva;

import java.util.Scanner;

public class q8_SwapTemp {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		float num1 = sc.nextFloat();
		System.out.println("Enter 2nd number: ");	
		float num2 = sc.nextFloat();		
		swap(num1,num2);	
		sc.close();
	}
	static void swap(float no1, float no2)
	{
		float temp =no1;
		no1=no2;
		no2=temp;	
		System.out.println("\nNos. after swapping are:"+"\n"+"Number 1 = "+no1+"\n"+"Number 2 = "+no2);
	}
}
