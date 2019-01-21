package monali;

public class Q3_SquareCube {
	public static void main(String[] args) {
		int i = Integer.parseInt(args[0]);
		int square = i * i;
		int cube = i * i * i;
		System.out.println("Square of "+i+ " is: "+ square);
		System.out.println("Cube of "+i+" is: " + cube);
	}
}
