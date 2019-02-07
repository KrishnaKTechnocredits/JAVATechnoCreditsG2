package monali;

public class SumPrimeNo {
	static int sum = 0;

	public static void main(String[] args) {
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);

		for (int i = start; i <= end; i++) {
			boolean flag = isPrime(i);
			if (flag == true) {
				System.out.println(i + " Number is Prime");
				sum = sum + i;
			}
		}
		System.out.println("Sum of all prime numbers between user given range: " + sum);
	}

	static boolean isPrime(int num) {
		boolean flag = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				// System.out.println(i + "Numbers are not Prime");
				break;
			}
		}
		return flag;
	}

}
