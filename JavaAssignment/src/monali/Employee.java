package monali;

public class Employee {
	private int emp_Id;
	private String emp_Name;
	private int emp_Salary;
	Employee(int id,String name,int salary)   //constructor parameterized with values
	{
		emp_Id=id;
		emp_Name=name;
		emp_Salary=salary;
	}
	void employeedetails()
	{
		System.out.println("Employee details are : "+emp_Id+"  "+emp_Name+"  "+emp_Salary+"  ");
	}
}
