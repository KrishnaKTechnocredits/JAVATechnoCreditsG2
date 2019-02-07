package rashmi;

public class Primenum
	{
		public static void main(String[] args)
	 	{
	    	int start=Integer.parseInt(args[0]);
	    	int end=Integer.parseInt(args[1]);
	  		for(int i=start;i<=end;i++)
	 		{
	   			boolean f= isPrime(i);
	   			if(f==false)
	   				System.out.println(+i+ " is a prime number between " +start+ " and " +end);
	  		}
	 	}

	 	static boolean isPrime(int num)
	 	{
	  		boolean flag=false;
	  		for(int i=2; i<=num/2;i++)
	  		{
	   			if(num%i==0)
	   			{
	    				flag=true; 
	    				break;
	   			}
	  		}
	  	return flag;
	 	}
	}
	 
