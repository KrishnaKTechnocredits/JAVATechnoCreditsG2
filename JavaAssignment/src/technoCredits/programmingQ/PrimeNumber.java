package technoCredits.programmingQ;

public class PrimeNumber {
	public static void main(String args[]){
		int count = 0;
		int sum = 0;	
		for(int i=2;i<=100;i++)
		{
			boolean flag= primeCheck(i);
				if(flag == true)
				{
					System.out.println(i + " is prime");
					sum = sum + i;
					count++;
				}
		}
		System.out.println("Sum is" + sum);
		System.out.println("Total prime numbers are " + count);
	}
	
	

	static boolean primeCheck(int num){
		boolean flag = true;
		for(int i = 2; i<=num/2; i++){
			if(num%i==0){
				flag = false;
				break;
			}
		}
		return flag;
	}

}
