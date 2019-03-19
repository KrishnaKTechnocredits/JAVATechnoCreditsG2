package technoCredits.stringDemo;

public class SUbStringDemo1 {

	public static void main(String[] args) {
		String msg = "Hello This is TechnocrediTs";
		int startIndex = msg.indexOf('T');
		int endIndex = msg.lastIndexOf('T');
		
		if( startIndex == -1)
		{
			System.out.println("Char not found");
		}else if(startIndex == endIndex){
			System.out.println("T");
		}else{
			String subString = msg.substring(startIndex, endIndex+1);
			System.out.println(subString);
		}
	}
}
