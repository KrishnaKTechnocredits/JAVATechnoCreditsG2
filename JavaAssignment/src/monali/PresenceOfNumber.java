package monali;

public class PresenceOfNumber {

	void presenceOfNo(int arr[], int num) {
		boolean flag = false;
		for (int index = 0; index < arr.length; index++)
			if (arr[index] != num) {
				flag = true;
				System.out.println("number is not in arr");
				break;
			}

	}

	public static void main(String[] args) {
		int arr[] = { 2, 5, 9, 7, 4, 6 };
		int num = 8;
		PresenceOfNumber pn = new PresenceOfNumber();
		pn.presenceOfNo(arr, num);
	}

}
