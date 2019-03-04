package swapnali;

import java.util.Scanner;

public class Q8_VowelsOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=scanner.nextLine();
		Q8_VowelsOfString vowels=new Q8_VowelsOfString();
		vowels.printVowelsOfString(str);
	}
	void printVowelsOfString(String str)
	{
		int vowelsCount=0;
		for(int index=0;index<str.length();index++)
		{
			char vowels[]={'a','e','i','o','u'};
			
			for(int count=0;count<vowels.length;count++)
			{
				if(str.charAt(index)==vowels[count])
				{
					System.out.println(vowels[count]);
					vowelsCount=vowelsCount+1;
				}
			}			
		}
		System.out.println("The total count of vowels in given string are: "+vowelsCount);
	}
}
