package rashmi;

public class PalindromeString 
{
	void reverse(String name)
    {
	 String str="";
    	for(int i=name.length()-1; i>=0;i--)
    	{
    	    str=str+name.charAt(i);
    	}
    	
	    if(name.equals(str))
	    {
	    	System.out.println(name +"  is a Palindrome");
	    }else
	    {
	    	System.out.println(name + "  is not a palindrome");
		}
    }

	public static void main(String[] args) 
	{
		String name = "naman";
		PalindromeString obj = new PalindromeString();
		obj.reverse(name);

	}

}
