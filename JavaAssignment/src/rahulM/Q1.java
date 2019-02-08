//WAP to print sum,multiply,subtract, divide and remainder of two numbers given by user
package rahulM;
class Q1
{   static int a,b; 
	public static void main(String x [])
	{
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		System.out.println("The sum is " +add(a,b)+"\nThe subtraction is " +sub(a,b)+"\nThe Multiplication is " +multiply(a,b)+"\nThe division is " +div(a,b)+"\nThe remainder is " +rem(a,b));
	}
	static int add(int a, int b)
	{
		int i= a+b;
		return i;
	}
	static int sub(int a, int b)
	{
		int i= a-b;
		return i;
	}
	static int multiply (int a, int b)
	{
		int i= a*b;
		return i;
	}
	static int div (int a, int b)
	{
		int i= a/b;
		return i;
	}
	static int rem(int a, int b)
	{
		int i= a%b;
		return i;
	}
}