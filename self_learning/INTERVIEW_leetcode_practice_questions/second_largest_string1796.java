package leetcode;

import java.util.*;

public class second_largest_string1796 {
    static void main(String[] args) {
       String s = "a";
        System.out.println(secondHighest(s));
    }
    static int secondHighest(String s){
        int j=0;

        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch<='9'){
                int ch1=ch-'0';
                arr[j]=ch1;
                j++;

            }
        }
        if(j<=1){
            return -1;
        }
        Arrays.sort(arr, 0, j);

        int largest=arr[1];
        int second=arr[0];
        for (int i = 2; i < j; i++) {
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];

            }else if(arr[i]<largest && second<arr[i]){
                second=arr[i];
            }
        }



        if(largest==second){
            return -1;
        }else if(arr[j-1]!=arr[j-2]) {
            return arr[j-2];
        }else{
            return second;
        }

    }
}
