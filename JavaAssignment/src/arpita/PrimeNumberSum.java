package arpita;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrimeNumberSum {
	
		public static void main(String[] args) throws IOException
		 {
			int sum=0;
			
			System.out.print ( "Enter the starting number: " );

		    BufferedReader input1 = new BufferedReader ( new InputStreamReader ( System.in ) );

		    String inputString1 = input1.readLine();

		    int firstNumber = Integer.parseInt(inputString1 );

		    System.out.print ( "Enter the last number: " );

		    BufferedReader input2 = new BufferedReader ( new InputStreamReader ( System.in ) );

		    String inputString2 = input2.readLine();

		    int lastNumber = Integer.parseInt( inputString2 );
		    
		    for(int i=firstNumber;i<=lastNumber;i++)
			{
			  boolean b=isPrime(i);
			 if(b==true){
			  System.out.println(i+" is prime");
			 sum=sum+i;
			 }
			}
			System.out.println(sum);
		}
		static boolean isPrime(int num)
		 {
			boolean flag=true;
			
			if(num == 1){
				return false;
			}
			
			for(int i=2;i<=num/2;i++)
			  {
			     if(num%i==0)
				{
				  flag=false;
				  break;
				}
			   }
			 return flag;			  
		}
}
