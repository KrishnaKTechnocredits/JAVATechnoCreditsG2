package technoCredits.constructor;

import java.util.Scanner;

public class StudentDemo1 {

	String name;
	int age;

	/*StudentDemo1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter std name and age");
		name = sc.next();
		age = sc.nextInt();
	}*/

	StudentDemo1(String stdname, int stdage)
	{
		name = stdname;
		age = stdage;
	}
	void display() {
		System.out.println(name + ":" + age);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter std name and age");
		String name = sc.next();
		int age = sc.nextInt();
		StudentDemo1 demo1 = new StudentDemo1(name,age);
		demo1.display();
	}
}
