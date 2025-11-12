package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack_using_2queue {
    static class Stack{
        Queue<Integer> q1=new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        public boolean isEmpty(){
            return q1.isEmpty() && q2.isEmpty();
        }

        public void push(int data){
            if(!q1.isEmpty()){
                q1.add(data);
            }else{
                q2.add(data);
            }
        }

        int pop(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;
            if(!q1.isEmpty()) {
                while (!q1.isEmpty()){
                    top=q1.remove();
                    if(q1.isEmpty()){
                        break;
                    }
                    q2.add(top);

                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();
                    if(q2.isEmpty()){
                        break;
                    }
                    q1.add(top);
                }
            }
            return top;
        }
        int peek(){
            if(isEmpty()){
                System.out.println("empty stack");
                return -1;
            }
            int top = -1;
            if(!q1.isEmpty()) {
                while (!q1.isEmpty()){
                    top=q1.remove();

                    q2.add(top);

                }
            }else{
                while(!q2.isEmpty()){
                    top=q2.remove();

                    q1.add(top);
                }
            }
            return top;
        }
    }
    static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
