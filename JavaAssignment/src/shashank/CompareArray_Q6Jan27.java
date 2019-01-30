package shashank;

// Program to check the equality of two arrays
public class CompareArray_Q6Jan27 
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
					System.out.println("Two Arrays Are Not Equal");
					flag=true;
					break;
				}
			}
			if(flag==false)
				System.out.println("Two Arrays Are Equal");
		}
		else 
			System.out.println("Two Arrays Are Not Equal");
	}
	
	public static void main(String[] args) {
		CompareArray_Q6Jan27 ca=new CompareArray_Q6Jan27();
		ca.compareArrays();
	}
}
