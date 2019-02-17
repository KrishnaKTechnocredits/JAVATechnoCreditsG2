package technoCredits.collectionPract;

import java.util.ArrayList;

public class ArrayListEx3 {

	public static void main(String[] args) {
		ArrayListEx3 saket =new ArrayListEx3();
		saket.m1();
	}
	
	void m1(){
		ArrayList<String> als = new ArrayList<String>();
		als.add("Krishna");
		als.add("Harsh");
		als.add("Maulik");  // removed
		als.add("Brinda");
		als.add("Maulik");
		//System.out.println("Size: "+als.size()+" Value: "+als);
		als.remove("Maulik");
		//System.out.println("Size: "+als.size()+" Value: "+als);
		als.remove(2);   // removed brinda
		System.out.println("Size: "+als.size()+" Value: "+als);
		als.set(1, "TechnoCredits");   // Replace the value on index
		als.add("Maulik");
		System.out.println("Size: "+als.size()+" Value: "+als);
		int index = als.indexOf("Maulik");
		System.out.println("MAulik index: "+index);
		boolean value = als.contains("Maulik");
		System.out.println("Maulik is present or not in arraylist result: "+value);
		als.clear();
		System.out.println("Als size: "+als.size());
	}
}
