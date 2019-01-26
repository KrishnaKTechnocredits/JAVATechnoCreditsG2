package arpita;

public class CalculatorsQ1 {
public static void main(String[] args) {
		
		CalculatorsQ1 c=new CalculatorsQ1();
		System.out.println("Sum is: "+c.sum(10, 20));
		System.out.println("Sub is: "+c.sub(20, 30));
		System.out.println("Multi is: "+c.mul(5, 4));
		System.out.println("Division is: "+c.div(50, 10));
		System.out.println("Modulo is: "+c.modulo(40, 3));

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
