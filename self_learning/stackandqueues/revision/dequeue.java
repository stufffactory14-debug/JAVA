package queue;
import java.util.*;
public class dequeue {
    static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(5);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
    }
}
