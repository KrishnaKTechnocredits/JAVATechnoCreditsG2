package vrushali;

public class SquareCube {
	static int square, cube;

	static void squareOfNumber(int num) {
		square = num * num;
	}

	static void cubeOfNumber(int num) {
		cube = num * num * num;
	}

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		squareOfNumber(num);
		cubeOfNumber(num);
		System.out.println("Square of " +num+ " is: " +square);
		System.out.println("Cube of " +num+ " is: "  +cube);
	}
}
