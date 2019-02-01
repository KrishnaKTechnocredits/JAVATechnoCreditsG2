package rashmi;

//Finding the second large number

public class SecondLargeNum 
{
	int findSecLarge(int[] num)
    {
    	int max=0;int secmax=0;
    	for(int i=0;i<num.length;i++)
    	{
    		if(max<num[i])
    		{
    			secmax=max;
    			max=num[i];
    			
    		}
    	}
    	return secmax;
    }
	public static void main(String[] args) 
	{
	 InputOutputOperations iop=new InputOutputOperations();
	 int[] num=iop.takeInputFromUser();
	 SecondLargeNum fmn= new SecondLargeNum();
	 int ans = fmn.findSecLarge(num);
	 System.out.println(ans);

	}
}
