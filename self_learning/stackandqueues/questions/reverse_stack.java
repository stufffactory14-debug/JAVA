package stack;
import java.util.*;
public class reverse_stack {
    static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        reverse(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }

    }
    static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        insertAtBottom(s,top);

    }
    static void insertAtBottom(Stack<Integer> s,int top){
        if(s.isEmpty()){
            s.push(top);
            return;
        }
        int t=s.pop();
        insertAtBottom(s,top);
        s.push(t);
    }


}
