package arpit;

import java.util.Scanner;

public class TestEmployeeQ7 {

	public static void main(String[] args) {

		// Creating object of Scanner class
		Scanner sc = new Scanner(System.in);

		// Give all details of first employee
		System.out.println("Give the information about first employee");
		System.out.println("Name of first employee");

		// Take name of first employee from user
		String name1 = sc.next();

		System.out.println("Department id of first employee");

		// Take department id of first employee from user
		String id1 = sc.next();

		System.out.println("Salary of first employee");

		// Take salary of first employee from user
		int salary1 = sc.nextInt();

		// Provide details of first employee
		EmployeeQ7 e1 = new EmployeeQ7(name1, id1, salary1);

		// Give all details of second employee
		System.out.println("Give the information about second employee");
		System.out.println("Name of second employee");

		// Take name of second employee from user
		String name2 = sc.next();

		System.out.println("Department id of second employee");

		// Take department id of second employee from user
		String id2 = sc.next();

		System.out.println("salary of second employee");

		// Take salary of second employee from user
		int salary2 = sc.nextInt();

		// Provide details of second employee
		EmployeeQ7 e2 = new EmployeeQ7(name2, id2, salary2);

		// Call compareEmployeeSalary method and provide details of both
		// employee
		compareEmployeeSalary(e1, e2);

	}

	// This function compare the salary of both employee and display the result
	// whose salary will maximum
	static void compareEmployeeSalary(EmployeeQ7 e1, EmployeeQ7 e2) {
		if (e1.getSalary() > e2.getSalary()) {
			e1.display();
		} else {
			e2.display();
		}

	}

}
