package technoCredits.switchDemo;

public class ContinueDemo {
	
	static void m1(int num)
	{
		for(int i=1;i<=10;i++)
		{
			if(i == 5)
				break;
			System.out.println(i);	
		}
	}
	
	public static void main(String[] args) {
		m1(2);
	}
}
