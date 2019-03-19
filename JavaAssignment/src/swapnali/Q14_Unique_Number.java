package swapnali;

public class Q14_Unique_Number {
static int count=0;

	public static void main(String[] args) {
		
		int FirstArray[]=new InputOutputOperation().takeInputFromUser();		
		int SecondArray[]=new InputOutputOperation().takeInputFromUser();	
		int resultArray[]=new int[FirstArray.length+SecondArray.length];
		for(int index=0;index<FirstArray.length;index++)
		{
			printUniqurNumbers(resultArray, FirstArray[index]);
		}
		for(int index=0;index<SecondArray.length;index++)
		{
			printUniqurNumbers(resultArray, SecondArray[index]);
		}
			display(resultArray);			
	}
	
	static void printUniqurNumbers(int resultArray[],int temp)
	{
		boolean flag=false;
		for(int index=0;index<resultArray.length;index++)
		{
			if(resultArray[index]==temp)
			{
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			resultArray[count]=temp;
			count++;			
		}
	}		
	
	static void display(int resultArray[])
	{	
		for(int index=0;index<resultArray.length;index++)
		{	
			if(resultArray[index]!=0)
			{
					System.out.println(resultArray[index]);
			}		
		}
	}
}
