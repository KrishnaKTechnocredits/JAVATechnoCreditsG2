package technoCredits.collectionPract;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx1 {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		ArrayList al = new ArrayList();
		for(int i=0; i<5; i++){
			al.add(sc.nextInt());
		}
		al.add("Technocredits");
		System.out.println("al size: "+al.size());
		System.out.println("al value: "+al);
		//display(al);
		sc.close();
	}
	
    static void display(ArrayList al){
//    	for(int i =0; i<al.size() ; i++)
//    		System.out.println(al.get(i));
    }
}
