package sorting;
import java.util.Arrays;
public class QUICK_SORT
{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quick(int[] nums , int low , int hi){
        if(low>=hi){
            return;
        }
        int s = low;
        int e = hi;
        int m = s+(e-s)/2;
        int pivit = nums[m];
        while(s<=e) {
            while (nums[s] < pivit) {
                s++;
            }
            while (nums[e] > pivit) {
                e--;
            }
            if(s<=e){
                int temp= nums[s];
                nums[s]=nums[e];
                nums[e]=temp;
                s++;
                e--;
            }
        }
        //now pivit is at correct index now sort the array
        quick(nums,low,e);
        quick(nums,s,hi);
    }
}

