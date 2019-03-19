/*
 * This Program will find all the visible trees from given input array
 */
package soumya;

public class TreeVisible_Client {
	public static void main(String[] args) {
		int arr[] = TreeVisible_Service.InputOutput();
		TreeVisible_Service.treeVisible(arr);
	}
}
