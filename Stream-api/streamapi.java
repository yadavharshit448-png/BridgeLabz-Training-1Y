import java.util.*;


interface Sumof2{
	int Sumof2(int a, int b);
}
interface productf2{
	int productf2(int a, int b);
}

interface length{
	
	int lengthFinder(String h);
	 
	
	
}



public class streamapi{
	
	
	
	public static void main(String[]args){
		
		LinkedList<Integer> l = new LinkedList<>();
		l.add(111);
		l.add(9);
		l.add(7);
		l.add(3);
		l.add(4);
		l.add(6);
		l.add(3);
		l.stream()
		   .filter(x-> x >=5)
		   .forEach(System.out::println);
		   
		   Sumof2 sum = (int a, int b)->(a+b);
		   System.out.println(sum.Sumof2(11,22));
		   productf2 pd = (int a, int b)->(a*b);
		   System.out.println(pd.productf2(12,2));
		   
		   length lf = (String h)->(h.length());
		   System.out.println(lf.lengthFinder("anoshkaaaaa"));
		   
		   
		   
		   
		
		   
		   
		
		
		
		
		
		
		
	}
}