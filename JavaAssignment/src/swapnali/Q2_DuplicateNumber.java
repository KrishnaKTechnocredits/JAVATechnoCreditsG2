package swapnali;

public class Q2_DuplicateNumber {

	public static void main(String[] args) 
	{
		int num[]=new InputOutputOperation().takeInputFromUser();
		Q2_DuplicateNumber duplicateNumber= new Q2_DuplicateNumber();
		duplicateNumber.displayDuplicate(num);

	}
	//Method to display the duplicate numbers
	void displayDuplicate(int num[])
	{
		for(int index=0;index<num.length;index++)
		{
			for(int count=index+1;count<num.length;count++)
			{
				if(num[index]==num[count])
				{
					System.out.println("Duplicate number of array is: "+num[index]);
					break;
				}
			}
		}
	}
}
