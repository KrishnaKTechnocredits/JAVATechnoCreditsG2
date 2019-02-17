package technoCredits.multiThreadingDemo;

public class User {

	public static void main(String[] args) {
		
		Client c1 = new Client();
		Client c2 = new Client();
		
		c1.setName("Krishna");
		c2.setName("Maulik");
		c1.start();
		c2.start();
		
	}
}
