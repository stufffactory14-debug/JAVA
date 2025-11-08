package leetcode;

public class rotateString796 {
    static void main(String[] args) {
        System.out.println(rotateString("defdefdefabcabc","defdefabcabcdef"));
    }
    static boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;

        for (int start = 0; start < s.length(); start++) {
            if(s.charAt(0)==goal.charAt(start)){
                int i=start;
                int j=0;
                while(j<s.length() && s.charAt(j)==goal.charAt(i%(goal.length()))){
                    i++;
                    j++;
                }
                if(j==s.length()) return true;
            }
        }
        return false;
    }
}
