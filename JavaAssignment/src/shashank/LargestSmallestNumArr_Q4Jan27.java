package shashank;

//Program to find Largest and smallest number in unsorted array
public class LargestSmallestNumArr_Q4Jan27 
{
	public static void main(String[] args) 
	{
		int inputArr[]=UserInputArrayConverter.takeInputFromUserInt();
		System.out.println("Largest number in the givern array is : "+MaxMinNumArray.maxNumArr(inputArr)  //Uses output of other class's method
		+" and the smallest number is : "+MaxMinNumArray.minNumArr(inputArr));
	}

}
