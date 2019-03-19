package technoCredits.fileHandling;

public class B {

	void m2() {
		try {
			System.out.println("In class B m2 start");
			C c = new C();
			c.m3();
			System.out.println("In class B m2 END");
		} catch (ArithmeticException e) {
			System.out.println("B m2 catch");
		}
	}
}
