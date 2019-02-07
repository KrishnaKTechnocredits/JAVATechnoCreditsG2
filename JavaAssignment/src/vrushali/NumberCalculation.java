package vrushali;

public class NumberCalculation {
	static int sum, sub, mul;
	static float div, mod;

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);

		NumberCalculation.numberCalculator(num1, num2);
		System.out.println("Addition of " + num1 + " and " + num2 + " is: " + sum);
		System.out.println("Substraction of " + num1 + " and " + num2 + " is: " + sub);
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + mul);
		System.out.println("Division of " + num1 + " and " + num2 + " is: " + div);
		System.out.println("Reminder of " + num1 + " and " + num2 + " is: " + mod);
	}

	static void numberCalculator(int num1, int num2) {
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = num1 / num2;
		mod = num1 % num2;
	}

}