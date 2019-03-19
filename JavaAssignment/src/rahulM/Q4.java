//WAP to find area and perimeter of rectangle and cirle
package rahulM;
class Q4
{   static int  l,b,h;
    static int  r;
	public static void main(String [] a)
	{
	int l = Integer.parseInt(a[0]);
	int b = Integer.parseInt(a[1]);
    int r = Integer.parseInt(a[2]);
	rectangle(l,b);
	circle(r);
	}
    static int rectangle(int l, int b)
	{
	 int P = 2*(l+b);
	 System.out.println("The perimeter of Rectangle is "+P);
	 int A =l*b;
	 System.out.println("The Area of Rectangle is "+A);
	 return P;
	}	
	 static float circle(int r)
	{
		float p = (float)2*22/7*r;
	    System.out.println("The perimeter of Circle is "+p);	
		float a =(float)22/7*r*r;
		System.out.println("The Area of Circle is "+a);
		return p;
	}
}