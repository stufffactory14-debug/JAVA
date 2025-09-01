package divide_conquer;

public class quicksort {
    public static void main(String[] args) {
//        int arr[] = {2,4,5,1,0};
//        quicksort(arr,0,arr.length-1);
//        for(int num:arr){
//            System.out.print(num+" ");
//        }
       int[] nums = {4,5,6,0,1,2,3};
            int target = 3;
        System.out.println(search(nums,target));

    }
    //PIVIT APPROCH
    static void quicksort(int[] arr,int start , int end){
        if(start>=end){
            return;
        }
        int pivit = findpivit(arr,start,end);
        quicksort(arr,start,pivit-1);
        quicksort(arr,pivit+1,end);

    }
    static int findpivit(int[] arr,int start,int end){
        int pivit=arr[end];
        int i=start-1;
        for (int j = start; j <end ; j++) {
            if(arr[j]<=pivit){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        i++;
        int temp=pivit;
        arr[end]=arr[i];
        arr[i]=temp;
        return i;
    }

    static int search(int[] nums, int target) {
            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;

                // Found the target
                if (nums[mid] == target) {
                    return mid;
                }

                // Determine which half is sorted
                if (nums[start] <= nums[mid]) {
                    // Left half is sorted
                    if (nums[start] <= target && target < nums[mid]) {
                        end = mid - 1; // Target is in the left half
                    } else {
                        start = mid + 1; // Target is in the right half
                    }
                } else {
                    // Right half is sorted
                    if (nums[mid] < target && target <= nums[start]) {
                        end = mid + 1; // Target is in the right half
                    } else {
                        start = mid - 1; // Target is in the left half
                    }
                }
            }

            return -1; // Target not found
        }




}
