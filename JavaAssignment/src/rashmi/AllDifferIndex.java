package rashmi;

//Finding the max value at differed index

public class AllDifferIndex 
{
	void compare(int[] num1,int[] num2)
    {
       int temp1=0;
       int temp2=0;
       for(int index=0;index<num1.length;index++)
       {
    	 
    	       if(num1[index]!=num2[index])
    	       {
    		      System.out.println(num1[index]);
    		      System.out.println(num2[index]);
    		      temp1=num1[index];
    		      temp2=num2[index];
    		   }
 
    	}
       if(temp1>temp2)
    	{
    	   System.out.println("Max value is " +temp1);
    	}
       else
       {
    	   System.out.println("Max value is " +temp2);
       }
    }
	
	public static void main(String[] args) 
	{
		 InputOutputOperations iop=new InputOutputOperations();
		 int[] num1=iop.takeInputFromUser();
		 int[] num2=iop.takeInputFromUser();
		 AllDifferIndex fmn= new AllDifferIndex();
		 fmn.compare(num1, num2);
	}
}
