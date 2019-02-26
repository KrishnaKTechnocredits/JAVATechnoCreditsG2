package technoCredits.collectionPract;

public class EmployeeDetails {

	int age;
	String name;
	
	public EmployeeDetails(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	void display()
	{
		System.out.println("Name is : "+ name);
		System.out.println("Age is :" + age);
	}
}
