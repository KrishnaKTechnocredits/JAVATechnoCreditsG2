package technoCredits.tricky;

/*
 * Step1 : covert char case [input = 'K' , output = 'k'] 
 * Step2 : convert Strign case using converCharcase method [input = 'MauLIK', output = 'mAUlik']
 * Step3 : loop to take multiple input and generate output for each string
 */

public class CaseConversion {
    
	// This method will take char and it will convert case and return coverted char
	char caseConvert(char ch) {
		int temp = ch;
		if (temp >= 65 && temp <= 90) {
			temp = temp + 32;
			ch = (char) temp;
		} else if (temp >= 97 && temp <= 122) {
			temp = temp - 32;
			ch = (char) temp;
		}
		return ch;
	}

	String stringCaseConvert(String str) {
		String output = "";
		for (int index = 0; index < str.length(); index++) {
			output = output + caseConvert(str.charAt(index));
		}
		return output;
	}

	public static void main(String[] args) {
		//String str = "Maulik"; // mAULIK
		String[] input = {"MauLIK","KRIshNa","KAnanI"};
		CaseConversion conversion = new CaseConversion();
		/*
		 * Take input from user array
		 */
		for(int index=0;index<input.length;index++)
		{
			String output = conversion.stringCaseConvert(input[index]);
			System.out.println(output);
		}
	}
}
