package soumya;

public class ArmstrongNumber_Service {
	// Method for checking Armstrong number
	int checkNum(int num) {
		int sum = 0;
		int rem;
		int temp;
		temp = num;
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem * rem);
			num = num / 10;
		}
		if (temp == sum) {
			System.out.println("Number is Armstrong");
		} else {
			System.out.println("Number is not Armstrong");
		}
		return num;
	}
}
