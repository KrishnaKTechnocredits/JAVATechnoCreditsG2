package swapnali;

public class SwapWithout {
	
	public static void main(String[] args) {
		int num1= Integer.parseInt(args[0]);
		int num2= Integer.parseInt(args[1]);
		SwapWithout.swapNumbers(num1,num2);
		
	}
	
	static void swapNumbers(int i, int j)
	{
		
		int temp = i;
		i=j;
		j=temp;
		System.out.println("After swapping : " +i +" "+j);
	}

}
