//Q1 WAP missing number in integer array of 1 to 10 
package ArrayPrograms;

public class missingNumber {

	public static void main(String[] args) {
		missingNumber.missingNumFinder();
	}

	static void missingNumFinder() {
		int[] arr = { 1, 2, 3, 4, 5, 8, 7, 9, 10 };
		int actsum = 0;
		for (int index = 0; index < arr.length; index++) {
			actsum = actsum + arr[index];
		}

		int expsum = 0;
		for (int count = 0; count <= 10; count++) {
			expsum = count + expsum;
		}
		System.out.println("The missing number is :" + (expsum - actsum));
	}

}
