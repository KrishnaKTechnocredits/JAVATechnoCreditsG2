package purva;

import java.util.Scanner;

public class q6TempConv {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the temperature in Fahrenheit: ");
		float fh = sc.nextFloat();
		FtoC(fh);
		sc.close();
	}

	static void FtoC(float fahrenheit) {
		float celsius = (fahrenheit - 32) * 5 / 9;

		System.out.println("Temperature conversion from " + (int) fahrenheit + " Fahrenheit to Celsius degree = "
				+ Math.round(celsius)+" degree");

	}

}
