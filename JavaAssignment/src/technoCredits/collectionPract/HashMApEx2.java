package technoCredits.collectionPract;

import java.util.HashMap;

public class HashMApEx2 {
	
	public static void main(String[] args) {
		HashMApEx2 e2 = new HashMApEx2();
		e2.charcterCountOnGivenString("TechnocreditseT");
		//e2.charcterCountOnGivenString("Good Morning");
	}
	
	void charcterCountOnGivenString(String str){
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++){
			//System.out.println(str.charAt(i));
			if(hm.containsKey(str.charAt(i))){
				hm.put(str.charAt(i), (hm.get(str.charAt(i))+1) );
			}else {
				hm.put(str.charAt(i), 1);
			}
		}
		System.out.println(hm);
	}

}
