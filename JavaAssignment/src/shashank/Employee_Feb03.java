package shashank;

public class Employee_Feb03 
{
	int empId;
	String empName;
	float salary;
	Employee_Feb03(String empName, int empId, float salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println("Employee id of the employee with name "+empName+" is "+empId+" and salary is "+salary);
	}
}
