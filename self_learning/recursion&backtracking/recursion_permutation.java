import java.util.ArrayDeque;
import java.util.ArrayList;

public class recursion_permutation {
    public static void main(String[] args) {
     //   ArrayList<String> list = permutationlist("","abc");
       // System.out.println(list);
        //System.out.println(helper(1090830));
        System.out.println(permutationcount("","abc"));
    }
    static void permutation(String p,String un) {
        if (un.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = un.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            permutation(f + ch + s, un.substring(1));
        }
    }
    static ArrayList<String> permutationlist(String p, String un) {
        if (un.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;

        }
        ArrayList<String> ans = new ArrayList<>();
        char ch = un.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            ans.addAll(permutationlist(f + ch + s, un.substring(1)));
        }
        return ans;
    }
    static int helper(int d){
        return count(d,0);
    }
    static int count(int d,int c){

        if (d==0){
            return c;
        }
        int rem = d%10;
        if (rem==0){
           return count(d/10,c+1) ;
        }

        return count(d/10,c);


    }

    static int permutationcount(String p,String un) {
        if (un.isEmpty()) {
            return 1;
        }
        int count =0;
        char ch = un.charAt(0);
        for (int i = 0; i <= p.length(); i++) {
            String f = p.substring(0, i);
            String s = p.substring(i, p.length());
            count = count + permutationcount(f + ch + s, un.substring(1));
        }
        return count;
    }
}
