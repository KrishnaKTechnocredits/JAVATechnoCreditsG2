package technoCredits.inheritanceEx;

public class Employee extends Manager{
	void encryption(){
		System.out.println("RSA");
	}
	void m2(){
	System.out.println("Manager m2");
	}
	public static void main(String[] args) {
		Manager m1 = new Manager();
		Employee e1 = new Employee();
		Manager m = new Employee();

		
	}
}
