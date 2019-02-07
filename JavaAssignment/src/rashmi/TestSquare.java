package rashmi;

import java.util.Scanner;

public class TestSquare 
{
    
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    int side=sc.nextInt();
	    Square obj = new Square(side);
	    obj.calArea();
	}

}
