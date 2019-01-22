package shashank;

public class SwapNumbersTwoVars 
{
	void swapNumbers(int num1, int num2)
	{
		  int temp;
		  // Swapping logic written below
		  num1=num1+num2;
		  num2=num1-num2;
		  num1=num1-num2;
		  System.out.println("After swapping, 1st number is "+num1+" and 2nd number is "+num2); //Printing swapped values
	}
	
	public static void main(String[] args)
	{
		System.out.println("User has provided 1st number as "+Integer.parseInt(args[0])+" and 2nd number as "+Integer.parseInt(args[1]));
		new SwapNumbersTwoVars().swapNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
}
