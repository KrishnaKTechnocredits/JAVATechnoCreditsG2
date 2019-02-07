package swapnali;

public class SquareCube {

	public static void main(String[] args) {
		int squ = Integer.parseInt(args[0]);
		int cube =Integer.parseInt(args[1]);
		calSquCube(squ, cube);
		
	}
	static void calSquCube(int squ,int cube)
	{
		int Result=0;
		Result = squ * squ;
		System.out.println("The squate root of num is : " +Result);
		
		Result = cube * cube * cube;
		System.out.println("The cube of num is : " +Result);
	}
}
