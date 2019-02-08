package array_1;

public class missingNumAPSeries {

	public static void main(String[] args) {
		missingNumAPSeries num= new missingNumAPSeries();
		num.apSeries(new UserInputArray().takeUserInputArrayInt());
		

	}
void apSeries(int[] series)
{
 int temp=0;
 for (int index=1; index<series.length;index++)
 {
	 temp=series[index-1];
	 if(series[index]-temp!=2)
	 {
		 System.out.println((series[index]-2)+ " is missing");
	 }
 }
}
}
