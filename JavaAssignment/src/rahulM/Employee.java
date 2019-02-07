package constructor;

import java.util.Scanner;

public class Employee {
 String empName;
 int deptID;
 int salary;
 Employee(String empName,int deptID,int salary){
	 this.empName=empName;
	 this.deptID=deptID;
	 this.salary=salary;
 }
 static void compareEmpSalary(Employee e1, Employee e2){
	 if(e1.salary> e2.salary){
		 System.out.println("The details of the employee having higher salary: ");
		 System.out.println("Employee Name is : "+e1.empName);
		 System.out.println("Employee Department ID is: "+e1.deptID);
		 System.out.println("Employee salary is : "+e1.salary);
	 }
	 else if(e2.salary>e1.salary){
		 System.out.println("The details of the employee having higher salary: ");
		 System.out.println("Employee Name is : "+e2.empName);
		 System.out.println("Employee Department ID is: "+e2.deptID);
		 System.out.println("Employee salary is : "+e2.salary);
	 }
	 else{
		 System.out.println("The salary of the employees are equal ");
	 }
 }
	 public static void main (String[] args){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter first employee name: ");
		 String empName1=sc.next();
		 System.out.println("Enter department ID of first employee:");
		 int deptID1= sc.nextInt();
		 System.out.println("Enter salary of the first employee");
		 int salary1=sc.nextInt();
		 System.out.println("Enter second employee name: ");
		 String empName2=sc.next();
		 System.out.println("Enter department ID of second employee:");
		 int deptID2= sc.nextInt();
		 System.out.println("Enter salary of the second employee");
		 int salary2=sc.nextInt();
		 Employee e1 = new Employee(empName1,deptID1,salary1);
		 Employee e2 = new Employee(empName2,deptID2,salary2);
		 compareEmpSalary(e1,e2);
		 
		 
		 
	 }
 
}
