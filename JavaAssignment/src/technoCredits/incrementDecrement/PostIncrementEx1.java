package technoCredits.incrementDecrement;

public class PostIncrementEx1 {

	static void m1(int x) {
		int y =20;
		if(x++ <=10)
		{
			if(x++ <=12 && ++y>20) // x = 12 y = 21
			{
				for(int i = 1;i<=x;i++)
				{
					if(y % (x*i) == 0){
						break;
					}
					System.out.println(x+y); //33
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		//m1(10);
		System.out.println(1%10); 
	}
}
