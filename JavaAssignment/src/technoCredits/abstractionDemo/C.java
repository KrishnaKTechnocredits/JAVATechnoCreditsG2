package technoCredits.abstractionDemo;

/*If class implements an Interface that class has to 
override all the abstract method of the interface.
*/public class C implements A{
	
/*	public static void main(String[] args) {
		TestLead tl = new TestLead();
		
	}*/
	public void m1() {
		System.out.println("C m1");
	}
	public void m2() {
		System.out.println("C m2");
	}
	public void m3() {
		System.out.println("C m3");
	}
    /*void m4(){
    	System.out.println("C m4");
    }compilation error  due to visibility */ 
	
	public void m4(){
    	System.out.println("C m4");
    }
	
	public void m5() {
	}
	
	public void m6() {
	}
	
}
