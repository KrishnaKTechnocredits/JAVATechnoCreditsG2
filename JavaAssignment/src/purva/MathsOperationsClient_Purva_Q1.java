package purva;

public class MathsOperationsClient_Purva_Q1 {
	public static void main(String[] args) {
		MathsOperations_Purva_Q1 m1 = new MathsOperations_Purva_Q1();
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		float add1 = m1.sum(num1, num2);
		float mul = m1.multi(num1, num2);
		float subtr = m1.sub(num1, num2);
		float div = m1.divide(num1, num2);
		int quot = m1.remainder(num1, num2);
		System.out.println("Addition of numbers " + num1 + " and " + num2 + "= " + add1);
		System.out.println("Multiplication of numbers " + num1 + " and " + num2 + "= " + mul);
		System.out.println("Subtraction of numbers " + num1 + " and " + num2 + "= " + subtr);
		System.out.println("Division of numbers " + num1 + "  and  " + num2 + "= " + div);
		System.out.println("Remainder of numbers " + num1 + " and " + num2 + "= " + quot);
	}
}