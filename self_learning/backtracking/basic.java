package backtracking;

import java.util.Arrays;

public class basic {
    public static void main(String[] args) {
        int[] arr = insert(0,new int[5]);
         for(int n:arr){
             System.out.print(n+" ");
         }
    }
    static int[] insert(int val,int[] arr){
        if(val==arr.length){
            return arr;
        }
        arr[val]=val+1;
        insert(val+1,arr);
        arr[val]=val-1;
        return arr;
    }
}
