package technoCredits.polymorphismDemo;
public class PostPreIncreamentEx1 {
	static void m1(int x){
			             //13 && 14 || 14 && 
		if (x++ < 10 || (x++ >=11 && x-- <13) || ++x >13 && x==12){
			x = x++ + ++x;
			System.out.println("if");
		} else{
			x = x-- + --x; //14 + 12
			System.out.println("else");
		}
		System.out.println(x); //24
	}
	
	public static void main(String[] args) {
		m1(12);
		//m2(10);
	}

}