package rashmi;

import java.util.Scanner;

public class AddOverload 
{
    void add(int num1, int num2)
    {
    	int addint=num1+num2;
    	System.out.println(addint);
    }
    void add(float float1, float float2)
    {
    	float addfloat=float1+float2;
    	System.out.println(addfloat);
    }
    void add(String string1, String string2)
    {
    	int res1=Integer.parseInt(string1);
    	int res2=Integer.parseInt(string2);
    	int addstring=res1+res2;
    	System.out.println(addstring);
    }
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    float float1=sc.nextFloat();
	    float float2=sc.nextFloat();
	    String string1=sc.next();
	    String string2=sc.next();
		AddOverload addition = new AddOverload();
		addition.add(num1, num2);
		addition.add(float1, float2);
		addition.add(string1, string2);
	}

}
