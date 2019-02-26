package technoCredits.collectionPract;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

//iterate HashSet using Iterator
public class SetEx5 {

	public static void main(String[] args) {
		LinkedHashSet<String> s = new LinkedHashSet<String>();
		s.add("Rahul");
		s.add("Maulik");
		s.add("Sagar");
		s.add("Neha");
		s.add("Ankush");
		s.add("Shashank");
		s.add("Monali");
		s.add("Piyush");
		s.add("Pallavi");
		
		Iterator<String> itr = s.iterator();
		int cnt = 0;
		while(itr.hasNext())
		{
			cnt++;
			System.out.println(itr.next());
			System.out.println(cnt);
		}
		/*while(itr.hasNext())
		{
			System.out.println(itr.next());
		}*/
	}
}
