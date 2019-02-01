package rashmi;

// Finding the Missing Number

public class FindMissingNum 
{
   static void findNum(int[] num)
    {
    	for(int index=0;index<num.length-1;index++)
    	{
    		if(num[index+1]!=num[index]+1)
    		{
    			System.out.println("Missing num is  " +(num[index]+1));
    		}
    				
    	}
    	
    }
   
	public static void main(String[] args) 
	{
		 InputOutputOperations iop=new InputOutputOperations();
		 int[] num=iop.takeInputFromUser();
		 findNum(num);

	}

}
