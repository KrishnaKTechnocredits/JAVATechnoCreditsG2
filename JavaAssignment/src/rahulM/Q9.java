//WAP to swap two numbers without using third numbers
package rahulM;
class Q9
{
	public static void main(String [] args)
	{
		int a=7;
		int b=9;
		System.out.println("value before swapping>> "+"value of A : "+a+" Value of B : "+b);
	    a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("value after swapping>> "+"value of A : "+a+" Value of B : "+b);
	}
}
