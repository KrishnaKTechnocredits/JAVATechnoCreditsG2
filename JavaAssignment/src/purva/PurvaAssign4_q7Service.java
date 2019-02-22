/*WAP to find Fibonacci series for user defined number
a. Input number :- 5
b. Output :- 120*/

package purva;

public class PurvaAssign4_q7Service {

	// below code finds fibonacci series and multiplies the values of fibonacci
	// series
	int fibonacciOfNum(int num) {
		int palin = 1;
		int mult = 1;
		if (num == 0) {
			palin = 0;
		}
		while (num > 0) {
			mult = num * (num - 1);
			num = num - 2;

			if (mult > 0) {
				palin = palin * mult;
			}
		}
		return palin;
	}

}
