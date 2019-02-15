package rashmi;

//Reverse Max length String

public class ReverseMaxString 
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
	String reverse(String name)
    {
	 String str2="";
    	for(int i=name.length()-1; i>=0;i--)
    	{
    		str2=str2+name.charAt(i);
    	}
    	return str2;
    }

	public static void main(String[] args) 
	{
		String[] inpArray={"all the best","technocredits","maharashtra"};
		ReverseMaxString obj = new ReverseMaxString();
	    String str=obj.length(inpArray);
	    System.out.println(str);
	    String str2=obj.reverse(str);
	    System.out.println(str2);
	}

}
