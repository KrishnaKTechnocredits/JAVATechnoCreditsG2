package technoCredits.stringDemo;

public class IndexOfDemo {
    
	public static void main(String[] args) {
		String msg = "technocredits";
		//msg = msg.toLowerCase();
		
		int index = msg.indexOf('z');
		
		if(msg.indexOf('z') >= 0)
		{
			System.out.println("found");
		}else{
			System.out.println("not Found");
		}
		System.out.println(index);
		
		msg.lastIndexOf('t');
		
	}
}