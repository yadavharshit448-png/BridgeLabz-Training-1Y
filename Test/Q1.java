import java.util.*;


public class Q1 {
	
	public static void main(String[]args){
		ArrayList<Integer> al= new ArrayList<>();
		al.add(1);
		al.add(1);
		al.add(22);
		al.add(3);
		al.add(3);
		al.add(55);
		
		System.out.println("array with duplicate elements "+al);
		HashSet<Integer> s = new HashSet<>();
		s.addAll(al);
		
		
		System.out.println("array without duplicate elements"+s);
		
		
	}
	
	
	
}