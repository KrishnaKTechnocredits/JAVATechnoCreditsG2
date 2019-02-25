package shashank;

import java.util.Scanner;

public class FibonacciSeries_Q7Feb10 
{
	int fibonacciSeries(int num)
	{
		int fibonacci=1;
		while(num>0)
		{
			fibonacci=fibonacci*num;
			num=num-1;
		}
		return fibonacci;
	}
	
	public static void main(String[] args) 
	{
		FibonacciSeries_Q7Feb10 fs = new FibonacciSeries_Q7Feb10();
		System.out.println("Please enter the number: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Fibonacci output of input number is: "+fs.fibonacciSeries(sc.nextInt()));
	}
}
