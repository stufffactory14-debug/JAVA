package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class majority_element_2 {
    static void main(String[] args) {
        int[] nums={3,2,3,5};
        System.out.println(majorityElement(nums));

        int result=0;
        int a=0;
        int b=1;
        for(int i=2;i<=3;i++){
            result+=a;
            a=b;
            b=a+b;
        }
        System.out.println(result);
    }
    static List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int element = nums.length/3;
        Arrays.sort(nums);
        int check=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i]){
                check++;
            }else {
                if(check>element){
                    list.add(nums[i-1]);
                }
                check=1;
            }

        }
        if(check>element){
            list.add(nums[nums.length-1]);
        }
        return list;

    }
}
