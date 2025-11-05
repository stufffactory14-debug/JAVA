package leetcode;
import java.util.*;
public class threesum {
    static void main(String[] args) {
        int[] nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));

    }
   static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> matrix = new ArrayList<>();

        int m=0;
        int i=0;
        int j=1;
        while(i<nums.length-2){
            for(int k=0;k<nums.length;k++){
                if(k==i || k==j){
                    continue;
                }else if(nums[i]+nums[j]+nums[k]==0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[j]);
                    triplet.add(nums[k]);
                    matrix.add(triplet);
                    m++;
                }


            }
            j++;
            if (j >= nums.length) {
                i++;
                j = i + 1;
            }
        }

       Set<List<Integer>> unique = new HashSet<>();

       for (List<Integer> triplet : matrix) {
           Collections.sort(triplet);
           unique.add(triplet);
       }

       matrix = new ArrayList<>(unique);

       return matrix;
    }
}
