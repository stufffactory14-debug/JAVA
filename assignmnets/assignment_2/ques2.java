package assignment;

public class ques2 {

        public static int maxSumFixed(int[] arr, int k) {
            int sum = 0;
            for (int i = 0; i < k; i++) sum += arr[i];

            int maxSum = sum;

            for (int i = k; i < arr.length; i++) {
                sum += arr[i] - arr[i - k];
                if (sum > maxSum) maxSum = sum;
            }
            return maxSum;
        }

        public static void main(String[] args) {
            int[] arr = {2, 1, 5, 1, 3, 2};
            int k = 3;
            System.out.println(maxSumFixed(arr, k));
        }

}
