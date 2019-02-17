package technoCredits.scannerDemo2601;

import java.util.Scanner;

/*This program is to take values from user 
and calculate sum of all values.
*/
public class ScannerDemo1 {

	public static void main(String[] args) {
		System.out.println("Enter number:");
		Scanner sc = new Scanner(System.in);
		int[] number = new int[3];
		number[0] = sc.nextInt();
		number[1] = sc.nextInt();
		number[2] = sc.nextInt();
		
		System.out.println("Values taken");
		
		for(int i=0;i<number.length;i++)
		{
			System.out.println(number[i]);
		}
		//System.out.println(num[3]); ArrayIndexOutOfBound
		
		
		
	}
}
