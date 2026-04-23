import java.util.stream.Stream;
import java.util.*;

public class Stream1 {
    
    public static void main(String[] args) {
        
        Stream<Integer> s = Stream.of(1,2,3,4,5,6);
        s.forEach(System.out::println);
        
        Stream<String> st = Stream.of("aa","b","c");
        st.forEach(System.out::println);
        
        System.out.println("---------Using stream---------");
        
        ArrayList<String> ar = new ArrayList<>();
        ar.add("anushka");
        ar.add("harshit");
        ar.add("ishika");
        ar.add("noobdi");
        ar.add("hai");
        ar.add("me pro");

        System.out.println(ar);
        
        Stream<String> str = ar.stream();   
        ar.stream()
		   .filter( n->n.startsWith("a"))
		   .forEach(System.out::println);
    }
}