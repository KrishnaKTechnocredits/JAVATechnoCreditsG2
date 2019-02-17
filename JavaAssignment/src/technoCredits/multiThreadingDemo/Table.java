package technoCredits.multiThreadingDemo;

public class Table {

	synchronized void m1()
	{
		for(int i=1;i<=100;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + ":" +Thread.currentThread().getName());
		}
	}
}
