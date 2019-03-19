package swapnali;

public class Q5_PrintSecondLargestNumber {

	public static void main(String[] args) 
	{
		int num[]=new InputOutputOperation().takeInputFromUser();
		Q5_PrintSecondLargestNumber printsecnum=new Q5_PrintSecondLargestNumber();
		printsecnum.FindSmallestLargestNumber(num);
	}
	//Method to find the second largest number
	void FindSmallestLargestNumber(int num[])
	{
		int max=num[0],secMax=0;
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>max)
			{
				secMax=max;
				max=num[i];				
			}
		}
		System.out.println(max +" is the largest number is an array");
		
		for(int i=1;i<num.length;i++)
		{
			if(num[i]<max)
			{
				secMax=num[i];
				
			}
		}		
	}
}
