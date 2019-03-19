package rashmi;

//Find the average of given array

public class AverageOfArray 
{
	void findAverage(int[] array)
	{
		float temp=0;
		for(int i=0;i<array.length;i++)
		{
			temp=array[i]+temp;
		}
		float average=temp/array.length;
		System.out.println(average);
	}

	public static void main(String[] args) 
	{
		int[] array= {14,32,19,14,78,36};
		AverageOfArray obj = new AverageOfArray();
		obj.findAverage(array);
		
	}

}
