package rashmi;

import java.util.Scanner;

public class ClientCircle 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		float input=sc.nextFloat();
		Circle obj = new Circle();
		obj.areaOfCircle(input);
		obj.circumferenceOfCircle(input);
		
	}

}
