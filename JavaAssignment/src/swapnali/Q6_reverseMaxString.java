package swapnali;

import java.util.Scanner;

public class Q6_reverseMaxString {

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
		String output=Q6_reverseMaxString.printMaxLengthOfString(name);
		System.out.println(output);
		
	}
	
	static String [] display(String name[])
	{
		String output[] = new String[name.length];
		int cnt = name.length-1;
		for (int index = 0; index < name.length; index++) 
		{
			output[cnt] = Q6_reverseMaxString.stringConvert(name[index]);
			cnt--;
		}
		return output;
	}
	static String stringConvert(String name) {
		String reverse = "";

		for (int index = name.length() - 1; index >= 0; index--) {
			reverse = reverse + name.charAt(index);
		}
		return reverse;

	}
	
	static String printMaxLengthOfString(String name[])
	{
		String max="";
		for(int index=0;index<name.length;index++)
		{
			name[index]=Q6_reverseMaxString.stringConvert(name[index]);
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
		return max;
	}

}
