package shashank;

//Program to find duplicate number on Integer array 
public class DupNumArray_Q2Jan27 
{
	boolean findDupNumArr_flag=false;
	int findDupNumArr(int num[])
	{
		//int maxNum=MaxMinNumArray.maxNumArr(num);
		int tempArr[] = new int[MaxMinNumArray.maxNumArr(num)+1]; //Allocates size of maximum number+1 to a temporary array
		for (int index=0; index<num.length; index++)
		{
			tempArr[num[index]]=tempArr[num[index]]+1;
		}
		
		/*for (int index=0; index<tempArr.length; index++)
		{
			System.out.println(tempArr[index]);
		}*/
		
		int dupNum=0;
		for (int index=0; index<tempArr.length; index++)
		{
			if (tempArr[index]>1)
			{
				dupNum=index;
				findDupNumArr_flag=true;
			}
		}
		return dupNum;	
	}
	
	public static void main(String[] args) {
		DupNumArray_Q2Jan27 dna=new DupNumArray_Q2Jan27();
		int dupNum=dna.findDupNumArr(UserInputArrayConverter.takeInputFromUserInt());
		if (dupNum!=0 || dupNum==0 && dna.findDupNumArr_flag==true)
		System.out.println("Duplicate number in the given array is : "+dupNum);
		else 
			System.out.println("There is no duplicate number in the given integer array!");
	}
}
