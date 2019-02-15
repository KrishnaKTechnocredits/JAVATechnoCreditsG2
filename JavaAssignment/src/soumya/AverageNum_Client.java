/*
 * This Program will find average of user given array
 */
package soumya;

import java.util.Scanner;

public class AverageNum_Client {
	public static void main(String[] args) {
		AverageNum_Service avgobj = new AverageNum_Service();
		Scanner sc = new Scanner(System.in);
		double num[];
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		System.out.println("Enter Numbers: ");
		num = new double[size];
		for (int index = 0; index <= num.length - 1; index++) {
			num[index] = sc.nextInt();
		}
		sc.close();
		double avg = avgobj.numAvg(num);
		System.out.println("Average is: " + avg);
	}
}
