//Q2 Find Duplicate number on integer array in Java
package ArrayPrograms;

public class duplicate {

	public static void main(String[] args) {
		duplicate df = new duplicate();
		df.duplicateFinder();
	
	}
	  void duplicateFinder(){
		int cnt =0;
		int [] input ={1,2,3,4,5,4,4};
		for(int index=0;index<input.length-1;index++)
		{
		for(int count=index+1;count<input.length;count++)
		{
		 
		 if(input[index]==input[count])	
		 {   
			 System.out.println("The duplicate number is :" +input[count]);
			 cnt=cnt+1;
			 	 }
		}
		
		}
		System.out.println("The duplicate value is repeated in array "+ cnt +" times");	
	
	 }
}
