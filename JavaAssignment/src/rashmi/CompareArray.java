package rashmi;

import java.util.Scanner;

//finding the 1st differ index from given array

public class CompareArray 
{
	void compare(int[] num1,int[] num2)
    {
            
       for(int i=0;i<num1.length;i++)
       {
    	   if(num1[i]!=num2[i])
    	   {
    		   System.out.println(i);
    		   break;
    	   }
    	   
       }
    }
	
	public static void main(String[] args) 
	{
		 InputOutputOperations iop=new InputOutputOperations();
		 int[] num1=iop.takeInputFromUser();
		 int[] num2=iop.takeInputFromUser();
		 CompareArray fmn= new CompareArray();
		 fmn.compare(num1, num2);
	}
}
