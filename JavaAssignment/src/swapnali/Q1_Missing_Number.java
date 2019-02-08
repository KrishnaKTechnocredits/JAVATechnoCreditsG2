package swapnali;

public class Q1_Missing_Number {
	//Method to find out the missing number from an array
	 static void getMissingNo (int num[], int n) 
	    { 
	        int actualSum=0;
	        int expectedSum = n *(n+1)/2;
	        System.out.println("Expected sum is: "+expectedSum);
	        for (int index=0;index<num.length;index++)
	        {
	        	actualSum = actualSum + num[index];
	        }
	        System.out.println("Actual Sum is: "+actualSum);
	        System.out.println("Missing number is: " +(expectedSum-actualSum));
	    } 	       
	    
	    public static void main(String args[]) 
	    { 
	            int num[]=new InputOutputOperation().takeInputFromUser();	            
	            int dupNum=num.length;
				Q1_Missing_Number.getMissingNo(num,dupNum+1);
	    } 

}
