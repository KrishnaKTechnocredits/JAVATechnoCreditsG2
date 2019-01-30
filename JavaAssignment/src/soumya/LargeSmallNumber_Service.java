package soumya;

import java.util.Scanner;

public class LargeSmallNumber_Service {
	int max=0;
	int min;
	int arr[];
	int tNo;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements in an array: ");
		tNo = sc.nextInt();
		arr = new int[tNo];
		System.out.println("Enter array for finding maximum and minimum numbers : ");
		for (int index = 0; index < arr.length; index++) {
			arr[index] = sc.nextInt();
		}
		sc.close();

}
	void max()
	{
		
		for (int index = 0; index < arr.length; index++) {
			//max=arr[index];//8,9
			if (max < arr[index]) {//8<9,9<4
				max = arr[index];//9
			}
			else if(max >arr[index])
			{
				 
				
			}
		}
		System.out.println("Maximum number is: "+ max);
		
	}
	void min()
	{
		for (int index = 0; index < arr.length-1; index++) {
			//146,41
			min=arr[index];
			if (arr[index]<arr[index+1]) {//146>1897,146>235,146>41,41>87,41>4699
				
				System.out.println(min);
				//min=arr[index];
				//System.out.println(min+","+arr[index+1]+"Minimum number is: "+ min);
			}
			else 
				
			{min=arr[index+1];
			System.out.println("/////////"+min);
				//min=arr[index];
				//min=arr[index+1];
				//min=arr[index];//146,41
				//System.out.println(min+","+arr[index+1]+"Minimum number is: "+ min);
				
			}
			
		}
		//146 1897 235 41 87 4699
		System.out.println("Minimum number is: "+ min);
		
	}
	
}
