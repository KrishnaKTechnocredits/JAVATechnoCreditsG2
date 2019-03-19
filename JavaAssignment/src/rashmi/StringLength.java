package rashmi;

//Find the string having length more than 7

public class StringLength 
{
	void length(String[] str)
	{
		for(int i =0; i<str[i].length(); i++)
		{
			if(str[i].length()>7)
			{
				System.out.println(str[i]);
			}
		}
	}

	public static void main(String[] args) 
	{
		String[] str = {"krishna","maulik","aakash","harsh","aakansha","abhishek"};
		StringLength obj = new StringLength();
		obj.length(str);
		
	}

}
