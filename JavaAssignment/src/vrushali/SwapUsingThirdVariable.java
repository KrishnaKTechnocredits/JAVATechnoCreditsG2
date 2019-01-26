package vrushali;

public class SwapUsingThirdVariable {
	int temp, num1, num2;
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		
		SwapUsingThirdVariable sw = new SwapUsingThirdVariable();
		sw.swapNumber(num1, num2);
		
	}
	void swapNumber(int num1, int num2)
	{
		System.out.println("Value before swapping is "+num1+ " and " +num2);
		temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("Value after swapping is "+num1+ " and " +num2);
	}
}
