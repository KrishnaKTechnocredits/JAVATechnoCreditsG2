package technoCredits.assignement;
public class PrimeNumbersRange {

	void PrimeNumbers(int number1, int number2) {
		int prime_sum = 0;

		for (int i = number1; i <= number2; i++) {
			for (int j = number1; j <= number2; j++) {
				if (i != j && i % j == 0) {
					// System.out.println("no. not prime" + i);
					break;
				} else if (i == j) {
					// System.out.println("number is prime" + i);
					prime_sum = prime_sum + i;

				}
			}
		}
		System.out.println("Sum Of Prime Nos:=" + prime_sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new PrimeNumbersRange().PrimeNumbers(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
	}

}