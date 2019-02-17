package technoCredits;

public class ExceptionDemo4 {
	
	public static void main(String[] args) {
		ExceptionDemo4 ed4 = new ExceptionDemo4();
		System.out.println(ed4.m1());
	}
	
	int m1(){
		try{
			System.out.println("HI");
		    return 5;
		}catch(Exception e){
			return 10;
		}
		finally{
			return 15;
		}
	}

}
