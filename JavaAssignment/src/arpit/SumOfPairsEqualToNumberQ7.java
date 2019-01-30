package arpit;


public class SumOfPairsEqualToNumberQ7 {
	
	// This function perform the operation to find pairs whose sum is equal to given number
	void findPairsOfNumber(int[] element,int userNum)
	{
		
		int number =userNum;
		for(int index1=0; index1 <element.length; index1++)
		{
			for(int index2=index1+1; index2 < element.length; index2++)
			{
				
				if((element[index1]+element[index2]) ==number)
				{
					
					//Display pairs
				 System.out.println("The number: "+ number + " whose pairs is: " + (element[index1] +" & "+ element[index2]));
				 
				}
			}
		}
			
	}
	
	public static void main(String[] args) {
		
		// Creating the object of the InputOutputOperations class
		InputOutputOperations iop = new InputOutputOperations();
		
		// Take the input from user in array form
		int[] num = iop.takeInputFromUser();
		
		// Take the input from user in integer form
		int userNum = iop.takeIntegerInputFromUser();
		
		// Creating object of the class
		SumOfPairsEqualToNumberQ7 sumOfPairs= new SumOfPairsEqualToNumberQ7();
		
		// To call the findPairsOfNumber method and provide input to that method
		sumOfPairs.findPairsOfNumber(num, userNum);
		
	}

}
