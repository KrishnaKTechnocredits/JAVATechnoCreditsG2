package shashank;

import java.util.Scanner;

public class EmployeeCompare_Feb03 
{
	int deptId;
	float salary;
	String name;
	
	EmployeeCompare_Feb03(String name, int deptId, float salary)
	{
		this.deptId=deptId;
		this.name=name;
		this.salary=salary;
	}
	
	void displayEmployeeDetails(EmployeeCompare_Feb03 e1, EmployeeCompare_Feb03 e2)
	{
		if (e1.salary==e2.salary)
			System.out.println("Both employees have same salary!");
		else if (e1.salary>e2.salary)
			System.out.println("Name : "+e1.name+" , deptId : "+e1.deptId+" , salary : "+e1.salary);
		else
			System.out.println("Name : "+e2.name+" , deptId : "+e2.deptId+" , salary : "+e2.salary);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter details of first employee (name, department id and salary)- ");
		EmployeeCompare_Feb03 e1= new EmployeeCompare_Feb03(sc.next(), sc.nextInt(), sc.nextFloat());
		System.out.println("Enter details of first employee (name, department id and salary)- ");
		EmployeeCompare_Feb03 e2= new EmployeeCompare_Feb03(sc.next(), sc.nextInt(), sc.nextFloat());
		e1.displayEmployeeDetails(e1, e2);
	}
}
