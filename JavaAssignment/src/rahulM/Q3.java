//WAP to find sqaure and cube of the number
package rahulM;
class Q3
{   static int x;
	public static void main(String[] a)
	{
	 int x = Integer.parseInt(a[0]);
	 System.out.println("Square of the number is: "+square(x) + "\nCube of the number is: "+cube(x));
	 
	}
	static int square(int x)
	{
		int i = x*x;
		return i;
	}
	static int cube(int x)
	{
		int i= x*x*x;
		return i;
	}
}