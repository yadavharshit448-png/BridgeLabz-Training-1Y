import java.util.*;

public class hashmapPractice{
	
	public static void main(String[]agrs){
		
		HashMap<Integer,Integer> hm = new HashMap<>();
		hm.put(2,90);
		hm.put(3,4);
		hm.put(5,55);
		
		System.out.println(hm.keySet());
	   System.out.println(hm.values());
	}	
}