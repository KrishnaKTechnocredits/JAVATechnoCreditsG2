package technoCredits.stringDemo;

public class ReplaceDemo {

	public static void main(String[] args) {
		String msg = "Hel*lo Maulik Hi Maulik GM Maulik All okay";
		int count = 0;
		while(msg.indexOf("Maulik") != -1)
		{
			msg = msg.replaceFirst("Maulik", "*");
			System.out.println(msg);
			count++;
		}
		System.out.println(count);
	}
}
