package technoCredits.tricky;

public class Employee {

	private int empid;
	private String empname;
	private int salary;
	
	public Employee(int empid, String empname, int salary) {
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
	}
	
	void display()
	{
		System.out.println("Empname :" + empname);
		System.out.println("Employee id :" + empid);
		System.out.println("Salary :" + salary);
	}
	
	void printLocation(Employee e)
	{
		System.out.println(e);
		e.empid = 100;
	}
	
	void compareData(Employee e1, Employee e2)
	{
		if(e1.empname.equals("Maulik"))
		{
			System.out.println(e1.empname);
			System.out.println(e1.salary);
			System.out.println(e1.empid);
		}else if(e2.empname.equals("Maulik"))
		{
			System.out.println(e2.empname);
			System.out.println(e2.salary);
			System.out.println(e2.empid);
		
		}else
		{
			System.out.println("NO Employee found");
		}
		
	}
}
