package technoCredits.programmingQ;
public class PrimeNumberR
{
	public static void main(String[] a)
	{
		int start = Integer.parseInt(a[0]);
		int end = Integer.parseInt(a[1]);
		for(int i=start;i<=end;i++)
		{
			boolean  f = isPrime(i);
			if(f == true)
				System.out.println(i + "is not prime ");
		}
		
	}
	
	static boolean isPrime(int number)
	{
		boolean flag =true;
		for(int i=2;i<=number/2;i++)
		{
			if(number%i == 0)
			{
				flag = false;
				break;
			}						
		}
		return flag;
	}
}