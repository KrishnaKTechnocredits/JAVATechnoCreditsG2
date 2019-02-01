package vrushali;

//Program to find duplicate number on Integer array in Java
public class DuplicateNumber {

	public static void main(String[] args) {
		DuplicateNumber duplicateNumber = new DuplicateNumber();
		duplicateNumber.duplicateNumCheck();
	}

	void duplicateNumCheck() {
		int numCount = 0;
		int[] num = new int[] { 0, 3, 1, 2, 3 };

		for (int index = 0; index < num.length; index++) {

			for (int count = index + 1; count < num.length; count++) {

				if (num[index] == num[count]) {
					numCount++;
					System.out.println("Duplicate number in array is: " + num[index]);
				}

			}

		}

	}
}
