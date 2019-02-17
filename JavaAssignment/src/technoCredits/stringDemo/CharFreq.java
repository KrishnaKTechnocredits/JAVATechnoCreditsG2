package technoCredits.stringDemo;

import java.util.Scanner;

public class CharFreq {

	int findCharFreq(String name, char ch)
	{
		int count = 0;
		name = name.toLowerCase();
		/*int x = ch + 32;
		System.out.println(x);
		char tem = (char)x;
		System.out.println("**** "+ tem);*/
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i) == ch)
				count++;
		}
		
		return count;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.next();
		System.out.println("Enter char :");
		char ch = sc.next().charAt(0);
		CharFreq charFreq = new CharFreq();
		int cnt = charFreq.findCharFreq(name, ch);
		System.out.println(name + " freq of " + ch + " is " + cnt);
	}
}
