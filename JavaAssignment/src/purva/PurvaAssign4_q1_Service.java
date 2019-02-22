/*WAP which fulfill below condition
a. WAP to find positive and negative number from the given array
b. check the sum of individual.
Input array;- {5, 6, -9, 14, -25, 6, 7, -14}
Output :- expected output of
a. positive number = {5, 6, 14, 6, 7}
b. negative number = {-9, -25, -14}
c. positive number sum :- 38
d. negative number sum :- 48 
This program is service program and all the functions are defined in service program*/


package purva;

public class PurvaAssign4_q1_Service {
	
	int plength,nlength;
	
	int[] parray = new int[10];
	int[] narray = new int[10];
	
	/*Below method will take input array and from each index it will fetch positive no and put the no is a new array - parray. */
	int[] positiveArray(int[] a)
	{
		for (int index=0; index<a.length;index++)
		{
			if(a[index]>0)
			{
				parray[plength]=a[index];
				plength++;
			}
		}
		return parray;
	}
	
	/*Below method will take input array and from each index it will fetch negative no and put the no is a new array - narray. */
	int[] negativeArray(int[] a)
	{
		for (int index=0; index<a.length;index++)
		{
			if(a[index]<0)
			{
				narray[nlength]=a[index];
				nlength++;
			}
		}
		return narray;
	}
	
	
	/* Below method will take positive array as input and calculate sum of the nos present in that array */
	int positiveArraySum(int[] a)
	{
		int psum = 0;
		
		for(int count = 0; a[count]>0 && count<plength;count++)
		{
			psum = psum + a[count];
		}		
		return psum;
	}
	
	/* Below method will take negative array as input and calculate sum of the nos present in that array */
	int negativeArraySum(int[] a)
	{
		int nsum = 0;
		for(int count = 0; a[count]<0 && count<plength;count++)
		{
			nsum = nsum + a[count];
		}		
		
		return nsum;
	}
			
	/* Below method prints the array in format {a,b,c,d}. 2 for loops are written, 1 for loop for printing positive array and other forloop for printing negative array */
	void displayArray(int[] a)
	{	
		System.out.print("{");
		for(int count = 0; a[count]>0 && count<plength;count++)
		{	
			if(count<plength-1)
			System.out.print(a[count]+",");
			else
			System.out.println(a[count]+"}");			
		}
		for(int count = 0; a[count]<0 && count<nlength;count++)
		{	
			if(count<nlength-1)
			System.out.print(a[count]+",");
			else 
			System.out.println(a[count]+"}");			
		}
		
		
	}
}
