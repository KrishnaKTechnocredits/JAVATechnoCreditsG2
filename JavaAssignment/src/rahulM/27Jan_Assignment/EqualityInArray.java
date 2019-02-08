//Q6 WAP java check equalities to array
package ArrayPrograms;

import java.util.Scanner;

public class EqualityInArray {

	static void checkequality (int[] arr1, int[] arr2, int size1, int size2)
	{
		boolean equal = true;
		if (size1 != size2)
		{
			equal = false;
		System.out.println("Arrays are not equal");
		}
		if(arr1.length == arr2.length)
		{
			for (int index = 0;index<arr1.length;index++)
			{
				if(arr1[index]!=arr2[index])
				{
					equal = false;
				}
			}
		}
		if(equal == true)
			System.out.println("Arrays are equal");
		else
			System.out.println("Arrays are not equal");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of first array");
		int size1 = sc.nextInt();
		System.out.println("Enter size of Second array");
		int size2 = sc.nextInt();
		System.out.println("Enter Numbers of first array");
		int[] arr1 = new int[size1];
		for (int index=0;index<arr1.length;index++)
		{
			arr1[index] = sc.nextInt();
		}
		System.out.println("Enter Numbers of Second array");
		int[] arr2 = new int[size2];
		for (int index=0;index<arr2.length;index++)
		{
			arr2[index] = sc.nextInt();
		}
		checkequality(arr1,arr2, size1,size2);
	}

}

