import java.util.*;

public class SetPractice{
	
	public static void main (String[]args){
		
		
		
		HashSet<Integer> hs = new HashSet<>();
		hs.add(2);
		hs.add(128);
		hs.add(2);
		hs.add(11);
		hs.add(6);
		hs.add(3);
		hs.add(9);

		System.out.println(hs);
		LinkedHashSet<Integer> ls = new LinkedHashSet<>();
		ls.addAll(hs);
		System.out.println(ls);
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(6);
		ts.add(0);
		ts.add(4);
		ts.add(0);
		System.out.println(ts);
		 
		
		
}
}