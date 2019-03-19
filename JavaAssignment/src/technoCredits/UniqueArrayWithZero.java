package technoCredits;

public class UniqueArrayWithZero {
    static int count =0;
	static boolean setZeroFlag = false;
	public static void main(String[] args) {
		int[] array1 = {3,0,9,1,0,4,1,7};
		int[] array2 = {9,11,1,14,0};
		int[] resultArray = new int[array1.length + array2.length];
		
		for(int i=0; i<array1.length; i++){
			setElement(resultArray, array1[i]);
		}
		for(int i=0; i<array2.length; i++){
			setElement(resultArray, array2[i]);
		}
		displayIntArray(resultArray);
	}

	static void setElement(int[] resultArray, int temp){
		boolean flag = false;
		for(int i=0; i<resultArray.length; i++){ //count
			if(resultArray[i]==temp){  
				flag = true;
				break;
			}
		}
		if(temp==0 && setZeroFlag == false){
			resultArray[count] = temp; 
			setZeroFlag = true;
			count++;
		}
		if(flag==false){
			resultArray[count] = temp;  
			count++;
		}
	}
	
	static void displayIntArray(int[] resultArray){
		for(int i=0; i<count; i++){
			//if(resultArray[i]!=0)
			 System.out.println(resultArray[i]);
		}
		
	}
	

}
