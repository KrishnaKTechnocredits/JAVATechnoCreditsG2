package rashmi;

public class Swapnotemp 
{
      public static void main(String[] args)
	  {
	    swapnum(4,6);
	  }
	  static void swapnum(int a, int b)
	  {
	    System.out.println(a);
	    System.out.println(b);
	    a=a+b;
	    b=a-b;
	    a=a-b;
	    System.out.println(a);
	    System.out.println(b);
	  }
}
