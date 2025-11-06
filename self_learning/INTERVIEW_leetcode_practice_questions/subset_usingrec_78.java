package leetcode;
import java.util.*;
public class subset_usingrec_78 {
    public static void main(String[] args) {
        System.out.println(reverseUsingRec("","123"));
    }
    static ArrayList<ArrayList<Integer>> reverseUsingRec(String p,String un){
        if (un.isEmpty()) {
            ArrayList<ArrayList<Integer>> list = new ArrayList<>();
            ArrayList<Integer> subset = new ArrayList<>();

                for (int i = 0; i < p.length(); i++) {
                    subset.add(p.charAt(i) - '0');
                }
            list.add(subset);
            return list;
        }
        char ch=un.charAt(0);
        ArrayList<ArrayList<Integer>> left = reverseUsingRec(p+ch,un.substring(1));
        ArrayList<ArrayList<Integer>> right =  reverseUsingRec(p,un.substring(1));
        left.addAll(right);
        return left;
    }
}
