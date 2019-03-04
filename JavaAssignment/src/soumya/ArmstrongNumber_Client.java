/*
 * This program will check if number is Armstrong or not
 */
package soumya;

import java.util.Scanner;

public class ArmstrongNumber_Client {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		sc.close();
		ArmstrongNumber_Service armstrongNum = new ArmstrongNumber_Service();
		armstrongNum.checkNum(num);
	}
}
