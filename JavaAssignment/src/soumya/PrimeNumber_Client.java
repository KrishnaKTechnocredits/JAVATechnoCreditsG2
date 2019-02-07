/*
 * This Program will find sum of all prime numbers between user given range
 */
package soumya;

import java.util.Scanner;

public class PrimeNumber_Client {
	public static void main(String[] args) {
		PrimeNumber_Service o1 = new PrimeNumber_Service();
		o1.scannerInput();
		o1.getRange();
	}
}
