package shashank;

public class Calculator 
{
	int summation(int num1, int num2)
	{
		return num1+num2;
	}
	
	int subtraction(int num1, int num2)
	{
		return num1-num2;
	}
	
	int multiplication(int num1, int num2)
	{
		return num1*num2;
	}
	
	int division(int num1, int num2)
	{
		return num1/num2;
	}
	
	int modulation(int num1, int num2)
	{
		return num1%num2;
	}
	
	void displayCalcuations(int num1, int num2)
	{
		System.out.println("Addition of "+num1+" and "+num2+" is : " + new Calculator().summation(num1, num2));
		System.out.println("Sutraction of "+num1+" and "+num2+" is : " + new Calculator().subtraction(num1, num2));
		System.out.println("Multiplication of "+num1+" and "+num2+" is : " + new Calculator().multiplication(num1, num2));
		System.out.println("Division of "+num1+" and "+num2+" is : " + new Calculator().division(num1, num2));
		System.out.println("Modulo of "+num1+" and "+num2+" is : " + new Calculator().modulation(num1, num2));
	}
	
	public static void main(String[] args)
	{
		Calculator dc = new Calculator();
		dc.displayCalcuations(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}
}
