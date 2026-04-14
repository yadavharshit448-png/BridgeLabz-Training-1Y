import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        // Stack
        Stack<Integer> st = new Stack<>();
        st.push(7);
        st.push(6);
        st.push(5);
        st.push(4);
        st.push(2);

        System.out.println(st.peek());    // top element
        System.out.println(st.size());    // size
        System.out.println(st.isEmpty()); // check empty

        // LinkedList
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(12);
        list1.add(11);
        list1.add(10);
        list1.add(8);
        list1.add(9);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addAll(list1);

        System.out.println(list2);
    }
}