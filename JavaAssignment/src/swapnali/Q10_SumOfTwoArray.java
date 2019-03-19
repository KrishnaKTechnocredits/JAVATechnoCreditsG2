package swapnali;

public class Q10_SumOfTwoArray {
	public static void main(String[] args) {
		
		int FirstArray[]=new InputOutputOperation().takeInputFromUser();		
		int SecondArray[]=new InputOutputOperation().takeInputFromUser();		
		Q10_SumOfTwoArray.sumOfNumber(FirstArray,SecondArray);
		
	}
	static void sumOfNumber(int FirstArray[],int SecondArray[])
	{
		int sum1=0,sum2=0,sum=0;
		for(int index=0;index<FirstArray.length;index++)
		{
			sum1=sum1+FirstArray[index];			
		}		
		for(int count=0;count<SecondArray.length;count++)
		{
			 sum2=sum2+SecondArray[count];
		}		
		sum=sum1+sum2;
		System.out.println("The sum of two array is: "+sum);
	}
}
