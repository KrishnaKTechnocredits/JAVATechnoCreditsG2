package monali;

import java.util.Scanner;

public class TestSquare {   //square class functionality to test
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side of a square: ");
		Square square=new Square(sc.nextFloat());
		square.areaOfSquare();
		
	}

}
