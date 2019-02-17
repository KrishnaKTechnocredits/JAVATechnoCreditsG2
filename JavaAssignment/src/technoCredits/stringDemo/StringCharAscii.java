package technoCredits.stringDemo;

public class StringCharAscii {

	static char caseConversion(char ch)
	{
		if (ch >=65 && ch<=90)
		{
			ch = (char)(ch+32);
		}else{
			ch = (char)(ch-32);
		}
		System.out.println("Converted char :" + ch);
		return ch;
	}
	
	public static void main(String[] args) {
		caseConversion('a');
		/*char ch = 97;
		System.out.println(ch);
		
		int x = 'A';
		System.out.println(x);
		*/
		
		/*for(char ch1='A'; ch1<='Z';ch1++)
		{
			int ascii = ch1;
			System.out.println(ch1 +":"+ ascii);
		}
		
		for(int i=65;i<=90;i++)
		{
			char ch = (char)i;
			System.out.println(i+":"+ ch);
		}
		
		int temp = '9';
		System.out.println(temp);*/
		
		
		/*char ch = 1000;
		System.out.println(ch);*/
	}
}
