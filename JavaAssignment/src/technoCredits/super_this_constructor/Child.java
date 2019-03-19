package technoCredits.super_this_constructor;

public class Child  extends Parent{

	// this is keyword in java
	// this is used to refer current class method, constructor and variable.
	// Constructor calling has to at the first line at the any constructor.
	// It means we can not use super and this constructor calling from the same constructor. 
	int rollNo; 
	
	 Child(){
		 this(10);
		 System.out.println("Child Default param");
	}
	 
	Child(int x) {
		super(x);
		System.out.println(super.y);
		System.out.println("Child one param");
	}
	 
	public static void main(String[] args) {
		Child c = new Child();
		Child c1 = new Child(20);
		c.display();
		c1.display();
		System.out.println("In Child class");
	}
}
