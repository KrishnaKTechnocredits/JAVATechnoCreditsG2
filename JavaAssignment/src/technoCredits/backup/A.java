package technoCredits.backup;

public interface A {

	default void m1()
	{
		System.out.println("A m1");
	}
	
	default void m2()
	{
		System.out.println("A m2");
	}
	
	static void m3()
	{
		System.out.println("A m3");
	}
	
	static void m4()
	{
		System.out.println("A m4");
	}
}
