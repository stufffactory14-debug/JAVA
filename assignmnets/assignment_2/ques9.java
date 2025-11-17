package assignment;

public class ques9 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 9, 12};
        int x = 6;
        int k = 3;

        int left = 0;
        int right = arr.length - 1;

        while (right - left + 1 > k) {

            int leftDist = (arr[left] > x) ? (arr[left] - x) : (x - arr[left]);
            int rightDist = (arr[right] > x) ? (arr[right] - x) : (x - arr[right]);

            if (leftDist <= rightDist) {
                right--;
            } else {
                left++;
            }
        }

        for (int i = left; i <= right; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
