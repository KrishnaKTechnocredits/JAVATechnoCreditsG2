package technoCredits.multiThreadingDemo;

public class Client2 extends Thread {

	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+  Thread.currentThread().getName());
		}
	}
	
	
	void m2()
	{
		for(int i=1001;i<=2000;i++)
		{
			System.out.println(i);
		}
	}
}
