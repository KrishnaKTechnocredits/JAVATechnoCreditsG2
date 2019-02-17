package technoCredits.stringDemo;

public class CaseConvert {

	static char caseConversion(char ch)
	{
		//System.out.println("Converted char :" + ch);
		if (ch >=65 && ch<=90)
		{
			ch = (char)(ch+32);
		}else{
			ch = (char)(ch-32);
		}
		return ch;
	}
	
	
	public static void main(String[] args) {
		String input = "TeCHnoCreDitS";
		String str = "";
		for(int i=0;i<input.length();i++)
		{
			char ch = caseConversion(input.charAt(i));
			str = str + ch;
		}
		System.out.println(str);
	}
}
