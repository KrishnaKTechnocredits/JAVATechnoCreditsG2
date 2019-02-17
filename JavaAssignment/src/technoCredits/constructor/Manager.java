package technoCredits.constructor;

public class Manager {

	String mngName = "Arpit";
	int deptId = 123;
	
	private Manager()
	{
		System.out.println("Hi");
	}
	
	Manager(String name)
	{
		mngName = name;
	}
	
	public Manager(String name, int id)
	{
		mngName = name;
		deptId = id;
	}
	
	void display()
	{
		System.out.println(mngName);
		System.out.println(deptId);
		System.out.println("-------------------");
	}
	
	public static void main(String[] args) {
		Manager mng = new Manager();
		mng.display();
		
		Manager mng1 = new Manager("Saket");
	}
}
