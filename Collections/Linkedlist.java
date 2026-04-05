import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class Linkedlist{


public static void main(String[]args){
    List b = new Vector(); 
    List a = new Stack();
    List c = new LinkedList();
    List l = new ArrayList();
    l.add(1);
    l.add(2);
    l.add(3);
    l.add("harshit");
    l.add(7.4343);
    System.out.println(l);
    ArrayList<String> al = new ArrayList<>();
    System.out.println("arary list"+al);
    al.add("harshit");
    al.add("yadav");
    al.add("anushka");
    al.add("noob");
    System.out.println("arary list"+al);
    for(int i = 0 ; i<al.size() ; i++){
        System.out.println(al.get(i));
    }
    System.out.println("using for each loop");
    for(String s : al){
        System.out.println(s);
    }

    ArrayList<String> al2 = new ArrayList<>();
    al2.add("1");
    al2.add("2");
    al2.add("3");
    al2.add("4");
    System.out.println(al2);

    al.addAll(al2);
    System.out.println("array after adding");
    System.out.println(al);



}




}
