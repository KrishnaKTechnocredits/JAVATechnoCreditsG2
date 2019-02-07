package technoCredits.super_this_constructor;

public class Parent {
	
	int y;
	
	public Parent(int y) {
		this.y = y ;
		System.out.println("Parent one param");
	}
   private  Parent(){
	   System.out.println("Parent default param");
    }

    void display() {
    	System.out.println(this.y);
    }
    
    void m2() {
    	System.out.println("Parent M2");
    }
    
    public static void main(String[] args) {
		System.out.println("In parent class.");
	}
}
