package queue;

import java.util.Stack;

public class queue_using_2stack {
    static class Queue{
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

         boolean isEmpty(){
            return stack1.isEmpty();
        }

        void add(int data){

             while(!stack1.isEmpty()){
                 stack2.add(stack1.pop());
             }
             stack1.add(data);
             while(!stack2.isEmpty()){
                 stack1.add(stack2.pop());
             }

        }

        public int remove(){
             if(isEmpty()){
                 System.out.println("queue is empty");
                 return -1;
             }
             return stack1.pop();
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return stack1.peek();
        }
    }
    static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove() ;
        }
    }
}

