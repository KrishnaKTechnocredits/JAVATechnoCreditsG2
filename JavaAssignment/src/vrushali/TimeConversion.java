package vrushali;

public class TimeConversion {
	
	static int sec, hour, minutes;
	
	static void secToHour(int sec){
		System.out.println("Enter seconds: " +sec);
		hour = sec / 3600;
		minutes = (sec /60)%60;
		sec = sec %60;
		System.out.println("Time conversion from sec to Hour:Mitute:Seconds is "+ hour + ":" +minutes + ":" +sec);
		System.out.println(hour + ":" +minutes + ":" +sec);
	}
	
	public static void main(String[] args) {
		int seconds = Integer.parseInt(args[0]);
		//TimeConversion.secToMinute(seconds);
		TimeConversion.secToHour(seconds);
		
	}
	
}
