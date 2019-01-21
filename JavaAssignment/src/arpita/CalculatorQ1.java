package arpita;

public class CalculatorQ1 {
public static void main(String[] args) {
		
		CalculatorQ1 c=new CalculatorQ1();
		System.out.println(c.sum(10, 20));
		System.out.println(c.sub(20, 30));
		System.out.println(c.mul(5, 4));
		System.out.println(c.div(50, 10));
		System.out.println(c.modulo(40, 3));

	}
	int sum(int x,int y)
	{
		return x+y;
	}
	int sub(int x,int y)
	{
		return x-y;
	}
	int mul(int x,int y)
	{
		return x*y;
	}
	int div(int x, int y)
	{
		return x/y;
	}
	int modulo(int x,int y)
	{
		return x%y;
	}

}
