package technoCredits.collectionPract;

import java.util.ArrayList;

public class AutoboxingUnboxing {

	static void m1(Integer i)
	{
		System.out.println("Hello");
	}
	
//	static void m1(int i)
//	{
//		System.out.println("Hi");
//	}
//	
	public static void main(String[] args) {
		int x = 10;
		m1(x);
		Integer x2 = new Integer(20);
		int x3 = x2.intValue();
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(10);
	}
}
