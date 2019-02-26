package technoCredits.fileHandling;

//Any abnormal situation in program is called as exeption.
//The mechnisam to handle such as situation is called as Exception handling mechanism.
// To handle this kind of situation we have to use try catch and finally block.
// One try block should be followed by one catch block or multiple catch block.
// If you want to use Try, Catch and finally block than sequence must be Try followed by catch and catch followed by finally.
// We can not write any statement in between Try-catch block and catch-fianlly block.

public class ExceptionDemo2 {
	
	public static void main(String[] args) {
		m1(100, 50);
		System.out.println("END");
	}

	static void m1(int x, int y){
		try{
			System.out.println("X is: "+x+" Y is: "+y);
			int z = x/y;
			System.out.println("Z is: "+z);
			ExceptionDemo2 ed2 = new ExceptionDemo2();
			ed2 = null;
			System.out.println("Object has been created !!");
			ed2.m2();
		}
			//catch(ArithmeticException e){
//			System.out.print("Message is: ");
//			//System.out.println(e.getMessage());
//			e.printStackTrace();
//		}
		catch(NullPointerException e){
			System.out.println("Null pointer exceptions");
		}
		finally{
			try{
				int z = 100/0;
			}
//			catch(ArithmeticException e){
//				System.out.println("Z must be 0 in finally block catch");
//			}
			finally{
				System.out.println("In finally > Finally");
			}
			System.out.println("This is finally block");
		}
	}
	void m2(){
		System.out.println("TechnoCredits");
	}
}
