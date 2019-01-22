package monali;

public class SecToMinToHour {

	public static void main(String[] args) {
		int seconds = Integer.parseInt(args[0]);
		int minute = seconds / 60;
		int rSec = seconds % 60;
		int hour = minute / 60;

		System.out.println(
				seconds + " Seconds Conversion into Hour:Minute:Second format = " + hour + ":" + minute + ":" + rSec);
	}
}
