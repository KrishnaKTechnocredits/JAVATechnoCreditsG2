package technoCredits.incrementDecrement;

public class PostIncrementEx2 {
	static void m1(int x){
		if (x++ < 10 || x++ >=11 && x-- <13 || ++x >13 && x==12){
			x = x++ + ++x;
			System.out.println("if");
		} else{
			x = x-- + --x;
			System.out.println("else");
		}
		System.out.println(x); //24
	}
	
	public static void main(String[] args) {
		m1(10);
		
		//m2(10);
	}
}
