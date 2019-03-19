/**WAP to find string which has length more than 7 characheter.
a. Input array ={“krishna”, “maulik”, “aakash”, “harsh”, “aakansha”, ”abhishek”}\
b. Output :- Krishna, aakansha, abhishek*//*
*/
package purva;

import java.util.Scanner;

public class PurvaAssign4_q15_Client {
	private static final String Null = null;

	public static void main(String[] args) {
		
			int count=0;
		
			String[] array = {"krishna", "maulik", "aakash", "harsh", "aakansha", "abhishek"};
			
			//prints input array on console
			System.out.println("Input array = {\"krishna\", \"maulik\", \"aakash\", \"harsh\", \"aakansha\", \"abhishek\"}");
			
			
			//calls method which calculates string elements with len>=7 and returs those elements in array
			PurvaAssign4_q15_Service obj1 = new PurvaAssign4_q15_Service();
			String[] output=obj1.maxLengthString(array);
			
			
			
			
			System.out.print("\n"+"Output string with length greater than or equal to 7 = ");
			
			//array has null values along with strings having len>=7 so with help of count'' it calculates total number of elements which are not Null
			for(int index=0;index<output.length;index++)
			{
				if(output[index]!=Null)
					count++;
			}
			
			//prints the array
			for(int index=0;index<count;index++)
			{
				if(index<=count-2 )
				{
					System.out.print(output[index]+", ");
				}
				else if(index==count-1 )
				{
					System.out.print(output[index]);
				}
				
			}
	}

}
