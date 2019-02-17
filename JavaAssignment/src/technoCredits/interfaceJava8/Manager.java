package technoCredits.interfaceJava8;

public interface Manager {

	//void m1();
	
	default void m2(){
		System.out.println("Manager m2");
	}
	
	static void m3()
	{
		System.out.println("Manager m3");
	}
	
}
