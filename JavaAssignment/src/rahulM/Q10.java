//WAP to check and find the sum all prime number in user given range
package rahulM;
class Q10
{   static int r1,r2;
    static int count =0;
	static int sum=0;
	public static void main(String [] a)
	{
	int r1 = Integer.parseInt(a[0]);
	int r2 =Integer.parseInt(a[1]);
	 for(int num =r1; num<r2;num++)
		{
		boolean f = isPrime(num);
		if (f==false)
		{
			System.out.println(num +" is  prime");
			sum = sum +num;
			count++;
		}
		}
	System.out.println("Total  prime numbers are " +count);
	System.out.println("Sum is " +sum);
	}
static boolean isPrime(int num) 
{
		boolean flag = false;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = true;
				break;
			}

		}
		return flag;	
	}
}