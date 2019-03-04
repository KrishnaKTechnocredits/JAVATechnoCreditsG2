package swapnali;

import java.util.Scanner;

public class Q3_FrequencyOfString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=scanner.nextLine();
		System.out.println("Enter the character to check the frequency: ");
		String temp=scanner.next();
		char ch=temp.charAt(0);
		scanner.close();
		int count=Q3_FrequencyOfString.printFrequencyOfString(str, ch);
		System.out.println("Count of char is : "+count);
		
	}
	static int printFrequencyOfString(String name,char ch)
	{
		int count=0;
		for(int index=0;index<name.length();index++)
		{
			if(name.charAt(index)==ch)
			{
				count++;
			}
		}
		return count;
	}
}
