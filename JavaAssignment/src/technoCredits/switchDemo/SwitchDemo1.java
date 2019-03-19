package technoCredits.switchDemo;

// byte, short, int, char, String

public class SwitchDemo1 {

	static void m1(String browser)
	{
		switch(browser)
		{
			default : 
			System.out.println("Option doesnt match");
			break;
			
			case "Firefox":
				System.out.println("FireFox opened");
				break;
				
			case "Chrome" :
				System.out.println("Chrome opened");
				break;
				
		}
		
		/*if(browser.equals("Chrome"))
		{
			System.out.println("Chrome opened");
		}
		else if(browser.equals("FireFox"))
		{
			System.out.println("FireFox opened");
		}
		else if(browser.equals("IE"))
		{
			System.out.println("IE opened");
		}
		else
		{
			System.out.println("Safari opened");
		}*/
	}
	
	public static void main(String[] args) {
		m1("chrome");
		String s = 'a' + "";
		/*short b = 2;
		m1(b);
		
		double d = 99.9;
		String temp = String.valueOf(10);*/
	}
}
