package arpit;

public class AdditionQ6 {

	int sum1;
	double sum2;
	String sum3;

	// This function is perform addition of two integer number and return
	// result.
	int addingInteger(int num1, int num2) {

		sum1 = num1 + num2;
		return sum1;
	}

	// This function is perform addition of two double number and return result.
	double addingDouble(double num1, double num2) {

		sum2 = num1 + num2;
		return sum2;

	}

	// This function is perform addition of two String value and return result.
	String addingString(String S1, String S2) {

		sum3 = S1 + S2;
		return sum3;
	}

	// Display the result of addition of two integer number
	void displayIntegerSum() {
		System.out.println("Integer sum is: " + sum1);
	}

	// Display the result of addition of two double number
	void displayDoubleSum() {
		System.out.println("Integer sum is: " + sum2);
	}

	// Display the result of addition of two String value
	void displayStringSum() {
		System.out.println("Integer sum is: " + sum3);
	}

	public static void main(String[] args) {

		// Creating object of the class
		AdditionQ6 addition = new AdditionQ6();

	}

}
