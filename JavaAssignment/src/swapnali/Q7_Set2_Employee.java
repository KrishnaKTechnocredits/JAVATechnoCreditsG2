package swapnali;

public class Q7_Set2_Employee {
	int empId;
	String empName;
	int salary;
	
	public Q7_Set2_Employee(int empId,String empName,int salary)
	{
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
	}
	
	void display()
	{
		System.out.println("Employee ID is: "+empId);
		System.out.println("Employee Name is: "+empName);
		System.out.println("Employee Salary is: "+salary);
	}
	
	void compareData(Q7_Set2_Employee e1,Q7_Set2_Employee e2)
	{
		if(e1.salary>e2.salary)
		{
			System.out.println(e1.empId);
			System.out.println(e1.empName);
			System.out.println(e1.salary);
		}
		else if(e2.salary>e1.salary)
		{
			System.out.println("Employee ID is:" +e2.empId);
			System.out.println("Employee Name is: "+e2.empName);
			System.out.println("Employee Salary is: "+e2.salary);
		}
	}

}
