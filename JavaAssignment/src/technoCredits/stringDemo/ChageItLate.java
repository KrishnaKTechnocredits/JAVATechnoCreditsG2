package technoCredits.stringDemo;

public class ChageItLate {

	public static void main(String[] args) {
		String s1 = "Technocredits";
		s1.substring(3);
		s1.toUpperCase();
		s1.substring(3);
		System.out.println(s1);
		
		String s2 = "maulik";
		String s3 = "Maulik Kanani";
		/*String s3 = s2.toLowerCase();
		s3 = s3.substring(0);
		*/
		/*Scanner sc = new Scanner(System.in);
		String input = sc.next();
		*/
		s3 = s3.trim();
		if(s2.equalsIgnoreCase(s3))
		{
			System.out.println("Good");
		}else
		{
			System.out.println("Very good");
		}
		
		
		String expected = "login";
		String actual = "you have login success";
		
		if(expected.contains(actual))
		{
			
		}
		
		
		
		
	}
}
