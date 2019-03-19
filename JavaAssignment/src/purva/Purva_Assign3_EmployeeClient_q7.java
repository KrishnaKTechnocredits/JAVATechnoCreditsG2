/* this is client class, 
 * it takes input as data of 2 employees and 
 * passes the data to constructor of service class and calls compare salary method
 * 
 * Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) and print all the details of employee having max salary.
HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);
 * */
package purva;

import java.util.Scanner;

public class Purva_Assign3_EmployeeClient_q7 {
public static void main(String[] args) {

		/* Takes input data of emp 1 from user */
		System.out.println("****Enter Employee 1 Details****");
		
		System.out.println("Enter name of Employee 1: ");
		Scanner sc1 = new Scanner(System.in);
		String name1 = sc1.next();
		
		System.out.println("Enter department ID of Employee 1: ");
		Scanner sc2 = new Scanner(System.in);
		int dpid1 = sc2.nextInt();
		
		System.out.println("Enter salary of Employee 1: ");
		Scanner sc3 = new Scanner(System.in);
		double salry1 = sc3.nextDouble();
		
		/* object e1 created for service class Employee */
		Purva_Assign3_Employee_q7 e1 = new Purva_Assign3_Employee_q7(name1,dpid1,salry1);

		/* Takes input data of emp 2 from user */
		System.out.println("****Enter Employee 2 Details****");
		
		System.out.println("Enter name of Employee 2: ");
		Scanner sc4 = new Scanner(System.in);
		String name2 = sc4.next();
		
		System.out.println("Enter department ID of Employee 2: ");
		Scanner sc5 = new Scanner(System.in);
		int dpid2 = sc5.nextInt();
		
		System.out.println("Enter salary of Employee 2: ");
		Scanner sc6 = new Scanner(System.in);
		double salry2 = sc6.nextDouble();
		
		/* object e1 created for service class Employee */
		Purva_Assign3_Employee_q7 e2 = new Purva_Assign3_Employee_q7(name2,dpid2,salry2);
		
		/* compare salary method called from service class which compares salary of both the employees */
		e1.compareEmpSalary(e1, e2);
		
		}
		

		
		
		
		
	}


