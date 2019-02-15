package swapnali;

import java.util.Scanner;

public class Q2_MaxLengthString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the count of array element: ");
		int size=scanner.nextInt();
		String name[]=new String[size];
		for(int index=0;index<name.length;index++)
		{
			name[index]=scanner.next();
		}
		scanner.close();
		Q2_MaxLengthString.printMaxLengthOfString(name);
	}
	
	static void printMaxLengthOfString(String name[])
	{
		String max="";
		for(int index=0;index<name.length;index++)
		{
			for(int count=index+1;count<name.length;count++)
			{
				if(name[index].length()>name[count].length())
				{
					max=name[index];
				}
				else
				{
					max=name[count];
				}
			}
		}
		System.out.println(max);
	}

}
