package rashmi;

public class Squarecube 
{
	  static void square(int num1)
	  {
	    num1=num1*num1;
	    System.out.println(num1);
	  }
	 
	  static void cube(int num2)
	  {
	     num2=num2*num2*num2;
	     System.out.println(num2);
	  }

	  public static void main(String[] args)
	  {
	    int num1=Integer.parseInt(args[0]);
	    int num2=Integer.parseInt(args[1]);
	    square(num1);
	    cube(num2);
	  }
}
