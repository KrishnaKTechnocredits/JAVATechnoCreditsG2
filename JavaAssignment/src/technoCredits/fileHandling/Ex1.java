package technoCredits.fileHandling;

import java.io.IOException;

public class Ex1 {
	public static void main(String[] args) {
		Ex1 ex1 = new Ex1();
		try {
			ex1.m1();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	void m1() throws InterruptedException,Exception {
		System.out.println("Ex1 m1");
		EX2 ex2 = new EX2();
		try {
			ex2.m2();
		} catch (IOException e) {

		}
	}
}
