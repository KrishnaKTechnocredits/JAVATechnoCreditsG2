package technoCredits.fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileEx1 {

	static int cnt = 0;
	static void wordCount(String line)
	{
		String[] str = line.split(" ");
		
		for(String word : str)
		{
			if(word.equals("Technocredits"))
				cnt++;
		}
	}
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader(".//sample.txt");
		BufferedReader br = new BufferedReader(file);
		
		String line = br.readLine();
		while(line != null)
		{
			System.out.println(line);
			wordCount(line);
			line = br.readLine();
		}
		System.out.println(cnt);
		br.close();
	}
}
