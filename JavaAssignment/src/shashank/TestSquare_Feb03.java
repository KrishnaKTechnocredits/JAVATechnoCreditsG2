package shashank;

import java.util.Scanner;

public class TestSquare_Feb03 
{
	public static void main(String[] args) 
	{
		System.out.println("Please enter the side of the square of which area is to calculate - ");
		Scanner sc=new Scanner(System.in);
		Square_Feb03 sq = new Square_Feb03(sc.nextFloat());
		System.out.println("Area is the square is : "+sq.area());
	}
}
