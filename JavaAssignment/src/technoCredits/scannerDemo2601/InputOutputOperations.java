package technoCredits.scannerDemo2601;

import java.util.Scanner;

public class InputOutputOperations {

	public int[] takeInputFromUserInt()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of inputs :");
		int size = sc.nextInt();
		int[] num = new int[size];
		
		for(int index=0;index<num.length;index++)
		{
			num[index] = sc.nextInt();
		}
		return num;
	}
}
