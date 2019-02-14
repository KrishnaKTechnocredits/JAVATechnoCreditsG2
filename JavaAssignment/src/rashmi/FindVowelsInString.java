package rashmi;

//Find the number of vowels in given string

public class FindVowelsInString 
{
	void findVowels(String input)
	{
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
			{
				count++;
			}
			
		}System.out.println(count);
		
	}

	public static void main(String[] args) 
	{
		FindVowelsInString obj = new FindVowelsInString();
		obj.findVowels("automation engineering");

	}

}
