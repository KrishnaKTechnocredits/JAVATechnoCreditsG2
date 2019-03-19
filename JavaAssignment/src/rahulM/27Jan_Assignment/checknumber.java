//Q3 check if the array contains the number in java?
package ArrayPrograms;

import java.util.Scanner;

public class checknumber {
	static void checkNum(int num[], int n)
	{
		boolean flag =false;
		for(int index=0;index<num.length;index++){
			if (num[index]==n)
			{flag =true;
			break;
			}
		}
		 if(flag==false)
			 System.out.println("Number "+n+" is not present in the array");
		 else 
			 System.out.println("Number "+n+" is present in array");
	}
	
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		System.out.println("Search the below number : ");
		int number =sc.nextInt();
		checkNum(useriparray.takeInputFromUserInt(),number);
		sc.close();
	}

}
