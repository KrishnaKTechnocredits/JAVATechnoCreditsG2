package arpit;

public class EmployeeQ3 {

	String empId;
	String empName;
	int salary;

	// This Constructor take input from user and update all variable value
	EmployeeQ3(String empId, String empName, int salary) {

		this.empId = empId;
		this.empName = empName;
		this.salary = salary;

	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// This function display details of the employee
	void display() {

		System.out.println("Id of the Employee is: " + empId);
		System.out.println("Name of the Employee is: " + empName);
		System.out.println("Salary of the Employee is: " + salary);

	}

}
