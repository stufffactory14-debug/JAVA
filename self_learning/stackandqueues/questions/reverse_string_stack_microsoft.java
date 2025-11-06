package stack;
import java.util.*;
//asked in microsoft , paytm
public class reverse_string_stack_microsoft {
    static void main(String[] args) {
        reverseString("bhavya");

    }
    public static void reverseString(String s){
        Stack<Character> j = new Stack<>();
        int i=0;
        while(i<s.length()){
            j.push(s.charAt(i));
            i++;
        }
        StringBuilder result = new StringBuilder("");
        while(!j.isEmpty()){
            result.append(j.peek());
            j.pop();
        }
        System.out.println(result.toString());
    }
}
