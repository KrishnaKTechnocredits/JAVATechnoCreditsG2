package shashank;

public class ArrayAverageNum_Q9Feb10 
{
	public static void main(String[] args) 
	{
		ArrayAverageNum_Q9Feb10 aan = new ArrayAverageNum_Q9Feb10();
		System.out.println("Average of the numbers of input array is: "+aan.averageOfArrayNumbers(UserInputArrayConverter.takeInputFromUserInt()));
	}
	
	double averageOfArrayNumbers(int arr[])
	{
		double average=0;
		double sum=0;
		for (int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];
		}
		average=sum/(double)arr.length;
		return average;	
		
	}
	
}
