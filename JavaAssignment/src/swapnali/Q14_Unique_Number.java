package swapnali;

public class Q14_Unique_Number {

	public static void main(String[] args) {
		int FirstArray[]=new InputOutputOperation().takeInputFromUser();		
		int SecondArray[]=new InputOutputOperation().takeInputFromUser();	
		Q14_Unique_Number.printUniqurNumbers(FirstArray, SecondArray);
	}
	static void printUniqurNumbers(int FirstArray[],int SecondArray[])
	{
		int a[]=new int[10],i=0;
		boolean flag=false;
		for(int index=0;index<FirstArray.length;index++)
		{
			for(int count=index+1;count<SecondArray.length;count++)
			{
				if(FirstArray[index]!=SecondArray[count])
				{
					a[i]=FirstArray[index];
					i++;
					
				}
				/*else
				{
					flag=false;
				}*/
			}
			for( i=0;i<a.length;i++)
			{
				
					System.out.println(FirstArray[i]);
				
			}
			
		}
	}
	/*static void display(int FirstArray[],int SecondArray[]){
		boolean flag=printUniqurNumbers(FirstArray, SecondArray);
		int index=0;
		
		for(int i=0;i<FirstArray.length;i++)
		{
			if(flag==true)
			{
				System.out.println(FirstArray[i]);
			}
		}
		
	}*/
	
}
