package shashank;

public class ArrayOutOfBound_Q2Feb16 
{
	public static void main(String[] args) 
	{
		ArrayOutOfBound_Q2Feb16 ab =  new ArrayOutOfBound_Q2Feb16();
		ab.tempMethod();
	}
	
	void tempMethod()
	{
		int arr[]={0,1,2,3,4};
		
		try{
		for (int i=0; i<=5; i++)
		{
			System.out.println(arr[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println("Check condition of 'for' loop");
		}
		finally{
			System.out.println("End");
		}
	}
}
