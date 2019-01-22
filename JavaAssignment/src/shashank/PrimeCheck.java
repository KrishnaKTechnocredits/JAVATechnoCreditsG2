package shashank;

public class PrimeCheck 
{
	int primeCheck(int num1, int num2)
	{
		boolean flag=true;
		int sum=0;
		for(int i=num1; i<=num2; i++)
		{
			for(int j=2; j<=i/2; j++)
			{
				if(i%j==0)  //gets prime number here
				{
					flag=false;
					break;
				}	
				else flag=true;
			}
			if(flag==true) //if this condition passes, number will be prime
				sum=sum+i;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Sum of prime numbers between (including both) "+Integer.parseInt(args[0])+" and "+Integer.parseInt(args[1])+" is : "+new PrimeCheck().primeCheck(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
	}
}