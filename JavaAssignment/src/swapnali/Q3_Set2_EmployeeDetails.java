package swapnali;

public class Q3_Set2_EmployeeDetails {
	int empid;
	String empName;
	int salary;
	
	public Q3_Set2_EmployeeDetails(int empid,String empName,int salary)
	{
		this.empid=empid;
		this.empName=empName;
		this.salary=salary;
	}
	
	void displayEmpDetails()
	{
		System.out.println("Employee ID is: "+empid);
		System.out.println("Employee Name is: "+empName);
		System.out.println("Employee Salary is: "+salary);
	}
		
}
