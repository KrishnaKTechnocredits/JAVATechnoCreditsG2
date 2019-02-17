package technoCredits.multiThreadingDemo;

public class ThreadByInterfaceClient2 implements Runnable{

	public void run()
	{
		for(int i=101;i<=200;i++)
		{
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i + " :" + Thread.currentThread().getName());
		}
	}
}
