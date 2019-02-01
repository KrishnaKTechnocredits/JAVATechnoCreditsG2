package monali;

public class DifferIndexInArray {
	static void differIndexInArray(int arr1[],int arr2 [])
	{
		boolean flag=true;
		for(int index=0;index<arr1.length;index++)
		{
			if(arr1[index]!=arr2[index])
			{
				flag=false;
				System.out.println("Values are not matching at index -> "+index);
				
			}
		}
	}
	
	public static void main(String[] args) {
		int arr1 [] = {10,2,9,14,3};
		int arr2 [] = {10,2,18,14,13};
		differIndexInArray(arr1,arr2);
			
	}
}
