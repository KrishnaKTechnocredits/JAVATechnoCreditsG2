package technoCredits;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		ExceptionDemo1 ed = new ExceptionDemo1();
		//ed.operation(100, 20);
		ed.operation(100, 0); // ArithmeticException
		System.out.println("END");
	}

	void operation(int x , int y){
		System.out.println("value of x is : "+x);
		System.out.println("value of y is : "+y);
		try{
			int div = x/y;
			System.out.println("Div is: "+div);
		}
		catch(ArithmeticException e){
			System.out.println("Y must be 0");
		}
		System.out.println("********************");
		try{
			int mul = x*y/y;
			System.out.println("mul is: "+mul);
		}
		catch(ArithmeticException e){
			System.out.println("Y must be 0 in 2nd try catch");
		}
		int sum = x+y;
		System.out.println("sum is: "+sum);
	}

	void m1() {
		operation(100, 0);
	}
}
