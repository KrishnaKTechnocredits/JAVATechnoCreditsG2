package swapnali;

import java.util.Scanner;

public class Q15_StringLengthGreaterThan7 {
	
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the count of array element: ");
		int size=scanner.nextInt();
		String name[]=new String[size];
		for(int index=0;index<name.length;index++)
		{
			name[index]=scanner.next();
		}
		scanner.close();
		Q15_StringLengthGreaterThan7.printMaxLOfString(name);
	}
	
	static void printMaxLOfString(String name[])
	{
		
		String max[]=new String[name.length];
		int i=0;
		for(int index=0;index<name.length;index++)
		{			
				if(name[index].length()>=7)
				{
					max[i]=name[index];
					i++;					
				}
		}
		for(i=0;i<max.length;i++)
		{
			System.out.println(max[i]);
		}
	}


}
