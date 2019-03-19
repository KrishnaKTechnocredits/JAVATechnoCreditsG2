/*WAP to find average of user given array
a. Input :- {14, 32, 19, 14, 78,36}
b. Output:- 32.16*/

package purva;

public class PurvaAssign4_q9_Service {

//calculates avg of array and returns value to main method	
	float sumOfIntArray(int[] inp)
	{
		float sum=0,avg=0;
		for(int index=0;index<inp.length;index++){
			//adds values of each element in array and places it in sum
			sum=sum+inp[index];
			
			//avg is sum/length of array
			avg=sum/inp.length;
			
		}
		return avg;
	}

}
