package leetcode_binaryques;

import java.util.Arrays;

public class QUES {

    public static void main(String[] args) {
        char[] letters={'c','f','g'};
        int[] arr = {1,2,3,4};
        int[] arr1 = {1,3,5,6};
        int[] arr2 = {0,10,5,2};
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4} ;
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
        //System.out.println(peakIndexInMountainArray(arr2));//
        // System.out.println(searchInsert(arr1,5));
        //    System.out.println(findKthPositive(arr,2));
        //  System.out.println(findKthPositive1(arr,2));
        //   System.out.println(nextGreatestLetter(letters,'a'));
    }
    //744 ( re do after somedays)
    static char nextGreatestLetter(char[] letters, char target) {
        int start =0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start + ( end - start)/2;
            if(letters[mid]>target){
                end=mid-1;
            }else{
                start=mid+1;
            }

        }
        return letters[start % letters.length];
    }
    //1539 LEETCODE
    static int findKthPositive(int[] arr, int k) {
        int[] nums = new int[k];
        int size=0;
        int j=0;
        int f=0;
        for(int i=1;size<k;i++){

            if(f < arr.length && arr[f]!=i){
                nums[j]=i;
                j++;
                size++;

            }
            if(f < arr.length &&arr[f]==i){
                f++;
            }
            if (f >= arr.length) {  // optional but safe: all remaining are missing
                nums[j] = i + 1;
                j++;
                size++;

            }

        }

        return nums[nums.length-1];
    }
    // OR METHOD 0(1) complexity (1539)
    static int findKthPositive1(int[] arr, int k) {
        for(int num:arr){
            if(num<=k) k++;
        }
        return k;
    }
    //LEETCODE 35
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                start = mid+1;
            }else{
                end=mid-1;
            }
        }
        return start;
    }
    //852 LEETCODE
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start= mid+1;
            }
        }
        return start;
    }
    //OR (WORST COMPLEXITY)
    static int peakIndexInMountainArray1(int[] arr) {
        int peak=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                peak=i+1;
            }
        }
        return peak;
    }

    //LEETCODE 349
    static int[] intersection(int[] nums1, int[] nums2) {

        int[] arr = new int[Math.min(nums1.length,nums2.length)];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    boolean exist = false;
                    for(int g=0;g<k;g++){
                        if(arr[g]==nums1[i]) {
                            exist=true;
                            break;
                        }

                    }
                    if(!exist){
                        arr[k++] = nums1[i];
                    }
                }
            }

        }

        return Arrays.copyOf(arr,k);
    }
}
