/* This is service class 
 * Create a class called Employee, having 3 fields Employee Name, DeptId and Salary (input using scanner). Create 3 parameterized constructor for same.
Take data for 2 employees and write a method which takes 2 arguments (instance of both employees) and print all the details of employee having max salary.
HINT: Method declaration - void compareEmpSalary(Employee e1, Employee e2);
 */
package purva;

public class Purva_Assign3_Employee_q7 {
	String Empname;
	int DeptID;
	double Salary;
	
	/* constructor with 3 parameter which are used to initialize instance variables */
	Purva_Assign3_Employee_q7(String empname, int deptid, double sal)
	{
		this.Empname=empname;
		this.DeptID=deptid;
		this.Salary=sal;	
	}
	
	/* below method compare salary of both employees and prints data of employee whose salary is greater */
	void compareEmpSalary(Purva_Assign3_Employee_q7 e1, Purva_Assign3_Employee_q7 e2)
	{
		if(e1.Salary>e2.Salary)
		{
			System.out.println("\n"+"Details of Employee 1 are: ");
			System.out.println("Name of Employee 1: "+e1.Empname);
			System.out.println("Department ID of Employee 1: "+e1.DeptID);
			System.out.println("Salary of Employeee 1: "+e1.Salary);
			
		}
		else
		{
			System.out.println("\n"+"Details of Employee 2 are: ");
			System.out.println("Name of Employee 2: "+e2.Empname);
			System.out.println("Department ID of Employee 2: "+e2.DeptID);
			System.out.println("Salary of Employeee 2: "+e2.Salary);
		}
	}

}
