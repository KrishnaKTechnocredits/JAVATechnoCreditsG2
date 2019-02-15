//Q2

package array_string_programs;

import java.util.Scanner;

public class MaxLengthString {

	static void printMaxLengthOfString(String name[]) {
		String max = "";
		for (int index = 0; index < name.length; index++) {
			for (int count = index + 1; count < name.length; count++) {
				if (name[index].length() > name[count].length()) {
					max = name[index];
				} else {
					max = name[count];
				}
			}
		}
		System.out.println(max);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of array element: ");
		int size = sc.nextInt();
		String name[] = new String[size];
		for (int index = 0; index < name.length; index++) {
			name[index] = sc.next();
		}
		sc.close();
		MaxLengthString.printMaxLengthOfString(name);
	}

}
