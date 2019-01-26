package arpita;

public class SquareCubeQ3 {
public static void main(String[] args) {
		
		SquareCubeQ3 s= new SquareCubeQ3();
		s.number(10);
		s.number(30);
		
	}
	void number(int num)
	{
		int square = num*num;
		System.out.println("Square is: " + square);
		int cube = num*num*num;
		System.out.println("Cube is: " + cube);
	}

}
