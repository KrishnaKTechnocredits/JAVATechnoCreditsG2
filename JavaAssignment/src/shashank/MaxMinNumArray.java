package shashank;

//Program to calculate maximum and minimum number from the integer array
public class MaxMinNumArray 
{
	static int maxNumArr(int num[])   // Returns maximum value from the integer array
	{
		int maxNum=num[0];
		for (int index=1; index<num.length; index++)
		{
			if (num[index]>maxNum)
				maxNum=num[index];
		}
		return maxNum;
	}
	
	static int minNumArr(int num[])    // Returns minimum value from the integer array
	{
		int minNum=num[0];
		for (int index=1; index<num.length; index++)
		{
			if (num[index]<minNum)
				minNum=num[index];
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		System.out.println("Maximum is: "+maxNumArr(UserInputArrayConverter.takeInputFromUserInt()));
		System.out.println("Minimum is: "+minNumArr(UserInputArrayConverter.takeInputFromUserInt()));
	}
}
