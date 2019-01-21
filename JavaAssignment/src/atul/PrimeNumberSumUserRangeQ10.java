package atul;

public class PrimeNumberSumUserRangeQ10 {
	static int sum = 0;

	// This function calculates the sum of Prime numbers
	int sumPrime(int start, int end) {
		// Since 1 is not a prime number hence checking if the start range is
		// from 1 then start the loop from 2 else start the loop from the
		// original starting number
		if (start == 1) {
			for (int i = 2; i <= end; i++) {
				// checking if the value is prime or not using function
				boolean flagvalue = primeCheck(i);
				if (flagvalue == true)
					sum = sum + i;
			}
		} else {
			for (int i = start; i <= end; i++) {
				// checking if the value is prime or not using function
				boolean flagvalue = primeCheck(i);
				if (flagvalue == true)
					sum = sum + i;
			}
		}
		return sum;
	}

	// This function checks if the number is prime or not
	boolean primeCheck(int num) {
		boolean flag = true;
		int i;
		for (i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// creating the object
		PrimeNumberSumUserRangeQ10 obj = new PrimeNumberSumUserRangeQ10();
		// calling the function to calculate the sum
		int sum = obj.sumPrime(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
		// displaying the result
		System.out.println("\nThe total sum of prime numbers between " + Integer.parseInt(args[0]) + " and "
				+ Integer.parseInt(args[1]) + " is " + sum);
	}
}