package swapnali;

import java.util.Scanner;

public class Q6_EqaulityOfArray {

	public static void main(String[] args) {
		int[] arr1=Q6_EqaulityOfArray.takeInputFromUser();
		int[] arr2=Q6_EqaulityOfArray.takeInputFromUser();
		Q6_EqaulityOfArray eqaulityOfArray= new Q6_EqaulityOfArray();
		
		eqaulityOfArray.IsEqualArray(arr1, arr2);
		
	}
	//Method to check equality of two arrays
	void IsEqualArray(int arr1[],int arr2[])
	{
		
		if(arr1.length==arr2.length)
			System.out.println("Two Arrays Are Equal");
		else
			System.out.println("Two Arrays Are Not Equal");
	}
	//Method to take input from user
	static int[] takeInputFromUser()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the count of numbers: ");
		int dupNum=scanner.nextInt();
			
		int num[]= new int[dupNum];
		
		for(int index=0;index<num.length;index++)
		{
			num[index]=scanner.nextInt();
		}
		
		return num;
		
	}
	
	
}
