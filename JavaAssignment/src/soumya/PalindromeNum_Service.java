package soumya;

public class PalindromeNum_Service {
	int rem, num1, temp;

	// Method to check palindrome number
	int palindrome(int num) {
		int sum = 0;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = (sum * 10) + rem;
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Number is not palindrome");
		}
		return num1;
	}
}
