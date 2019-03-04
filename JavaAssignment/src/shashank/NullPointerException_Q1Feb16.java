package shashank;

public class NullPointerException_Q1Feb16 
{
	public static void main(String[] args) {
		NullPointerException_Q1Feb16 np =  new NullPointerException_Q1Feb16();
		np=null;
		try{
		np.m1();
		}
		catch(NullPointerException n){
			NullPointerException_Q1Feb16 np1 =  new NullPointerException_Q1Feb16();
			np=np1;
			np.m1();
		}
		System.out.println("End");
	}
	
	void m1()
	{
		System.out.println("M1 called.");
	}
}
