package technoCredits.collectionPract;

import java.util.ArrayList;

public class ArrayListRemoveMaulik {

	public static void main(String[] args) {
		ArrayListRemoveMaulik alr = new ArrayListRemoveMaulik();
		ArrayList<String> al = alr.addValueInArrayList();
		alr.removeStringFromGivenArrayList(al, "Maulik");
	}

	ArrayList<String> addValueInArrayList() {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Maulik");
		al.add("Maulik");
		al.add("Krishna");
		al.add("Maulik");
		al.add("Maulik");
		al.add("HArsh");
		al.add("Maulik");
		al.add("TechnoCredits");
		al.add("Krishna");
		al.add("Maulik");
		System.out.println(al);
		return al;
	}
	
	void removeStringFromGivenArrayList(ArrayList<String> al, String value){
		while(al.indexOf(value)!= -1)
			al.remove(value);
		System.out.println("Final ArrayList: "+al);
	}

}
