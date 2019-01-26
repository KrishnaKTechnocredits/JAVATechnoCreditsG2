/*
 * This Program will find duplicate value from given input numbers array
 */
package soumya;

public class DuplicateNum_Client {
	public static void main(String[] args) {
		int arr[] = DuplicateNum_Service.InputOutput();
		DuplicateNum_Service.dup(arr);
	}
}
