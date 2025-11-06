package leetcode;
import java.util.*;
public class reverse_word_151 {
    static void main(String[] args) {
        System.out.println(reverseWords("a good   example"));
    }
    static String reverseWords(String s) {
        s=s.trim();
        ArrayList<String> list = new ArrayList<>();
        String ans = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                ans+=s.charAt(i);
            }else if(s.charAt(i)==' '&& ans !=""){
                list.add(ans);
                ans="";
            }
        }
        list.add(ans);
        String result = "";
        for(int i=list.size()-1;i>=0;i--){
            result+=list.get(i)+" ";
        }
        return result.trim();
    }
}
