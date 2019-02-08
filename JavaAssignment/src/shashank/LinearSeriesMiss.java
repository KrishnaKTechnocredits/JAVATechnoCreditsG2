package shashank;

public class LinearSeriesMiss 
{
	void linearSeries(int[] series)
	{
		int temp=0;
		for (int index=1; index<series.length; index++)
		{
			temp=series[index-1];
			if(series[index]-temp!=2)
			{
				System.out.println((series[index]-2)+" is missing");
			}
		}
	}
	
	public static void main(String[] args) 
	{
		LinearSeriesMiss ls= new LinearSeriesMiss();
		ls.linearSeries(new UserInputArrayInt().takeUserInputArrayInt());
	}
}

// 2 4 8 10