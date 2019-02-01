package rashmi;

//Finding all pair on integer array whose sum is equal to given num

public class PairSum 
{
	void sumOfTwo(int[] num)
    {
    	int sum=7;
    	for(int i=0;i<num.length;i++)
    	{
    		for(int j=1;j<num.length;j++)
    		{
    		     if((num[i]+num[j])==sum)
    		     {
    			    System.out.println(num[i]);
    			    System.out.println(num[j]);
    		     }
    		}
    	}
    	
    }
	public static void main(String[] args) 
	{
	 InputOutputOperations iop=new InputOutputOperations();
	 int[] num=iop.takeInputFromUser();
	 PairSum fmn= new PairSum();
	 fmn.sumOfTwo(num);
	
	}
}
