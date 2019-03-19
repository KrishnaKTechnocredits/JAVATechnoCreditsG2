/* Create a class Addition and write add method for:
a) add two integers
b) add two decimal
c) add two String 
This is client class which has calls 3 Add methods from service class as per input choice from user. 
If user wants to add integer values switch case calls case 1
If user wants to decimal values switch case calls case 2
If user wants to add string values switch case calls case 3
 */

package purva;

import java.util.*;

public class Purva_Assign3_AddTest_q6 {
	public static void main(String[] args) {
		int choice;
		char option = 'y';
		do {
			System.out.println("Menu");
			System.out.println("1. Add 2 integers");
			System.out.println("2. Add 2 decimals");
			System.out.println("3. Add 2 string values");
			Scanner sc1 = new Scanner(System.in);
			choice = sc1.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Enter integer 1:");
				Scanner sc2 = new Scanner(System.in);
				int x = sc2.nextInt();
				System.out.println("Enter integer 2:");
				Scanner sc3 = new Scanner(System.in);
				int y = sc3.nextInt();
				Purva_Assign3_Add_q6 obj1 = new Purva_Assign3_Add_q6();
				obj1.Add(x, y);
				System.out.println("\n" + "Do you want to continue. Enter y or n: ");
				Scanner scr = new Scanner(System.in);
				option = scr.next().charAt(0);
				break;

			case 2:
				System.out.println("Enter integer 1:");
				Scanner sc4 = new Scanner(System.in);
				double p = sc4.nextDouble();
				System.out.println("Enter integer 2:");
				Scanner sc5 = new Scanner(System.in);
				double q = sc5.nextDouble();
				Purva_Assign3_Add_q6 obj2 = new Purva_Assign3_Add_q6();
				obj2.Add(p, q);
				System.out.println("\n" + "Do you want to continue. Enter y or n: ");
				Scanner scr2 = new Scanner(System.in);
				option = scr2.next().charAt(0);
				break;

			case 3:
				System.out.println("Enter string 1:");
				Scanner sc6 = new Scanner(System.in);
				String r = sc6.next();
				System.out.println("Enter integer 2:");
				Scanner sc7 = new Scanner(System.in);
				String s = sc7.next();
				Purva_Assign3_Add_q6 obj3 = new Purva_Assign3_Add_q6();
				obj3.Add(r, s);
				System.out.println("\n" + "Do you want to continue. Enter y or n: ");
				Scanner scr3 = new Scanner(System.in);
				option = scr3.next().charAt(0);
				break;

			default:
				System.out.println("You have entered invalid input. Please enter valid input.");
			}
		} while ((option == 'y') || (option == 'Y'));
	}
}
