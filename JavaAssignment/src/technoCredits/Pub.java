package technoCredits;

import java.io.IOException;

public class Pub {

	void verifyEntryOnAge(int age) throws IOException
	{
		if(age>=18)
			System.out.println("Welcome");
		else
		{
			System.out.println("Let me call your moma");
			throw new IOException();
		}
	}
}
