package stackandqueues;

import java.util.*;

public class inbuildExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(65);
        stack.push(3);
        stack.push(42);
        stack.push(1);
        System.out.println(stack.pop());
        //LIFO (last in first out)
        //stack is a class

        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(23);
        queue.add(45);
        queue.add(56);
        System.out.println(queue.peek());
        System.out.println(queue.remove());
        //FIFO (first in last out)
        //it is an interface

        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(32);
        deque.addFirst(42);
        deque.addLast(3);
        System.out.println(deque.remove());
        System.out.println(deque.removeFirst());
        System.out.println(deque.removeLast());

    }


}
