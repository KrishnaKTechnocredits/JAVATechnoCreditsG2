/*WAP to reveres user given number
a. Input number:- 456789
b. Output number :- 987654*/

package purva;

public class PurvaAssign4_q5_Service {

	// below code reverse given input no
	String numReverse(int num, int count) {
		int temp = 0;
		String reverseno = " ";
		for (int index = 0; index < count; index++) {
			temp = num % 10;
			reverseno = reverseno + Integer.toString(temp);
			num = num / 10;
		}
		return reverseno;
	}

	// code to calculate no of digits in a number
	int countOfDigits(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

}
