package swapnali;
import java.util.Scanner;

public class InputOuputOperationTree
{
	//Method to take the input from user
	int[] takeInputFromUser()
	{
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Enter the numbers of tree: ");		
		int treeCount =Scanner.nextInt();	
		System.out.println("The total tree are: "+treeCount);
		
		int[] num = new int[treeCount];
		
		for(int index=0;index<num.length;index++)
		{
			num[index] =Scanner.nextInt();
		}
		Scanner.close();
		return num;
		
		
	}
}