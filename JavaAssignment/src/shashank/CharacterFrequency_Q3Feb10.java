package shashank;

import java.util.Scanner;

public class CharacterFrequency_Q3Feb10 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the string : ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println("Please enter the character to be found: ");
		String str1 = sc.next();
		char c= str1.charAt(0);
		CharacterFrequency_Q3Feb10 cf = new CharacterFrequency_Q3Feb10();
		System.out.println(c+" has occured "+cf.findCharacterFrequency(str, c)+" times in the given string");
	}
	
	int findCharacterFrequency(String str, char c)
	{
		int charcount=0;
		char charArr[] = str.toCharArray();
		for (int index=0; index<charArr.length; index++)
		{
			if (charArr[index]==c)
				charcount++;
		}
		return charcount;
	}
}
