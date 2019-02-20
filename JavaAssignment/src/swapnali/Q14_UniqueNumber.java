package swapnali;

public class Q14_UniqueNumber  {
	static int count =0;
	static boolean setZeroFlag = false;

	public static void main(String[] args) {
		int FirstArray[]=new InputOutputOperation().takeInputFromUser();		
		int SecondArray[]=new InputOutputOperation().takeInputFromUser();	
		int resultArray[]=new int[FirstArray.length+SecondArray.length];
		
		for(int i=0; i<FirstArray.length; i++)
		{
			setElement(resultArray, FirstArray[i]);
		}
		
		for(int i=0; i<SecondArray.length; i++)
		{
			setElement(resultArray, SecondArray[i]);
		}
		displayArray(resultArray);
	}
	static void setElement(int[] resultArray, int temp)
	{
		boolean flag = false;
		
		for(int index=0; index<resultArray.length; index++)
		{
			if(resultArray[index]==temp)
			{  
				flag = true;
				break;
			}
		}
		
		if(temp==0 && setZeroFlag == false)
		{
			resultArray[count] = temp; 
			setZeroFlag = true;
			count++;
		}
		
		if(flag==false)
		{
			resultArray[count] = temp;  
			count++;
		}
	}
	
	static void displayArray(int resultArray[])
	{
		for(int index=0; index<count; index++)
		{
			 System.out.println(resultArray[index]);
		}
		
	}
		
}