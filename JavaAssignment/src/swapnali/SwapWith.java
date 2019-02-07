package swapnali;

public class SwapWith {

	public static void main(String[] args)
	{
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		SwapWith.swapNumbers(num1,num2);

	}
	
	static void swapNumbers(int i, int j)
	{
		System.out.println("Before swapping: "+i +" "+j);
		i = i + j;
		j = i - j;
		i = i - j;
		System.out.println("After swapping : " +i +" "+j);
	}
}
