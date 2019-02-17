package technoCredits.trickyExample;

public class BlankFinalVariable {

	static final int x;
	static int y;
	
	static{
		x = 10;
	}
	
	public BlankFinalVariable(int x) {
		//y = x;
	}
	
	public BlankFinalVariable() {
	}
	
	public static void main(String[] args) {
		y = 10;
		System.out.println(x);
	}
	
}
