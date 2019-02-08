package monali;

import java.util.Scanner;

public class EmployeeClass {
	String Empployee_Name;
	int dept_id;
	int salary;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first employee details: ");
		System.out.println("Enter employee name: ");
		String Empployee_Name=sc.next();
		System.out.println(" Enter Department id:");
		int dept_id=sc.nextInt();
		System.out.println("Enter Salary of Employee: ");
		int salary=sc.nextInt();
		EmployeeClass objEmpClass=new EmployeeClass(Empployee_Name,dept_id,salary);
		
		System.out.println("Enter second employee details: ");
		System.out.println("Enter employee name: ");
		 Empployee_Name=sc.next();
		System.out.println(" Enter Department id:");
		 dept_id=sc.nextInt();
		System.out.println("Enter Salary of Employee: ");
		 salary=sc.nextInt();
		EmployeeClass objEmpClass2=new EmployeeClass(Empployee_Name,dept_id,salary);
		//compareEmpSalary cmp=new compareEmpSalary();
		compareEmpSalary(objEmpClass,objEmpClass2);

	}
	EmployeeClass(String emp_name,int deptid,int salary)
	{
		emp_name=Empployee_Name;
		deptid=dept_id;
		salary=salary;
	}	
	static void compareEmpSalary(EmployeeClass objEmpClass,EmployeeClass objEmpClass2)
	{
		if(objEmpClass.salary>objEmpClass2.salary)
		{
			System.out.println("First Employee has greater salary: ");
		}
		else
			System.out.println("Second employee has greater salary");
	}
}
