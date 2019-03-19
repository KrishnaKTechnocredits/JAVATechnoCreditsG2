package shashank;

//Program to find second largest element in an array of integers
public class SecondLargestNumArr_Q5Jan27 
{
	int findSecLargestNum(int num[])
	{
		int largest=num[0], secLargest=num[1];
		if (largest<secLargest)
		{
			secLargest=num[0];
			largest=num[1];
		}
		for (int index=2; index<num.length; index++)
		{
			if(num[index]>secLargest && num[index]<largest)
				secLargest=num[index];
			else if(num[index]>largest)
			{
				secLargest=largest;
				largest=num[index];
			}
			else if(secLargest==largest && num[index]<secLargest)   // This is for the inputs like {1,1,1,1,0}
				secLargest=num[index];	
		}
		
		return secLargest;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Second largest number of the array is : "+new SecondLargestNumArr_Q5Jan27().findSecLargestNum(UserInputArrayConverter.takeInputFromUserInt()));
	}
}
