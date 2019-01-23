package swapnali;

public class Arithmetic {
	int Result;
	
	public static void main(String[] args)
	{
			int Num1 = Integer.parseInt(args[0]);
			int Num2 = Integer.parseInt(args[1]);
			
			Arithmetic a = new Arithmetic();
			a.ArOperation(Num1,Num2);
	
	}
	
	void ArOperation(int Num1, int Num2)
	{
		Result= Num1 + Num2;
		System.out.println("The sum of two numers is: " +Result);
		
		Result= Num1 - Num2;
		System.out.println("The sub of two numers is: " +Result);
		
		Result= Num1 * Num2;
		System.out.println("The mul of two numers is: " +Result);
		
		Result= Num1 / Num2;
		System.out.println("The div of two numers is: " +Result);
		
		Result= Num1 % Num2;
		System.out.println("The rem of two numers is: " +Result);
		
	}

}
