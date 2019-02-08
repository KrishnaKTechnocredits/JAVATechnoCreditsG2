package arpit;

public class EmployeeQ7 {

	String employeeName;
	String deptId;
	int salary;

	// This Constructor take input from user and update all variable value
	EmployeeQ7(String name, String id, int salary) {
		this.employeeName = name;
		this.deptId = id;
		this.salary = salary;
	}

	// This function display details of the employee whose salary is maximum
	void display() {
		System.out.println("Detail of the employee whose salary is maximum: ");
		System.out.println("Employee name is: " + employeeName);
		System.out.println("Employee department id is: " + deptId);
		System.out.println("Employee salary is: " + salary);
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDeptId() {
		return deptId;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
