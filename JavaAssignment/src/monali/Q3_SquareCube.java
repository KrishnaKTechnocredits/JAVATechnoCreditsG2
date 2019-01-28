package monali;

public class Q3_SquareCube {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		Square(i);
		Cube(i);
	}
		static void Square(int num)
		{
			int square = num * num;
			System.out.println("Square of "+num+ " is: "+ square);
		}
		
		static void Cube(int num)
		{
		int cube = num * num * num;
		System.out.println("Cube of "+num+" is: " + cube);
	}
}
