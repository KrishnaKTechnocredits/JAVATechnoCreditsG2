package monali;

public class Addition {

	void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("Addition of two integer numbers: " + result);
	}

	void add(double num1, double num2) {
		double result = num1 + num2;
		System.out.println("Addition of two decimal numbers: " + result);
	}

	void add(String num1, String num2) {
		String result = num1 + num2;
		System.out.println("Addition of two strings : " + result);

	}

}
