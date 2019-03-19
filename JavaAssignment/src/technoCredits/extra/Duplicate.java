package technoCredits.extra;

public class Duplicate {

	public static void main(String[] args) {
		int size = 5;
		
		int[] x = new int[size+2]; // 0-->4 [duplicate]
		x[0] = 3;
		x[1] = 0;
		x[2] = 2;
		x[3] = 1;
		x[4] = 3; // duplicate
		x[5] = 4;
		
		int[] temp = new int[x.length];
		
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
			temp[x[i]] = temp[x[i]]+1;
		}
		
		
	}
}
