package swapnali;

public class treeCount {
		
	public static void main(String[] args) 
	{
		int num[]=new InputOuputOperationTree().takeInputFromUser();
		treeCount.trees_Visible(num);
	}
	//Display the count of tree visible
	static void trees_Visible(int num[])
	{	
		int temp =0;
		for(int index=0;index<num.length;index++)
		{
			if(num[index]!=num[0] ||num[index]>num[0])
			{
				temp=temp+1;
			}
			
		}
		System.out.println("The number of trees visible are: "+temp);
	}

}
