package shashank;
import java.util.Scanner;

public class UserInputArrayConverter 
{
	static int[] takeInputFromUserInt()
	{
		System.out.println("Please enter the number of inputs: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int IntArr[] = new int[size];
		
		for (int index=0; index<IntArr.length; index++)
		{
			IntArr[index]=sc.nextInt();
		}
		//sc.close();
		return IntArr;	
	}
	
	static String[] takeInputFromUserStr()
	{
		System.out.println("Please enter the number of inputs: ");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String StringArr[] = new String[size];
		
		for (int index=0; index<StringArr.length; index++)
		{
			StringArr[index]=sc.next();
		}
		for (int index=0; index<StringArr.length; index++)
		{
			System.out.println(StringArr[index]);
		}
		//sc.close();
		return StringArr;	
	}	
}
