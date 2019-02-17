package technoCredits.blockDemo;

public class Manager {

	int x;
	static{
		System.out.println("Welcome to technocredits.");
	}
	
	{
		x = 10;
	}
	
	void m1()
	{
		
	}
	Manager()
	{
		System.out.println("Default");
	}
	
	Manager(int managerId)
	{
		System.out.println("1 param");
//		System.out.println("Welcome to technocredits.");
	}
	
	Manager(String managerName, int managerId)
	{
		System.out.println("2 param");
	//	System.out.println("Welcome to technocredits.");
	}
	
	public static void main(String[] args) {
		Manager mng1 = new Manager();
		Manager mng2 = new Manager(10109);
		//System.out.println(mng1);
	}
	
}
