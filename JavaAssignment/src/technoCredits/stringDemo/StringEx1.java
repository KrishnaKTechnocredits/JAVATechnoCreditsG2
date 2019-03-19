package technoCredits.stringDemo;

import java.util.Scanner;

// 1. length()
// 2. charAt()
// 3. toLowerCase()
// 4. toUpperCase()

public class StringEx1 {

	void printData(String name, char ch)
	{
		
		/*if('d' != 'a' && ch != 'd')
		{
			System.out.println("Invalid input");
			return;
		}*/
		
		if(ch == 'a' || ch == 'A')
		{
			printAllChar(name);
		}else if(ch == 'd' || ch =='D'){
			printAllCharR(name);
		}
		
	}
	void printAllChar(String name)
	{
		for(int i=0;i<name.length();i++){
			System.out.println(name.charAt(i));
		}
		
	}
	
	void printAllCharR(String name)
	{
		/*//Maulik [6]
		 M -> 0
		   a -> 1
		   u->  2
		   l -> 3
		   i -> 4
		   k -> 5*/
		
		for(int i = name.length()-1;i>=0;i--)
		{
			System.out.println(name.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name :");
		String name = sc.next();
		//System.out.println(name.toLowerCase());
		StringEx1 ex1 = new StringEx1();
		//ex1.printAllChar(name);
		ex1.printAllCharR(name);
	}
}
