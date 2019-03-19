package shashank;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class UncehckedException_Q3Feb16 
{
	void g() throws FileNotFoundException
	{
		FileReader f= new FileReader(".//checkedE.txt");
		System.out.println(f);
	}
	
	void f() throws IOException
	{
		try{
		g();
		}
		catch (FileNotFoundException f)
		{
			System.out.println("Exception handled in f()");
			throw new IOException();
		}
	}

	public static void main(String[] args) 
	{
		UncehckedException_Q3Feb16 ue = new UncehckedException_Q3Feb16();
		try{
		ue.f();
		}
		catch (IOException i)
		{
			System.out.println("Exception handled in main");
		}
	}
	
}

