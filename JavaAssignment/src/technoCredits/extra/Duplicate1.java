package technoCredits.extra;

import java.util.HashSet;

public class Duplicate1 {

	public static void main(String[] args) {
		int[] x = {1,2,3,4,5,3};
		
		for(int i=0;i<x.length;i++)
		{
			//System.out.println(x[i]);
			for(int j=i+1;j<x.length;j++)
			{
				if( x[i] == x[j])
					System.out.println("Duplicate: "+ x[i]);
			}
		}
	}
}
