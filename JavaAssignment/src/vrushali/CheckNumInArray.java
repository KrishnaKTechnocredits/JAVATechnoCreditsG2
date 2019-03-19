package vrushali;

//Program to check if array contains a number in Java
public class CheckNumInArray {
	void numCheck() {
		int[] arr = new int[] { 2, 5, 9, 7, 4, 6 };
		int num = 3;
		boolean flag = false;

		for (int index = 0; index < arr.length; index++) {
			if (num == arr[index]) {
				flag = true;
				System.out.println("Number " + num + " is available in array");
				break;
			}
		}
		if (flag == false)
			System.out.println("number is not in arr.");
	}

	public static void main(String[] args) {
		CheckNumInArray checkNumInArray = new CheckNumInArray();
		checkNumInArray.numCheck();
	}
}
