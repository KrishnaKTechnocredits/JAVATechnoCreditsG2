package shashank;

public class DuplicateNumSearch 
{
	static void findDupNum(int[] numbers)
	{
		int[] dummyInt=new int[11];
		for(int index=0; index<numbers.length; index++)
		{
			dummyInt[numbers[index]]=dummyInt[numbers[index]]+1;
					//numbers[index];
		}
		for(int index=1; index<dummyInt.length; index++)
		{
			if (dummyInt[index]>1)
				System.out.println(index+" is replicated "+ dummyInt[index]+" times.");
		}
	}
	
	public static void main(String[] args) 
	{
		findDupNum(new UserInputArrayInt().takeUserInputArrayInt());
	}
}

//3 2 3 4 

