package technoCredits.abstractionDemo;

public class Test {

	public static void main(String[] args) {
		C c1= new C();
		c1.m1();
		c1.m2();
		c1.m3();
		c1.m4();
		A c2 = new C();
		//c2.m4(); compilation error
		// A c3 = new A(); compilation error 
	}
}
