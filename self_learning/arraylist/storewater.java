package arraylist;
import java.util.*;
public class storewater {
    public static void main(String[] args) {
//store water leetcode question
//        int[] height={1,8,6,2,5,4,8,3,7};
//        System.out.println(maxArea(height));

//        int[] arr={11,15,6,8,9,10};
//        System.out.println(pairsuum(arr,16));
//
//        int[] arr= {1,2,3,4,4};
//        System.out.println(isMonotonic(arr));
        // this will return true , it is incraesing order, if it was in decreasing order it will return true , nor asc nor desc then false

        int[] nums = {10,6,8,5,8};
        //System.out.println(findLonely(nums));
        System.out.println(mostFrequent(nums));
    }

    static int maxArea(int[] height) {
        int maxwater=0;
        int p1=0;
        int p2=height.length-1;
        while(p1<p2){
            int h=Math.min(height[p1],height[p2]);
            int w=p2-p1;
            if(maxwater<h*w){
                maxwater=h*w;
            }
            if(height[p1] < height[p2]) {
                p1++;
            }   else {
                p2--;
            }

        }
        return maxwater;
    }

    //pair sum 2
    static boolean pairsuum(int[] arr,int target){
        int start=0;
        int end=0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                start=i+1;
                end=i;
                break;
            }
        }
        while(start!=end){
            if(arr[start]+arr[end]==target){
                return true;
            }
            else if(arr[start]+arr[end]>target){
                end=(end-1+arr.length)%arr.length;

            }else if(arr[start]+arr[end]<target){
                start=(start+1)%arr.length;

            }
        }
        return false;
    }

    //MONOTONCI ARRAY
    static boolean isMonotonic(int[] nums) {
        int start=0;
        int end = nums.length-1;
        int p=start+1;
        int e=end-1;
        if(nums[start]<nums[end]){
            while(p<nums.length){
                if(nums[start]>nums[p]){
                    return false;
                }
                start++;
                p++;
            }
            return true;
        }else{
            while(e>=0){
                if(nums[end]>nums[e]){
                    return false;
                }
                end--;
                e--;
            }
            return true;
        }
    }

    //FIND ALL LONELY NUMBER
    static List<Integer> findLonely(int[] nums) {
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        if (nums.length == 1 || (nums[0] != nums[1] && nums[0] + 1 != nums[1])) {
            list.add(nums[0]);
        } if (nums.length > 1 && nums[nums.length - 1] != nums[nums.length - 2] &&
                nums[nums.length - 1] - 1 != nums[nums.length - 2]) {
            list.add(nums[nums.length - 1]);
        }
        for(int i=1;i<nums.length-1;i++){

            if(nums[i] != nums[i - 1] && nums[i] != nums[i + 1] &&  nums[i]+1!=nums[i+1] && nums[i]-1!=nums[i-1]){
                list.add(nums[i]);
            }
        }
        return list;
    }

    // MOST COMMAN ELEMENT
    static int mostFrequent(int[] nums) {
        Arrays.sort(nums);

        int maxCount = 1, currCount = 1;
        int mostFrequent = nums[0];


        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                currCount++;
            } else {
                currCount = 1;
            }

            if (currCount > maxCount) {
                maxCount = currCount;
                mostFrequent = nums[i];
            }
        }

        return mostFrequent;
    }

}
