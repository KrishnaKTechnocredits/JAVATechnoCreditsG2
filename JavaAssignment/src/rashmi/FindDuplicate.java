package rashmi;

// Finding the Duplicate

public class FindDuplicate 
{
	void findDuplicateNum(int[] num)
    {
       for(int index=0;index<num.length;index++)
       {
    	   for(int temp=index+1;index<num.length;temp++)
    	   {
    		   if(num[index]==num[temp])
    		   {
    			   
    			   System.out.println(num[index]);
    			  
    		   }
    	   }
       }
    }
	public static void main(String[] args) 
	{
		 InputOutputOperations iop=new InputOutputOperations();
		 int[] num=iop.takeInputFromUser();
		 FindDuplicate fmn= new FindDuplicate();
		 fmn.findDuplicateNum(num);
		 //System.out.println(duplicate);
	}
}
