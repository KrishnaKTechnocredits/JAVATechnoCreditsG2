package technoCredits;

/**
 * @author Harsh
 *
 */
/**
 * @author HarshVegada
 *
 */
public class PrimeNumber {
	static int cnt;
	static int start;
	static int end;

	/**
	 * this method only call the service method to get output
	 * 
	 * @param args
	 * @return void
	 */
	public static void main(String[] args) {
		start = Integer.parseInt(args[0]);
		end = Integer.parseInt(args[1]);
		for (int i = start; i < end; i++) {
			checkPrimeNumber(i);
		}
		countOfPrimeNumber();
	}

	/**
	 * This method checks the given number is prime or not
	 * 
	 * @param number
	 * @return void
	 */
	static void checkPrimeNumber(int number) {
		for (int i = 2; i < number / 2; i++) {
			if (number % i != 0) {
				System.out.println("Number " + number + " Is Prime");
				cnt++;
			}
		}
	}

	/**
	 * This method gives the total count of prime number which is given by user
	 * 
	 * @return void
	 */
	static void countOfPrimeNumber() {
		System.out.println("Total Prime Number between " + start + " and " + end + " is " + cnt);
	}

}
