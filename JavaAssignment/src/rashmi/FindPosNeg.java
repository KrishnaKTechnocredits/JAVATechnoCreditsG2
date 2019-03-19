package rashmi;

//find the positive and negative numbers from the given array and find the sum of positive negative numbers

public class FindPosNeg 
{
	int findingPos(int[] array)
	{
		int posSum=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]>=0)
			{
				System.out.println("Positive numbers are  " +array[i]);
				posSum=array[i]+posSum;
			}
		}
		return posSum;	
	}
	int findingNeg(int[] array)
	{
		int negSum=0;
		for(int i=0;i<array.length;i++)
		{
			if(array[i]<0)
			{
				System.out.println("Positive numbers are  " +array[i]);
				negSum=array[i]+negSum;
			}
		}
		return negSum;
	}

	public static void main(String[] args) 
	{
		int[] array = {5,6,-9,14,-25,6,7,-14};
		FindPosNeg obj = new FindPosNeg();
		int posSum=obj.findingPos(array);
		int negSum=obj.findingNeg(array);
		System.out.println("Positive count is  " +posSum +" Negavitive count is  " +negSum);

	}

}
