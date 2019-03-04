package shashank;

public class ReverseMaxLengthString 
{
	void reverseMaxLengthString(String str)
	{
		char charArr[]=str.toCharArray();
		System.out.println("Reverse of the lenghtiest string is : ");
		for (int index=charArr.length-1; index>=0; index--)
		{
			System.out.print(charArr[index]);
		}
		
	}
	
	public static void main(String[] args) {
		ReverseMaxLengthString rm =new ReverseMaxLengthString();
		MaxLengthString_Q2Feb10 ml = new MaxLengthString_Q2Feb10();
		rm.reverseMaxLengthString(ml.findMaxLengthString(UserInputArrayConverter.takeInputFromUserStr()));
	}
}
