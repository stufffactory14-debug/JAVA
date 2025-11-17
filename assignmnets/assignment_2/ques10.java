package assignment;

public class ques10 {

    public int trap(int[] height) {
        int n = height.length;

        int[] leftmax = new int[n];
        int[] rightmax = new int[n];

        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        rightmax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(leftmax[i], rightmax[i]) - height[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        ques10 sol = new ques10();
        int[] arr = {4, 2, 0, 3, 2, 5};
        System.out.println(sol.trap(arr));
    }
}
