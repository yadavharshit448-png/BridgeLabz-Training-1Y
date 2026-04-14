import java.util.*;

public class dequeue {

    public static void main(String[]args){
                 Deque<Integer> deque = new ArrayDeque<>();
                 deque.addFirst(1);
                 deque.addLast(2);
                deque.addLast(3);
                deque.offerFirst(5);
                 deque.offerLast(6);      
                System.out.println("Deque: " + deque);
                

    }
}