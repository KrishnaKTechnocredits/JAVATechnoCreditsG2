/*WAP to reveres user given number
a. Input number:- 456789
b. Output number :- 987654*/

package purva;

import java.util.Scanner;

public class PurvaAssign4_q5_Client {
	public static void main(String[] args) {
		System.out.println("\n" + "Enter number:- ");
		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();

		// first counts the of digits in a number with the help of
		// countOfDigits()
		PurvaAssign4_q5_Service obj1 = new PurvaAssign4_q5_Service();
		int count = obj1.countOfDigits(num);

		// calls code to reverse the digits of input no
		PurvaAssign4_q5_Service obj2 = new PurvaAssign4_q5_Service();
		String rno = obj2.numReverse(num, count);
		System.out.println("Reverse of given number = " + rno);
	}

}
