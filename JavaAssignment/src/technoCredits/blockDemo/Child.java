package technoCredits.blockDemo;

public class Child extends Parent{

	static{
		System.out.println("Child block");
	}
	
	Child()
	{
		super();
		System.out.println("Child constructor");
	}
	
	public static void main(String[] args) {
		Child c1 = new Child();
		System.out.println("End");
	}
}
