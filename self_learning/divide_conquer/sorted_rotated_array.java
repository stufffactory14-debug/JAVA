package divide_conquer;

public class sorted_rotated_array {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(rotatedArray(arr, 6, 0, arr.length - 1));
        System.out.println(search(arr,0));
    }

    //USING RECURSION

    static int rotatedArray(int arr[], int target, int start, int end) {
        if (start > end) {
            return 1;
        }

        int mid = start + (end - start) / 2;
        if (target == arr[mid]) {
            return mid;
        }
        if (arr[start] <= arr[mid]) {
            if (arr[start] <= target && target < arr[mid]) {
                return rotatedArray(arr, target, start, mid - 1);
            } else {
                return rotatedArray(arr, target, mid + 1, end);
            }
        } else {
            if (arr[mid] < target && target <= arr[end]) {
                return rotatedArray(arr, target, mid + 1, end);
            } else {
                return rotatedArray(arr, target, start, mid - 1);
            }
        }


    }

    //USING ITTRATION


    static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;


            if (nums[mid] == target) {
                return mid;
            }


            if (nums[start] <= nums[mid]) {

                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {

                if (nums[mid] < target && target <= nums[start]) {
                    end = mid + 1;
                } else {
                    start = mid - 1;
                }
            }
        }

        return -1;
    }



}
