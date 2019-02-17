package technoCredits.com.p2;

import technoCredits.com.p1.A;

public class B extends A {


	void m1(){
		System.out.println("m1");
		System.out.println("From m1, y value: "+y);
	}
	public static void main(String[] args) {
		int y = 5;
		A a = new A();
		B b = new B();
		System.out.println(a.z);
		System.out.println("b.y: "+b.y + " A.y: "+A.y +" B.y: "+ B.y+" local y: " + y) ;
		b.m1();
	}
}
