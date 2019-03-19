package soumya;

public class Factorial_Service {
	// Method to calculate factorial
	int calculateFactorial(int num) {
		int mul = 1;
		while (num > 0) {
			mul = mul * num;
			num--;
		}
		return mul;
	}
}
