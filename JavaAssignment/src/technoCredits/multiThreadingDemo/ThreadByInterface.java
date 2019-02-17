package technoCredits.multiThreadingDemo;

public class ThreadByInterface {

	public static void main(String[] args) {
		
		ThreadByInterfaceClient1 c1 = new ThreadByInterfaceClient1();
		Thread t1 = new Thread(c1);
		t1.start();
		
		
		ThreadByInterfaceClient2 c2 = new ThreadByInterfaceClient2();
		Thread t2 = new Thread(c2);
		t2.start();
	}
	
}
