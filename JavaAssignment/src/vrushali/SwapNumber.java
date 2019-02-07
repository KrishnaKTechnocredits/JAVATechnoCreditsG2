package vrushali;

public class SwapNumber {
	int num1, num2;

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		SwapNumber sw = new SwapNumber();
		sw.swapNumber(num1, num2);

	}

	void swapNumber(int num1, int num2) {
		System.out.println("Value before swapping is " + num1 + " and " + num2);
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("Value after swapping is " + num1 + " and " + num2);
	}
}
