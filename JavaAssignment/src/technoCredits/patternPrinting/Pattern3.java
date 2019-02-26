package technoCredits.patternPrinting;

public class Pattern3 {

	public static void main(String[] args) {
		int n = 11;
		
		for(int i=1;i<=(n/2)+1;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
		
		for(int i=(n/2);i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
