package shashank;

public class PosNegArray_Q1Feb10 
{
	void positiveNegativeArray(int arr[])
	{
		/*int posCount=0;
		int negCount=0;
		*/
		/*for (int index=0; index<arr.length; index++)
		{
			if(arr[index]>0)
			{
				System.out.print(arr[index]+"\t");
				posCount++;
			}
			
			else if(arr[index]<0)
			{
				System.out.print(arr[index]+"\t");
				negCount++;
			}
		}*/
		
		int posArr[]= new int[arr.length];
		int negArr[]= new int[arr.length];
		int posSum=0;
		int negSum=0;
		
		for (int index=0; index<arr.length; index++)
		{
			if(arr[index]>0)
			{
				posArr[index]= arr[index];
			}
			else if(arr[index]<0)
			{
				negArr[index]= arr[index];
			}
		}
		
		System.out.print("\nPositive numbers are : ");
		for (int index=0; index<posArr.length; index++)
		{
			if(posArr[index]!=0)
			{
				System.out.print(posArr[index]+"\t");
				posSum=posSum+posArr[index];
			}
		}
		System.out.println("\nSum of positive numbers is : "+posSum);
		
		System.out.print("\nNegative numbers are : ");
		for (int index=0; index<negArr.length; index++)
		{
			if(negArr[index]!=0)
			{
				System.out.print(negArr[index]+"\t");
				negSum=negSum+negArr[index];
			}
		}
		System.out.println("\nSum of negative numbers is : "+negSum);
		
				
	}
	
	public static void main(String[] args) 
	{
		PosNegArray_Q1Feb10 pna = new PosNegArray_Q1Feb10();
		UserInputArrayInt ua = new UserInputArrayInt();
		pna.positiveNegativeArray(ua.takeUserInputArrayInt());
	
	}
}
