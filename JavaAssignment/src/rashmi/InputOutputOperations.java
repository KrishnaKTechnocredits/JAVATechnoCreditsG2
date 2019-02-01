package rashmi;

import java.util.Scanner;

public class InputOutputOperations 
{
	public int[] takeInputFromUser()
    {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the size of input");
    	int size=sc.nextInt();
    	int[] num=new int[size];
    	
    	for(int index=0;index<num.length;index++)
    	{
    		num[index]=sc.nextInt();
    	}
    	return num;
    }
    
}
