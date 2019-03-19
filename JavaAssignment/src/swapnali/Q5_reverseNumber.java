package swapnali;

import java.util.Scanner;

public class Q5_reverseNumber {
	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the count of numbers: ");
	int length=scanner.nextInt();
	int number[]=new int[length];
	for(int index=0;index<number.length;index++)
	{
		number[index]=scanner.nextInt();
	}
	scanner.close();
	Q5_reverseNumber reverseNumber=new Q5_reverseNumber();
	reverseNumber.reverseTheNumber(number);
	}
	

	void reverseTheNumber(int number[]) {
		int reverse[] = new int[number.length], j = 0;
		for (int index = number.length - 1; index >= 0; index--)
		{
			reverse[j] = number[index];
			j++;
		}
		for (j = 0; j < reverse.length; j++) 
		{
			System.out.print(+reverse[j]);
		}
	}
}
