package swapnali;

public class Q4_IdentifySmallestLargestNumber {

	public static void main(String[] args) 
	{
		int num[]=new InputOutputOperation().takeInputFromUser();
		Q4_IdentifySmallestLargestNumber minmax=new Q4_IdentifySmallestLargestNumber();
		minmax.FindSmallestLargestNumber(num);
	}
	//Method to find the numbers
	void FindSmallestLargestNumber(int num[])
	{
		int min=num[0],max=0;
		//Finding the largest number
		for(int index=0;index<num.length;index++)
		{
			if(num[index]>max)
			max=num[index];
		}
		System.out.println("Largest number is: "+max);		
		//Finding the smallest number
		for(int count=1;count<num.length;count++)
		{
			if(num[count]<min)
			min=num[count];
		}
		System.out.println("Smallest number is: "+min);
	}
}
