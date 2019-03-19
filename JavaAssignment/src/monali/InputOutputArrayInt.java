package monali;

import java.util.Scanner;

public class InputOutputArrayInt {
	Scanner sc = new Scanner(System.in);
	int[] takeInputFromUser() {
		
		System.out.println("Enter size of elements: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("Enter input numbers: ");

		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		return arr;

	}
	
	int takeNumber()
	{
		System.out.println("Enter value : ");
		int num=sc.nextInt();
		return num;
	}
	
}
