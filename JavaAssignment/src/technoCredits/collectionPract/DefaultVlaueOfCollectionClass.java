package technoCredits.collectionPract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.Vector;

public class DefaultVlaueOfCollectionClass {

	public static void main(String[] args) {
		TreeMap();
	}

	private static void arrayList() {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		System.out.println("ArrayList :- " + al.size());
	}

	private static void linkedList() {
		LinkedList<Integer> al = new LinkedList<Integer>();
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		System.out.println("LinkedList :- " + al.size());
	}

	private static void vectorDemo() {
		Vector<Integer> al = new Vector<Integer>();
		al.ensureCapacity(10);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(2);
		al.add(4);
		System.out.println("Vector Capacity --> " + al.capacity());
		System.out.println("vector Size --> " + al.size());
	}

	private static void HashMapDemo() {
		HashMap<Integer, Integer> al = new HashMap<Integer, Integer>();
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		System.out.println("size --> " + al.size());
	}

	private static void HashTableDemo() {
		Hashtable<Integer, Integer> al = new Hashtable<Integer, Integer>();
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		al.put(1, 5);
		System.out.println("size --> " + al.size());
	}

	private static void TreeMap() {
		TreeMap<Integer, Integer> tr = new TreeMap<Integer, Integer>();
		tr.put(1, 6);
		tr.put(2, 6);
		tr.put(3, 6);
		tr.put(4, 6);
		tr.put(5, 6);
		tr.put(6, 6);
		tr.put(7, 6);
		tr.put(8, 6);
		tr.put(9, 6);
		tr.put(11, 6);
		tr.put(11, 7);
		System.out.println("TreeMap " + tr.size());
	}

}
