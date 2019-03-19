package technoCredits.programmingQ;

public class Employee {

	int empid = 10109;
	String name = "Maulik";
	
	void setData(int eid, String ename)
	{
		empid = eid;
		name = ename;
	}
	
	void display()
	{
		System.out.println(name);
		System.out.println(empid);
	}
	
	
	
	
}
