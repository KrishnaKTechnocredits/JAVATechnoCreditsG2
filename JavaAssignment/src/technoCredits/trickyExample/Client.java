package technoCredits.trickyExample;

public class Client {
	
	public static void main(String[] args) {
		Test t1 = new Test();
		short s = 10;
		t1.m1(s);
		t1.m1((short)10);
		t1.m1(10); // int
		t1.m1(10.10);  //double
		t1.m1(10.10f);  //float
		t1.m1((float)10.10); //float
		t1.m1("TechnoCredits");  //String
		Test t2 = null;
		t1.m1(t2); // Test
		t1.m1(t2); // Comment (Test x) method and run this it will return Object
		t1.m1(10); // Comment int : It will return long
		t1.m1(10); // Comment long : It will return float
		t1.m1(10); // Comment float : It will return double
		t1.m1(10); // Comment double : It will return Object
		t1.m1(10); // Comment Object : It will give error(The method m1(byte) in the type Test is not applicable for the arguments (int))
	}

}
