package technoCredits.p2;

import technoCredits.p1.Admin;

public class Manager extends Admin{
	
	public static void main(String[] args) {
		Admin  m = new Manager();
		m.m1();
       Admin a = new Admin();
	}
	
	 public void m1(){
		System.out.println("Manager m1");
	}

	void m4(){
		System.out.println("Manager m4");
	}
	
	void m5(){
		System.out.println("Manager m5");
	}
}
