package swapnali;

public class TimeConversion {
	
	public static void main(String[] args) {
		
		TimeConversion tc= new TimeConversion();
		
		int time=Integer.parseInt(args[0]);
		
		tc.secondTohours(time);
				
	}

	
	void secondTohours(int time)
	{
		
        
        int seconds = time % 60;
        int hours = time / 60;
        int minutes = hours % 60;
        hours = hours / 60;
        
        System.out.print( hours + ":" + minutes + ":" + seconds);
		System.out.print("\n");
	}
	
	
}
