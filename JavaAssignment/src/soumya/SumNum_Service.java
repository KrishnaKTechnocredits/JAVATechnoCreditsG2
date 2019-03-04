package soumya;

public class SumNum_Service {
	// Method to find sum
	int sum(int num) {
		int sum = 0;
		int temp = 0;
		while (num > 0) {
			temp = num % 10;
			num = num / 10;
			sum = sum + temp;
		}
		return sum;
	}
}
