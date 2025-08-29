import java.util.Arrays;
public class facebookques {
        public static void main(String[] args) {
            int[] nums= {1,2,3,8,8,0,9};
            int target=8;
            int[] op= searchrange(nums,target);
            System.out.println(Arrays.toString(op));
        }
        public static int[] searchrange(int[] nums,int target) {
            int[] ans = {-1, -1};

            int start = search(nums, target, true);
            int end = search(nums, target, false);
            ans[0] = start;
            ans[1] = end;
            return ans;

        }

        public static int search(int[] nums, int target, boolean firstindex) {
            int ans = -1;
            int start = 0;
            int end = nums.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid]) {
                    end = mid - 1;
                } else if (target > nums[mid]) {
                    start = mid + 1;
                } else {
                    ans = mid;
                    if (firstindex) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
            return ans;
        }
    }

