package rashmi;

//Find the max length string from the given array

public class MaxLengthString 
{
	
	String length(String[] inpArray)
	{
		String str="";
		for(int i=0;i<inpArray.length;i++)
		{
			if(inpArray[i].length()>str.length())
			{
				str=inpArray[i];
			}
		}
		return str;
	}
		

	public static void main(String[] args) 
	{
		String[] inpArray={"all the best","technocredits","maharashtra"};
		MaxLengthString obj = new MaxLengthString();
	    String str=obj.length(inpArray);
	    System.out.println(str);
	}

}
