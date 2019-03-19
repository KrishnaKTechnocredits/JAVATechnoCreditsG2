package purva;

public class q3SquareCube {
	static void SquareOfNum(float no) {
		float sq = no * 2;
		System.out.println("Square of number " + no + " is " + sq);
	}

	static void CubeOfNum(float no) {
		float cu = no * 3;
		System.out.println("Cube of number " + no + " is " + cu);
	}

	public static void main(String[] a) {
		float num = Float.parseFloat(a[0]);
		SquareOfNum(num);
		CubeOfNum(num);
	}
}
