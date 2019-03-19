/*WAP to find sum of user given number.
a. Input:- 159753
b. Sum of given number:- 30 
*/
package purva;

public class PurvaAssign4_q4_Service {

	// finds each digit of input no and add it to 'sum'
	int sumofDigitsinNo(int tnum, int count) {
		int sum = 0, digit = 0;
		for (int index = 0; index < count; index++) {
			digit = tnum % 10;
			sum = sum + digit;
			tnum = tnum / 10;
		}
		return sum;
	}

	// counts the no of digits in input no
	int countOfDigit(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count = count + 1;
		}
		return count;
	}
}
