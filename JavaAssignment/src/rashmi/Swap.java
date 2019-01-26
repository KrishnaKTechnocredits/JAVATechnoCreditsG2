package rashmi;

public class Swap 
{
	  public static void main(String[] args)
	  {
	    swapnum(4,6);
	  }
	  static void swapnum(int a, int b)
	  {
	    System.out.println(a);
	    System.out.println(b);
	    int temp=a;
	    a=b;
	    b=temp;
	    System.out.println(a);
	    System.out.println(b);
	  }
}
