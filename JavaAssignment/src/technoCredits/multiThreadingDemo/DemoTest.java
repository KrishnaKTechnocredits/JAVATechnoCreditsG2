package technoCredits.multiThreadingDemo;

public class DemoTest {

	public static void main(String[] args) {
		Client1 c1 = new Client1();
		c1.setName("Client1");
		c1.start();
		
		Client2 c2 = new Client2();
		c2.setName("Client2");
		c2.start();
		
	}
}
