package shashank;

import java.util.Scanner;

public class Vowel_Q8Feb10 
{
	public static void main(String[] args) {
		System.out.println("Please enter string : ");
		Scanner sc =new Scanner(System.in);
		Vowel_Q8Feb10 v= new Vowel_Q8Feb10();
		System.out.println("Number of vowels in the string are : "+v.findNumberOfVowels(sc.nextLine()));
	}
	
	int findNumberOfVowels(String str)
	{
		int countVowel=0;
		str=str.toLowerCase();
		for (int index=0; index<str.length(); index++)
		{
			if (str.charAt(index)=='a'||str.charAt(index)=='e'||str.charAt(index)=='i'||str.charAt(index)=='o'||str.charAt(index)=='u')
				countVowel++;
		}
		return countVowel;
	}
}
