package shashank;

//Program to find max value at differed index
public class MaxDifferIndex_Q10Jan27 
{
	void compareArrays()
	{
		boolean flag=false;
		int temp1[]=UserInputArrayConverter.takeInputFromUserInt();  //First array input 
		int temp2[]=UserInputArrayConverter.takeInputFromUserInt();  //Second array input
		if(temp1.length==temp2.length)
		{
			for (int index=0; index<temp1.length; index++)
			{
				if(temp1[index]!=temp2[index])
				{
					System.out.println("Values are not matching at index -> "+index);
					if(temp1[index]>temp2[index])
						System.out.println("From ("+temp1[index]+","+temp2[index]+") max values is "+temp1[index]);
					else 
						System.out.println("From ("+temp1[index]+","+temp2[index]+") max values is "+temp1[index]);
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
		MaxDifferIndex_Q10Jan27 mdi=new MaxDifferIndex_Q10Jan27();
		mdi.compareArrays();
	}
}
