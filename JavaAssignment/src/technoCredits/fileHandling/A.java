package technoCredits.fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class A {
	public static void main(String[] args) {
		A a = new A();
		try {
			a.m1();
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("END");
	}

	void m1() {
		B b = new B();
		b.m2();
		System.out.println("m1 END");
		//FileInputStream input = new FileInputStream(new File("D://krishna.txt"));
	}
}
