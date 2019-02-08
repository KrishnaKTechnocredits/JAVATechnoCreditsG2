package shashank;

public class CountOfTrees 
{
	int treesCount(int[] numOfTrees)
	{
		int max=numOfTrees[0], count=1;
		for (int index=0; index<numOfTrees.length; index++)
		{
			if(max<numOfTrees[index])
			{
				max=numOfTrees[index];
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		UserInputArrayInt UI=new UserInputArrayInt();
		CountOfTrees CT=new CountOfTrees();
		System.out.println("Number of visible trees will be: "+CT.treesCount(UI.takeUserInputArrayInt()));
	}
}
