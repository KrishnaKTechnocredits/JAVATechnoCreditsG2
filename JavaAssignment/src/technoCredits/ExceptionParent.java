package technoCredits;

import java.io.IOException;

// Overriding rule of exception
// 1) If parent class method is not throwing any exception than overridden method can throw unchecked exception
// It means overridden method can not throw any checked exception.
// 2) If parent method throws unchecked exception than overriden method can throw any type of unchecked exception.
// or even no exception at overriden method is also permissible.
// 3) If parent class method throws checked exception than child class method can either throws same exception or child of that exception or No exception.

public class ExceptionParent {
 
	void m1() throws IOException{
		System.out.println("ExceptionParent");
	}
}
