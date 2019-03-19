package technoCredits.backup;
public class PostPreIncreamentEx1 {
	static void m1(int x){
		if(x++ < 10 | x++ >=11 & x-- <13 | ++x >13 & x==12){
			x = x++ + ++x;
			System.out.println("if");
		} else{
			x = x-- + --x;
			System.out.println("else");
		}
		System.out.println(x); //24
	}
	
	static void m2()
	{
		int x = 10;
		if( x++ < 9 & x++ == 10){
			System.out.println(x);
		}else{
			System.out.println("*" + x);
		}
	}
	public static void main(String[] args) {
		m1(10);
		//m2(10);
	}

}



