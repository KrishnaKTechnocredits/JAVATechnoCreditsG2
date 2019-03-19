package shashank;

//Program to find first differ index from given arrays
public class FirstDifference_Q8Jan27 
{
	void compareArrays()
	{
		boolean flag=false;
		int temp1[]=UserInputArrayConverter.takeInputFromUserInt(); //First array input
		int temp2[]=UserInputArrayConverter.takeInputFromUserInt(); //Second array input
		if(temp1.length==temp2.length)
		{
			for (int index=0; index<temp1.length; index++)
			{
				if(temp1[index]!=temp2[index])
				{
					System.out.println("Values are not matching at index -> "+index);
					flag=true;
					break;
				}
			}
			if(flag==false)
				System.out.println("Two Arrays Are Equal");
		}
		else 
			System.out.println("Lengths of Two Arrays Are Not Equal");
	}
	
	public static void main(String[] args) {
		FirstDifference_Q8Jan27 ca=new FirstDifference_Q8Jan27();
		ca.compareArrays();
	}
}
