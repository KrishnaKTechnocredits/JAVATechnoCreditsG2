package swapnali;

public class PrimeInput {
	
	public static void main(String[] args) {
		
		int start=Integer.parseInt(args[0]);
		int end=Integer.parseInt(args[1]);
		int sum=0;
		
		PrimeInput pi = new PrimeInput();
		
		for(int i=start;i<=end;i++)
		{
			
			boolean flag = pi.primeCheck(i);
			if(flag==true)
			{
				sum=sum+i;
				System.out.println("The prime numbers are "+i);
			}
		}
		System.out.println("The sum of above prime numbers is : "+sum);
	}
	
	
	boolean primeCheck(int no)
	{
		boolean flag= true;
		for(int i=2;i<=no/2;i++)
		{
			if(no % i == 0)
			{
				flag = false;
				break;
			}
		}
		return flag;
	}
	
	
}