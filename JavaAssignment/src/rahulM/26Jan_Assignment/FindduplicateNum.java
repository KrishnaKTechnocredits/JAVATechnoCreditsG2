package array_1;

public class FindduplicateNum {

	public static void main(String[] args) {
		findDupNum(new UserInputArray().takeUserInputArrayInt());

	}
	static void findDupNum(int[] elements)
	{
		
		int[] tempInt= new int[11];
		for (int index=0; index<elements.length;index++)
		{
			tempInt[elements[index]]= tempInt[elements[index]]+1;
		}
		for(int index=1;index<tempInt.length;index++)
		{
			if (tempInt[index]>1)
				System.out.println(index+" is duplicate number and repeated "+tempInt[index]+ " times");
		}
	}

}
