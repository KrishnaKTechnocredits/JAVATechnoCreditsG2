package vrushali;

public class TimeConversion {
	static void secToHour(int sec) {
		int second, hour, minutes;
		System.out.println("Enter seconds: " + sec);
		hour = sec / 3600;
		minutes = (sec / 60) % 60;
		sec = sec % 60;
		System.out.println("Time conversion from sec to Hour:Mitute:Seconds is " + hour + ":" + minutes + ":" + sec);
	}

	public static void main(String[] args) {
		int seconds = Integer.parseInt(args[0]);

		TimeConversion.secToHour(seconds);

	}

}
