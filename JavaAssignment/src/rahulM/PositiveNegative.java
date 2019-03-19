//Q1

package array_string_programs;

public class PositiveNegative {
	void PositiveNumber(int array1[]) {

		int sum = 0;
		System.out.println("Positive Numbers: ");
		for (int i = 0; i < array1.length; i++) {

			if (array1[i] >= 0) {
				System.out.print(array1[i] + " ");
				sum = sum + array1[i];
			}
		}
		System.out.println("\nSum of positive numbers: " + sum);
	}

	void NegativeNumber(int array2[]) {

		int sum = 0;
		System.out.println("Negative Numbers: ");
		for (int i = 0; i < array2.length; i++) {

			if (array2[i] > 0) {
				System.out.print(array2[i] + " ");
				sum = sum + array2[i];
			}
		}
		System.out.println("\nSum of negative numbers: " + sum);
	}

	public static void main(String[] args) {

		int input[] = { 5, 6, -9, 14, -25, 6, 7, -14 };

		PositiveNegative pn = new PositiveNegative();
		pn.PositiveNumber(input);
		pn.NegativeNumber(input);
	}

}
