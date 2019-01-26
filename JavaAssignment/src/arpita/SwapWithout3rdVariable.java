package arpita;

public class SwapWithout3rdVariable {
	
	public static void main(String[] args) {
		
	int a=10;
	int b=20;
	System.out.println("Before swaping: "+a +" "+b);
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("after swaping: "+a +" "+b);
	}

}
