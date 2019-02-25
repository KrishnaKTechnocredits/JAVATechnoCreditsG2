package shashank;

public class SumTwoArray_Q10Feb10 
{
	public static void main(String[] args) 
	{
		SumTwoArray_Q10Feb10 sta = new SumTwoArray_Q10Feb10();
		double sum1=sta.arraySum(UserInputArrayConverter.takeInputFromUserInt());
		double sum2=sta.arraySum(UserInputArrayConverter.takeInputFromUserInt());
		System.out.println("Sum of inetegeres of two arrays is : "+(sum1+sum2));
	}
	
	double arraySum(int arr[])
	{
		double sum=0;
		for (int i=0; i<arr.length; i++)
		{
			sum=arr[i]+sum;
		}
		System.out.println(sum);
		return sum;
	}
}
