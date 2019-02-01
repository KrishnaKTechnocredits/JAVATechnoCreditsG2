//Q4 largest and smallest in unsorted array
package ArrayPrograms;

import java.util.Scanner;

public class LargestSmallest {
	public void inputffromUser() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array :");
		int size = sc.nextInt();
		System.out.println("Enter Numbers:");
		int[] num = new int[size];
		for (int index = 0; index < num.length; index++) {
			num[index] = sc.nextInt();
		}
		System.out.println("Entered numbers are :");
		for (int index = 0; index < num.length; index++) {
			System.out.println(num[index]);
		}
		int smallest = num[0];
		int largest = num[0];
		for(int index=1; index<num.length;index++)
		{
			if(num[index]>largest)
			{
				largest = num[index];
			}
			else if(num[index]<smallest)
			{
				smallest=num[index];
			}
		}
		System.out.println("The largest number in array is "+largest);
		System.out.println("The smallest number in array is "+smallest);
		
	}

	public static void main(String[] args) {
		LargestSmallest ls = new LargestSmallest();
		ls.inputffromUser();

	}

}
