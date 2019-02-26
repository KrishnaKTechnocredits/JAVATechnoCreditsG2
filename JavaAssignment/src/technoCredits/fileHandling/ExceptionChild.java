package technoCredits.fileHandling;

import java.io.FileNotFoundException;

public class ExceptionChild extends ExceptionParent{

	void m1() throws FileNotFoundException{
		System.out.println("Exception Child");
	}
}
