package soumya;

import java.util.Scanner;

public class TimeConverter_Service {
	static int h, m, sec;

	static void scannerInput() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter time in seconds: ");
		sec = sc.nextInt();
	}

	void secConverter() {
		scannerInput();
		System.out.print(sec / 3600 + " HH :");
		System.out.print((sec / 60) % 60 + " MM :");
		System.out.print(sec % 60 + " SS");
	}
}
