package technoCredits.stringDemo;

public class StringSplit {

	
	
	public static void main(String[] args) {
		String name = "This is Maulik From technocredits";
		String[] temp = name.split(" ");
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
	}
}


