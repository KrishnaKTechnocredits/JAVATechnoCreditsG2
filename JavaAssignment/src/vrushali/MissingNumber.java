package vrushali;

//Program t find the missing number in integer array of 1 to 10
public class MissingNumber {

	public static void main(String[] args) {

		MissingNumber ms = new MissingNumber();
		ms.missingNumCheck();
	}

	void missingNumCheck() {
		int[] num = new int[] { 1, 2, 3, 4, 5, 9, 7, 8, 10 };
		int actuallNum = 10;
		int numSum = 0;

		for (int index = 0; index < num.length; index++) {

			numSum = num[index] + numSum;
		}

		int expectedNum = actuallNum * (actuallNum + 1) / 2;

		int missingNum = expectedNum - numSum;
		System.out.println("Missing number in between 1 to 10 is: " + missingNum);

	}

}
