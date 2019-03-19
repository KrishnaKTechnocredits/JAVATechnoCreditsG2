package vrushali;

/**
 * a. Int number = 153 i. Number is Armstrong b. Int number = 234 i. Number is
 * not Armstrong
 */

public class ArmstrongNumber {
	public static void main(String[] args) {
		int num = 153;
		int num1 = 234;
		ArmstrongNumber am = new ArmstrongNumber();
		am.checkNumberIsArmstrong(num);
		am.checkNumberIsArmstrong(num1);
	}

	void checkNumberIsArmstrong(int num) {
		int temp = num;
		int sum = 0;
		while (num > 0) {
			int rem = num % 10;
			num = num / 10;
			sum = sum + rem * rem * rem;
		}
		if (temp == sum) {
			System.out.println(temp + " is an Armstrong Number ");
		} else {
			System.out.println(temp + " is not an Armstrong Number");
		}
	}
}
