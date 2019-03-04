package shashank;

//import java.util.ArrayIndexOutOfBoundsException;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ThrowsBehaviour_Q4Feb16 
{
	public static void main(String[] args) throws FileNotFoundException {
		ThrowsBehaviour_Q4Feb16 tb = new ThrowsBehaviour_Q4Feb16();
		tb.m1();
	}
	
	void m1() throws FileNotFoundException 
	{
		m2();
	}
	
	void m2() throws ArrayIndexOutOfBoundsException, FileNotFoundException
	{
		int arr[]= {1,2,3};
		try{
		for (int i=0; i<=3; i++)
		{
			System.out.println(arr[i]);
		}
		}
		catch (ArrayIndexOutOfBoundsException a){
		}
		
		try{
		FileReader f= new FileReader(".//file.txt");
		}
		catch (FileNotFoundException fi){
		}
		
	}
}

//Observations:
//1. Unchecked exceptions are not compulsory for parent method to handle even if it is thrown by child method
//2. Checked exceptions from child method must be handled by parent class or should be thrown by parent method
//3. Even if checked exception is handeled in child method and not thrown, still parent method can throws exception
//4. For checked exception, if it is handeled in child method and also thrown, it has to be handled/thrown in parent method 
