package leetcode;

public class remove_outerparen_1021 {
    static void main(String[] args) {
        String s="(()())(())(()(()))";
        System.out.println(removeOuterParentheses(s));
    }
    static String removeOuterParentheses(String s) {
        int n=0;
        int b=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if (n > 0) ans += '('; // only add if not outermost

                n++;
            }else if(s.charAt(i)==')'){
                n--;
                if (n > 0) ans += ')';


            }
            }

        return ans;
    }
}
