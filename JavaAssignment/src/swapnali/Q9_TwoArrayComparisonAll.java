package swapnali;
import java.util.Scanner;

public class Q9_TwoArrayComparisonAll {
	
		public static void main(String[] args) 
		{
			int arr1[]=Q9_TwoArrayComparisonAll.takeInputFromUser();
			int arr2[]=Q9_TwoArrayComparisonAll.takeInputFromUser();		
			Q8TwoArrayComparision.IsTwoArrayAreEqual(arr1, arr2);			
		}
		//Method to display all differ index
		static void IsTwoArrayAreEqual(int arr1[],int arr2[])
		{
			if(arr1.length==arr2.length)
			{
				for(int index=0;index<arr1.length;index++)
				{
					if(arr1[index]!=arr2[index])
					{
						System.out.println("Values are not matching at index: " +index);
					}
				}
			}
			
		}		
		//Method to take input from user
		static int[] takeInputFromUser()
		{
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter the count of numbers: ");
			int size = scanner.nextInt();
			int num[]=new int[size];
			
			for(int index=0;index<num.length;index++)
			{
				num[index]=scanner.nextInt();
			}
			return num;
			
		}

}
