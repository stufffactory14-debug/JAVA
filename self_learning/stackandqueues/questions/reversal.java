package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reversal {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        revseralQueue(q);
    }

    static void revseralQueue(Queue<Integer> q){
        Stack<Integer> stack = new Stack<>();
        while(!q.isEmpty()) {
            stack.push(q.remove());
        }
        while(!stack.isEmpty()){
            q.add(stack.pop());
        }

        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            q.remove();
        }
    }
}
