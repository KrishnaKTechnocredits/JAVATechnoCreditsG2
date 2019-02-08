package arpit;

import java.util.Scanner;

public class TestEmployeeQ3 {

	public static void main(String[] args) {

		// Creating object of the Scanner class
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the employee id: ");

		// Take id of the employee by the user
		String id = sc.next();

		System.out.println("Enter name of the employee: ");

		// Take employee name from user
		String name = sc.next();

		System.out.println("Enter employee Salary: ");

		// Take salary of the employee from user
		int salary = sc.nextInt();

		// Creating object of the class
		EmployeeQ3 employee = new EmployeeQ3(id, name, salary);

		// To call display method to display all the details of the employee
		employee.display();

		sc.close();
	}

}
