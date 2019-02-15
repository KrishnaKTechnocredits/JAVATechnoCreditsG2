package vrushali;

/* WAP to find Fibonacci series for user defined number
   a. Input number :- 5
   b. Output :- 120
*/
public class Factorial {
	public static void main(String[] args) {

		int num = 5;
		Factorial fc = new Factorial();
		int ans = fc.factorialCalc(num);
		fc.display(ans);
	}

	// Method to calculate factorial
	int factorialCalc(int num) {
		int fact = 1;

		while (num > 0) {
			fact = num * fact;
			num--;
		}
		return fact;
	}

	// Method to display factorial
	void display(int factorial) {
		System.out.println("factorial is: " + factorial);
	}

}
