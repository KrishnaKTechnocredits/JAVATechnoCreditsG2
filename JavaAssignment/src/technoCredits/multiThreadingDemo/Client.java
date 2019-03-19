package technoCredits.multiThreadingDemo;

public class Client extends Thread{

	static Table t = new Table();
	public void run()
	{
		t.m1();
	}
	
	
}
