package soumya;

import java.util.Scanner;

public class TempConverter_Service {
	static double fahr, cel;

	// Method for getting input from user
	static void scannerInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter temperature in Fahreheit: ");
		fahr = sc.nextDouble();
		System.out.println("°F");
	}

	void TempConverter() {
		scannerInput();
		System.out.println("Temperature in celsius: ");
		System.out.print((fahr - 32) * 5 / 9);
		System.out.print("°C");
	}
}
