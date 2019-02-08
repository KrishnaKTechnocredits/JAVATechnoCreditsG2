package monali;

public class DuplicateNumber {

	static void duplicateNo(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			for (int index1 = index + 1; index1 < arr.length; index1++) {
				if (arr[index] == arr[index1]) {
					System.out.println(arr[index] + " number is duplicate in array");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		InputOutputArrayInt input = new InputOutputArrayInt();  //another class for input number to be taken..object is created 
		int[] arr = input.takeInputFromUser();                 //call method using referenced variable 
		duplicateNo(arr);                                      //values taken from takeInputFromUser stired in arr[] and passed to method

	}
}
