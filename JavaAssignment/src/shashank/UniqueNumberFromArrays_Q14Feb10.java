package shashank;

public class UniqueNumberFromArrays_Q14Feb10 
{
	public static void main(String[] args) 
	{
		int arr1[]=UserInputArrayConverter.takeInputFromUserInt();
		int arr2[]=UserInputArrayConverter.takeInputFromUserInt();
		UniqueNumberFromArrays_Q14Feb10 ua =new UniqueNumberFromArrays_Q14Feb10();
		ua.uniqueValueFinder(arr1, arr2);
		
	}
	
	void uniqueValueFinder(int arr1[], int arr2[])
	{
		int tempArr[]= new int[arr1.length+arr2.length];
		//int outputArr[]=new int[tempArr.length];
		
	
		
		for(int i=0; i<arr1.length; i++)
		{
			boolean flag1=true;
			for(int j=0; j<tempArr.length; j++)
			{
				if (arr1[i]==tempArr[j])
				{
					flag1=false;
					break;
				}
			}
			if(flag1==true)
			tempArr[i]=arr1[i];
		}
		/*for(int i=0; i<tempArr.length; i++)
		{
			System.out.println(tempArr[i]);
		}*/
		
		for(int i=0; i<arr2.length; i++)
		{
			
			boolean flag2=true;
			for(int j=0; j<tempArr.length; j++)
			{
				if (arr2[i]==tempArr[j])
					{
						flag2=false;
						break;
					}
			}
			if(flag2==true)
			tempArr[i+arr1.length]=arr2[i];
		}
		
		for(int i=0; i<tempArr.length; i++)
		{
			System.out.println(tempArr[i]);
		}
		/*System.out.println(arr1.length);
		for(int i=0; i<arr1.length; i++)
		{
			tempArr[i]=arr1[i];
		}
		for(int i=arr1.length, j=0; i<tempArr.length; i++, j++)
		{
			tempArr[i]=arr2[j];
			//System.out.println(i);
			//System.out.println(j);
		}
		for(int i=0; i<tempArr.length; i++)
		{
			System.out.print(tempArr[i]+" ");
		}
		
		tempArr[0]=outputArr[0];
		for(int i=1; i<tempArr.length; i++)
		{
			if(tempArr[i-1]!=tempArr[(i)])
			outputArr[(i)]=tempArr[(i)];
			
		}
		
		for(int i=0; i<outputArr.length; i++)
		{
			System.out.println(outputArr[i]);
		}*/
		
	}
}
