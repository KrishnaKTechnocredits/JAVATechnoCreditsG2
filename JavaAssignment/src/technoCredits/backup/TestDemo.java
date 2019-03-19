package technoCredits.backup;

public class TestDemo implements A{

	public void m1()
	{
		System.out.println("TestDemo M1");
	}
	
	public static void m3()
	{
		System.out.println("TestDemo m3");
	}
	public static void main(String[] args) {
		A a = new TestDemo();
		a.m1();
		a.m2();
	}
}
