package technoCredits.polymorphismDemo;

public class Child extends Parent{

	void m1()
	{
		System.out.println("Child m1");
	}
	
	static void m2()
	{
		//m1();
		System.out.println("Child m2");
	}
	
	
}
