package stack;
import java.util.*;
public class stack_using_ArrayList {

    static class StackB{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean isEmpty(){
            return list.size()==0;
        }
        public static void push(int data){
            list.add(data);
        }
        public static int pop(){
            if(list.size()==0){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;

        }

        public static int peek(){
            if(list.size()==0){
                return -1;
            }
            return list.get(list.size()-1);
        }
    }
    static void main(String[] args) {
        StackB stack = new StackB();
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            stack.pop();
        }
    }

}
