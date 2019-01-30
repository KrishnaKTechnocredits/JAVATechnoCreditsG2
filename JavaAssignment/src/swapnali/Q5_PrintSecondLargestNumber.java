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
		for(int index=1;index<num.length;index++)
		{
			if(max < num[index])
			{
				secMax=max;
				max=num[index];
			}
			else
				secMax=num[index];
		}
		System.out.println("Second largest number is: "+secMax);		
	}
}
