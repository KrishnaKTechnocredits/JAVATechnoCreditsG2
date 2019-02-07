package rashmi;

public class Arithmeticoperation 
{
    static void add(int a, int b)
    {
        int addition=a+b;
        System.out.println(addition);
    }
    static void sub(int a, int b)
    {
        int subtraction=a-b;
        System.out.println(subtraction);
    }
    static void mul(int a, int b)
    {
    	int multiplication=a*b;
        System.out.println(multiplication);
    }
    static void div(int a, int b)
    {
    	double division=a/b;
        System.out.println(division);
    }
    static void rem(int a, int b)
    {
        int remainder=a%b;
        System.out.println(remainder);
    }
	public static void main(String[] args) 
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
		rem(a,b);
    }
}
