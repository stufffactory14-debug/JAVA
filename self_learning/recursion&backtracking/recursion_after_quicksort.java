import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class recursion_after_quicksort {
    public static void main(String[] args) {
      // skip("","baccad");
     //   purmutation("","abc");
    //    int [] arr={1,2,3};
//        List<List<Integer>> ans = subset(arr);
//        for(List<Integer> list : ans){
//            System.out.println(list);
        int [] arr={1,2,2};
        List<List<Integer>> ans = removeduplicate(arr);
        for(List<Integer> list : ans){
           System.out.println(list);
        }
    }
    static void skip(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        if (ch=='a'){
            skip(p, up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    static void purmutation(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        purmutation(p+ch,up.substring(1));
        purmutation(p,up.substring(1));
    }
    static List<List<Integer>> subset(int [] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for ( int num : arr){
            int n = outer.size();
            for ( int i =0;i<n;i++){
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);

            }
        }
        return outer;
    }
    static List<List<Integer>> removeduplicate(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start =0;
        int end =0;
        for(int i=0;i<arr.length;i++){
            start=0;
            if (i>0 && arr[i]==arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();
            for ( int j =start;j<n;j++){
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
