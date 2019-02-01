package monali;

public class MaxDifferIndex {

	static void maxDifferIndex(int arr1[], int arr2[]) {
		for (int index = 0; index < arr1.length; index++) {
			if (arr1[index] != arr2[index]) {
				System.out.println("Values are not matching at index -> " + index);
				
			
			if (arr1[index] > arr2[index]) {
				System.out.println("From " + arr1[index] + "," + arr2[index] + "max value is " + arr1[index]);
			} else {
				System.out.println("From " + arr1[index] + "," + arr2[index] + " max value is " + arr2[index]);
			}
			}
			
		}

	}
	public static void main(String[] args) {
		int arr1[]={10,2,9,14,3};
		int arr2[]={10,2,18,14,3};
		maxDifferIndex(arr1,arr2);
	}
}
