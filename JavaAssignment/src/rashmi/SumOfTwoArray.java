package rashmi;

//Find the sum of two arrays

public class SumOfTwoArray 
{
	int findSum(int[] array)
	{
		int sum=0;
		for(int i=0;i<array.length;i++)
		{
			sum=array[i]+sum;
		}
		return sum;
	}


	public static void main(String[] args) 
	{
		int[] array1= {1,5,9,3,7};
		int[] array2= {1,7,9,3};
		SumOfTwoArray obj = new SumOfTwoArray();
		int sum1=obj.findSum(array1);
		int sum2=obj.findSum(array2);
		System.out.println(sum1+sum2);

	}

}
