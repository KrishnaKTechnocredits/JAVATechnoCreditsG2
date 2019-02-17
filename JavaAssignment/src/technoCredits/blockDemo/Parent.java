package technoCredits.blockDemo;

public class Parent {

	static{
		System.out.println("Parent block");
	}
	
	{
		System.out.println("Parent block");
	}
	
	Parent()
	{
		System.out.println("Parent constructor");
	}
}
