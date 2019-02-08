/* Client class of employee class which creates object of serrvice class and passes value to service class */
/* Create Employee class and parameterized constructor with attributes empId , empName and salary. Write a method to display the details of employees. Create a TestEmployee class to test Employee class functionality. */
package purva;

import java.util.Scanner;

public class Purva_Assign3_TestEmployee_q3 {
	public static void main(String[] args) {
		char choice;
		do {

			/* Input taken from user for name, id and salary */
			System.out.println("\n" + "Please enter employee details: ");

			Scanner sc1 = new Scanner(System.in);
			System.out.println("Employee ID");
			int ID = sc1.nextInt();

			Scanner sc2 = new Scanner(System.in);
			System.out.println("Employee name");
			String name = sc2.next();

			Scanner sc3 = new Scanner(System.in);
			System.out.println("Employee salary");
			Float salary = sc3.nextFloat();

			/*
			 * Object obj1 created and parameters passed to constructor where
			 * values are assigned
			 */
			Purva_Assign3_Employee_q3 obj1 = new Purva_Assign3_Employee_q3(ID, name, salary);
			obj1.displayDetails();

			/* USer asked if want to continue further or exit the program */
			Scanner sc4 = new Scanner(System.in);
			System.out.println("\n" + "Do you want to continue (y or n): ");
			choice = sc4.next().charAt(0);
		} while ((choice == 'y') || (choice == 'y'));
		System.out.println("Program has ended!!");
	}
}
