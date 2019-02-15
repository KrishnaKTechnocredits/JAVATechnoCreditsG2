package rashmi;

import java.util.Scanner;

//find the frequency of user defined character in user defined string

public class FindChar 
{
	void countChar(String name,char ch)
	{
		int count=0;
		for(int i=0; i<name.length();i++)
		{
			
			if(name.charAt(i)==ch)
			{
				count++;
			}
		
		}
		System.out.println(count);
		
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		char ch=sc.next().charAt(0);
		FindChar obj = new FindChar();
		obj.countChar(name,ch);
	}
}
