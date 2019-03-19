/* 
* This Program will take employee name,department id and salary for two employees and will display details of employee having max salary
*/
package soumya;

import java.util.Scanner;

public class EmployeeQ7Test {
	public static void main(String[] args) {
		// Taking input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Employee Name: ");
		String empName = sc.next();
		System.out.println("Enter First Department Id: ");
		int deptId = sc.nextInt();
		System.out.println("Enter First Employee Salary: ");
		double salary = sc.nextDouble();
		System.out.println("Enter Second Employee Name: ");
		String empName1 = sc.next();
		System.out.println("Enter Second Department Id: ");
		int deptId1 = sc.nextInt();
		System.out.println("Enter Second Employee Salary: ");
		double salary1 = sc.nextDouble();
		sc.close();
		// Passing value to constructor for first employee
		EmployeeQ7 e1 = new EmployeeQ7(empName, deptId, salary);
		// Passing value to constructor for second employee
		EmployeeQ7 e2 = new EmployeeQ7(empName1, deptId1, salary1);
		e1.compareEmpSalary(e1, e2);
	}
}
